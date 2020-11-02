package com.peng.utilbo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by peng.wang on 2018/12/6.
 */
public class GetAttendanceInfoResponse {

    @JSONField(name = "Success")
    private boolean success;
    @JSONField(name = "Message")
    private String message;
    @JSONField(name = "Code")
    private int code;
    @JSONField(name = "Total")
    private int total;
    @JSONField(name = "ReturnValue")
    private List<AttendanceBo> returnValue;

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<AttendanceBo> getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(List<AttendanceBo> returnValue) {
        this.returnValue = returnValue;
    }
}
