package com.elong.hotel.hotelconfirm.communicationevent.request;

/**
 * Created by yangboyu on 17/4/27.
 */
public class AddCommunicationEventRequest {
    private String tag;
    private String eventtype;
    private Object request;
    private Object response;


    public AddCommunicationEventRequest(String eventtype, Object request, Object response, String tag) {
        this.eventtype = eventtype;
        this.request = request;
        this.response = response;
        this.tag = tag;
    }

    public String getEventtype() {
        return eventtype;
    }

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }

    public Object getRequest() {
        return request;
    }

    public void setRequest(Object request) {
        this.request = request;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
