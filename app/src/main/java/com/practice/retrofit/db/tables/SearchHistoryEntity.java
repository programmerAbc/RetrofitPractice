package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * 点赞
 * Created by UQIANTU on 16/10/9.
 */

@DatabaseTable(tableName = Tables.SearchHistory)
public class SearchHistoryEntity extends BaseDbEntity {
    protected static final long serialVersionUID = 1L;

    @DatabaseField
    private String searchValue;

    public long getLastTime() {
        return lastTime;
    }

    public void setLastTime(long lastTime) {
        this.lastTime = lastTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @DatabaseField
    private long lastTime;

    //用户ID号
    @DatabaseField
    private String userId;

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

}