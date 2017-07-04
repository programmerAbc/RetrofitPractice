package com.practice.retrofit.model.request;


import com.practice.retrofit.model.SelectionDanceTypeData;

/**
 * 看、学通用的列表数据请求
 * Created by UQIANTU on 16/11/6.
 */

public class RequestListCommon {
    /**
     * type = Latest最新Hot最热Recommend推荐...
     */
    private String type = "";

    /**
     * 页面条数
     */
    private int pageSize = 10;

    /**
     * 页数
     */
    private int page = 1;

    /**
     * 类型
     */
    private String dancetype = "";

    /**
     * 课程类型
     */
    private String danceway = "";

    /**
     * 适合人群
     */
    private String difficulty_level = "";

    /**
     * 学习目标
     */
    private String goal = "";

    /**
     * 形式
     */
    private String modality = "";

    /**
     * 性别
     */
    private String gender_group = "";

    /**
     * 适合年龄
     */
    private String person = "";

    /**
     * 内容形式
     */
    private String resource = "";


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setDancetype(String dancetype) {
        this.dancetype = dancetype;
    }

    public String getDancetype() {
        return dancetype;
    }

    public void setDanceway(String danceway) {
        this.danceway = danceway;
    }

    public String getDanceway() {
        return danceway;
    }

    public void setDifficultyLevel(String difficulty_level) {
        this.difficulty_level = difficulty_level;
    }

    public String getDifficultyLevel() {
        return difficulty_level;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getGoal() {
        return goal;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getModality() {
        return modality;
    }

    public void setGenderGroup(String gender_group) {
        this.gender_group = gender_group;
    }

    public String getGenderGroup() {
        return gender_group;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getPerson() {
        return person;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }

    public void setSelectionData(SelectionDanceTypeData selectionData) {
        if (selectionData != null) {
            setDancetype(selectionData.getDancetype());
            setDanceway(selectionData.getDanceway());
            setDifficultyLevel(selectionData.getDifficultyLevel());
            setGoal(selectionData.getGoal());
            setModality(selectionData.getModality());
            setGenderGroup(selectionData.getGenderGroup());
            setPerson(selectionData.getPerson());
            setResource(selectionData.getResource());
        }
    }
}
