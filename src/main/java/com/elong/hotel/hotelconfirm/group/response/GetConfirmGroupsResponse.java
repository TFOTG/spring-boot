package com.elong.hotel.hotelconfirm.group.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.group.po.ConfirmGroupPo;

import java.util.List;

/**
 * Created by user on 17/6/8.
 */
public class GetConfirmGroupsResponse extends ServiceResponseBase {
    public List<ConfirmGroupPo> getConfirmGroupPos() {
        return confirmGroupPos;
    }

    public void setConfirmGroupPos(List<ConfirmGroupPo> confirmGroupPos) {
        this.confirmGroupPos = confirmGroupPos;
    }

    private List<ConfirmGroupPo> confirmGroupPos;

}
