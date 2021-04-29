package me.t.LocalManCannotBot.controllers;

import me.t.LocalManCannotBot.model.LocalManCannotBot;
import me.t.LocalManCannotBot.model.TelegramBotProperties;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.GetMe;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

@RestController
public class HelloController {


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BotApiMethod<?> webhookUpdate(@RequestBody Update update) {
        /* TEMPORARY IF BLOCK for debugging */
        if (update.getMessage().hasText()) {
            System.out.println("recieved text: " + update.getMessage().getText());
        }

        LocalManCannotBot localManCannotBot = new LocalManCannotBot();
        return localManCannotBot.onWebhookUpdateReceived(update);

    }

    @RequestMapping("/getMe")
    public User getMe() {
        RestTemplate restTemplate = new RestTemplate();
        String getMeJsonStr = restTemplate.getForObject(TelegramBotProperties.getTelegramBotPath() + TelegramBotProperties.getTelegramBotToken() + "/getMe", String.class);
        GetMe gm = new GetMe();
        User user = new User();;
        try {
            user = gm.deserializeResponse(getMeJsonStr);
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
        return user;
    }
}
