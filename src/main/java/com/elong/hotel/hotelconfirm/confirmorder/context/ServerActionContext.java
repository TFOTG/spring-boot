package com.elong.hotel.hotelconfirm.confirmorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmOrderBo;
import com.elong.hotel.hotelconfirm.confirmorder.bo.EBRefuseBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerActionEnum;
import com.elong.hotel.hotelconfirm.confirmorder.request.ConfirmHeChengRequest;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.enums.ActionOpFromEnum;
import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.io.Serializable;

public class ServerActionContext implements Serializable {

	ConfirmOrderBo confirmOrderBo;
	ConfirmOrderBo targetConfirmOrderBo;
	Order order;
	OperatorInfoBo operatorInfo;
	ServerActionEnum actionEnum;
	ActionOpFromEnum actionOpFromEnum;
	String Msg2Customer;
	Integer msdId;
	String note2Action;
	EBRefuseBo ebRefuseBo;
    /**
     * 赫程小修改请求参数
     */
    private ConfirmHeChengRequest hechengRequest;


	public ServerActionEnum getActionEnum() {
		return actionEnum;
	}

	public void setActionEnum(ServerActionEnum actionEnum) {
		this.actionEnum = actionEnum;
	}

	public ActionOpFromEnum getActionOpFromEnum() {
		return actionOpFromEnum;
	}

	public void setActionOpFromEnum(ActionOpFromEnum actionOpFromEnum) {
		this.actionOpFromEnum = actionOpFromEnum;
	}

	public ConfirmOrderBo getConfirmOrderBo() {
		return confirmOrderBo;
	}

	public void setConfirmOrderBo(ConfirmOrderBo confirmOrderBo) {
		this.confirmOrderBo = confirmOrderBo;
	}

	public OperatorInfoBo getOperatorInfo() {
		return operatorInfo;
	}

	public void setOperatorInfo(OperatorInfoBo operatorInfo) {
		this.operatorInfo = operatorInfo;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ConfirmOrderBo getTargetConfirmOrderBo() {
		return targetConfirmOrderBo;
	}

	public void setTargetConfirmOrderBo(ConfirmOrderBo targetConfirmOrderBo) {
		this.targetConfirmOrderBo = targetConfirmOrderBo;
	}

	public String getMsg2Customer() {
		return Msg2Customer;
	}

	public void setMsg2Customer(String msg2Customer) {
		Msg2Customer = msg2Customer;
	}

	public String getNote2Action() {
		return note2Action;
	}

	public void setNote2Action(String note2Action) {
		this.note2Action = note2Action;
	}

	public EBRefuseBo getEbRefuseBo() {
		return ebRefuseBo;
	}

	public void setEbRefuseBo(EBRefuseBo ebRefuseBo) {
		this.ebRefuseBo = ebRefuseBo;
	}

	public Integer getMsdId() {
		return msdId;
	}

	public void setMsdId(Integer msdId) {
		this.msdId = msdId;
	}

	public ConfirmHeChengRequest getHechengRequest() {
		return hechengRequest;
	}

	public void setHechengRequest(ConfirmHeChengRequest hechengRequest) {
		this.hechengRequest = hechengRequest;
	}
	
}
