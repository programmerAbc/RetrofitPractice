package com.practice.retrofit.model.request;

/**
 * 验证验证码
 * Created by UQIANTU on 16/11/12.
 */

public class RequestVerify
{
    private String account;

    private String verify;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getVerify() {
        return verify;
    }
}
