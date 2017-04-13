package com.elong.hotel.proxy.javaorder.response;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 创建订单response
 * @author zouyufei
 *
 */
public class CreateOrderResponse  {
	private Long orderId;// Y 160000001 订单号
	private Boolean isVouch;// Y true 是否担保订单
	private BigDecimal vouchPrice;// Y 400.00 支付金额
	private Date latestChangeTime;// Y 1900-01-01 00:00:04 最晚取消变更时间
	private Date latestPayTime;// Y 2015-07-01 15:26:09 最晚支付时间
	private Integer authorizeType;// Y 1 用户授权类型: 1：先扣款后确认，2：先确认后扣款
	private Boolean isInstantConfirm;// Y true 是否即时确认Ï
	private Long duplicateOrderId;// Y 0 重单订单号
	private String duplicateTraceId;// N null 重单TraceId
	private Integer responseCode;// Y 0 API执行结果，0表示正确返回，-1表示系统异常，大于0表示业务异常
	private String message;// N 红包余额不足 API未正确返回时，附加的系统异常或业务异常信息
	private Long executeTime;// Y 800 API执行时间(服务器端)，从接收请求到返回结果的时间，单位毫秒
	private String executeServerIp;// Y 192.168.67.49 API执行机器的Ip地址

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Boolean getIsVouch() {
		return isVouch;
	}

	public void setIsVouch(Boolean isVouch) {
		this.isVouch = isVouch;
	}

	public BigDecimal getVouchPrice() {
		return vouchPrice;
	}

	public void setVouchPrice(BigDecimal vouchPrice) {
		this.vouchPrice = vouchPrice;
	}

	public Date getLatestChangeTime() {
		return latestChangeTime;
	}

	public void setLatestChangeTime(Date latestChangeTime) {
		this.latestChangeTime = latestChangeTime;
	}

	public Date getLatestPayTime() {
		return latestPayTime;
	}

	public void setLatestPayTime(Date latestPayTime) {
		this.latestPayTime = latestPayTime;
	}

	public Integer getAuthorizeType() {
		return authorizeType;
	}

	public void setAuthorizeType(Integer authorizeType) {
		this.authorizeType = authorizeType;
	}

	public Boolean getIsInstantConfirm() {
		return isInstantConfirm;
	}

	public void setIsInstantConfirm(Boolean isInstantConfirm) {
		this.isInstantConfirm = isInstantConfirm;
	}

	public Long getDuplicateOrderId() {
		return duplicateOrderId;
	}

	public void setDuplicateOrderId(Long duplicateOrderId) {
		this.duplicateOrderId = duplicateOrderId;
	}

	public String getDuplicateTraceId() {
		return duplicateTraceId;
	}

	public void setDuplicateTraceId(String duplicateTraceId) {
		this.duplicateTraceId = duplicateTraceId;
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getExecuteTime() {
		return executeTime;
	}

	public void setExecuteTime(Long executeTime) {
		this.executeTime = executeTime;
	}

	public String getExecuteServerIp() {
		return executeServerIp;
	}

	public void setExecuteServerIp(String executeServerIp) {
		this.executeServerIp = executeServerIp;
	}
}
