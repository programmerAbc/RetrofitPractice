package com.practice.retrofit.db.tables;


import com.practice.retrofit.model.BaseInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 发布作品
 * Created by UQIANTU on 16/11/29.
 */

public class PublishInfo extends BaseInfo {
    private List<MyProductEntity> productEntityList = new ArrayList<>();

    public void setProductEntityList(List<MyProductEntity> productEntityList) {
        this.productEntityList = productEntityList;
    }

    public List<MyProductEntity> getProductEntityList() {
        return productEntityList;
    }

    public void addProductEntity(MyProductEntity productEntity) {
        productEntityList.add(productEntity);
    }

    public void addProductEntityList(List<MyProductEntity> list) {
        productEntityList.addAll(list);
    }
}