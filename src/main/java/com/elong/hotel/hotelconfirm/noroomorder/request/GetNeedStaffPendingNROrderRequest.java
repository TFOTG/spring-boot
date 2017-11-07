package com.elong.hotel.hotelconfirm.noroomorder.request;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年9月7日 下午5:08:00   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetNeedStaffPendingNROrderRequest {

	/**
	 * 马上到店
	 */
	private Integer immediately;

	/**
	 * IVR外呼状态
	 */
	private Integer ivrStatus;

	/**
	 * EB状态
	 */
	private Integer ebookingStatus;

	/**
	 * 订单状态
	 */
	private String orderStatus;

	/**
	 * 订单ID
	 */
	private Integer orderId;

	/**
	 * 页码
	 */
	private int page;

	/**
	 * 每页条数
	 */
	private int size;

	public Integer getImmediately() {
		return immediately;
	}

	public void setImmediately(Integer immediately) {
		this.immediately = immediately;
	}

	public Integer getIvrStatus() {
		return ivrStatus;
	}

	public void setIvrStatus(Integer ivrStatus) {
		this.ivrStatus = ivrStatus;
	}

	public Integer getEbookingStatus() {
		return ebookingStatus;
	}

	public void setEbookingStatus(Integer ebookingStatus) {
		this.ebookingStatus = ebookingStatus;
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

}
