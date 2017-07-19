package com.elong.hotel.proxy.hotel3.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by peng.wang on 2017/7/17.
 */
public class CloseRoomResponse {

    @JSONField(name = "ErrMsg")
    private String errMsg;

    @JSONField(name = "Result")
    private String result;

    @JSONField(name = "ResultCode")
    private int resultCode;

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

}
