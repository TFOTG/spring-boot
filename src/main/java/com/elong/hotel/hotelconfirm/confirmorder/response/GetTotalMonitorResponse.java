package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.confirmorder.vo.TotalMonitorVO;

import java.util.List;

/**
 * Created by peng.wang on 2017/7/12.
 */
public class GetTotalMonitorResponse extends ServiceResponseBase {


    private List<TotalMonitorVO> list;

    //最后一行总计的数据
    private TotalMonitorVO total;

    public List<TotalMonitorVO> getList() {
        return list;
    }

    public void setList(List<TotalMonitorVO> list) {
        this.list = list;
    }

    public TotalMonitorVO getTotal() {
        return total;
    }

    public void setTotal(TotalMonitorVO total) {
        this.total = total;
    }
}
