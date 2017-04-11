package com.elong.hotel.proxy.javaorder.getorder;

/**
 * 联系人
 * 
 * @author zouyufei
 *
 */
public class Contact {

	private String country;
	private Long customerId;
	private String email;
	private Fax fax;
	private String mobile;
	private String name;
	private Phone phone;
	private Integer sex;
	private String supplierCardNo;
	private boolean isConfirmed;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Fax getFax() {
		return fax;
	}

	public void setFax(Fax fax) {
		this.fax = fax;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getSupplierCardNo() {
		return supplierCardNo;
	}

	public void setSupplierCardNo(String supplierCardNo) {
		this.supplierCardNo = supplierCardNo;
	}

	public boolean getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(boolean confirmed) {
		isConfirmed = confirmed;
	}
}
