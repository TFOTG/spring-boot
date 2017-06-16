package com.elong.hotel.proxy.javaorder.visualizationentity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by yangboyu on 17/6/16.
 */
public class UrgeVisual {

    @JSONField(name = "AdjustTime", format = "yyyy-MM-dd HH:mm")
    private Date adjustTime;

    public UrgeVisual(Date adjustTime) {
        this.adjustTime = adjustTime;
    }

    public Date getAdjustTime() {
        return adjustTime;
    }

    public void setAdjustTime(Date adjustTime) {
        this.adjustTime = adjustTime;
    }
}
