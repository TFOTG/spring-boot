package com.elong.hotel.proxy.platform.response;

import java.io.Serializable;
import java.util.List;

import com.elong.hotel.proxy.platform.bo.ProxyInfoBo;

public class GetProxyInfoResponse implements Serializable {

	private int code;
	private String msg;
	private List<ProxyInfoBo> data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<ProxyInfoBo> getData() {
		return data;
	}

	public void setData(List<ProxyInfoBo> data) {
		this.data = data;
	}
}
