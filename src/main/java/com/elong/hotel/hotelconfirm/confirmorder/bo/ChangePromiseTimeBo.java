package com.elong.hotel.hotelconfirm.confirmorder.bo;

import com.elong.hotel.hotelconfirm.confirmorder.enums.ChangePromiseTimeResultEnum;

import java.util.Date;

/**
 * Created by yangboyu on 17/4/7.
 */
public class ChangePromiseTimeBo {
    private ChangePromiseTimeResultEnum changePromiseResultEnum;

    private Date newPromiseTime;

    public ChangePromiseTimeResultEnum getChangePromiseResultEnum() {
        return changePromiseResultEnum;
    }

    public void setChangePromiseResultEnum(ChangePromiseTimeResultEnum changePromiseResultEnum) {
        this.changePromiseResultEnum = changePromiseResultEnum;
    }

    public Date getNewPromiseTime() {
        return newPromiseTime;
    }

    public void setNewPromiseTime(Date newPromiseTime) {
        this.newPromiseTime = newPromiseTime;
    }
}
