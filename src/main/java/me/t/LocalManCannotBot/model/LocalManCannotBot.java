package me.t.LocalManCannotBot.model;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * "@LocalManCannotBot" is user name of this Telegram bot
 */
@Component
public class LocalManCannotBot extends TelegramWebhookBot {

    @Override
    public String getBotUsername() {
        return TelegramBotProperties.getTelegramBotName();
    }

    @Override
    public String getBotToken() {
        return TelegramBotProperties.getTelegramBotToken();
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        TelegramBotAPI telegramBotAPI = new TelegramBotAPI();
        SendMessage sendMessage = new SendMessage();
        if (telegramBotAPI.isMessageWithText(update)) {
            sendMessage.setChatId(update.getMessage().getChatId().toString());
            sendMessage.setText(update.getMessage().getText());
        }
        return sendMessage;
    }

    @Override
    public String getBotPath() {
        return TelegramBotProperties.getTelegramBotPath();
    }
}
