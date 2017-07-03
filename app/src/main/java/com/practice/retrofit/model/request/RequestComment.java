package com.practice.retrofit.model.request;

/**
 * 评论
 * Created by UQIANTU on 16/11/14.
 */

public class RequestComment {
    /**
     * serverCode码
     */
    private String serverCode;

    /**
     * 页数
     */
    private int page = 1;

    /**
     * 页面条数
     */
    private int pageSize = 10;

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }
}
