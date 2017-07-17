package com.elong.hotel.proxy.hotel3.response;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by peng.wang on 2017/7/17.
 */
public class CloseRoomResponse {

    @JsonProperty(value = "ErrMsg")
    private String errMsg;

    @JsonProperty(value = "Result")
    private String result;

    @JsonProperty(value = "ResultCode")
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
