package com.practice.retrofit.model.request;

/**
 * Created by UQIANTU on 16/10/8.
 */

public class RequestLike
{
    //本地ID号
    private int localId;

    //点赞资源ID号
    private String serverCode;

    //时间戳
    private long dateTime;

    public void setLocalId(int localId) {
        this.localId = localId;
    }

    public int getLocalId() {
        return localId;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public long getDateTime() {
        return dateTime;
    }
}
