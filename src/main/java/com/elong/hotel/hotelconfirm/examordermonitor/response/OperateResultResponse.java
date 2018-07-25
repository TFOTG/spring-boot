package com.elong.hotel.hotelconfirm.examordermonitor.response;

import com.elong.hotel.common.response.ServiceResponseBase;

import java.io.Serializable;

/**
 * Created by liujunjie on 2018/6/25.
 */
public class OperateResultResponse extends ServiceResponseBase implements Serializable {

    private int resultCode;

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }
}
