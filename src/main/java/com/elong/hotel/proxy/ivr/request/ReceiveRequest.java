package com.elong.hotel.proxy.ivr.request;

import com.elong.hotel.common.request.ServiceRequestBase;

import java.io.Serializable;

public class ReceiveRequest extends ServiceRequestBase implements Serializable {

	private static final long serialVersionUID = -1364044844113709588L;
	//唯一guid
	private String bussinessGuid;
	//模板号
	private Integer flowTemplateNo;
	//
	private Integer priority;
	//产品线
	private String productline;
	//电话
	private String mobile;
	//分机
	private String extension;
	//订单号
	private String orderIds;
	//酒店id
	private String hotelId;
	//模板数据
	private Object flowData;

	public ReceiveRequest(String bussinessGuid, Integer flowTemplateNo, Integer priority, String productline, String mobile,
			String extension, String orderIds, String hotelId, Object flowData) {
		this.bussinessGuid = bussinessGuid;
		this.flowTemplateNo = flowTemplateNo;
		this.priority = priority;
		this.productline = productline;
		this.mobile = mobile.replaceAll("-", "");
		this.extension = extension;
		this.orderIds = orderIds;
		this.hotelId = hotelId;
		this.flowData = flowData;
	}

	public String getBussinessGuid() {
		return bussinessGuid;
	}

	public void setBussinessGuid(String bussinessGuid) {
		this.bussinessGuid = bussinessGuid;
	}

	public Integer getFlowTemplateNo() {
		return flowTemplateNo;
	}

	public void setFlowTemplateNo(Integer flowTemplateNo) {
		this.flowTemplateNo = flowTemplateNo;
	}

	public String getProductline() {
		return productline;
	}

	public void setProductline(String productline) {
		this.productline = productline;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(String orderIds) {
		this.orderIds = orderIds;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public Object getFlowData() {
		return flowData;
	}

	public void setFlowData(Object flowData) {
		this.flowData = flowData;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}
}