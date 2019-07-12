package util;

/**
 * @author yd
 * @version 1.0
 * @date 2019/7/12 11:00
 *//*
 *FileName:  Params
 * Author:   Administrator
 * Date  :   2019/7/12 11:00
 * */
public class Params {

	private String symptomCode;//症状CODE

	private int healthFileCode;//健康档案CODE

	private int yiBao;//是否为医保 0：否，1：是

	private int zhongXi;//中西 1:中药,2:西药

	private int drugstoreCode;//药店CODE

	private String type; // 0:不是联合用药,1:联合用药

	private int lhtype;//联合分类TYPE

	private int drugCode; //药品CODE

	/**
	 *
	 * @return 症状CODE
	 */
	public String getSymptomCode() {
		return symptomCode;
	}

	/**
	 *
	 * @param symptomCode 症状CODE
	 */
	public void setSymptomCode(String symptomCode) {
		this.symptomCode = symptomCode;
	}

	/**
	 *
	 * @return 健康档案CODE
	 */
	public int getHealthFileCode() {
		return healthFileCode;
	}

	/**
	 *
	 * @param healthFileCode 健康档案CODE
	 */
	public void setHealthFileCode(int healthFileCode) {
		this.healthFileCode = healthFileCode;
	}

	/**
	 *
	 * @return 是否为医保 0：否，1：是
	 */
	public int getYiBao() {
		return yiBao;
	}

	/**
	 *
	 * @param yiBao 是否为医保 0：否，1：是
	 */
	public void setYiBao(int yiBao) {
		this.yiBao = yiBao;
	}

	/**
	 *
	 * @return 中西 1:中药,2:西药
	 */
	public int getZhongXi() {
		return zhongXi;
	}

	/**
	 *
	 * @param zhongXi 中西 1:中药,2:西药
	 */
	public void setZhongXi(int zhongXi) {
		this.zhongXi = zhongXi;
	}

	/**
	 *
	 * @return 药店CODE
	 */
	public int getDrugstoreCode() {
		return drugstoreCode;
	}

	/**
	 *
	 * @param drugstoreCode 药店CODE
	 */
	public void setDrugstoreCode(int drugstoreCode) {
		this.drugstoreCode = drugstoreCode;
	}

	/**
	 *
	 * @return 0:不是联合用药,1:联合用药
	 */
	public String getType() {
		return type;
	}

	/**
	 *
	 * @param type 0:不是联合用药,1:联合用药
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 *
	 * @return 联合分类TYPE
	 */
	public int getLhtype() {
		return lhtype;
	}

	/**
	 *
	 * @param lhtype 联合分类TYPE
	 */
	public void setLhtype(int lhtype) {
		this.lhtype = lhtype;
	}

	/**
	 *
	 * @return 药品CODE
	 */
	public int getDrugCode() {
		return drugCode;
	}

	/**
	 *
	 * @param drugCode 药品CODE
	 */
	public void setDrugCode(int drugCode) {
		this.drugCode = drugCode;
	}
}
