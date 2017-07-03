package com.practice.retrofit.model.request;

/**
 * Created by Administrator on 2016/9/23.
 */

public class RequestLogin {
    private String account;
    private String password;

    public RequestLogin(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
