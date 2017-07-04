package com.practice.retrofit.model;


import java.io.Serializable;


/**
 * 类描述：【订单详情】
 * 创建人：xiachao
 * 创建时间：2016/11/18 11:04
 */
public class OrderDetailModel implements Serializable {
    /**
     * 订单状态码
     * 0、下单完成/未选择支付方式
     * 1、支付成功
     * 2、订单交易失败
     * 3、等待支付
     * 5、等待收货
     * 21、已取消订单
     * 22、已退款
     */
    public static final int ORDER_STATUS_NOT_PAY_0 = 0;//下单完成/未选择支付方式
    public static final int ORDER_STATUS_PAY_FINISH_1 = 1;//支付成功
    public static final int ORDER_STATUS_FAILED_2 = 2;//订单交易失败
    public static final int ORDER_STATUS_WAIT_PAY_3 = 3;//等待支付
    public static final int ORDER_STATUS_TAKE_AKE_GOODS_5 = 5;//等待收货
    public static final int ORDER_STATUS_ORDER_CANCEL_21 = 21;//已取消订单
    public static final int ORDER_STATUS_REFUND_22 = 22;//已退款
    public String salerAvatar;//	头像
    public String salerId;//	卖家ID号
    public String salerName;//	卖家名称(用户名/机构名)
    public String salerAccId;
    public long paymentTime;//支付时间
    public String spend;//实付金额
    //    public String price;//原价
//    public String buyPrice;//现价(下单时的价格)
    public String region;//
    public String cover;//	http://images.baidu.com	封面
    public String title;//	商品标题/名称
    public long dateTime;   //下订单时间
    public String tag;//#芭蕾舞	标签
    public String orderId;//订单标号
    public int statusCode;//订单状态
    public String router;

    public String market_price;//支付金额
    public String goods_price;//商品价格
    public String preferential_price;//优惠金额

    /**
     * 商品类型:
     * 培训卡 2002
     * 教室出租2003
     * 班级（大师课）2004
     * 私教 2005
     * 通用商品2006
     * 教学视频2007
     */
    public int goods_type = 2001;

    public String getStatusCodeString() {
        String statusName = "";
        return statusName;
    }
}

