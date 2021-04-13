package me.t.mylazybot.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

    public void sendMessage() {
        RestTemplate restTemplate = new RestTemplate();
        String sendMessageUri = uri + "/sendMessage";
        String chatId = "352047046";
        String messageText = "iambot, wazzup";
        String message = sendMessageUri + "?chat_id=" + chatId + "&text=" + messageText;
        String result = restTemplate.getForObject(message, String.class);
        System.out.println(result);

    }
}
