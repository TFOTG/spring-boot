package com.elong.hotel.proxy.javaorder.visualizationentity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by yangboyu on 17/6/16.
 */
public class ChangePromiseTimeVisualzation {

    @JSONField(name = "Reason")
    private String reason;

    @JSONField(name = "PromiseTime", format = "yyyy-MM-dd HH:mm")
    private Date promiseTime;

    public ChangePromiseTimeVisualzation(Date promiseTime, String reason) {
        this.promiseTime = promiseTime;
        this.reason = reason;
    }

    public Date getPromiseTime() {
        return promiseTime;
    }

    public void setPromiseTime(Date promiseTime) {
        this.promiseTime = promiseTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
