package com.xiaoqiao.entity;

import java.io.Serializable;

public class Symptom implements Serializable {

    private static final long serialVersionUID = -3709264327791273598L;

    //自增长Code
    private int code;
    //名称
    private String name;
    //描述
    private String miaoshu;
    //排序
    private int sort;
    //疾病Code    disease表关联
    private int disCode;
    //相悖症状
    private String contrarycodes;
    //症状权重
    private int quanzhong;
    //区域编号
    private int quyuCode;

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

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getDisCode() {
        return disCode;
    }

    public void setDisCode(int disCode) {
        this.disCode = disCode;
    }

    public String getContrarycodes() {
        return contrarycodes;
    }

    public void setContrarycodes(String contrarycodes) {
        this.contrarycodes = contrarycodes;
    }

    public int getQuanzhong() {
        return quanzhong;
    }

    public void setQuanzhong(int quanzhong) {
        this.quanzhong = quanzhong;
    }

    public int getQuyuCode() {
        return quyuCode;
    }

    public void setQuyuCode(int quyuCode) {
        this.quyuCode = quyuCode;
    }
}
