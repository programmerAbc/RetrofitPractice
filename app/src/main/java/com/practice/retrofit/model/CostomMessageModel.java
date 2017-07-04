package com.practice.retrofit.model;

import java.io.Serializable;

/**
 * Created by xiachao on 16/11/27.
 */

public class CostomMessageModel implements Serializable {

    public final static String TYPE_COMMENT = "comment";// 评论
    public final static String TYPE_LIKE = "like";// 点赞
    public final static String TYPE_ANNOUNCE = "announce";//系统消息

    private int localId;
    private String id;
    private String type;//
    private String message;
    private String timestamp;
    private String serverCode;
    private String authorAccId;
    private String router;

    // 下面是自带格式
    private String fromAccount;
    private String sessionId;
    private String sessiontype;
}
