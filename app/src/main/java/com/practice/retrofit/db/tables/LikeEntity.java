package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * 点赞
 * Created by UQIANTU on 16/10/9.
 */

@DatabaseTable(tableName = Tables.LikeTable)
public class LikeEntity extends BaseDbEntity {
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

    @Override
    public String toString() {
        return "localId=" + localId +
                ", userId='" + userId + "\'" +
                ", serverCode='" + serverCode + "\'" +
                ", statusCode=" + statusCode +
                ", dateTime=" + dateTime;
    }
}