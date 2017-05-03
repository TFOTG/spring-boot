package com.elong.hotel.common.response;

import java.io.Serializable;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class GetOrderListByTimeResponse implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private OrderBodyResponse body;
	
	private int retcode;
	
	private String retdesc;
	
	private String serverIp;
	
	private long serverTicks;

	public OrderBodyResponse getBody() {
		return body;
	}

	public void setBody(OrderBodyResponse body) {
		this.body = body;
	}

	public int getRetcode() {
		return retcode;
	}

	public void setRetcode(int retcode) {
		this.retcode = retcode;
	}

	public String getRetdesc() {
		return retdesc;
	}

	public void setRetdesc(String retdesc) {
		this.retdesc = retdesc;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public long getServerTicks() {
		return serverTicks;
	}

	public void setServerTicks(long serverTicks) {
		this.serverTicks = serverTicks;
	}
	
	
}
