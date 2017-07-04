package com.practice.retrofit.model.resp;

import com.practice.retrofit.model.OrderModel;

import java.util.List;



/**
 * 订单列表
 */

public class RespOrderList extends BaseResp<List<OrderModel>>{

    public int total;
}
