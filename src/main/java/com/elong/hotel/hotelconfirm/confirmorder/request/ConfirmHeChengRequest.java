package com.elong.hotel.hotelconfirm.confirmorder.request;

import java.io.Serializable;

import com.elong.common.util.StringUtils;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年2月27日 下午2:01:29   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class ConfirmHeChengRequest implements Serializable {

	/** 
	 * long ConfirmHeChengRequest.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String ctripOrderId;

	private String elongOrderId;

	private String status;

	private String notes;

	public String getCtripOrderId() {
		return ctripOrderId;
	}

	public void setCtripOrderId(String ctripOrderId) {
		this.ctripOrderId = ctripOrderId;
	}

	public String getElongOrderId() {
		return elongOrderId;
	}

	public void setElongOrderId(String elongOrderId) {
		this.elongOrderId = elongOrderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean validtion() {
		if (StringUtils.isEmpty(ctripOrderId)) {
			return true;
		}
		if (StringUtils.isEmpty(elongOrderId)) {
			return true;
		}
		if (StringUtils.isEmpty(status)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "ConfirmHeChengRequest [ctripOrderId=" + ctripOrderId + ", elongOrderId=" + elongOrderId + ", status=" + status + ", notes="
				+ notes + "]";
	}

}
