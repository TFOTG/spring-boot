package com.elong.hotel.hotelconfirm.confirmorder.vo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by yangboyu on 17/6/16.
 */
public class ChangeOrderStatusVo implements Serializable {

    @NotNull
    @Min(0L)
    Integer orderid;
    @NotNull
    String orderstatus;
    @NotNull
    private String opname;
    String confirmno;
    String note2elong;
    String note2hotel;
    String note2client;

    //可视化消息
    String msg2action;

    String msg2customer;

    Integer msg2Id;

    public String getConfirmno() {
        return confirmno;
    }

    public void setConfirmno(String confirmno) {
        this.confirmno = confirmno;
    }

    public String getNote2client() {
        return note2client;
    }

    public void setNote2client(String note2client) {
        this.note2client = note2client;
    }

    public String getNote2elong() {
        return note2elong;
    }

    public void setNote2elong(String note2elong) {
        this.note2elong = note2elong;
    }

    public String getNote2hotel() {
        return note2hotel;
    }

    public void setNote2hotel(String note2hotel) {
        this.note2hotel = note2hotel;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getOpname() {
        return opname;
    }

    public void setOpname(String opname) {
        this.opname = opname;
    }

    public String getMsg2customer() {
        return msg2customer;
    }

    public void setMsg2customer(String msg2customer) {
        this.msg2customer = msg2customer;
    }

    public String getMsg2action() {
        return msg2action;
    }

    public void setMsg2action(String msg2action) {
        this.msg2action = msg2action;
    }

    public Integer getMsg2Id() {
        return msg2Id;
    }

    public void setMsg2Id(Integer msg2Id) {
        this.msg2Id = msg2Id;
    }
}
