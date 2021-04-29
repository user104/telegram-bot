package me.t.LocalManCannotBot.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TelegramBotProperties {

    public static String getTelegramBotName(){
        Properties prop = new Properties();
        try (InputStream input = TelegramBotProperties.class.getClassLoader().getResourceAsStream("application.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop.getProperty("TelegramBotUsername");
    }

    public static String getTelegramBotToken(){
        Properties prop = new Properties();
        try (InputStream input = TelegramBotProperties.class.getClassLoader().getResourceAsStream("token.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop.getProperty("LocalManCannotBot_Token");
    }

    public static String getTelegramBotPath(){
        Properties prop = new Properties();
        try (InputStream input = TelegramBotProperties.class.getClassLoader().getResourceAsStream("application.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop.getProperty("TelegramBotPath");
    }
}
