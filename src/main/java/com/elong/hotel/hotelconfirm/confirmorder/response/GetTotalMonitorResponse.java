package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.confirmorder.vo.TotalMonitorVO;

import java.util.Date;
import java.util.List;

/**
 * Created by peng.wang on 2017/7/12.
 */
public class GetTotalMonitorResponse extends ServiceResponseBase {


    private List<TotalMonitorVO> list;

    //最后一行总计的数据
    private TotalMonitorVO total;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date systemDate;

    public Date getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(Date systemDate) {
        this.systemDate = systemDate;
    }

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
