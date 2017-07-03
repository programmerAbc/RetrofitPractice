package com.practice.retrofit.model.request;

/**
 * 获取验证码
 * Created by UQIANTU on 16/11/3.
 */

public class RequestVerifyCode
{
    private String account;

    private String condition;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }
}
