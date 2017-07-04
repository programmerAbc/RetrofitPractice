package com.practice.retrofit.model;

import java.io.Serializable;
import java.util.List;

/**
 * 获取广告
 * Created by UQIANTU on 16/11/9.
 */

public class BroadcastInfo implements Serializable {
    //标题
    private String title;

    //广告描述
    private String description;

    //图片地址
    private List<String> cover;

    //路由
    private String router;

    //serverCode
    private String serverCode;


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCover(List<String> cover) {
        this.cover = cover;
    }

    public List<String> getCover() {
        return cover;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getRouter() {
        return router;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerCode() {
        return serverCode;
    }
}
