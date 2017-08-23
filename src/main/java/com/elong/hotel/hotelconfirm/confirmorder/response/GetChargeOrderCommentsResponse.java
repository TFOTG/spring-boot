package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.proxy.javaorder.getorder.OrderComment;

import java.util.List;

/**
 * Created by peng.wang on 2017/8/17.
 */
public class GetChargeOrderCommentsResponse extends ServiceResponseBase {

    private List<OrderComment> list;

    public List<OrderComment> getList() {
        return list;
    }

    public void setList(List<OrderComment> list) {
        this.list = list;
    }
}
