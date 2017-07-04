package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * 数据埋点收集报告数据表
 * Created by UQIANTU on 16/10/12.
 */

@DatabaseTable(tableName = Tables.PageReportTable)
public class PageReportEntity implements Serializable
{
    protected static final long serialVersionUID = 1L;

    @DatabaseField(generatedId = true)
    private int id;

    //页面ID号(如: 分类列表、详情页)
    @DatabaseField
    private int pageId;

    //埋点来源哪个页面(如: 从开机广告进入直播)
    @DatabaseField
    private String pageName;

    //埋点来源哪个页面的参数
    @DatabaseField
    private String pageParam;

    //埋点产生于来源页Id
    @DatabaseField
    private int fromPageId;

    //埋点产生来源页的页面名称
    @DatabaseField
    private String fromPageName;

    //埋点产生于来源页的参数
    @DatabaseField
    private String fromPageParam;

    //进入页面时间
    @DatabaseField
    private long enterTime;

    //离开页面时间
    @DatabaseField
    private long leaveTime;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageParam(String pageParam) {
        this.pageParam = pageParam;
    }

    public String getPageParam() {
        return pageParam;
    }

    public void setFromPageId(int fromPageId) {
        this.fromPageId = fromPageId;
    }

    public int getFromPageId() {
        return fromPageId;
    }

    public String getFromPageName() {
        return fromPageName;
    }

    public void setFromPageName(String fromPageName) {
        this.fromPageName = fromPageName;
    }

    public void setFromPageParam(String fromPageParam) {
        this.fromPageParam = fromPageParam;
    }

    public String getFromPageParam() {
        return fromPageParam;
    }

    public void setEnterTime(long enterTime) {
        this.enterTime = enterTime;
    }

    public long getEnterTime() {
        return enterTime;
    }

    public void setLeaveTime(long leaveTime) {
        this.leaveTime = leaveTime;
    }

    public long getLeaveTime() {
        return leaveTime;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", pageId=" + pageId +
                ", pageName='" + pageName +"\'" +
                ", pageParam='" + pageParam +"\'" +
                ", fromPageId=" + fromPageId +
                ", fromPageName='" + fromPageName +"\'" +
                ", fromPageParam='" + fromPageParam +"\'" +
                ", enterTime=" + enterTime +
                ", leaveTime=" + leaveTime;
    }
}
