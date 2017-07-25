package com.elong.hotel.proxy.dc.bo;

/**
 * Created by peng.wang on 2017/7/6.
 */
public class UrgeCtripBo {

    private String ctripOrderId;
    private Integer elongOrderId;

    private int dateChanged;

    private int isSuccess;

    private String lastReplyDate;

    private String resultMsg;

    public int getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(int dateChanged) {
        this.dateChanged = dateChanged;
    }

    public int getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(int isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getLastReplyDate() {
        return lastReplyDate;
    }

    public void setLastReplyDate(String lastReplyDate) {
        this.lastReplyDate = lastReplyDate;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getCtripOrderId() {
        return ctripOrderId;
    }

    public void setCtripOrderId(String ctripOrderId) {
        this.ctripOrderId = ctripOrderId;
    }

    public Integer getElongOrderId() {
        return elongOrderId;
    }

    public void setElongOrderId(Integer elongOrderId) {
        this.elongOrderId = elongOrderId;
    }
}
