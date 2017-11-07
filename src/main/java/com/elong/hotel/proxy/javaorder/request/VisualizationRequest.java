package com.elong.hotel.proxy.javaorder.request;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 订单可视化Request  数据
 * 
 * @author
 *
 */
public class VisualizationRequest {

	// 操作者信息
	@JSONField(name = "operatorInfo")
	private OperatorInfo clientOperatorInfo;

	// 订单号
	private Integer orderId;

	// 内部备注
	private String templateNo;

	// 是否需要更新给客人可视化状态
	private Boolean needRecordClientStatus;

	// 模板数据json 对象
	private String generalParam;

	public OperatorInfo getClientOperatorInfo() {
		return clientOperatorInfo;
	}

	public void setClientOperatorInfo(OperatorInfo clientOperatorInfo) {
		this.clientOperatorInfo = clientOperatorInfo;
	}

	public String getGeneralParam() {
		return generalParam;
	}

	public void setGeneralParam(String generalParam) {
		this.generalParam = generalParam;
	}

	public Boolean getNeedRecordClientStatus() {
		return needRecordClientStatus;
	}

	public void setNeedRecordClientStatus(Boolean needRecordClientStatus) {
		this.needRecordClientStatus = needRecordClientStatus;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getTemplateNo() {
		return templateNo;
	}

	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}
}
