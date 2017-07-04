package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * 按钮数据收集报告
 * Created by UQIANTU on 16/10/12.
 */

@DatabaseTable(tableName = Tables.ButtonReportTable)
public class ButtonReportEntity implements Serializable
{
    protected static final long serialVersionUID = 1L;

    @DatabaseField(generatedId = true)
    public int id;

    //单击时间
    @DatabaseField
    private long clickTime;

    //按钮类型
    @DatabaseField
    private int clickType;

    //按钮名称
    @DatabaseField
    private String clickName;

    //来源页面ID
    @DatabaseField
    private int fromPageId;

    //来源页面名称
    @DatabaseField
    private String fromPageName;

    //来源页面参数
    @DatabaseField
    private String fromPageParam;

    //目标页面ID
    @DatabaseField
    private int targetPageId;

    //目标页面名称
    @DatabaseField
    private String targetPageName;

    //目标页面参数
    @DatabaseField
    private String targetPageParam;


    public void setClickTime(long clickTime) {
        this.clickTime = clickTime;
    }

    public long getClickTime() {
        return clickTime;
    }

    public void setClickType(int buttonType) {
        this.clickType = buttonType;
    }

    public int getClickType() {
        return clickType;
    }

    public void setClickName(String buttonName) {
        this.clickName = buttonName;
    }

    public String getClickName() {
        return clickName;
    }

    public void setFromPageId(int fromPageId) {
        this.fromPageId = fromPageId;
    }

    public int getFromPageId() {
        return fromPageId;
    }

    public void setFromPageName(String fromPageName) {
        this.fromPageName = fromPageName;
    }

    public String getFromPageName() {
        return fromPageName;
    }

    public void setFromPageParam(String fromPageParam) {
        this.fromPageParam = fromPageParam;
    }

    public String getFromPageParam() {
        return fromPageParam;
    }

    public void setTargetPageId(int targetPageId) {
        this.targetPageId = targetPageId;
    }

    public int getTargetPageId() {
        return targetPageId;
    }

    public void setTargetPageName(String targetPageName) {
        this.targetPageName = targetPageName;
    }

    public String getTargetPageName() {
        return targetPageName;
    }

    public void setTargetPageParam(String targetPageParam) {
        this.targetPageParam = targetPageParam;
    }

    public String getTargetPageParam() {
        return targetPageParam;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", clickTime=" + clickTime +
                ", clickType='" + clickType +"\'" +
                ", clickName='" + clickName +"\'" +
                ", fromPageId=" + fromPageId +
                ", fromPageName='" + fromPageName +"\'" +
                ", fromPageParam='" + fromPageParam +"\'" +
                ", targetPageId=" + targetPageId +
                ", targetPageName='" + targetPageName+"\'" +
                ", targetPageParam='" + targetPageParam+"\'";
    }
}
