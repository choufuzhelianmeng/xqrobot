package com.xiaoqiao.entity;

import java.io.Serializable;

/**
 * 过敏药物
 */
public class AllergicDrug implements Serializable {

    private static final long serialVersionUID = 1096600994407205093L;

    //自增ID
    private int code;
    //过敏药物名称
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
