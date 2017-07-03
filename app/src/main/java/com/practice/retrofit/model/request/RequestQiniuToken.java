package com.practice.retrofit.model.request;

/**
 * 获取七牛上传Token
 * Created by UQIANTU on 16/10/10.
 */

public class RequestQiniuToken
{
    //本地ID号
    private int localId;

    //待上传文件类型(支持：photo, media)
    private String type;

    //待上传文件名称(例如：name.jpg, name.mp4), 如留空则在上传时指定
    private String name;

    //无水印控制，仅在上传图是有效(0: 有水印, 1: 无水印)
    private int noWater;

    //上次使用的七牛上传凭证
    private String token;

    public void setLocalId(int localId) {
        this.localId = localId;
    }

    public int getLocalId() {
        return localId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNoWater(int noWater) {
        this.noWater = noWater;
    }

    public int getNoWater() {
        return noWater;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
