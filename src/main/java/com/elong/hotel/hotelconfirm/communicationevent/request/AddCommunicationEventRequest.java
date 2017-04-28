package com.elong.hotel.hotelconfirm.communicationevent.request;

/**
 * Created by yangboyu on 17/4/27.
 */
public class AddCommunicationEventRequest {
    private String tag;
    private String methodName;
    private String request;
    private String response;

    public AddCommunicationEventRequest(String methodName, String request, String response, String tag) {
        this.methodName = methodName;
        this.request = request;
        this.response = response;
        this.tag = tag;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
