package me.t.mylazybot.model.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {

    private int message_id;
    private User userFrom;
    private Chat chat;
    private int date;
    private String text;

    public Message() {
    }

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public User getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(User userFrom) {
        this.userFrom = userFrom;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message that = (Message) o;
        return message_id == that.message_id &&
                date == that.date &&
                Objects.equals(userFrom, that.userFrom) &&
                Objects.equals(chat, that.chat) &&
                Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message_id, userFrom, chat, date, text);
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", userFrom=" + userFrom +
                ", chat=" + chat +
                ", date=" + date +
                ", text='" + text + '\'' +
                '}';
    }
}
