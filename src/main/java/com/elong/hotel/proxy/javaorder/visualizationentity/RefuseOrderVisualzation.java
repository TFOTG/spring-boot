package com.elong.hotel.proxy.javaorder.visualizationentity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by yangboyu on 17/6/16.
 */
public class RefuseOrderVisualzation {

    @JSONField(name = "Notes")
    private String notes;

    @JSONField(name = "SpecialStatus")
    private String specialStatus;

    @JSONField(name = "ReserveStatus")
    private String reserveStatus;

    @JSONField(name = "IsNeedInstantConfirm")
    private Boolean isNeedInstantConfirm;

    public RefuseOrderVisualzation(String notes, String reserveStatus, String specialStatus,Boolean isNeedInstantConfirm) {
        this.isNeedInstantConfirm = isNeedInstantConfirm;
        this.notes = notes;
        this.reserveStatus = reserveStatus;
        this.specialStatus = specialStatus;
    }

    public Boolean isNeedInstantConfirm() {
        return isNeedInstantConfirm;
    }

    public void setIsNeedInstantConfirm(Boolean isNeedInstantConfirm) {
        this.isNeedInstantConfirm = isNeedInstantConfirm;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(String reserveStatus) {
        this.reserveStatus = reserveStatus;
    }

    public String getSpecialStatus() {
        return specialStatus;
    }

    public void setSpecialStatus(String specialStatus) {
        this.specialStatus = specialStatus;
    }

}
