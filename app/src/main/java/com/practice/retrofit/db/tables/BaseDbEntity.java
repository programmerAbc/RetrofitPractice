package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

/**
 * Created by xiachao on 16/9/27.
 */

public class BaseDbEntity implements Serializable ,Cloneable{
    //对应状态
    public static final int NORMAL = 1;//正常
    public static final int WAITTING_INSERT = 0;//待同步上传
    public static final int WAITTING_DELETE = 2;//待删除
    public static final int UPLOAD_SUCCESS = 10;//操作成功
    public static final int DELETE_SUCCESS = 20;//删除成功
    public static final int IS_BLACK_LIST = 30;//对象已经拉黑,无法关注,删除本地关注对象
    public static final int IS_NOT_BLACK_LIST = 31;//不是黑名单

    protected static final long serialVersionUID = 1L;
    @DatabaseField(generatedId = true)
    public int localId;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @DatabaseField
    public int statusCode;

    public int getLocalId() {
        return localId;
    }

    public void setLocalId(int localId) {
        this.localId = localId;
    }

}
