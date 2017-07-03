package com.practice.retrofit.model.request;

/**
 * 删除评论
 * Created by UQIANTU on 16/11/15.
 */

public class RequestCommentRemove {

    /**
     * ID号
     */
    private int id;
    /**
     * serverCode码
     */
    private String serverCode;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerCode() {
        return serverCode;
    }
}
