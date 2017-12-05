package com.elong.hotel.log.monitordata.po;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年12月4日 下午3:21:17   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class MonitorDataPo implements Serializable {

	/** 
	 * long MonitorDataPo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Long id;

	/**
	 * 采集时间
	 */
	private Date collectTime;

	/**
	 * 酒店预订单量
	 */
	private int hotelReserve;

	/**
	 * 入库量
	 */
	private int storage;

	/**
	 * 已审待分配量（马上到店）
	 */
	private int immediately;

	/**
	 * 已审待分配量（普通当日）
	 */
	private int oridinaryToday;

	/**
	 * 已审待分配量（普通非当日）
	 */
	private int oridinary;

	/**
	 * 已审人工触碰订单量
	 */
	private int touched;

	/**
	 * 已审无人触碰量
	 */
	private int untouched;

	/**
	 * 已审员工实际可获取的待分配量
	 */
	private int unfetched;

	/**
	 * 员工处理量
	 */
	private int staffHandled;

	/**
	 * IVR处理量
	 */
	private int ivrHandled;

	/**
	 * EBK处理量
	 */
	private int ebkHandled;

	/**
	 * 直连处理量
	 */
	private int dirctHandled;

	/**
	 * 其他处理量
	 */
	private int otherHandled;

	/**
	 * 时间戳
	 */
	private Date timeStamp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCollectTime() {
		return collectTime;
	}

	public void setCollectTime(Date collectTime) {
		this.collectTime = collectTime;
	}

	public int getHotelReserve() {
		return hotelReserve;
	}

	public void setHotelReserve(int hotelReserve) {
		this.hotelReserve = hotelReserve;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getImmediately() {
		return immediately;
	}

	public void setImmediately(int immediately) {
		this.immediately = immediately;
	}

	public int getOridinaryToday() {
		return oridinaryToday;
	}

	public void setOridinaryToday(int oridinaryToday) {
		this.oridinaryToday = oridinaryToday;
	}

	public int getOridinary() {
		return oridinary;
	}

	public void setOridinary(int oridinary) {
		this.oridinary = oridinary;
	}

	public int getTouched() {
		return touched;
	}

	public void setTouched(int touched) {
		this.touched = touched;
	}

	public int getUntouched() {
		return untouched;
	}

	public void setUntouched(int untouched) {
		this.untouched = untouched;
	}

	public int getUnfetched() {
		return unfetched;
	}

	public void setUnfetched(int unfetched) {
		this.unfetched = unfetched;
	}

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

	public int getDirctHandled() {
		return dirctHandled;
	}

	public void setDirctHandled(int dirctHandled) {
		this.dirctHandled = dirctHandled;
	}

	public int getOtherHandled() {
		return otherHandled;
	}

	public void setOtherHandled(int otherHandled) {
		this.otherHandled = otherHandled;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
