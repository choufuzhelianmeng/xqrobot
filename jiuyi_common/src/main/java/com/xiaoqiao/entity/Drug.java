package com.xiaoqiao.entity;

import java.io.Serializable;

/**
 * 药品表
 */
public class Drug implements Serializable {

    private static final long serialVersionUID = -9140507725736377432L;

    //自增长ID
    private int code;
    //生产企业
    private String brand;
    //药品名称
    private String name;
    //最小价格
    private Double minPrice;
    //最大价格
    private Double maxPrice;
    //性状
    private String properties;
    //治疗疾病
    private String diseases;
    //功效主治
    private String symptoms;
    //药物图片
    private String img;
    //用法用量
    private String dosage;
    //不良反应
    private String unEffect;
    //批准文号
    private String appNumber;
    //禁忌
    private String taboo;
    //注意事项
    private String note;
    //相互作用
    private String interaction;
    //药理作用
    private String pharmac;
    //化学成分
    private String component;
    //0、西药；1、中成药
    private int isChinese;
    //
    private String href;

    private int hrefInt;
    //综合疗效评分
    private Double effectScore;
    //综合副作用评分
    private Double sideEffectScore;
    //排序
    private int sort;
    //综合评分
    private Double evaluation;
    //热门药
    private int hot;
    //条形码
    private int barCode;
    //药标签：0没有分类，1内用药，2外用药，3注射药
    private int labelType;
    //备注
    private String beizhu;
    //规格
    private String guige;
    //剂型
    private String jixing;
    //提成
    private Double tiCheng;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getUnEffect() {
        return unEffect;
    }

    public void setUnEffect(String unEffect) {
        this.unEffect = unEffect;
    }

    public String getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(String appNumber) {
        this.appNumber = appNumber;
    }

    public String getTaboo() {
        return taboo;
    }

    public void setTaboo(String taboo) {
        this.taboo = taboo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    public String getPharmac() {
        return pharmac;
    }

    public void setPharmac(String pharmac) {
        this.pharmac = pharmac;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public int getIsChinese() {
        return isChinese;
    }

    public void setIsChinese(int isChinese) {
        this.isChinese = isChinese;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public int getHrefInt() {
        return hrefInt;
    }

    public void setHrefInt(int hrefInt) {
        this.hrefInt = hrefInt;
    }

    public Double getEffectScore() {
        return effectScore;
    }

    public void setEffectScore(Double effectScore) {
        this.effectScore = effectScore;
    }

    public Double getSideEffectScore() {
        return sideEffectScore;
    }

    public void setSideEffectScore(Double sideEffectScore) {
        this.sideEffectScore = sideEffectScore;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public Double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Double evaluation) {
        this.evaluation = evaluation;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public int getLabelType() {
        return labelType;
    }

    public void setLabelType(int labelType) {
        this.labelType = labelType;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public String getGuige() {
        return guige;
    }

    public void setGuige(String guige) {
        this.guige = guige;
    }

    public String getJixing() {
        return jixing;
    }

    public void setJixing(String jixing) {
        this.jixing = jixing;
    }

    public Double getTiCheng() {
        return tiCheng;
    }

    public void setTiCheng(Double tiCheng) {
        this.tiCheng = tiCheng;
    }
}
