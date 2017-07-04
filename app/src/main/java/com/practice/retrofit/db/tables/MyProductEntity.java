package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.practice.retrofit.model.BaseInfo;


/**
 * 我的发布数据表
 * Created by UQIANTU on 16/10/11.
 */

@DatabaseTable(tableName = Tables.MyProductTable)
public class MyProductEntity extends BaseInfo {
    public static final int STATUS_NOUPLOAD = 0;
    public static final int STATUS_UPLOADED = 1;
    public static final int STATUS_UPLOADING = 2;
    public static final int STATUS_UPLOAD_STOP = 3;
    public static final int STATUS_UPLOAD_FINISH = 4;
    public static final int STATUS_UPLOAD_FAIL = 5;

    @DatabaseField(generatedId = true)
    private int localId;
    @DatabaseField
    private String userId;
    //0代表视频,1代表图片,2代表广告
    @DatabaseField
    private String resourceId;
    @DatabaseField
    private String router;
    @DatabaseField
    private String title;
    @DatabaseField
    private String videoId;
    @DatabaseField
    private String videoName;
    @DatabaseField
    private String fileId;
    @DatabaseField
    private String videoPath;
    @DatabaseField
    private String videoUrl;
    @DatabaseField
    private String imgPath;
    @DatabaseField
    private String imgUrl;
    @DatabaseField
    private String danceType;
    @DatabaseField
    private String location;
    @DatabaseField
    private double latitude;
    @DatabaseField
    private double longitude;
    @DatabaseField
    private long videoTime;
    @DatabaseField
    private long createTime;
    @DatabaseField
    private long uploadTime;
    @DatabaseField
    private int taskId;
    @DatabaseField
    private int status;
    @DatabaseField
    private long size;
    @DatabaseField
    private long compeleteSize;
    @DatabaseField
    private String uploadToken;

    public int errno;
    public String error;

    public int getLocalId() {
        return localId;
    }

    public void setLocalId(int localId) {
        this.localId = localId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDanceType() {
        return danceType;
    }

    public void setDanceType(String danceType) {
        this.danceType = danceType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(long videoTime) {
        this.videoTime = videoTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getCompeleteSize() {
        return compeleteSize;
    }

    public void setCompeleteSize(long compeleteSize) {
        this.compeleteSize = compeleteSize;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(long uploadTime) {
        this.uploadTime = uploadTime;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUploadToken() {
        return uploadToken;
    }

    public void setUploadToken(String uploadToken) {
        this.uploadToken = uploadToken;
    }
}