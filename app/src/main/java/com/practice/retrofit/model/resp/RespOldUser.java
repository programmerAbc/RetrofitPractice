package com.practice.retrofit.model.resp;

/**
 * Created by UQIANTU on 16/12/22.
 */

public class RespOldUser extends BaseResp<RespOldUser.RespData> {
    public class RespData {
        //10表示成功,20表示失败
        public int statusCode;
    }
}