package com.elong.hotel.hotelconfirm.confirmorder.bo;

import java.io.Serializable;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年12月6日 下午2:43:54   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class CountAllocatedDataBo implements Serializable {

	/** 
	 * long CountAllocatedDataBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 马上到店
	 */
	private int immediately;

	/**
	 * 普通当日
	 */
	private int oridinaryToday;

	/**
	 * 普通非当日
	 */
	private int oridinary;

	/**
	 * 待分配总量
	 */
	private int unallocated;

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

	public int getUnallocated() {
		return unallocated;
	}

	public void setUnallocated(int unallocated) {
		this.unallocated = unallocated;
	}

}
