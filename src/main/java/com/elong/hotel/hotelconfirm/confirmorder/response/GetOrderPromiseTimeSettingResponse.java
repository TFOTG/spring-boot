package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * 执行command的结果
 */
public class GetOrderPromiseTimeSettingResponse extends ServerActionResponseBase implements Serializable {

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date promiseTime;

    private Integer orderType;

    //还有多久确认，非即时订单大于0，即时为0
    private Integer promiseTime4Minute;

    public GetOrderPromiseTimeSettingResponse() {
    }

    public Date getPromiseTime() {
        return promiseTime;
    }

    public void setPromiseTime(Date promiseTime) {
        this.promiseTime = promiseTime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getPromiseTime4Minute() {
        return promiseTime4Minute;
    }

    public void setPromiseTime4Minute(Integer promiseTime4Minute) {
        this.promiseTime4Minute = promiseTime4Minute;
    }
}
