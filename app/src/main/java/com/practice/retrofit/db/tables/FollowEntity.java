package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by dance on 2016/9/19.
 */
@DatabaseTable(tableName = Tables.FollowTable)
public class FollowEntity extends BaseDbEntity {

    protected static final long serialVersionUID = 1L;


    @DatabaseField
    public String targetId = "";//被关注人id

    @DatabaseField
    public String userName = "";

    @DatabaseField
    public String avatar = "";

    @DatabaseField
    public int sex = 0;

    @DatabaseField
    public String accId = "";

    @DatabaseField
    public int offical = 0;

    @DatabaseField
    public String myUserId = "";//我的用户id

    @DatabaseField
    public long dateTime = 0;//关注的时间

    @DatabaseField
    public int blanckListStatus=IS_NOT_BLACK_LIST;//黑名单状态

    // 是否是官方会员1表示是,0表示不是
    public boolean isOffical() {
        return offical == 1;
    }


    @Override
    public String toString() {
        return "localId=" + localId +
                ", targetId='" + targetId + "\'" +
                ", userName='" + userName + "\'" +
                ", avatar='" + avatar + "\'" +
                ", sex='" + sex + "\'" +
                ", accId='" + accId + "\'" +
                ", offical=" + offical +
                ", myUserId='" + myUserId + "\'" +
                ", dateTime=" + dateTime;
    }

}
