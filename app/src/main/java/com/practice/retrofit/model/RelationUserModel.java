package com.practice.retrofit.model;

import com.practice.retrofit.R;

import java.io.Serializable;



/**
 * 类描述：【关系用户】
 * 创建人：xiachao
 * 创建时间：2016/11/18 15:45
 */
public class RelationUserModel implements Serializable {
    public String targetUserId;// 被关注人ID
    public String userName;//被关注人昵称
    public String avatar;//头像地址
    public int sex;//性别
    public String accId;//云信的Im
    public int offical;// 是否是官方
    public boolean isFollowed;
    public boolean isMySelf = false;//是否是自己

    public boolean isBoy()
    {
        return sex == 1;
    }

    public boolean isGirl()
    {
        return sex == 2;
    }

    public boolean isOffical()
    {
        return offical==1;
    }

    /**
     * 获取性别图片
     * @return
     */
    public int getSexImage()
    {
        return sex == 1? R.drawable.ico_boy:R.drawable.ico_girl;
    }
}
