package com.elong.hotel.hotelconfirm.confirmorderactionlog.bo;

import java.io.Serializable;

/**
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年11月20日 上午10:16:04   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class CountRefusedOrderBo implements Serializable {

	/** 
	 * long CountRefusedOrderBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String operatorName;

	private int quantity;

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
