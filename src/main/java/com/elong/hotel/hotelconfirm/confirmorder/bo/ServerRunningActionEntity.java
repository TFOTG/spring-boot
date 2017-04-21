package com.elong.hotel.hotelconfirm.confirmorder.bo;


/**
 * 执行action操作的参数来源
 * 
 */
public class ServerRunningActionEntity {
    ConfirmOrderBo confirmOrderBo;

    public ServerRunningActionEntity(ConfirmOrderBo confirmOrderBo){
        this.confirmOrderBo = confirmOrderBo;
    }

    public ConfirmOrderBo getConfirmOrderBo() {
        return confirmOrderBo;
    }

    public void setConfirmOrderBo(ConfirmOrderBo confirmOrderBo) {
        this.confirmOrderBo = confirmOrderBo;
    }
}
