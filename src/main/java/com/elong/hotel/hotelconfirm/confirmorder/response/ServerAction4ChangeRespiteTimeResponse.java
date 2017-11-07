package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * 执行command的结果
 */
public class ServerAction4ChangeRespiteTimeResponse extends ServerActionResponseBase implements Serializable{


	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date respiteTime;

	public ServerAction4ChangeRespiteTimeResponse() {

	}

	public Date getRespiteTime() {
		return respiteTime;
	}

	public void setRespiteTime(Date respiteTime) {
		this.respiteTime = respiteTime;
	}
}
