package com.practice.retrofit.model.request;

/**
 * 关系列表请求模型
 * friend,follow,fan,blacklist列表
 * Created by UQIANTU on 16/11/6.
 */

public class RequestListRelation
{
    public final static String  RELATION_FRIEND = "friend";
    public final static String  RELATION_FOLLOW = "follow";
    public final static String  RELATION_FAN = "fan";
    public final static String  RELATION_BLACKLIST = "blacklist";
    public String model;//friend,follow,fan,blacklist列表
    public String userId;
    public int page;
    public int pageSize;
}
