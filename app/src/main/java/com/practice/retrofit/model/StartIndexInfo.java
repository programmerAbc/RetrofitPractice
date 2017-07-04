package com.practice.retrofit.model;

import java.io.Serializable;

/**
 * 同步数据库比对时间model
 */
public class StartIndexInfo implements Serializable{
    private long contact;// 联系人表的服务器时间
    private long favourite;// 收藏表的服务器时间
    private long order;// 订单表的服务器时间
    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public long getFavourite() {
        return favourite;
    }

    public void setFavourite(long favourite) {
        this.favourite = favourite;
    }

    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }



}
