package com.practice.retrofit.model;

import java.io.Serializable;
import java.util.List;

/**
 * 类描述：【区域，省市区】
 * 创建人：xiachao
 * 创建时间：2016/11/16 20:48
 */
public class Area implements Serializable{
    public String id;
    public String name;
    public int parent;
    public List<Area> child;
}
