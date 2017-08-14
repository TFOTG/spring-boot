/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmorder.vo.ResetEbkVO.java]
 * Createion [2017年8月10日]
 */
package com.elong.hotel.hotelconfirm.confirmorder.vo;

import javax.validation.constraints.NotNull;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class ResetEbkVO {

	@NotNull(message="订单号不能为空")
	private Integer reserno;
	
	@NotNull(message="备注不能为空")
	private String notesToHotel;

	public Integer getReserno() {
		return reserno;
	}

	public void setReserno(Integer reserno) {
		this.reserno = reserno;
	}

	public String getNotesToHotel() {
		return notesToHotel;
	}

	public void setNotesToHotel(String notesToHotel) {
		this.notesToHotel = notesToHotel;
	}
	
	
}
