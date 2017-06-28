package com.elong.hotel.log.hotelconfirm.po;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class CommunicationEventPo {
    private Long id;

    private String eventType;

    private String customTag;

    private String request;

    private String response;

    private Date opDate;

    private String opName;

    private String opIp;

    public CommunicationEventPo(String eventType, String request, String response, String customTag) throws UnknownHostException {
        this.response = response;
        this.request = request;
        this.eventType = eventType;
        this.customTag = customTag;
        this.opDate = new Date();
        this.opIp = InetAddress.getLocalHost().getHostAddress();
        this.opName = "";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    public String getCustomTag() {
        return customTag;
    }

    public void setCustomTag(String customTag) {
        this.customTag = customTag == null ? null : customTag.trim();
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName == null ? null : opName.trim();
    }

    public String getOpIp() {
        return opIp;
    }

    public void setOpIp(String opIp) {
        this.opIp = opIp == null ? null : opIp.trim();
    }
}