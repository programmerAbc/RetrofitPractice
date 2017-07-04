package com.practice.retrofit.model;

import java.io.Serializable;
import java.util.List;

/**
 * 相关：视频、图片等信息
 * Created by UQIANTU on 16/11/13.
 */

public class VideoAboutInfo implements Serializable {
    protected static final long serialVersionUID = 1L;

    //资源ID
    private String id;

    //0代表看,1代表学,2代表购
    private String typeId = "0";

    //0代表视频,1代表图片,2代表广告
    private String resourceId = "0";

    //3代表咨询， 4代表专题
    private String watchType = "0";

    //标题
    private String title;

    //浏览数
    private String clickCount;

    //路由
    private String router;

    //
    private String serverCode;

    //封面图片
    private List<String> cover;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setWatchType(String watchType) {
        this.watchType = watchType;
    }

    public String getWatchType() {
        return watchType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setClickCount(String clickCount) {
        this.clickCount = clickCount;
    }

    public String getClickCount() {
        return clickCount;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getRouter() {
        return router;
    }

    public void setCover(List<String> cover) {
        this.cover = cover;
    }

    public List<String> getCover() {
        return cover;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerCode() {
        return serverCode;
    }
}
