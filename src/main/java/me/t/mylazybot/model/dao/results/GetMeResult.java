package me.t.mylazybot.model.dao.results;

import me.t.mylazybot.model.dao.User;

import java.util.Objects;

public class GetMeResult {
    boolean ok;
    User result;

    public GetMeResult() {
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public User getResult() {
        return result;
    }

    public void setResult(User result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMeResult that = (GetMeResult) o;
        return ok == that.ok &&
                Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ok, result);
    }

    @Override
    public String toString() {
        return "GetMeResult{" +
                "ok=" + ok +
                ", result=" + result +
                '}';
    }
}
