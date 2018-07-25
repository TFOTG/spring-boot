package com.elong.hotel.proxy.javaorder.getorder;

import java.io.Serializable;

/**
 * 同程订单信息
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年7月2日 下午3:38:14   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class TcOrderInfo implements Serializable{

	/** 
	 * long tcOrderInfo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private Integer strictSelected;
	
	private String tcCardNo;
	
	private String tcOrderId;
	
	private String tcSubOrderId;

	public Integer getStrictSelected() {
		return strictSelected;
	}

	public void setStrictSelected(Integer strictSelected) {
		this.strictSelected = strictSelected;
	}

	public String getTcCardNo() {
		return tcCardNo;
	}

	public void setTcCardNo(String tcCardNo) {
		this.tcCardNo = tcCardNo;
	}

	public String getTcOrderId() {
		return tcOrderId;
	}

	public void setTcOrderId(String tcOrderId) {
		this.tcOrderId = tcOrderId;
	}

	public String getTcSubOrderId() {
		return tcSubOrderId;
	}

	public void setTcSubOrderId(String tcSubOrderId) {
		this.tcSubOrderId = tcSubOrderId;
	}
	
}
