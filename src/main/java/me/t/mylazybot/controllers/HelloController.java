package me.t.mylazybot.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.t.mylazybot.model.TelegramBotAPI;
import me.t.mylazybot.model.dao.results.GetMeResult;
import me.t.mylazybot.model.dao.results.GetUpdatesResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<String> messageResponse(@RequestBody String jsonUpdateRequest) {

        TelegramBotAPI telegramBot = new TelegramBotAPI();
        telegramBot.returnSameMessage(jsonUpdateRequest);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping("/getMe")
    public GetMeResult index() {
        TelegramBotAPI telegramBot = new TelegramBotAPI();
        return telegramBot.getMeRequest();
    }
}
