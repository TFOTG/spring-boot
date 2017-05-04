package com.elong.hotel.hotelconfirm.confirmorder.bo;


import com.elong.hotel.common.bo.OperatorInfoBo;

/**
 * 执行action操作的参数来源
 * 
 */
public class ServerRunningActionEntity {
    ConfirmOrderBo confirmOrderBo;

    OperatorInfoBo operatorInfoBo;

    public ServerRunningActionEntity(ConfirmOrderBo confirmOrderBo){
        this.confirmOrderBo = confirmOrderBo;
    }

    public ServerRunningActionEntity(ConfirmOrderBo confirmOrderBo, OperatorInfoBo operatorInfoBo) {
        this.confirmOrderBo = confirmOrderBo;
        this.operatorInfoBo = operatorInfoBo;
    }

    public ConfirmOrderBo getConfirmOrderBo() {
        return confirmOrderBo;
    }

    public void setConfirmOrderBo(ConfirmOrderBo confirmOrderBo) {
        this.confirmOrderBo = confirmOrderBo;
    }

    public OperatorInfoBo getOperatorInfoBo() {
        return operatorInfoBo;
    }

    public void setOperatorInfoBo(OperatorInfoBo operatorInfoBo) {
        this.operatorInfoBo = operatorInfoBo;
    }
}
