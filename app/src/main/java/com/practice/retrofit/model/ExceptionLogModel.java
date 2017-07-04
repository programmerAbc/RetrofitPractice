package com.practice.retrofit.model;

import java.io.Serializable;

/**
 * Created by xiachao on 16/9/28.
 */

public class ExceptionLogModel implements Serializable{
    private String netConnected;

    private String netType;
    private String reportTime;
    private String reportText;

    public String getNetConnected() {
        return netConnected;
    }

    public void setNetConnected(String netConnected) {
        this.netConnected = netConnected;
    }

    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportText() {
        return reportText;
    }

    public void setReportText(String reportText) {
        this.reportText = reportText;
    }

}
