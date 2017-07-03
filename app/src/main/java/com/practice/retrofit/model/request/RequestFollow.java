package com.practice.retrofit.model.request;

/**
 * 添加关注
 * Created by UQIANTU on 16/11/20.
 */

public class RequestFollow {
    //关注人ID
    private String targetId;
    //时间
    private long dateTime;

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public long getDateTime() {
        return dateTime;
    }
}
