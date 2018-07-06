package com.elong.hotel.hotelconfirm.examorder.bo;

import java.io.Serializable;

/**
 * 过期单BO
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年7月5日 下午2:38:56   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class ExpiredExamOrderBo implements Serializable{

	/** 
	 * long ExpiredExamOrderBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private Integer reserNo;
	
	private String responseStr;

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public String getResponseStr() {
		return responseStr;
	}

	public void setResponseStr(String responseStr) {
		this.responseStr = responseStr;
	}
	
}
