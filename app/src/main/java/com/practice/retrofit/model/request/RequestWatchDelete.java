package com.practice.retrofit.model.request;

/**
 * 删除看
 * Created by UQIANTU on 16/12/4.
 */

public class RequestWatchDelete {

    /**
     * serverId号
     */
    private String serverId;

    /**
     * 路由
     */
    private String router;

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getServerId() {
        return serverId;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getRouter() {
        return router;
    }
}
