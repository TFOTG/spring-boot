package com.elong.hotel.log.hotelconfirm.po;

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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CommunicationEventPo other = (CommunicationEventPo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEventType() == null ? other.getEventType() == null : this.getEventType().equals(other.getEventType()))
            && (this.getCustomTag() == null ? other.getCustomTag() == null : this.getCustomTag().equals(other.getCustomTag()))
            && (this.getRequest() == null ? other.getRequest() == null : this.getRequest().equals(other.getRequest()))
            && (this.getResponse() == null ? other.getResponse() == null : this.getResponse().equals(other.getResponse()))
            && (this.getOpDate() == null ? other.getOpDate() == null : this.getOpDate().equals(other.getOpDate()))
            && (this.getOpName() == null ? other.getOpName() == null : this.getOpName().equals(other.getOpName()))
            && (this.getOpIp() == null ? other.getOpIp() == null : this.getOpIp().equals(other.getOpIp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEventType() == null) ? 0 : getEventType().hashCode());
        result = prime * result + ((getCustomTag() == null) ? 0 : getCustomTag().hashCode());
        result = prime * result + ((getRequest() == null) ? 0 : getRequest().hashCode());
        result = prime * result + ((getResponse() == null) ? 0 : getResponse().hashCode());
        result = prime * result + ((getOpDate() == null) ? 0 : getOpDate().hashCode());
        result = prime * result + ((getOpName() == null) ? 0 : getOpName().hashCode());
        result = prime * result + ((getOpIp() == null) ? 0 : getOpIp().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", eventType=").append(eventType);
        sb.append(", customTag=").append(customTag);
        sb.append(", request=").append(request);
        sb.append(", response=").append(response);
        sb.append(", opDate=").append(opDate);
        sb.append(", opName=").append(opName);
        sb.append(", opIp=").append(opIp);
        sb.append("]");
        return sb.toString();
    }
}