package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * 上传任务
 * Created by UQIANTU on 16/10/21.
 */

@DatabaseTable(tableName = Tables.UploadTaskTable)
public class UploadTaskEntity implements Serializable {
    protected static final long serialVersionUID = 1L;

    public static final int STATUS_NOUPLOAD = 0;//未上传
    public static final int STATUS_UPLOADED = 1;//已发布
    public static final int STATUS_UPLOADING = 2;//正在上传
    public static final int STATUS_UPLOAD_STOP = 3;//停止上传
    public static final int STATUS_UPLOAD_FINISH = 4;//上传完成
    public static final int STATUS_UPLOAD_FAIL = 5;//上传失败

    @DatabaseField(generatedId = true)
    private int localId;

    //用户ID
    @DatabaseField
    private String userId;

    //任务类型:0代表视频、1代表图片
    @DatabaseField
    private String resourceId;

    //路由
    @DatabaseField
    private String router;

    //任务状态
    @DatabaseField
    private int status;

    //标签
    @DatabaseField
    private String tag;

    //标题
    @DatabaseField
    private String title;

    //描述
    @DatabaseField
    private String describe;

    //舞种
    @DatabaseField
    private String danceType;

    //地址
    @DatabaseField
    private String address;

    /**
     * 经纬度
     */
    @DatabaseField
    private double lat;
    @DatabaseField
    private double lng;

    //上传总数
    @DatabaseField
    private int totalCount;

    //已上传个数
    @DatabaseField
    private int uploadCount;

    //上传总大小
    @DatabaseField
    private long size;

    //已上传的文件大小
    @DatabaseField
    private long uploadSize;

    //视频总时长
    @DatabaseField
    private long totalTime;

    //时间
    @DatabaseField
    private long dateTime;

    //是否已发布
    @DatabaseField
    private String isPublish = "1";

    public void setLocalId(int localId) {
        this.localId = localId;
    }

    public int getLocalId() {
        return localId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getRouter() {
        return router;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDanceType(String danceType) {
        this.danceType = danceType;
    }

    public String getDanceType() {
        return danceType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLat() {
        return lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLng() {
        return lng;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setUploadCount(int uploadCount) {
        this.uploadCount = uploadCount;
    }

    public int getUploadCount() {
        return uploadCount;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public void setUploadSize(long uploadSize) {
        this.uploadSize = uploadSize;
    }

    public long getUploadSize() {
        return uploadSize;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public long getDateTime() {
        return dateTime;
    }


    //---------------------------------------------已上传作品模型-------------------------------------------------
    @DatabaseField
    private String id;
    //typeId
    private String typeId = "0";
    //点赞次数
    @DatabaseField
    private String likeCount = "0";
    //收藏次数
    @DatabaseField
    private String favouriteCount = "0";
    //评论数
    @DatabaseField
    private String commentCount = "0";
    //描述
    @DatabaseField
    private String description;
    //浏览数
    @DatabaseField
    private String clickCount = "0";
    //时间
    @DatabaseField
    private String showTime;
    //分享图标
    @DatabaseField
    private String shareIcon;
    //
    @DatabaseField
    private String serverCode;
    //封面图
    @DatabaseField
    private String cover;

    //是否已点赞
    private boolean isLike = false;

    //是否已收藏
    private boolean isFavourite = false;

    //点赞LocalId
    private int likeLocalId = 0;

    //收藏LocalId
    private int favouriteLocalId = 0;

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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setClickCount(String clickCount) {
        this.clickCount = clickCount;
    }

    public String getClickCount() {
        return clickCount;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShareIcon(String shareIcon) {
        this.shareIcon = shareIcon;
    }

    public String getShareIcon() {
        return shareIcon;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover() {
        return cover;
    }


    public void setLike(boolean like) {
        isLike = like;
    }

    public boolean isLike() {
        return isLike;
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

    public void setIsPublish(String isPublish) {
        this.isPublish = isPublish;
    }

    public String getIsPublish() {
        return isPublish;
    }

    //---------------------------------------------已上传作品模型-------------------------------------------------
}
