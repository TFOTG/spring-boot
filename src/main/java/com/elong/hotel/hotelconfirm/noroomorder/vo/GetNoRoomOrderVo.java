package com.elong.hotel.hotelconfirm.noroomorder.vo;

import java.io.Serializable;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年9月8日 上午9:53:29   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetNoRoomOrderVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 当前页
	 */
	private int page;

	/**
	 * 当前页酒店数量
	 */
	private int size;

	/**
	 * EB状态
	 */
	private Integer ebookingStatus;

	/**
	 * ivr外呼状态
	 */
	private Integer ivrStatus;

	/**
	 * 订单状态
	 */
	private String orderStatus;

	/**
	 * 订单ID
	 */
	private Integer orderId;

	/**
	 * 检查是否马上到店
	 */
	private Integer checkImmedatelies;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Integer getEbookingStatus() {
		return ebookingStatus;
	}

	public void setEbookingStatus(Integer ebookingStatus) {
		this.ebookingStatus = ebookingStatus;
	}

	public Integer getIvrStatus() {
		return ivrStatus;
	}

	public void setIvrStatus(Integer ivrStatus) {
		this.ivrStatus = ivrStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCheckImmedatelies() {
		return checkImmedatelies;
	}

	public void setCheckImmedatelies(Integer checkImmedatelies) {
		this.checkImmedatelies = checkImmedatelies;
	}

}
