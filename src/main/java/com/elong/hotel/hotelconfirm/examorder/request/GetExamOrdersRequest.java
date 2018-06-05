package com.elong.hotel.hotelconfirm.examorder.request;

import java.io.Serializable;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月30日 下午4:20:16   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetExamOrdersRequest implements Serializable{

	/** 
	 * long GetExamOrdersRequest.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 类型 1:待处理，2:暂缓
	 */
	private int type;
	
	/**
	 * 页码
	 */
	private int page;
	
	/**
	 * 每页条数
	 */
	private int size;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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
