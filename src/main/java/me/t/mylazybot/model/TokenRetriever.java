package me.t.mylazybot.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TokenRetriever {

    public String getTelegramBotToken(){
        Properties prop = new Properties();

        try (InputStream input = TokenRetriever.class.getClassLoader().getResourceAsStream("token.properties")) {

            prop.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop.getProperty("LocalManCannotBot_Token");
    }
}
