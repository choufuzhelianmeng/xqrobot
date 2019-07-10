package com.xiaoqiao.entity;

import java.io.Serializable;

/**
 * 疾病关键字表
 */
public class DiseaseKeyword implements Serializable {

    private static final long serialVersionUID = -3905003777075231870L;

    //自增ID
    private int code;
    //关键词名称
    private String name;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
