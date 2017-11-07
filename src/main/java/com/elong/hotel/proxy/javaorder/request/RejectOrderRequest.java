package com.elong.hotel.proxy.javaorder.request;

/**
 * Created by peng.wang on 17/5/3.
 */
public class RejectOrderRequest extends ChangeOrderStatusRequestBase {

    //拒单状态
    private String rejectStatus;
    //满房处理意见
    private String fullRoomNotes;
    //满房处理意见其他信息
    private String fullRoomOther;
    //不记录拒单标识
    private boolean notRecordRefusedTag;

    public RejectOrderRequest(int orderId, String operatorName, String operatorIp, String rejectStatus, String fullRoomNotes, String fullRoomOther, boolean notRecordRefusedTag) {
        super(orderId, operatorName, operatorIp);
        this.rejectStatus = rejectStatus;
        this.fullRoomNotes = fullRoomNotes;
        this.fullRoomOther = fullRoomOther;
        this.notRecordRefusedTag = notRecordRefusedTag;
    }

    public RejectOrderRequest(int orderId, String operatorName, String operatorIp) {
        super(orderId, operatorName, operatorIp);
    }


    public String getRejectStatus() {
        return rejectStatus;
    }

    public void setRejectStatus(String rejectStatus) {
        this.rejectStatus = rejectStatus;
    }

    public String getFullRoomNotes() {
        return fullRoomNotes;
    }

    public void setFullRoomNotes(String fullRoomNotes) {
        this.fullRoomNotes = fullRoomNotes;
    }

    public String getFullRoomOther() {
        return fullRoomOther;
    }

    public void setFullRoomOther(String fullRoomOther) {
        this.fullRoomOther = fullRoomOther;
    }

    public boolean getNotRecordRefusedTag() {
        return notRecordRefusedTag;
    }

    public void setNotRecordRefusedTag(boolean notRecordRefusedTag) {
        this.notRecordRefusedTag = notRecordRefusedTag;
    }
}
