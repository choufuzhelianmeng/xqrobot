package entity;

import java.io.Serializable;

/**
 * @author yd
 * @version 1.0
 * @date 2019/7/10 9:58
 *//*
 *FileName:  Disease 疾病表
 * Author:   Administrator
 * Date  :   2019/7/10 9:58
 * */
public class Disease implements Serializable {


	private static final long serialVersionUID = 5456613320817835481L;
	private int code;
	private String name; //名称'
	private String miaoshu; // '描述'
	private int sort; // '排序'
	private String img; //'图片'
	private String jianjie; //'简介'
	private String bingyin; //'病因' ,
	private String lcbiaoxian; //'临床表现'
	private String jiancha; //'检查'
	private String jbzhenduan; //'鉴别诊断'
	private String tixing; //'医师提醒'
	private int categorycode; //'疾病分类


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return 名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return 描述
	 */
	public String getMiaoshu() {
		return miaoshu;
	}

	/**
	 *
	 * @param miaoshu 描述
	 */
	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}

	/**
	 *
	 * @return 排序
	 */
	public int getSort() {
		return sort;
	}

	/**
	 *
	 * @param sort 排序
	 */
	public void setSort(int sort) {
		this.sort = sort;
	}

	/**
	 *
	 * @return 图片
	 */
	public String getImg() {
		return img;
	}

	/**
	 *
	 * @param img 图片
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 *
	 * @return 简介
	 */
	public String getJianjie() {
		return jianjie;
	}

	/**
	 *
	 * @param jianjie 简介
	 */
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}

	/**
	 *
	 * @return 病因
	 */
	public String getBingyin() {
		return bingyin;
	}

	/**
	 *
	 * @param bingyin 病因
	 */
	public void setBingyin(String bingyin) {
		this.bingyin = bingyin;
	}

	/**
	 *
	 * @return 临床表现
	 */
	public String getLcbiaoxian() {
		return lcbiaoxian;
	}

	/**
	 *
	 * @param lcbiaoxian 临床表现
	 */
	public void setLcbiaoxian(String lcbiaoxian) {
		this.lcbiaoxian = lcbiaoxian;
	}

	/**
	 *
	 * @return 检查
	 */
	public String getJiancha() {
		return jiancha;
	}

	/**
	 *
	 * @param jiancha 检查
	 */
	public void setJiancha(String jiancha) {
		this.jiancha = jiancha;
	}

	/**
	 *
	 * @return 疾病诊断
	 */
	public String getJbzhenduan() {
		return jbzhenduan;
	}

	/**
	 *
	 * @param jbzhenduan 疾病诊断
	 */
	public void setJbzhenduan(String jbzhenduan) {
		this.jbzhenduan = jbzhenduan;
	}

	/**
	 *
	 * @return 提醒
	 */
	public String getTixing() {
		return tixing;
	}

	/**
	 *
	 * @param tixing 提醒
	 */
	public void setTixing(String tixing) {
		this.tixing = tixing;
	}

	/**
	 *
	 * @return 分类CODE 现在没用
	 */
	public int getCategorycode() {
		return categorycode;
	}

	/**
	 *
	 * @param categorycode 分类CODE 现在没用
	 */
	public void setCategorycode(int categorycode) {
		this.categorycode = categorycode;
	}
}
