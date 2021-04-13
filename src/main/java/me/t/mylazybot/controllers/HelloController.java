package me.t.mylazybot.controllers;

import me.t.mylazybot.model.TelegramBotAPI;
import me.t.mylazybot.model.dao.results.GetMeResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public GetMeResult index() {
        TelegramBotAPI telegramBot = new TelegramBotAPI();
        telegramBot.sendMessage();
        return telegramBot.getMeRequest();
    }
}
