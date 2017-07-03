package com.practice.retrofit.model.request;

/**
 * 注册
 * Created by UQIANTU on 16/11/3.
 */

public class RequestReigster
{
    //账号：手机号、用户名、邮箱等
    private String account;

    //验证码
    private String verify;

    //密码
    private String password;

    //用户名
    private String userName;

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

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
