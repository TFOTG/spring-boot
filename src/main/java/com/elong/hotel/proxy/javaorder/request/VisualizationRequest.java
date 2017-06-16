package com.elong.hotel.proxy.javaorder.request;

/**
 * 订单可视化Request  数据
 * 
 * @author
 *
 */
public class VisualizationRequest {

	// 操作者信息
	private OperatorInfo clientOperatorInfo;

	// 订单号
	private Long orderId;

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

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getTemplateNo() {
		return templateNo;
	}

	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}
}
