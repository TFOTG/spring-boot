package com.elong.hotel.storage.context;

import com.elong.hotel.hotelconfirm.cancel.po.CancelOrderPo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;
import com.elong.hotel.hotelconfirm.confirmorder.po.ConfirmOrderPo;
import com.elong.hotel.hotelconfirm.examorder.po.ExamOrderPo;
import com.elong.hotel.proxy.javaorder.getorder.GetOrderStatusChangeTimeBo;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.storage.bo.OrderConsumerInfoBo;
import com.elong.hotel.storage.enums.StorageTypeEnum;
import com.elong.hotel.storage.request.OrderStatusChangeRequest;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Hualong.Li on 17/4/24.
 */
public class StorageContext implements Serializable{

	private static final long serialVersionUID = -234123412341234123L;

	/**
	 * 反馈来源
	 */
	private StorageTypeEnum fromEnum;

	private OrderConsumerInfoBo orderConsumerInfo;
	/**
	 * 订单信息
	 */
	private Order order;
	// 操作ip
	private String opIp;
	// 操作人
	private String opName;
	// 操作日期
	private Date opDate;

	private String tableName;

	private GetOrderStatusChangeTimeBo orderStatusChange;

	private ConfirmOrderPo confirmOrderPo;

	private ServerRunningDomainEnum runningDomainEnum;

	private OrderStatusChangeRequest request;
	
	private ExamOrderPo examOrderPo;

    private CancelOrderPo cancelOrderPo;

	public StorageTypeEnum getFromEnum() {
		return fromEnum;
	}

	public void setFromEnum(StorageTypeEnum fromEnum) {
		this.fromEnum = fromEnum;
	}

	public OrderConsumerInfoBo getOrderConsumerInfo() {
		return orderConsumerInfo;
	}

	public void setOrderConsumerInfo(OrderConsumerInfoBo orderConsumerInfo) {
		this.orderConsumerInfo = orderConsumerInfo;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getOpIp() {
		return opIp;
	}

	public void setOpIp(String opIp) {
		this.opIp = opIp;
	}

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public Date getOpDate() {
		return opDate;
	}

	public void setOpDate(Date opDate) {
		this.opDate = opDate;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public ConfirmOrderPo getConfirmOrderPo() {
		return confirmOrderPo;
	}

	public void setConfirmOrderPo(ConfirmOrderPo confirmOrderPo) {
		this.confirmOrderPo = confirmOrderPo;
	}

	public ServerRunningDomainEnum getRunningDomainEnum() {
		return runningDomainEnum;
	}

	public void setRunningDomainEnum(ServerRunningDomainEnum runningDomainEnum) {
		this.runningDomainEnum = runningDomainEnum;
	}

	public GetOrderStatusChangeTimeBo getOrderStatusChange() {
		return orderStatusChange;
	}

	public void setOrderStatusChange(GetOrderStatusChangeTimeBo orderStatusChange) {
		this.orderStatusChange = orderStatusChange;
	}

	public OrderStatusChangeRequest getRequest() {
		return request;
	}

	public void setRequest(OrderStatusChangeRequest request) {
		this.request = request;
	}

	public ExamOrderPo getExamOrderPo() {
		return examOrderPo;
	}

	public void setExamOrderPo(ExamOrderPo examOrderPo) {
		this.examOrderPo = examOrderPo;
	}

    public CancelOrderPo getCancelOrderPo() {
        return cancelOrderPo;
    }

    public void setCancelOrderPo(CancelOrderPo cancelOrderPo) {
        this.cancelOrderPo = cancelOrderPo;
    }
}
