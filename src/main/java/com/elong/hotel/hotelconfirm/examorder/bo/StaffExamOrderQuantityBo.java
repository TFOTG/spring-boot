package com.elong.hotel.hotelconfirm.examorder.bo;

/**
 * Created by user on 18/6/14.
 */
public class StaffExamOrderQuantityBo {
    private String staffName;
    private int pendingCount;
    private int respiteCount;

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getPendingCount() {
        return pendingCount;
    }

    public void setPendingCount(int pendingCount) {
        this.pendingCount = pendingCount;
    }

    public int getRespiteCount() {
        return respiteCount;
    }

    public void setRespiteCount(int respiteCount) {
        this.respiteCount = respiteCount;
    }
}
