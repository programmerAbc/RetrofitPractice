package com.practice.retrofit.model;

import android.text.TextUtils;

/**
 * Created by xiachao on 16/11/21.
 */

public class VersionInfo {
    public String isForceUpdate;
    public String versionName;
    public String fileUrl;
    public String description;

    public String oldVersion;
    public String versionSize;
    // 是否强制更新
    public boolean isForceUpdate()
    {
        return !TextUtils.isEmpty(isForceUpdate) && isForceUpdate.equals("1");
    }
}
