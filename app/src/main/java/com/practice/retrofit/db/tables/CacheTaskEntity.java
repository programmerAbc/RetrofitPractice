package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * 缓存任务数据库
 * Created by UQIANTU on 16/11/23.
 */

@DatabaseTable(tableName = Tables.CacheTaskTable)
public class CacheTaskEntity implements Serializable {
    protected static final long serialVersionUID = 1L;

    public static final int STATUS_WAIT_DOWNLOAD = 0;//未下载
    public static final int STATUS_FINISHED = 1;//下载完成
    public static final int STATUS_DOWNING = 2;//正在下载
    public static final int STATUS_PAUSE = 3;//暂停

    public static final int TYPE_WATCH = 0;//0代表看
    public static final int TYPE_LEARN = 1;//1代表学

    @DatabaseField(generatedId = true)
    private int localId;

    //用户ID
    @DatabaseField
    private String userId;

    //视频ID
    @DatabaseField
    private String videoId;

    //缓存类型:0代表看,1代表学
    @DatabaseField
    private int typeId = -1;

    //标题
    @DatabaseField
    private String title;

    //描述
    @DatabaseField
    private String description;

    //视频封面图
    @DatabaseField
    private String cover;

    //缓存状态
    @DatabaseField
    private int status;

    //视频总个数
    @DatabaseField
    private int total;

    //已下载视频个数
    @DatabaseField
    private int downloadCount;

    //缓存总大小
    @DatabaseField
    private long size;

    //已缓存的文件大小
    @DatabaseField
    private long completeSize;

    //ServerCode
    @DatabaseField
    private String serverCode;

    @DatabaseField
    //缓存时间
    private String createTime;

    //是否显示编辑
    private boolean isEdit = false;

    //是否选中
    private boolean isSelect = false;

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

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover() {
        return cover;
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

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public void setCompleteSize(long completeSize) {
        this.completeSize = completeSize;
    }

    public long getCompleteSize() {
        return completeSize;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setEdit(boolean edit) {
        isEdit = edit;
    }

    public boolean getEdit() {
        return isEdit;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public boolean getSelect() {
        return isSelect;
    }
}
