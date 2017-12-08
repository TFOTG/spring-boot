package com.elong.hotel.hotelconfirm.confirmorder.bo;

import java.io.Serializable;

/**
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年12月6日 下午2:32:37   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class CountTouchedDataBo implements Serializable {

	/** 
	 * long CountTouchedDataBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 已审人工触碰量
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

}
