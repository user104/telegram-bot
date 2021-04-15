package me.t.mylazybot.model.dao.results;

import me.t.mylazybot.model.dao.Message;
import java.util.Objects;

public class GetUpdatesResult {
    private int update_id;
    private Message message;

    public GetUpdatesResult() {
    }

    public int getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(int update_id) {
        this.update_id = update_id;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetUpdatesResult getUpdatesResult = (GetUpdatesResult) o;
        return update_id == getUpdatesResult.update_id &&
                Objects.equals(message, getUpdatesResult.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(update_id, message);
    }

    @Override
    public String toString() {
        return "GetUpdatesResult{" +
                "update_id=" + update_id +
                ", message=" + message +
                '}';
    }
}
