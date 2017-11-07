package com.elong.hotel.proxy.javaorder.getorder;

/**
 * 
 * @author zouyufei
 *
 */
public class Phone {

	// 区号 010
	private String areaCode;
	// 0000001
	private String extCode;
	// 010-81040253-0000001
	private String fullNumber;
	// +86
	private String interCode;
	// 123456
	private String number;

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getExtCode() {
		return extCode;
	}

	public void setExtCode(String extCode) {
		this.extCode = extCode;
	}

	public String getFullNumber() {
		return fullNumber;
	}

	public void setFullNumber(String fullNumber) {
		this.fullNumber = fullNumber;
	}

	public String getInterCode() {
		return interCode;
	}

	public void setInterCode(String interCode) {
		this.interCode = interCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
