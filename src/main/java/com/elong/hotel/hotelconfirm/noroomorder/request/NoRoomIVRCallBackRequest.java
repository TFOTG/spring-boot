package com.elong.hotel.hotelconfirm.noroomorder.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.hotelconfirm.ivr.bo.CallBackItem;

import java.util.List;

/**
 * Created by peng.wang on 2017/9/4.
 */
public class NoRoomIVRCallBackRequest {

    @JSONField(name = "BussinessGuid")
    private String bussinessGuid;

    @JSONField(name = "CallBackStatus")
    private int callBackStatus;

    @JSONField(name = "CallBackItemList")
    private List<CallBackItem> callBackItemList;

    public String getBussinessGuid() {
        return bussinessGuid;
    }

    public void setBussinessGuid(String bussinessGuid) {
        this.bussinessGuid = bussinessGuid;
    }

    public int getCallBackStatus() {
        return callBackStatus;
    }

    public void setCallBackStatus(int callBackStatus) {
        this.callBackStatus = callBackStatus;
    }

    public List<CallBackItem> getCallBackItemList() {
        return callBackItemList;
    }

    public void setCallBackItemList(List<CallBackItem> callBackItemList) {
        this.callBackItemList = callBackItemList;
    }

}
