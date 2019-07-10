package com.xiaoqiao.entity;

import java.io.Serializable;

/**
 * 健康档案
 */
public class HealthFile implements Serializable {

    private static final long serialVersionUID = -8618844432628191412L;

    //自增ID
    private int code;
    //档案名称
    private String name;
    //用户code
    private int userCode;
    //年龄
    private int age;
    //性别（1，男 2，女）
    private int sex;
    //药物过敏（0，过敏 1，不过敏）
    private int yaowuguomin;
    //病史(0为健康）
    private String bingshi;
    //肝功能（0，不全 1，正常）
    private int gangongneng;
    //肾功能（0，不全 1，正常）
    private int shengongneng;
    //孕妇及哺乳（0，正常 1，孕期，2哺乳期）
    private int yunfuburu;
    //禁用药
    private String jinyongdrug;
    //创建时间
    private String creatDate;
    //修改时间
    private String updateDate;
    //身高
    private int shengao;
    //体重
    private Double tizhong;

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

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getYaowuguomin() {
        return yaowuguomin;
    }

    public void setYaowuguomin(int yaowuguomin) {
        this.yaowuguomin = yaowuguomin;
    }

    public String getBingshi() {
        return bingshi;
    }

    public void setBingshi(String bingshi) {
        this.bingshi = bingshi;
    }

    public int getGangongneng() {
        return gangongneng;
    }

    public void setGangongneng(int gangongneng) {
        this.gangongneng = gangongneng;
    }

    public int getShengongneng() {
        return shengongneng;
    }

    public void setShengongneng(int shengongneng) {
        this.shengongneng = shengongneng;
    }

    public int getYunfuburu() {
        return yunfuburu;
    }

    public void setYunfuburu(int yunfuburu) {
        this.yunfuburu = yunfuburu;
    }

    public String getJinyongdrug() {
        return jinyongdrug;
    }

    public void setJinyongdrug(String jinyongdrug) {
        this.jinyongdrug = jinyongdrug;
    }

    public String getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(String creatDate) {
        this.creatDate = creatDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public int getShengao() {
        return shengao;
    }

    public void setShengao(int shengao) {
        this.shengao = shengao;
    }

    public Double getTizhong() {
        return tizhong;
    }

    public void setTizhong(Double tizhong) {
        this.tizhong = tizhong;
    }
}
