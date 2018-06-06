package com.elong.hotel.hotelconfirm.examorder.bo;

import java.io.Serializable;

/**
 * 终拒员工待处理统计信息
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月4日 上午11:17:38   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class AmendStaffHandleCountBo implements Serializable{

	/** 
	 * long AmendStaffHandleCountNo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 紧急数量
	 */
	private int urgeCount;
	
	/**
	 * 非紧急数量
	 */
	private int nonurgeCount;
	
	/**
	 * 暂缓量
	 */
	private int respitedCount;
	
	/**
	 * 预约量（已到暂缓时间）
	 */
	private int promisedCount;
	
	/**
	 * 待处理量
	 */
	private int pendingCount;
	
	/**
	 * 处理量
	 */
	private int handleCount;
	
	/**
	 * 转化量
	 */
	private int convertCount;

	public int getUrgeCount() {
		return urgeCount;
	}

	public void setUrgeCount(int urgeCount) {
		this.urgeCount = urgeCount;
	}

	public int getNonurgeCount() {
		return nonurgeCount;
	}

	public void setNonurgeCount(int nonurgeCount) {
		this.nonurgeCount = nonurgeCount;
	}

	public int getRespitedCount() {
		return respitedCount;
	}

	public void setRespitedCount(int respitedCount) {
		this.respitedCount = respitedCount;
	}

	public int getPromisedCount() {
		return promisedCount;
	}

	public void setPromisedCount(int promisedCount) {
		this.promisedCount = promisedCount;
	}

	public int getPendingCount() {
		return pendingCount;
	}

	public void setPendingCount(int pendingCount) {
		this.pendingCount = pendingCount;
	}

	public int getHandleCount() {
		return handleCount;
	}

	public void setHandleCount(int handleCount) {
		this.handleCount = handleCount;
	}

	public int getConvertCount() {
		return convertCount;
	}

	public void setConvertCount(int convertCount) {
		this.convertCount = convertCount;
	}
	
}
