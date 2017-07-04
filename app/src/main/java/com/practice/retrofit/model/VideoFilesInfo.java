package com.practice.retrofit.model;

/**
 * 视频分集
 * Created by UQIANTU on 16/11/12.
 */

public class VideoFilesInfo {
    //标题
    private String title;

    //地址
    private String videoFileUrl;

    //视频封面
    private String cover;

    //是否免费
    private String isFree = "1";

    //是否已下载
    private boolean isDownload = false;

    //是否选择
    private boolean isSelected = false;

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    private long fileSize;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setVideoFileUrl(String videoFileUrl) {
        this.videoFileUrl = videoFileUrl;
    }

    public String getVideoFileUrl() {
        return videoFileUrl;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean getSelected() {
        return isSelected;
    }

    public void setIsFree(String isFree) {
        this.isFree = isFree;
    }

    public String getIsFree() {
        return isFree;
    }

    public void setDownload(boolean download) {
        isDownload = download;
    }

    public boolean getDownload() {
        return isDownload;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover() {
        return cover;
    }
}
