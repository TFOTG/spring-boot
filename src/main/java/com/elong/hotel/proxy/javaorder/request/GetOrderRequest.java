package com.elong.hotel.proxy.javaorder.request;

import edu.emory.mathcs.backport.java.util.Arrays;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 获取原始订单request
 * 
 * @author zouyufei
 *
 */
public class GetOrderRequest implements Serializable  {

	private static final long serialVersionUID = 8251288774722684444L;
	
	// 订单id
	private int orderId;
	//订单id集合
	private List<String> orderIds;
	//所需字段
	private List<String> fields;
	//开始时间戳
	private String startTimestamp;
	//结束时间戳
	private String endTimestamp;
	//参数类型
	private String logType;
	//订单状态
	private String status;
	//mod
	private String modeNo;
	
	private String mod;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(String startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public String getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(String endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public GetOrderRequest() {
	}

	public GetOrderRequest(int orderId, String... fields) {
		this.orderId = orderId;
		this.addFields(fields);
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getFields() {
		if (this.fields == null || this.fields.size() == 0) {
			return "";
		}
		return StringUtils.join(fields.iterator(), ",");
	}

	public void addFields(String... fields) {
		if (this.fields == null) {
			this.fields = new ArrayList<String>();
		}
		if (fields != null && fields.length > 0) {
			this.fields.addAll(Arrays.asList(fields));
		}
	}

	public String getModeNo() {
		return modeNo;
	}

	public void setModeNo(String modeNo) {
		this.modeNo = modeNo;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public List<String> getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(List<String> orderIds) {
		this.orderIds = orderIds;
	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (!(o instanceof GetOrderRequest)) return false;
//
//		GetOrderRequest request = (GetOrderRequest) o;
//
//		return orderId == request.orderId;
//
//	}
//
//	@Override
//	public int hashCode() {
//		return orderId;
//	}

	//
//
//	@Override
//	public int hashCode() {
//		return this.getOrderId();
//	}
}