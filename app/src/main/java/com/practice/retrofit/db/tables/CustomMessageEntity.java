package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by xiachao on 16/11/28.
 */

@DatabaseTable(tableName = Tables.CustomMessageTable)
public class CustomMessageEntity {

    public final static String TYPE_COMMENT = "comment";// 评论
    public final static String TYPE_LIKE = "like";// 点赞
    public final static String TYPE_ANNOUNCE = "announce";//系统消息

    public final static int MY_POST = 1;//我发出的
    public final static int MY_PARTICIPATION= 0;//我参与的
    protected static final long serialVersionUID = 1L;

    //点赞资源ID号
    @DatabaseField
    public String serverCode;

    @DatabaseField(generatedId = true)
    public int localId;

    @DatabaseField
    public String id;

    @DatabaseField
    public String type;//

    @DatabaseField
    public String title;

    @DatabaseField
    public String message;

    @DatabaseField
    public String timestamp;

    @DatabaseField
    public String authorAccId;

    @DatabaseField
    public String router;

    // 下面是自定义格式

    @DatabaseField
    public String fromAccount;

    @DatabaseField
    public String sessionId;

    @DatabaseField
    public String sessionType;

    @DatabaseField
    public String myAccId;

    @DatabaseField
    public int unreadCount;

    @DatabaseField
    public int messageTag;// 0是我发出的 1是我参与的



}
