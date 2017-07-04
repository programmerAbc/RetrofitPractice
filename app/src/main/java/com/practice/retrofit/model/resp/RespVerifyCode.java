package com.practice.retrofit.model.resp;

/**
 * 获取验证码
 * Created by UQIANTU on 16/11/3.
 */

public class RespVerifyCode extends BaseResp<RespVerifyCode.RespData> {
    public class RespData {
        //10表示成功,20表示失败
        public int statusCode;
        //-1表示新用户,0表示老用户未绑定，1表示已经绑定
        public String isBind;
    }
}