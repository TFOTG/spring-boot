package com.elong.hotel.proxy.javaorder.response;

/**
 * 修改订单response
 * 
 * @author zouyufei
 *
 */
public class ModifyOrderResponse {

	private Integer authorizeType;
	private boolean instantConfirm;
	private Integer orderId;
	private Integer retcode;
	private String retdesc;
	private String serverIp;
	private Long serverTicks;
	private boolean vouch;
	private Integer vouchStatus;

	public Integer getAuthorizeType() {
		return authorizeType;
	}

	public void setAuthorizeType(Integer authorizeType) {
		this.authorizeType = authorizeType;
	}

	public boolean isInstantConfirm() {
		return instantConfirm;
	}

	public void setInstantConfirm(boolean instantConfirm) {
		this.instantConfirm = instantConfirm;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getRetcode() {
		return retcode;
	}

	public void setRetcode(Integer retcode) {
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

	public Long getServerTicks() {
		return serverTicks;
	}

	public void setServerTicks(Long serverTicks) {
		this.serverTicks = serverTicks;
	}

	public boolean isVouch() {
		return vouch;
	}

	public void setVouch(boolean vouch) {
		this.vouch = vouch;
	}

	public Integer getVouchStatus() {
		return vouchStatus;
	}

	public void setVouchStatus(Integer vouchStatus) {
		this.vouchStatus = vouchStatus;
	}

}
