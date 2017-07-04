package com.practice.retrofit.model;

import java.io.Serializable;
import java.util.List;

/**
 * 学筛选类型
 * Created by UQIANTU on 17/4/21.
 */

public class LearnSelectionDanceType implements Serializable {
    protected static final long serialVersionUID = 1L;

    public List<SelectionDanceType> data;
    public List<SelectionDanceType> related;
}