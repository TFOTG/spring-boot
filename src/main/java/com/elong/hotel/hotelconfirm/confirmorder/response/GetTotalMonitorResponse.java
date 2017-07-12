package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.confirmorder.vo.TotalMonitorVO;

import java.util.List;

/**
 * Created by peng.wang on 2017/7/12.
 */
public class GetTotalMonitorResponse extends ServiceResponseBase {


    private List<TotalMonitorVO> list;

    public List<TotalMonitorVO> getList() {
        return list;
    }

    public void setList(List<TotalMonitorVO> list) {
        this.list = list;
    }
}
