package org.example;

public class User {
    int user_id;
    String user_name;
    String user_log;
    String user_pass;

    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_log() {
        return user_log;
    }
    public void setUser_log(String user_log) {
        this.user_log = user_log;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }
}
