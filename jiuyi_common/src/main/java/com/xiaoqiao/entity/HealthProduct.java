package com.xiaoqiao.entity;

import java.io.Serializable;

/**
 * 保健品表
 */
public class HealthProduct implements Serializable {

    private static final long serialVersionUID = 5298633588858371393L;

    //主键ID
    private int code;
    //产品名称(进口：产品中文名称)
    private String name;
    //申请人中文名称
    private String chineseName;
    //申请人地址
    private String address;
    //保健功能
    private String healthFunctions;
    //功效成分/标志性成分含量
    private String component;
    //主要原料
    private String mainMaterial;
    //适宜人群
    private String suitablePopulation;
    //不适宜人群
    private String unfitCrowd;
    //食用方法及食用量
    private String usageAndDosage;
    //产品规格
    private String specification;
    //保质期
    private String qualityGuaranteePeriod;
    //贮藏方法
    private String storage;
    //注意事项
    private String notes;
    //批准日期
    private String approvalDate;
    //备案内容
    private String filingContent;
    //转让方中文名称
    private String transferorName;
    //转让方地址
    private String transferorAddress;
    //批准变更日期
    private String approvalChangeDate;
    //备案日期
    private String filingDate;
    //受让方
    private String transferee;
    //变更内容
    private String changeContent;
    //批准转让日期
    private String transferDate;
    //补发日期
    private String reissueDate;
    //产品编号
    private String productNumber;
    //备注
    private String remarks;
    //批准文号
    private String appNumber;
    //受让方地址
    private String transfereeAddress;
    //有效期至
    private String validUntil;
    //（1：国产、2：进口）
    private int type;
    //申请人英文名称
    private String applicantEnglishName;
    //生产企业中文名称
    private String brandChineseName;
    //生产企业英文名称
    private String brandEnglishName;
    //生产国
    private String country;
    //地址
    private String addressForImported;
    //产品英文名称
    private String englishName;
    //受让方中文名称
    private String transfereeChineseName;
    //转让前批准文号
    private String beforeTransferAppNumber;
    //转让方英文名称
    private String transferEnglishName;
    //注销日期
    private String logoutDate;
    //注销原因
    private String logoutReasons;

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

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHealthFunctions() {
        return healthFunctions;
    }

    public void setHealthFunctions(String healthFunctions) {
        this.healthFunctions = healthFunctions;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(String mainMaterial) {
        this.mainMaterial = mainMaterial;
    }

    public String getSuitablePopulation() {
        return suitablePopulation;
    }

    public void setSuitablePopulation(String suitablePopulation) {
        this.suitablePopulation = suitablePopulation;
    }

    public String getUnfitCrowd() {
        return unfitCrowd;
    }

    public void setUnfitCrowd(String unfitCrowd) {
        this.unfitCrowd = unfitCrowd;
    }

    public String getUsageAndDosage() {
        return usageAndDosage;
    }

    public void setUsageAndDosage(String usageAndDosage) {
        this.usageAndDosage = usageAndDosage;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getQualityGuaranteePeriod() {
        return qualityGuaranteePeriod;
    }

    public void setQualityGuaranteePeriod(String qualityGuaranteePeriod) {
        this.qualityGuaranteePeriod = qualityGuaranteePeriod;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getFilingContent() {
        return filingContent;
    }

    public void setFilingContent(String filingContent) {
        this.filingContent = filingContent;
    }

    public String getTransferorName() {
        return transferorName;
    }

    public void setTransferorName(String transferorName) {
        this.transferorName = transferorName;
    }

    public String getTransferorAddress() {
        return transferorAddress;
    }

    public void setTransferorAddress(String transferorAddress) {
        this.transferorAddress = transferorAddress;
    }

    public String getApprovalChangeDate() {
        return approvalChangeDate;
    }

    public void setApprovalChangeDate(String approvalChangeDate) {
        this.approvalChangeDate = approvalChangeDate;
    }

    public String getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(String filingDate) {
        this.filingDate = filingDate;
    }

    public String getTransferee() {
        return transferee;
    }

    public void setTransferee(String transferee) {
        this.transferee = transferee;
    }

    public String getChangeContent() {
        return changeContent;
    }

    public void setChangeContent(String changeContent) {
        this.changeContent = changeContent;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }

    public String getReissueDate() {
        return reissueDate;
    }

    public void setReissueDate(String reissueDate) {
        this.reissueDate = reissueDate;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(String appNumber) {
        this.appNumber = appNumber;
    }

    public String getTransfereeAddress() {
        return transfereeAddress;
    }

    public void setTransfereeAddress(String transfereeAddress) {
        this.transfereeAddress = transfereeAddress;
    }

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getApplicantEnglishName() {
        return applicantEnglishName;
    }

    public void setApplicantEnglishName(String applicantEnglishName) {
        this.applicantEnglishName = applicantEnglishName;
    }

    public String getBrandChineseName() {
        return brandChineseName;
    }

    public void setBrandChineseName(String brandChineseName) {
        this.brandChineseName = brandChineseName;
    }

    public String getBrandEnglishName() {
        return brandEnglishName;
    }

    public void setBrandEnglishName(String brandEnglishName) {
        this.brandEnglishName = brandEnglishName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressForImported() {
        return addressForImported;
    }

    public void setAddressForImported(String addressForImported) {
        this.addressForImported = addressForImported;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getTransfereeChineseName() {
        return transfereeChineseName;
    }

    public void setTransfereeChineseName(String transfereeChineseName) {
        this.transfereeChineseName = transfereeChineseName;
    }

    public String getBeforeTransferAppNumber() {
        return beforeTransferAppNumber;
    }

    public void setBeforeTransferAppNumber(String beforeTransferAppNumber) {
        this.beforeTransferAppNumber = beforeTransferAppNumber;
    }

    public String getTransferEnglishName() {
        return transferEnglishName;
    }

    public void setTransferEnglishName(String transferEnglishName) {
        this.transferEnglishName = transferEnglishName;
    }

    public String getLogoutDate() {
        return logoutDate;
    }

    public void setLogoutDate(String logoutDate) {
        this.logoutDate = logoutDate;
    }

    public String getLogoutReasons() {
        return logoutReasons;
    }

    public void setLogoutReasons(String logoutReasons) {
        this.logoutReasons = logoutReasons;
    }
}
