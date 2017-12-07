package com.elong.hotel.log.monitordata.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * @outhor jianjun.wang
 * @create 2017-12-05 下午4:57
 */

public class MonitorBoardResponse extends ServiceResponseBase{

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}