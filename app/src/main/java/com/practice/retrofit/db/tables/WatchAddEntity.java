package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;

import java.util.List;

/**
 * 添加看
 * Created by UQIANTU on 16/12/1.
 */

public class WatchAddEntity extends BaseDbEntity {
    //0是视频,1是图片
    @DatabaseField
    private String resourceId;
    //标题
    @DatabaseField
    private String title;
    //描述
    @DatabaseField
    private String description;
    //舞种
    @DatabaseField
    private String danceType;
    //标签
    @DatabaseField
    private List<String> tag;
    //文件大小t
    @DatabaseField
    private String fileSize;
    //时间总长
    @DatabaseField
    private String totalTime;
    //图片地址数组
    @DatabaseField
    private List<String> imageFiles;
    //视频地址数组
    @DatabaseField
    private List<String> videoFiles;
    //显示地址
    @DatabaseField
    private String showAddress;
    //经度
    @DatabaseField
    private String lon;
    //纬度
    @DatabaseField
    private String lat;
    //时间
    @DatabaseField
    private String dateTime;

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDanceType(String danceType) {
        this.danceType = danceType;
    }

    public String getDanceType() {
        return danceType;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setImageFiles(List<String> imageFiles) {
        this.imageFiles = imageFiles;
    }

    public List<String> getImageFiles() {
        return imageFiles;
    }

    public void setVideoFiles(List<String> videoFiles) {
        this.videoFiles = videoFiles;
    }

    public List<String> getVideoFiles() {
        return videoFiles;
    }

    public void setShowAddress(String showAddress) {
        this.showAddress = showAddress;
    }

    public String getShowAddress() {
        return showAddress;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLat() {
        return lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLon() {
        return lon;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }
}
