package com.practice.retrofit.model;

/**
 * Created by UQIANTU on 16/12/3.
 */

public class PayInfo {
    /**
     * 支付地址
     * 客户端APP使用WebView打开该地址, 进入支付流程
     * 注意: IOS版APP需同时遵循以下策略
     */
    private String payUrl;

    /**
     * 支付模式(限IOS)
     * 安卓版APP跳过从该字段开始的以下全部字段
     * 当返回值为apple时, IOS版APP需调用内置的苹果支付。
     * 场景: APP在审核期间使用的支付方式默认使用苹果支付，一经审核通过，由服务端决定 是否继续使用苹果支付；若关闭苹果支付，IOS将和Android一致，全部使用HTML5方式 完全支付过程。
     */
    private String payMode;

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getPayUrl() {
        return payUrl;
    }


}
