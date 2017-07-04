package com.practice.retrofit.model;

import java.io.Serializable;

/**
 * 启动页参数,传递和返回一样
 */
public class StartInfo implements Serializable{
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    private String accId;
    private String session;
    private String accessToken;

    public String getAccToken() {
        return accToken;
    }

    public void setAccToken(String accToken) {
        this.accToken = accToken;
    }

    private String accToken;


    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "StartInfo{" +
                "userId='" + userId + '\'' +
                ", accId='" + accId + '\'' +
                ", session='" + session + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", accToken='" + accToken + '\'' +
                '}';
    }
}
