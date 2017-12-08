package com.elong.hotel.log.hotelconfirm.bo;

import java.io.Serializable;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年12月6日 上午9:46:18   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class HandledQuantityBo implements Serializable {

	/** 
	 * long HandledQuantityBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * MIS员工处理量
	 */
	private int staffHandled;

	/**
	 * IVR处理量
	 */
	private int ivrHandled;

	/**
	 * EB处理量
	 */
	private int ebkHandled;

	/**
	 * 直连处理量
	 */
	private int directHandled;

	/**
	 * 其他处理量
	 */
	private int otherHandled;

	/**
	 * 入库量
	 */
	private int storage;

	public int getStaffHandled() {
		return staffHandled;
	}

	public void setStaffHandled(int staffHandled) {
		this.staffHandled = staffHandled;
	}

	public int getIvrHandled() {
		return ivrHandled;
	}

	public void setIvrHandled(int ivrHandled) {
		this.ivrHandled = ivrHandled;
	}

	public int getEbkHandled() {
		return ebkHandled;
	}

	public void setEbkHandled(int ebkHandled) {
		this.ebkHandled = ebkHandled;
	}

	public int getDirectHandled() {
		return directHandled;
	}

	public void setDirectHandled(int directHandled) {
		this.directHandled = directHandled;
	}

	public int getOtherHandled() {
		return otherHandled;
	}

	public void setOtherHandled(int otherHandled) {
		this.otherHandled = otherHandled;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

}
