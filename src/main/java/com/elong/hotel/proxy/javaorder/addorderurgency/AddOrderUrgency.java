package com.elong.hotel.proxy.javaorder.addorderurgency;

import scala.Int;

import java.util.Date;

/**
 * Created by yangboyu on 17/6/16.
 */
public class AddOrderUrgency {

    private Integer addOrderUrgencyRecord;

    private Date lastChangeTime;

    public Integer getAddOrderUrgencyRecord() {
        return addOrderUrgencyRecord;
    }

    public void setAddOrderUrgencyRecord(Integer addOrderUrgencyRecord) {
        this.addOrderUrgencyRecord = addOrderUrgencyRecord;
    }

    public Date getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(Date lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }
}
