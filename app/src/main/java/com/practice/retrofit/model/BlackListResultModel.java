package com.practice.retrofit.model;

import java.io.Serializable;

/**
 * Created by xiachao on 16/11/21.
 */

public class BlackListResultModel implements Serializable {
    public String targetId;
    public int statusCode;//操作结果20表示成功0表示失败
}
