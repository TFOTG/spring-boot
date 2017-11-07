package com.elong.hotel.hotelconfirm.targetdata.bo;

import java.io.Serializable;

/**
 * 
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年10月9日 下午4:25:42   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class SearchResultBo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer confirmType;

	private int quantity;

	private String supplierName;

	private String supplier;

	private Double handledTime;

	public Integer getConfirmType() {
		return confirmType;
	}

	public void setConfirmType(Integer confirmType) {
		this.confirmType = confirmType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Double getHandledTime() {
		return handledTime;
	}

	public void setHandledTime(Double handledTime) {
		this.handledTime = handledTime;
	}

}
