package com.elong.hotel.proxy.javaorder.request;

import java.io.Serializable;

/**
 * Created by user on 17/1/10.
 */
public class GetVerifyProcessOrderRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String contactorMobile;

    private String last2NumbersOfReserNo;

    public String getContactorMobile() {
        return contactorMobile;
    }

    public void setContactorMobile(String contactorMobile) {
        this.contactorMobile = contactorMobile;
    }

    public String getLast2NumbersOfReserNo() {
        return last2NumbersOfReserNo;
    }

    public void setLast2NumbersOfReserNo(String last2NumbersOfReserNo) {
        this.last2NumbersOfReserNo = last2NumbersOfReserNo;
    }
}
