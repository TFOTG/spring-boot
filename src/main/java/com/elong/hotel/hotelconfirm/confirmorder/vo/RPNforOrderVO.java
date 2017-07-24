/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmorder.vo.SendMessageVO.java]
 * Createion [2017年7月18日]
 */
package com.elong.hotel.hotelconfirm.confirmorder.vo;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class RPNforOrderVO {

	@NotBlank(message="备注内容不能为空")
	private String notesToElong;
	
	@NotNull(message="订单号不能为空")
	private Integer orderId;

	@NotNull(message="酒店id不能为空")
	private String hotelId;
	
	@NotBlank(message="暂缓时间不能为空")
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date respitetime;
	
	@NotBlank(message="承诺时间不能为空")
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date promiseTime;

	private String msg;

	private String note2Action;

	private Integer minutes;

	public String getNotesToElong() {
		return notesToElong;
	}

	public void setNotesToElong(String notesToElong) {
		this.notesToElong = notesToElong;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getRespitetime() {
		return respitetime;
	}

	public void setRespitetime(Date respitetime) {
		this.respitetime = respitetime;
	}

	public Date getPromiseTime() {
		return promiseTime;
	}

	public void setPromiseTime(Date promiseTime) {
		this.promiseTime = promiseTime;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getNote2Action() {
		return note2Action;
	}

	public void setNote2Action(String note2Action) {
		this.note2Action = note2Action;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}
}
