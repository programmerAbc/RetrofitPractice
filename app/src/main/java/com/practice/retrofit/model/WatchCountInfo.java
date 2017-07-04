package com.practice.retrofit.model;

/**
 * 看统计信息
 * Created by UQIANTU on 16/12/3.
 */

public class WatchCountInfo {
    //ID号
    private String id;
    //点击次数
    private String clickCount;
    //点赞次数
    private String likeCount;
    //收藏次数
    private String favouriteCount;
    //评论次数
    private String commentCount;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setClickCount(String clickCount) {
        this.clickCount = clickCount;
    }

    public String getClickCount() {
        return clickCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setFavouriteCount(String favouriteCount) {
        this.favouriteCount = favouriteCount;
    }

    public String getFavouriteCount() {
        return favouriteCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getCommentCount() {
        return commentCount;
    }
}
