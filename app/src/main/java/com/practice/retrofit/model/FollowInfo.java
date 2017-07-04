package com.practice.retrofit.model;

/**
 * 添加关注
 * Created by UQIANTU on 16/11/20.
 */

public class FollowInfo {
    //被关注人ID
    private int targetId;
    //操作状态10表示成功,0表示失败,30表示关注对象拉黑
    private int statusCode;

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
