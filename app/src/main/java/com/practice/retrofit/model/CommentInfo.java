package com.practice.retrofit.model;

import java.io.Serializable;

/**
 * 评论信息
 * Created by UQIANTU on 16/11/14.
 */

public class CommentInfo implements Serializable {
    protected static final long serialVersionUID = 1L;

    //ServerID号
    private String id;

    //是否是官方官员
    private String official;

    //用户ID
    private String userId;

    //用户名
    private String userName;

    //头像
    private String avatar;

    //评论内容
    private String message;

    //图片
    private String imageUrl;

    //声音
    private String voice;

    //时间
    private String dateTime;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getOfficial() {
        return official;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
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

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }
}
