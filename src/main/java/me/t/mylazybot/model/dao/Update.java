package me.t.mylazybot.model.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import me.t.mylazybot.model.dao.results.GetUpdatesResult;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Update {
    private boolean isOk;
    private GetUpdatesResult result;

    public Update() {
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    public GetUpdatesResult getResult() {
        return result;
    }

    public void setResult(GetUpdatesResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Update update = (Update) o;
        return isOk == update.isOk &&
                Objects.equals(result, update.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOk, result);
    }

    @Override
    public String toString() {
        return "Update{" +
                "isOk=" + isOk +
                ", result=" + result +
                '}';
    }
}
