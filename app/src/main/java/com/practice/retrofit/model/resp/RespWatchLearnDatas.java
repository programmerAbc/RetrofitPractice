package com.practice.retrofit.model.resp;

import com.practice.retrofit.model.WatchLearnInfo;

import java.util.List;



/**
 * 看、学列表数据
 * Created by UQIANTU on 16/11/6.
 */

public class RespWatchLearnDatas extends BaseResp<List<WatchLearnInfo>> {
    private int total = 0;
    private int nextPage = 0;

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getNextPage() {
        return nextPage;
    }
}
