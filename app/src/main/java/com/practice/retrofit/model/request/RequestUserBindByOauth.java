package com.practice.retrofit.model.request;

/**
 * 第三方账户绑定
 * Created by UQIANTU on 16/11/1.
 */

public class RequestUserBindByOauth
{


    //用户ID, 整型"0"表示未登陆
    private String openId;

    //第三方类型(支持weixin,weibo,qq), 字符串
    private String openType;

    //用户名在第三方的昵称
    private String userName;

    //用户头像
    private String avatar;

    //手机号
    private String mobile;

    //验证码
    private String verify;

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }

    public String getOpenType() {
        return openType;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    public String getMobile() {
        return mobile;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getVerify() {
        return verify;
    }

    @Override
    public String toString() {
        return "RequestUserBindByOauth{" +
                "openId='" + openId + '\'' +
                ", openType='" + openType + '\'' +
                ", userName='" + userName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", mobile='" + mobile + '\'' +
                ", verify='" + verify + '\'' +
                '}';
    }
}
