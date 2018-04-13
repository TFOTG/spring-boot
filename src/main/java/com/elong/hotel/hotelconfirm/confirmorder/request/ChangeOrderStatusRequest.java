package com.elong.hotel.hotelconfirm.confirmorder.request;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.vo.ChangeOrderStatusVo;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.enums.ActionOpFromEnum;

/**
 * Created by peng.wang on 17/6/6.
 */
public class ChangeOrderStatusRequest {

    private Integer orderId;

    private String orderStatus;

    private String note2Elong;

    private String note2Hotel;

    private String note2Client;

    private String note2Action;

    private String msg2Customer;

    private Integer msgId;

    private String confirmNo;

    private OperatorInfoBo operatorInfo;

    private ActionOpFromEnum actionOpFromEnum;

    public ChangeOrderStatusRequest(ChangeOrderStatusVo vo) {

        this.confirmNo=vo.getConfirmno();
        this.note2Client=vo.getNote2client();
        this.note2Elong=vo.getNote2elong();
        this.note2Hotel=vo.getNote2hotel();
        this.orderId=vo.getOrderid();
        this.orderStatus=vo.getOrderstatus();

    }

    public ChangeOrderStatusRequest() {
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OperatorInfoBo getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfoBo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    public String getConfirmNo() {
        return confirmNo;
    }

    public void setConfirmNo(String confirmNo) {
        this.confirmNo = confirmNo;
    }

    public String getNote2Client() {
        return note2Client;
    }

    public void setNote2Client(String note2Client) {
        this.note2Client = note2Client;
    }

    public String getNote2Elong() {
        return note2Elong;
    }

    public void setNote2Elong(String note2Elong) {
        this.note2Elong = note2Elong;
    }

    public String getNote2Hotel() {
        return note2Hotel;
    }

    public void setNote2Hotel(String note2Hotel) {
        this.note2Hotel = note2Hotel;
    }

    public ActionOpFromEnum getActionOpFromEnum() {
        return actionOpFromEnum;
    }

    public void setActionOpFromEnum(ActionOpFromEnum actionOpFromEnum) {
        this.actionOpFromEnum = actionOpFromEnum;
    }

    public String getMsg2Customer() {
        return msg2Customer;
    }

    public void setMsg2Customer(String msg2Customer) {
        this.msg2Customer = msg2Customer;
    }

    public String getNote2Action() {
        return note2Action;
    }

    public void setNote2Action(String note2Action) {
        this.note2Action = note2Action;
    }

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }
}
