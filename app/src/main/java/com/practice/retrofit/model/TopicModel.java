package com.practice.retrofit.model;



import com.practice.retrofit.util.StringUtils;

import java.util.List;

/**
 * 项目名称：爱一格
 * 类描述：【作品模型】
 * 创建人：xiachao
 * 创建时间：2016/11/9 11:25
 * 修改人：xiachao
 * 修改时间：2016/11/9 11:25
 * 修改备注：
 */
public class TopicModel {
    protected static final long serialVersionUID = 1L;


    public boolean isLike() {
        return isLiked;
    }

    public void setLike(boolean like) {
        isLiked = like;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    //是否已点赞
    private boolean isLiked = false;

    //是否已收藏
    public boolean isFavourite = false;

    public long getShowTime() {
        return showTime;
    }

    public void setShowTime(long showTime) {
        this.showTime = showTime;
    }

    public long showTime;

    public long dateTime;//时间

    public long totalTime;//总时长

    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public String getClickCount() {
        return clickCount;
    }

    public void setClickCount(String clickCount) {
        this.clickCount = clickCount;
    }

    public List<String> getCover() {
        return cover;
    }

    public void setCover(List<String> cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return StringUtils.splitString(description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getFavouriteCount() {
        return favouriteCount;
    }

    public void setFavouriteCount(String favouriteCount) {
        this.favouriteCount = favouriteCount;
    }

    public String clickCount;//点击次数
    public List<String> cover;//封面
    public String title;//标题
    public String description;//描述
    public String likeCount;//点赞次数
    public String commentCount;//点赞次数
    public String favouriteCount;//收藏次数

    public String getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(String buyCount) {
        this.buyCount = buyCount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    //购买人数
    private String buyCount;

    //购买价格
    private String price;

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    private String router;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    private String id;
    //0代表看,1代表学,2代表购
    private String typeId = "1";

    public String getServerCode() {
        return serverCode;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    //
    private String serverCode;

    public int getLikeLocalId() {
        return likeLocalId;
    }

    public void setLikeLocalId(int likeLocalId) {
        this.likeLocalId = likeLocalId;
    }

    public int getFavouriteLocalId() {
        return favouriteLocalId;
    }

    public void setFavouriteLocalId(int favouriteLocalId) {
        this.favouriteLocalId = favouriteLocalId;
    }

    //点赞LocalId
    private int likeLocalId = 0;

    //收藏LocalId
    private int favouriteLocalId = 0;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    //0代表视频,1代表图片,2代表广告
    private String resourceId = "2";

    //分享图片
    private String shareIcon;

    public void setShareIcon(String shareIcon) {
        this.shareIcon = shareIcon;
    }

    public String getShareIcon() {
        return shareIcon;
    }

    //是否已发布
    private String isPublish = "0";

    public void setIsPublish(String isPublish) {
        this.isPublish = isPublish;
    }

    public String getIsPublish() {
        return isPublish;
    }
}
