package com.practice.retrofit.model;



import com.practice.retrofit.util.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * 首页－看、学详情
 * Created by UQIANTU on 16/11/12.
 */

public class WatchLearnDetailInfo implements Serializable {
    protected static final long serialVersionUID = 1L;

    //资源ID
    private String id;

    //0代表看,1代表学,2代表购
    private String typeId = "0";

    //0代表视频,1代表图片,2代表广告
    private String resourceId = "0";

    //官方标志:1官方、非1户
    private String official;

    //大于0的。标示是中舞网员工账户
    private String adminId = "0";

    //0非认证老实，1认证老师
    private String isTeacher = "0";

    //用户ID
    private String userId;

    //用户名
    private String userName;

    //接口问题，多加一个字段
    //用户名
    private String username;

    //头像
    private String avatar;

    //时间
    private String showTime;

    //地址
    private String showAddress;

    //描述
    private String description;

    //时长
    private String totalTime = "0";

    //路由
    private String router;

    //
    private String serverCode;

    //标题
    private String title;

    //浏览数
    private String clickCount;

    //评论数据
    private String commentCount;

    //背景音乐
    private String bgSound;

    //已购买人数
    private int buyCount;

    //封面图片
    private List<String> cover;

    //标签
    private List<String> tag;

    //视频分集
    private List<VideoFilesInfo> videoFilesUrl;

    //多张图片
    private List<String> imageFilesUrl;

    //审核
    private String allow = "0";

    //视频总大小
    private String fileSize;

    //分享图片地址
    private String shareIcon;

    //是否已购买
    private int isBuy = 0;

    //售价
    private String sellPrice = "0.00";

    //原价
    private String originalPrice = "0.00";

    //是否已下架
    private String isDelete = "0";
    //是否已下架
    private String isPublish = "1";

    //状态 0 未发布 1发布 2未审核 3删除 4水印没有结束
    private int status = 1;

    //是否已点赞
    private boolean isLiked = false;

    //是否已收藏
    private boolean isFavourite = false;

    //点赞LocalId
    private int likeLocalId = 0;

    //收藏LocalId
    private int favouriteLocalId = 0;


    public String getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
    }

    public String getTargetAccId() {
        return targetAccId;
    }

    public void setTargetAccId(String targetAccId) {
        this.targetAccId = targetAccId;
    }

    private String targetUserId;

    private String targetAccId;

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

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserName() {
        return userName == null ? (username == null ? "" : username) : userName;
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
        return StringUtils.splitString(description);
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getTotalTime() {
        return totalTime;
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

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setBgSound(String bgSound) {
        this.bgSound = bgSound;
    }

    public String getBgSound() {
        return bgSound;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setCover(List<String> cover) {
        this.cover = cover;
    }

    public List<String> getCover() {
        return cover;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setVideoFilesUrl(List<VideoFilesInfo> videoFilesUrl) {
        this.videoFilesUrl = videoFilesUrl;
    }

    public List<VideoFilesInfo> getVideoFilesUrl() {
        return videoFilesUrl;
    }

    public void setImageFilesUrl(List<String> imageFilesUrl) {
        this.imageFilesUrl = imageFilesUrl;
    }

    public List<String> getImageFilesUrl() {
        return imageFilesUrl;
    }

    public void setAllow(String allow) {
        this.allow = allow;
    }

    public String getAllow() {
        return allow;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setShareIcon(String shareIcon) {
        this.shareIcon = shareIcon;
    }

    public String getShareIcon() {
        return shareIcon;
    }

    public void setIsBuy(int isBuy) {
        this.isBuy = isBuy;
    }

    public int getIsBuy() {
        return isBuy;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsPublish(String isPublish) {
        this.isPublish = isPublish;
    }

    public String getIsPublish() {
        return isPublish;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
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

    public int getFavouriteLocalId() {
        return favouriteLocalId;
    }
}
