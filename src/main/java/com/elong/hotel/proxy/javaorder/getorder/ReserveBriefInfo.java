package com.elong.hotel.proxy.javaorder.getorder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by user on 17/1/10.
 */
public class ReserveBriefInfo implements Serializable{
    private static final long serialVersionUID = 1L;

    private long orderID;

    private String orderStatus;

    private String comfirmMethod;

    private Date createDate;

    private Date arriveDate;

    private Date leaveDate;

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getComfirmMethod() {
        return comfirmMethod;
    }

    public void setComfirmMethod(String comfirmMethod) {
        this.comfirmMethod = comfirmMethod;
    }
}
