package me.t.mylazybot.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.t.mylazybot.model.dao.results.GetUpdatesResult;
import me.t.mylazybot.model.dao.results.GetMeResult;
import org.springframework.web.client.RestTemplate;

public class TelegramBotAPI {

    private RestTemplate restTemplate;

    final static String uri = TokenRetriever.getTelegramBotURL();

    public GetMeResult getMeRequest() {
        String getMeUri = uri + "/getMe";
        restTemplate = new RestTemplate();
        String getMeJsonStr = restTemplate.getForObject(getMeUri, String.class); /*java.net.UnknownHostException sometimes happens*/
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(getMeJsonStr, GetMeResult.class);
    }

    public void returnSameMessage(String jsonUpdateRequest) {
        Gson gson = new GsonBuilder().create();
        GetUpdatesResult getUpdates = gson.fromJson(jsonUpdateRequest, GetUpdatesResult.class);
        String message = messageBuilder(getUpdates);
        System.out.println("message: " + message);
        restTemplate = new RestTemplate();
        restTemplate.getForObject(message, String.class);
    }

    public String messageBuilder(GetUpdatesResult getUpdates){
        String message = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
        String telegramToken = TokenRetriever.getTelegramBotToken();
        String chatId = getUpdates.getMessage().getChat().getId();
        String messageText = getUpdates.getMessage().getText();
        message = String.format(message, telegramToken, chatId, messageText);
        return message;
    }
}
