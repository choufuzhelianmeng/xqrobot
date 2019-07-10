package com.xiaoqiao.entity;

import java.io.Serializable;

/**
 * 成分表
 */
public class Component implements Serializable {

    private static final long serialVersionUID = -8292998424409790380L;

    //自增ID
    private int code;
    //药品成分名称
    private String name;
    //1为特殊成分，在重复用药时不需要提示
    private int type;

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
