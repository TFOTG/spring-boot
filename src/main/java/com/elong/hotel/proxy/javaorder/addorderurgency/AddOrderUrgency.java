package com.elong.hotel.proxy.javaorder.addorderurgency;

import scala.Int;

import java.util.Date;

/**
 * Created by yangboyu on 17/6/16.
 */
public class AddOrderUrgency {

    private Int addOrderUrgencyRecord;

    private Date lastChangeTime;

    public Int getAddOrderUrgencyRecord() {
        return addOrderUrgencyRecord;
    }

    public void setAddOrderUrgencyRecord(Int addOrderUrgencyRecord) {
        this.addOrderUrgencyRecord = addOrderUrgencyRecord;
    }

    public Date getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(Date lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }
}
