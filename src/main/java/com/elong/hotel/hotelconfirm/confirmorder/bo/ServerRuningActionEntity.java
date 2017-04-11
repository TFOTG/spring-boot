package com.elong.hotel.hotelconfirm.confirmorder.bo;


/**
 * 执行action操作的参数来源
 * 
 */
public class ServerRuningActionEntity {
    ConfirmOrderBo confirmOrderBo;

    public ServerRuningActionEntity(ConfirmOrderBo confirmOrderBo){
        this.confirmOrderBo = confirmOrderBo;
    }

    public ConfirmOrderBo getConfirmOrderBo() {
        return confirmOrderBo;
    }

    public void setConfirmOrderBo(ConfirmOrderBo confirmOrderBo) {
        this.confirmOrderBo = confirmOrderBo;
    }
}
