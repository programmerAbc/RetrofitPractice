package com.practice.retrofit.model.request;

/**
 * 老用户
 * Created by UQIANTU on 16/12/22.
 */

public class RequestOldUser {
    /**
     * 手机号
     */
    private String account;
    /**
     * 验证码
     */
    private String verify;

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getVerify() {
        return verify;
    }
}
