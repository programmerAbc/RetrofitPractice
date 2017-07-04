package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by dance on 2016/9/19.
 */
@DatabaseTable(tableName = Tables.FavouriteTable)
public class FavouriteEntity extends BaseDbEntity {

//    /**
//     * 看
//     */
//    public static final int RESOURCE_ID_WATCH = 0;
//
//    /**
//     * 学
//     */
//    public static final int RESOURCE_ID_LEARN = 1;
//
//    /**
//     * 购
//     */
//    public static final int RESOURCE_ID_SHOPPING = 2;

    //路由
    @DatabaseField
    public String router;

    @DatabaseField
    public String serverCode;

    //描述
    @DatabaseField
    public String description;

    //图片URL地址
    @DatabaseField
    public String imageUrl;

    //来源名称
    @DatabaseField
    public String fromName = "";

    //来源图片URL地址
    @DatabaseField
    public String fromImageUrl = "";

    //标题
    @DatabaseField
    public String title;

    //时间戳
    @DatabaseField
    public long dateTime;

    //资源ID
    //0代表视频,1代表图片,2代表广告
    @DatabaseField
    public String resourceId;

    // (自定义字段,非服务端同步字段)我的用户Id 用于多用户登录切换账号  收藏数据库进行筛选
    @DatabaseField
    public String myUserId;

    //用来更新索引,路由(router)md5加密的,用来判断资源的唯一值所用,在数据库中查询是否存在同样的资源的时候用code判断
    @DatabaseField
    public String code;
    protected static final long serialVersionUID = 1L;

    //(用于model批量选择标记)
    public boolean selected;
//
//    @DatabaseField
//    public String avatar;
//
//    @DatabaseField
//    public String userName;
//
//
//
//    @DatabaseField
//    public String userId;
//
    // 资源类型,提交的时候服务器根据serverCode判断是看还是学,而同步下载下来的数据中 服务器会给typeId字段值
    // 0看 1学 2购
    @DatabaseField
    public String typeId;
//
//
//
//
//
//
//
//    //图片URL地址
//    @DatabaseField
//    public String cover;




    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }



    public String getMyUserId() {
        return myUserId;
    }

    public void setMyUserId(String myUserId) {
        this.myUserId = myUserId;
    }

    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

//    public String getAvatar() {
//        return avatar;
//    }
//
//    public void setAvatar(String avatar) {
//        this.avatar = avatar;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceId() {
        return resourceId;
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

//    public String getCover() {
//        return cover;
//    }
//
//    public void setCover(String cover) {
//        this.cover = cover;
//    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public void setFromImageUrl(String fromImageUrl) {
        this.fromImageUrl = fromImageUrl;
    }

    public String getFromImageUrl() {
        return fromImageUrl;
    }




    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public Object clone() {
        FavouriteEntity stu = null;
        try{
            stu = (FavouriteEntity)super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return stu;
    }
}
