package com.practice.retrofit.model.request;

/**
 * 相关：视频、图片
 * Created by UQIANTU on 16/11/13.
 */

public class RequestVideoAbout {
//    /**
//     * ID号
//     */
//    private String id;
//
//    /**
//     * 页数
//     */
//    private int page = 1;
//
//    /**
//     * 页面条数
//     */
//    private int pageSize = 10;
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setPage(int page) {
//        this.page = page;
//    }
//
//    public int getPage() {
//        return page;
//    }
//
//    public void setPageSize(int pageSize) {
//        this.pageSize = pageSize;
//    }
//
//    public int getPageSize() {
//        return pageSize;
//    }

    /**
     * Server Code
     */
    private String serverCode;

    private int top = 0;

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getTop() {
        return top;
    }
}
