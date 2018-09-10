package com.elong.hotel.hotelconfirm.cancelorder.request;

import java.io.Serializable;

import javax.validation.constraints.Min;


/**
 * 待处理查询参数类
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年9月3日 下午2:45:05   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class PendingRequest implements Serializable{

	/** 
	 * long PendingRequest.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 订单类型
	 */
	private Integer orderType;
	
	/**
	 * 是否直签
	 */
	private Integer isDS;
	
	/**
	 * 是否直连
	 */
	private Integer isDC;
	
	/**
	 * 是否免费取消
	 */
	private Integer isFC;
	
	/**
	 * 到店日期
	 */
	private String arriveDate;
	
	/**
	 * 离店日期
	 */
	private String leaveDate;
	
	/**
	 * 入库时长（最低）
	 */
	private Integer enterTimeMin;
	
	/**
	 * 入库时长（最高）
	 */
	private Integer enterTimeMax;
	
	/**
	 * 查询起始数
	 */
	private int startRow;
	
	/**
	 * 当前页码
	 */
	@Min(value = 0, message = "param currentPage < 0.")
	private int currentPage;
	
	/**
	 * 查询数量
	 */
	@Min(value = 0, message = "param pageSize < 0.")
	private int pageSize;

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Integer getIsDS() {
		return isDS;
	}

	public void setIsDS(Integer isDS) {
		this.isDS = isDS;
	}

	public Integer getIsDC() {
		return isDC;
	}

	public void setIsDC(Integer isDC) {
		this.isDC = isDC;
	}

	public Integer getIsFC() {
		return isFC;
	}

	public void setIsFC(Integer isFC) {
		this.isFC = isFC;
	}

	public String getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(String arriveDate) {
		this.arriveDate = arriveDate;
	}

	public String getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}

	public Integer getEnterTimeMin() {
		return enterTimeMin;
	}

	public void setEnterTimeMin(Integer enterTimeMin) {
		this.enterTimeMin = enterTimeMin;
	}

	public Integer getEnterTimeMax() {
		return enterTimeMax;
	}

	public void setEnterTimeMax(Integer enterTimeMax) {
		this.enterTimeMax = enterTimeMax;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

}
