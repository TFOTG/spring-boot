package com.elong.hotel.hotelconfirm.group.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.group.bo.ConfirmGroupBo;
import com.elong.hotel.hotelconfirm.group.po.ConfirmGroupPo;

import java.util.List;

/**
 * Created by user on 17/6/8.
 */
public class GetConfirmGroupsResponse extends ServiceResponseBase {
    public List<ConfirmGroupBo> getConfirmGroupBos() {
        return confirmGroupBos;
    }

    public void setConfirmGroupBos(List<ConfirmGroupBo> confirmGroupBos) {
        this.confirmGroupBos = confirmGroupBos;
    }

    private List<ConfirmGroupBo> confirmGroupBos;

}
