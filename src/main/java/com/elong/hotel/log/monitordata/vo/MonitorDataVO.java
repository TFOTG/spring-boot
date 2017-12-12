package com.elong.hotel.log.monitordata.vo;

import com.elong.hotel.common.parameter.PaginationParameter;
import com.sun.tools.corba.se.idl.StringGen;

import java.util.Date;

/**
 * @outhor jianjun.wang
 * @create 2017-12-05 下午4:50
 */

public class MonitorDataVO extends PaginationParameter{



    /**
     *时间轴参数 start
     */
    private Date startCollectTime;

    /**
     * 时间轴参数 end
     */
    private Date endCollectTime;

    public Date getStartCollectTime() {
        return startCollectTime;
    }

    public void setStartCollectTime(Date startCollectTime) {
        this.startCollectTime = startCollectTime;
    }

    public Date getEndCollectTime() {
        return endCollectTime;
    }

    public void setEndCollectTime(Date endCollectTime) {
        this.endCollectTime = endCollectTime;
    }

    public MonitorDataVO(Date startCollectTime, Date endCollectTime) {
        this.startCollectTime = startCollectTime;
        this.endCollectTime = endCollectTime;
    }

    public MonitorDataVO() {
    }
}