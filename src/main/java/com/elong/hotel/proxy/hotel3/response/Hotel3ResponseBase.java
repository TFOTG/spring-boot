package com.elong.hotel.proxy.hotel3.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by user on 17/8/16.
 */
public class Hotel3ResponseBase {

    @JSONField(name = "Result")
    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public class Result{
        @JSONField(name = "ApplicationServerIP")
        private String applicationServerIP;

        @JSONField(name = "ErrorMessage")
        private String ErrorMessage;

        @JSONField(name = "UsedMillionSecond")
        private double usedMillionSecond;

        @JSONField(name = "ResponseCode")
        private int responseCode;

        public String getApplicationServerIP() {
            return applicationServerIP;
        }

        public void setApplicationServerIP(String applicationServerIP) {
            this.applicationServerIP = applicationServerIP;
        }

        public String getErrorMessage() {
            return ErrorMessage;
        }

        public void setErrorMessage(String errorMessage) {
            ErrorMessage = errorMessage;
        }

        public int getResponseCode() {
            return responseCode;
        }

        public void setResponseCode(int responseCode) {
            this.responseCode = responseCode;
        }

        public double getUsedMillionSecond() {
            return usedMillionSecond;
        }

        public void setUsedMillionSecond(double usedMillionSecond) {
            this.usedMillionSecond = usedMillionSecond;
        }
    }

}
