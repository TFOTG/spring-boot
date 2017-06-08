package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.confirmorder.bo.ChargeConfirmOrderBo;

import java.util.List;

/**
 * Created by peng.wang on 17/6/6.
 */
public class GetChargeOrdersResponse extends ServiceResponseBase {

    private List<ChargeConfirmOrderBo> list;

    private int totalSize;

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public List<ChargeConfirmOrderBo> getList() {
        return list;
    }

    public void setList(List<ChargeConfirmOrderBo> list) {
        this.list = list;
    }
}
