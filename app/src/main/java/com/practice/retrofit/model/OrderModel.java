package com.practice.retrofit.model;

import java.io.Serializable;

/**
 * 项目名称：爱一格
 * 类描述：【订单Model】
 * 创建人：xiachao
 * 创建时间：2016/11/13 16:03
 * 修改人：xiachao
 * 修改时间：2016/11/13 16:03
 * 修改备注：
 */
public class OrderModel implements Serializable{


    public int type = 0;
    public String orderId;
    public String salerId;
    public String salerAvatar;
    public String salerAccId;
    public String salerName;//机构名称
    public String cover;
    public String title;//肚皮舞基础教学
    public String tag;
    public long dateTime;//下单时间 9小时之前
    public long payTime;// 支付时间
    public String price;
    public String region;
    public String router;

    public String goods_type;//商品类型
    public String market_price;//市场价格
    public String goods_price;//商品价格
    public String preferential_price;//优惠金额

}
