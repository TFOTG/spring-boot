package com.elong.hotel.proxy.platform.response;

import com.elong.hotel.common.response.ServiceResponseBase;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Hualong.Li on 17/7/14.
 */
public class SendMsgResponse extends ServiceResponseBase implements Serializable {

	private String code;
	private String msg;
	private String data;

	private String serverIp;

	private Date timestamp;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
