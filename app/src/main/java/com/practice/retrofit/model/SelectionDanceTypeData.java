package com.practice.retrofit.model;

import java.io.Serializable;

/**
 * 筛选条件
 * Created by UQIANTU on 17/4/21.
 */

public class SelectionDanceTypeData implements Serializable {
    protected static final long serialVersionUID = 1L;

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

    public boolean isNull() {
        if (!getDancetype().equals("")) {
            return false;
        } else if (!getDanceway().equals("")) {
            return false;
        } else if (!getDifficultyLevel().equals("")) {
            return false;
        } else if (!getGoal().equals("")) {
            return false;
        } else if (!getModality().equals("")) {
            return false;
        } else if (!getGenderGroup().equals("")) {
            return false;
        } else if (!getPerson().equals("")) {
            return false;
        }else if (!getResource().equals("")) {
            return false;
        }
        return true;
    }

    public boolean isEquals(SelectionDanceTypeData value) {

        if (value == null) {
            return false;
        }

        if (isNull() && value.isNull()) {
            return true;
        }

        if (!getDancetype().equals(value.getDancetype())) {
            return false;
        } else if (!getDanceway().equals(value.getDanceway())) {
            return false;
        } else if (!getDifficultyLevel().equals(value.getDifficultyLevel())) {
            return false;
        } else if (!getGoal().equals(value.getGoal())) {
            return false;
        } else if (!getModality().equals(value.getModality())) {
            return false;
        } else if (!getGenderGroup().equals(value.getGenderGroup())) {
            return false;
        } else if (!getPerson().equals(value.getPerson())) {
            return false;
        }else if (!getResource().equals(value.getResource())) {
            return false;
        }
        return true;
    }
}
