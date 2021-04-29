package me.t.LocalManCannotBot.model;

import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBotAPI {


    public boolean isMessageWithText(Update update) {
        return !update.hasCallbackQuery() && update.hasMessage() && update.getMessage().hasText();
    }
}
