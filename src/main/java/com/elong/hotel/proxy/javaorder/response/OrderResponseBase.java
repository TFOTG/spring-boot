package com.elong.hotel.proxy.javaorder.response;

/**
 * 
 * @author zouyufei
 *
 */
public class OrderResponseBase {

	private int retcode;
	private String retdesc;
	private String serverIp;
	private long serverTicks;

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
