package com.practice.retrofit.model;

import java.io.Serializable;

/**
 * 七牛上传Token
 * Created by UQIANTU on 16/10/10.
 */

public class QiniuToken implements Serializable
{
    //本地记录ID, 原样反回
    private int localId;

    //待上传文件访问前缀
    private String domain;

    //单点登陆凭证
    private String token;

    public void setLocalId(int localId) {
        this.localId = localId;
    }

    public int getLocalId() {
        return localId;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomain() {
        return domain;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
