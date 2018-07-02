package com.elong.hotel.proxy.javaorder.getorder;

import java.io.Serializable;

/**
 * 订单红包/返现
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年7月2日 下午2:24:57   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class OrderPromotionData implements Serializable{

	/** 
	 * long OrderPromotionData.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 订单ID
	 */
	private Integer orderId;
	
	/**
	 * 类型 0：返现，1：立减，2：发放
	 */
	private Integer promotionSettlementType;
	
	private Integer promotionType;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getPromotionSettlementType() {
		return promotionSettlementType;
	}

	public void setPromotionSettlementType(Integer promotionSettlementType) {
		this.promotionSettlementType = promotionSettlementType;
	}

	public Integer getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(Integer promotionType) {
		this.promotionType = promotionType;
	}

}
