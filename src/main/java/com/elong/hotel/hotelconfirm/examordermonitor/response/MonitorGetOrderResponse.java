package com.elong.hotel.hotelconfirm.examordermonitor.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.examordermonitor.bo.MonitOrorderBo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liujunjie on 2018/6/8.
 */
public class MonitorGetOrderResponse extends ServiceResponseBase implements Serializable {

    private List<MonitOrorderBo> orderList ;

    //当请页
    private int thisPage;

    //共找到多少订单
    private int orderCount;

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public int getThisPage() {
        return thisPage;
    }

    public void setThisPage(int thisPage) {
        this.thisPage = thisPage;
    }


    public List<MonitOrorderBo> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<MonitOrorderBo> orderList) {
        this.orderList = orderList;
    }
}
