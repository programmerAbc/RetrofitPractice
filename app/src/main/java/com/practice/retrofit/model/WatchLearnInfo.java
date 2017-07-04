package com.practice.retrofit.model;



import com.practice.retrofit.util.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * 看、学列表数据信息
 * Created by UQIANTU on 16/11/6.
 */

public class WatchLearnInfo implements Serializable {
    protected static final long serialVersionUID = 1L;


    private String id;

    //官方标志:1官方、非1用户
    private String official = "0";

    //大于0的。标示是中舞网员工账户
    private String adminId = "0";

    //0非认证老实，1认证老师
    private String isTeacher = "0";

    //用户ID
    private String userId;

    //0代表看,1代表学,2代表购
    private String typeId = "0";

    //0代表视频,1代表图片,2代表广告
    private String resourceId = "2";

    //3代表咨询， 4代表专题
    private String watchType = "0";

    //点赞条数
    private String likeCount;

    //收藏条数
    private String favouriteCount;

    //评论条数
    private String commentCount;

    //浏览条数
    private String clickCount;

    //图片
    private List<String> cover;

    //显示地址
    private String showAddress = "";

    //描述
    private String description;

    //标题
    private String title;

    //用户名
    private String username;
    //接口问题，多加一个字段
    //用户名
    private String userName;

    //头像
    private String avatar;

    //时间描述
    private String showTime = "";

    //路由
    private String router;

    //
    private String serverCode;

    //分享图片地址
    private String shareIcon;

    //购买人数
    private String buyCount;

    //购买价格
    private String price = "0.00";

    //原始价格
    private String originalPrice = "0.00";

    //时间
    private String dateTime;

    //是否已点赞
    private boolean isLiked = false;

    //是否已收藏
    private boolean isFavourite = false;

    //点赞LocalId
    private int likeLocalId = 0;

    //收藏LocalId
    private int favouriteLocalId = 0;

    public int getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(int favoriteType) {
        this.favoriteType = favoriteType;
    }

    private int favoriteType = 0;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getOfficial() {
        return official;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setIsTeacher(String isTeacher) {
        this.isTeacher = isTeacher;
    }

    public String getIsTeacher() {
        return isTeacher;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
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

    public void setClickCount(String clickCount) {
        this.clickCount = clickCount;
    }

    public String getClickCount() {
        return clickCount;
    }

    public void setCover(List<String> cover) {
        this.cover = cover;
    }

    public List<String> getCover() {
        return cover;
    }

    public void setShowAddress(String showAddress) {
        this.showAddress = showAddress;
    }

    public String getShowAddress() {
        return showAddress;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description != null ? StringUtils.splitString(description) : null;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUsername() {
        return username == null ? (userName == null ? "" : userName) : username;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getShowTime() {
        return showTime;
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

    public void setLike(boolean like) {
        isLiked = like;
    }

    public boolean isLike() {
        return isLiked;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setLikeLocalId(int likeLocalId) {
        this.likeLocalId = likeLocalId;
    }

    public int getLikeLocalId() {
        return likeLocalId;
    }

    public void setFavouriteLocalId(int favouriteLocalId) {
        this.favouriteLocalId = favouriteLocalId;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public int getFavouriteLocalId() {
        return favouriteLocalId;
    }

    public void setShareIcon(String shareIcon) {
        this.shareIcon = shareIcon;
    }

    public String getShareIcon() {
        return shareIcon;
    }

    public void setBuyCount(String buyCount) {
        this.buyCount = buyCount;
    }

    public String getBuyCount() {
        return buyCount;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }
}
