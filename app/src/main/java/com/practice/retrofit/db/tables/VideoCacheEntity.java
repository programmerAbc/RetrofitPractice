package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by UQIANTU on 16/10/26.
 */

@DatabaseTable(tableName = Tables.VideoCacheTable)
public class VideoCacheEntity implements Serializable
{
    protected static final long serialVersionUID = 1L;

    public static final int STATUS_WAIT_DOWNLOAD = 0;//未下载
    public static final int STATUS_FINISHED = 1;//下载完成
    public static final int STATUS_DOWNING = 2;//正在下载
    public static final int STATUS_PAUSE = 3;//暂停

    @DatabaseField(generatedId = true)
    private int localId;
    @DatabaseField
    private String videoId;
    @DatabaseField
    private String title;
    @DatabaseField
    private String url;
    @DatabaseField
    private String path;
    @DatabaseField
    private String imageUrl;
    @DatabaseField
    private long size;
    @DatabaseField
    private long compeleteSize;
    /**
     *  0 : 未读  1 : 已读
     */
    @DatabaseField
    private int isRead;
    /**
     * 0 : 未下载  1 ：下载完成   2 : 正在下载  3 : 暂停
     */
    @DatabaseField
    private int status;
    @DatabaseField
    private int page;
    @DatabaseField
    private long duration;

    public long lastDownloadTime;//最后一次下载的时间
    public VideoCacheEntity() {
    }

    public int getLocalId() {
        return localId;
    }
    public void setLocalId(int localId) {
        this.localId = localId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
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
    public int getIsRead() {
        return isRead;
    }
    public void setIsRead(int isRead) {
        this.isRead = isRead;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public long getDuration() {
        return duration;
    }
    public void setDuration(long duration) {
        this.duration = duration;
    }
    public String getVideoId() {
        return videoId;
    }
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
