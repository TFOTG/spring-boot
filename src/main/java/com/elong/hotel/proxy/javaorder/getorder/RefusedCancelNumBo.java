package com.elong.hotel.proxy.javaorder.getorder;

import java.io.Serializable;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月14日 上午8:45:08   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class RefusedCancelNumBo implements Serializable{

	/** 
	 *
	 * long RefusedCancelNumBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private int orderNum;

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
}
