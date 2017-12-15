package com.elong.hotel.log.monitordata.forcomparator;

import com.elong.hotel.log.monitordata.bo.MonitorDataBo;

import java.util.Comparator;

/**
 * @outhor jianjun.wang
 * @create 2017-12-11 下午3:04
 */

public class MonitorDataComparator implements Comparator<MonitorDataBo> {

    @Override
    public int compare(MonitorDataBo o1, MonitorDataBo o2) {
        return o1.getCollectTime().compareTo(o2.getCollectTime());
    }
}