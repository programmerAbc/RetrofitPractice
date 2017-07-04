package com.practice.retrofit.model;

import android.text.TextUtils;

import com.practice.retrofit.R;


/**
 * 项目名称：爱一格
 * 类描述：【关系model】
 * 创建人：xiachao
 * 创建时间：2016/11/10 21:30
 * 修改人：xiachao
 * 修改时间：2016/11/10 21:30
 * 修改备注：
 */
public class RelationModel {
    public String targetId; //被关注人ID
    public String userName;//被关注人的昵称
    public String avatar; //头像地址
    public String accId; //云信的IM帐号
    public int sex; //1代表男2代表女
    public String offical;// 是否是官方会员1表示是,0表示不是

    /**
     * 是否是官方会员1表示是,0表示不是
     * @return
     */
    public boolean  isOffical()
    {
        return !TextUtils.isEmpty(offical) && "1".equals(offical);
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
