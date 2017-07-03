package com.practice.retrofit.model.request;

/**
 * 设置新密码
 * Created by UQIANTU on 16/11/4.
 */

public class RequestResetPassword
{
    //账号：手机号、用户名、邮箱等
    private String account;

    //验证码
    private String verify;

    //密码
    private String password;

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

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
