package me.t.mylazybot.model;

import com.google.gson.Gson;
import me.t.mylazybot.model.dao.results.GetMeResult;
import org.springframework.web.client.RestTemplate;

public class GetUpdate {

    public String getBotUsername() {
        return "temporary hardcoded";
    }


    public void getMeRequest() {
TokenRetriever token = new TokenRetriever();
        final String uri = "https://api.telegram.org/bot" + token.getTelegramBotToken() + "/getMe";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);


        GetMeResult a = new Gson().fromJson(result, GetMeResult.class);
        System.out.println(a);



    }
}
