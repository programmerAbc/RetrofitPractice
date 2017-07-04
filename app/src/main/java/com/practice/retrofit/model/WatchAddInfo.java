package com.practice.retrofit.model;

/**
 * Created by UQIANTU on 16/12/1.
 */

public class WatchAddInfo {
    //服务器ID
    private String serverId;

    //localId
    private String localId;

    //路由
    private String router;

    //操作状态,10表示成功,0表示失败
    private String statusCode;

    //
    private String serverCode;

    //分享图标
    private String shareIcon;

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getServerId() {
        return serverId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public String getLocalId() {
        return localId;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getRouter() {
        return router;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setShareIcon(String shareIcon) {
        this.shareIcon = shareIcon;
    }

    public String getShareIcon() {
        return shareIcon;
    }
}
