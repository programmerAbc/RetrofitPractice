package com.practice.retrofit.model.request;

/**
 * 接入支付
 * Created by UQIANTU on 16/12/3.
 */

public class RequestPay {
    /**
     * 产品类型
     * video: 表示教学视频
     */
    private String product;

    /**
     * 产品编号
     * 如: 1001, 表示id=1001的产品
     */
    private String productId;

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }
}
