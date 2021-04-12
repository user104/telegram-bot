package me.t.mylazybot.model.dao;


import java.util.Objects;

public class User {
    private int id;
    private boolean is_bot;
    private String first_name;
    private String username;
    private boolean can_join_groups;
    private boolean can_read_all_group_messages;
    private boolean supports_inline_queries;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_bot() {
        return is_bot;
    }

    public void setIs_bot(boolean is_bot) {
        this.is_bot = is_bot;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isCan_join_groups() {
        return can_join_groups;
    }

    public void setCan_join_groups(boolean can_join_groups) {
        this.can_join_groups = can_join_groups;
    }

    public boolean isCan_read_all_group_messages() {
        return can_read_all_group_messages;
    }

    public void setCan_read_all_group_messages(boolean can_read_all_group_messages) {
        this.can_read_all_group_messages = can_read_all_group_messages;
    }

    public boolean isSupports_inline_queries() {
        return supports_inline_queries;
    }

    public void setSupports_inline_queries(boolean supports_inline_queries) {
        this.supports_inline_queries = supports_inline_queries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                is_bot == user.is_bot &&
                can_join_groups == user.can_join_groups &&
                can_read_all_group_messages == user.can_read_all_group_messages &&
                supports_inline_queries == user.supports_inline_queries &&
                Objects.equals(first_name, user.first_name) &&
                Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, is_bot, first_name, username, can_join_groups, can_read_all_group_messages, supports_inline_queries);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", is_bot=" + is_bot +
                ", first_name='" + first_name + '\'' +
                ", username='" + username + '\'' +
                ", can_join_groups=" + can_join_groups +
                ", can_read_all_group_messages=" + can_read_all_group_messages +
                ", supports_inline_queries=" + supports_inline_queries +
                '}';
    }
}
