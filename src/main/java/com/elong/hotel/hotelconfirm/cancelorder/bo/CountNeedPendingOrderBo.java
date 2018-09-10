package com.elong.hotel.hotelconfirm.cancelorder.bo;

import java.io.Serializable;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年9月5日 上午8:18:56   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class CountNeedPendingOrderBo implements Serializable{

	/** 
	 * long CountNeedPendingOrderBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 直签，担保
	 */
	private int directSignForVoucher;
	
	/**
	 * 非直签，担保
	 */
	private int notDirectSignForVoucher;
	
	/**
	 * 直签，预付
	 */
	private int directSignForPrepay;
	
	/**
	 * 非直签，预付
	 */
	private int notDirectSignForPrepay;

	public int getDirectSignForVoucher() {
		return directSignForVoucher;
	}

	public void setDirectSignForVoucher(int directSignForVoucher) {
		this.directSignForVoucher = directSignForVoucher;
	}

	public int getNotDirectSignForVoucher() {
		return notDirectSignForVoucher;
	}

	public void setNotDirectSignForVoucher(int notDirectSignForVoucher) {
		this.notDirectSignForVoucher = notDirectSignForVoucher;
	}

	public int getDirectSignForPrepay() {
		return directSignForPrepay;
	}

	public void setDirectSignForPrepay(int directSignForPrepay) {
		this.directSignForPrepay = directSignForPrepay;
	}

	public int getNotDirectSignForPrepay() {
		return notDirectSignForPrepay;
	}

	public void setNotDirectSignForPrepay(int notDirectSignForPrepay) {
		this.notDirectSignForPrepay = notDirectSignForPrepay;
	}
	
}
