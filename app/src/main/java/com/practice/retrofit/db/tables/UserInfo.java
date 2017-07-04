package com.practice.retrofit.db.tables;

import android.text.TextUtils;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


/**
 * Created by xiachao on 16/10/9.
 */
@DatabaseTable(tableName = Tables.UserTable)
public class UserInfo {

    public String getAccToken() {
        return accToken;
    }

    public void setAccToken(String accToken) {
        this.accToken = accToken;
    }

    public String accToken;

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    @DatabaseField()
    public String accId;

    @DatabaseField(generatedId = true)
    public String userId;

    @DatabaseField()
    public String userName;

    @DatabaseField()
    public String sex;// 1：男   2：女

    @DatabaseField()
    public String birthday;

    @DatabaseField()
    public String avatar;//头像地址

    @DatabaseField()
    public String region;

    @DatabaseField()
    public String danceType;

    @DatabaseField()
    public int fans;

    @DatabaseField()
    public int follow;

    @DatabaseField()
    public String official;

//    @DatabaseField()
//    public String isTeacher;//userTpye != 2 就是供应商,就是isTeacher

    @DatabaseField()
    public int userType;// 1 机构供应商创业版 2 ：消费者 3：个人供应商 4：机构供应商创业版成长版 5：机构供应商 集团版
    //TODO 只要不是2 就表示可以发视频,这里TAG一下 sun说,他们代码里面写的也是这个逻辑,所以未来如果有其他的类型导致非2的时候不能发视频,那么后台和App都要改代码。


    @DatabaseField()
    public String mobileVerified;


    public String getAuthmobile() {
        return authmobile;
    }

    public void setAuthmobile(String authmobile) {
        this.authmobile = authmobile;
    }

    public String authmobile;//0表示老用户没有绑定手机号，1表示正常
    /**
     * 1：男   2：女
     *
     * @return
     */
    public boolean isBoy() {
        return !TextUtils.isEmpty(sex) && sex.equals("1");
    }

    /**
     * 1：男   2：女
     *
     * @return
     */
    public boolean isGirl() {
        return !TextUtils.isEmpty(sex) && sex.equals("2");
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @DatabaseField()
    public String session;

    public String accessToken;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDanceType() {
        return danceType;
    }

    public void setDanceType(String danceType) {
        this.danceType = danceType;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public int getFollow() {
        return follow;
    }

    public void setFollow(int follow) {
        this.follow = follow;
    }

    public String getOfficial() {
        return official;
    }

    public boolean isOfficial() {
        return !TextUtils.isEmpty(official) && official.equals("1");
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    /**
     * 是否是 供应商 非2,都是供应商,可以发视频
     * @return
     */
    public boolean isProvider() {
        return  userType != 2 && userType != 0;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public void setMobileVerified(String mobileVerified) {
        this.mobileVerified = mobileVerified;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "accToken='" + accToken + '\'' +
                ", accId='" + accId + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", avatar='" + avatar + '\'' +
                ", region='" + region + '\'' +
                ", danceType='" + danceType + '\'' +
                ", fans=" + fans +
                ", follow=" + follow +
                ", official='" + official + '\'' +
                ", userType=" + userType +
                ", mobileVerified='" + mobileVerified + '\'' +
                ", session='" + session + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }

    public String getMobileVerified() {
        return mobileVerified;
    }


}
