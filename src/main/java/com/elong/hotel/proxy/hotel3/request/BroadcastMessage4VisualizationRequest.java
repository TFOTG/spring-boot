package com.elong.hotel.proxy.hotel3.request;

/**
 * Created by peng.wang on 17/4/25.
 */
public class BroadcastMessage4VisualizationRequest {

    private String templateNo;

    private String reason;

    private String promiseTime;

    public BroadcastMessage4VisualizationRequest() {

    }

    public String getTemplateNo() {
        return templateNo;
    }

    public void setTemplateNo(String templateNo) {
        this.templateNo = templateNo;
    }

    public String getPromiseTime() {
        return promiseTime;
    }

    public void setPromiseTime(String promiseTime) {
        this.promiseTime = promiseTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}


