package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by dance on 2016/9/19.
 */
@DatabaseTable(tableName = Tables.HistoryTable)
public class HistoryEntity extends BaseDbEntity {

    protected static final long serialVersionUID = 1L;
    @DatabaseField
    public String userId;

    @DatabaseField
    public String dateTime;
    @DatabaseField
    public String code;
    //路由
    @DatabaseField
    public String router;
    //标题
    @DatabaseField
    public String title;
    //描述
    @DatabaseField
    public String description;
    //图片URL地址
    @DatabaseField
    public String imageUrl;
    //用户名
    @DatabaseField
    public String fromName;
    //用户头像
    @DatabaseField
    public String fromImageUrl;
    //
    @DatabaseField
    public String serverCode;

    //0代表看,1代表学,2代表购
    @DatabaseField
    public String typeId = "1";

    //0代表视频,1代表图片,2代表广告
    @DatabaseField
    public String resourceId = "2";

    public void setLocalId(int localId)
    {
        this.localId = localId;
    }

    public String getFavouriteTime() {
        return favouriteTime;
    }

    public void setFavouriteTime(String favouriteTime) {
        this.favouriteTime = favouriteTime;
    }

    @DatabaseField
    public String favouriteTime = "";

    @DatabaseField
    public String id;


    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    private boolean isSelected;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromImageUrl() {
        return fromImageUrl;
    }

    public void setFromImageUrl(String fromImageUrl) {
        this.fromImageUrl = fromImageUrl;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
