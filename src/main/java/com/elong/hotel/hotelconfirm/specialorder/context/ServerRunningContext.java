package com.elong.hotel.hotelconfirm.specialorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;
import com.elong.hotel.hotelconfirm.specialorder.bo.SpecialOrderBo;
import com.elong.hotel.storage.bo.OrderConsumerInfoBo;

import java.io.Serializable;

public class ServerRunningContext implements Serializable {

	private Integer reserNo;

	private SpecialOrderBo originSpecialOrderBo;

	private SpecialOrderBo targetSpecialOrderBo;

	private ServerRunningDomainEnum serverRunningDomainEnum;

	private OrderConsumerInfoBo orderConsumerInfoBo;

	private OperatorInfoBo operator;
	
	private int vouchType;

    public ServerRunningContext() {
    }

    public ServerRunningContext(Integer reserNo, SpecialOrderBo originSpecialOrderBo,
                                SpecialOrderBo targetSpecialOrderBo, ServerRunningDomainEnum serverRunningDomainEnum,
                                OrderConsumerInfoBo orderConsumerInfoBo, OperatorInfoBo operator) {
        this.reserNo = reserNo;
        this.originSpecialOrderBo = originSpecialOrderBo;
        this.targetSpecialOrderBo = targetSpecialOrderBo;
        this.serverRunningDomainEnum = serverRunningDomainEnum;
        this.orderConsumerInfoBo = orderConsumerInfoBo;
        this.operator = operator;
    }

    public Integer getReserNo() {
        return reserNo;
    }

    public void setReserNo(Integer reserNo) {
        this.reserNo = reserNo;
    }

    public SpecialOrderBo getOriginSpecialOrderBo() {
        return originSpecialOrderBo;
    }

    public void setOriginSpecialOrderBo(SpecialOrderBo originSpecialOrderBo) {
        this.originSpecialOrderBo = originSpecialOrderBo;
    }

    public SpecialOrderBo getTargetSpecialOrderBo() {
        return targetSpecialOrderBo;
    }

    public void setTargetSpecialOrderBo(SpecialOrderBo targetSpecialOrderBo) {
        this.targetSpecialOrderBo = targetSpecialOrderBo;
    }

    public ServerRunningDomainEnum getServerRunningDomainEnum() {
        return serverRunningDomainEnum;
    }

    public void setServerRunningDomainEnum(ServerRunningDomainEnum serverRunningDomainEnum) {
        this.serverRunningDomainEnum = serverRunningDomainEnum;
    }

    public OrderConsumerInfoBo getOrderConsumerInfoBo() {
        return orderConsumerInfoBo;
    }

    public void setOrderConsumerInfoBo(OrderConsumerInfoBo orderConsumerInfoBo) {
        this.orderConsumerInfoBo = orderConsumerInfoBo;
    }

    public OperatorInfoBo getOperator() {
        return operator;
    }

    public void setOperator(OperatorInfoBo operator) {
        this.operator = operator;
    }

	public int getVouchType() {
		return vouchType;
	}

	public void setVouchType(int vouchType) {
		this.vouchType = vouchType;
	}
    
}
