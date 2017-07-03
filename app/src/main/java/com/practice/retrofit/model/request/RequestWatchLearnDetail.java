package com.practice.retrofit.model.request;

/**
 * 首页－看详情
 * Created by UQIANTU on 16/11/12.
 */

public class RequestWatchLearnDetail
{
    //类型:1表示看2表示学
    private String typeId;

    //ID号
    private String id;

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
