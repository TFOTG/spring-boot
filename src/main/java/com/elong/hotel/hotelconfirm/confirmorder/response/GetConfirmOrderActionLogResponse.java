package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * 执行command的结果
 */
public class GetConfirmOrderActionLogResponse extends ServerActionResponseBase implements Serializable {

    private String status;
    public GetConfirmOrderActionLogResponse() {
        status = "0";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
