package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by xiachao on 16/10/9.
 */
@DatabaseTable(tableName = Tables.ExceptionTable)
public class ExceptionEntity extends BaseDbEntity{

    @DatabaseField()
    public String netConnected;

    @DatabaseField()
    public String netType;

    @DatabaseField()
    public int reportTime;

    @DatabaseField()
    public String reportText;

    @Override
    public String toString() {
        return "ExceptionEntity{" +
                "netConnected='" + netConnected + '\'' +
                ", netType='" + netType + '\'' +
                ", reportTime=" + reportTime +
                ", reportText='" + reportText + '\'' +
                '}';
    }
}
