package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by UQIANTU on 16/11/15.
 */

@DatabaseTable(tableName = Tables.CommentTable)
public class CommentAddEntity extends BaseDbEntity {
    protected static final long serialVersionUID = 1L;

    //点赞资源ID号
    @DatabaseField
    private String serverCode;

    //用户ID号
    @DatabaseField
    private String userId;

    //时间戳
    @DatabaseField
    private long dateTime;

    //发送的内容
    @DatabaseField
    private String message;

    //图片地址
    @DatabaseField
    private String imageUrl;

    //语音信息
    @DatabaseField
    private String voice;

    @Override
    public void setLocalId(int localId) {
        super.setLocalId(localId);
    }

    @Override
    public int getLocalId() {
        return super.getLocalId();
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public long getDateTime() {
        return dateTime;
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

    @Override
    public String toString() {
        return "localId=" + localId +
                ", userId='" + userId + "\'" +
                ", serverCode='" + serverCode + "\'" +
                ", message='" + message + "\'" +
                ", imageUrl='" + imageUrl + "\'" +
                ", voice='" + voice + "\'" +
                ", dateTime=" + dateTime;
    }
}