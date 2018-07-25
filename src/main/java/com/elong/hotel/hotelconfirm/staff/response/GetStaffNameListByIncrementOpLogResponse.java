package com.elong.hotel.hotelconfirm.staff.response;

import java.util.*;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * Created by user on 18/7/2.
 */
public class GetStaffNameListByIncrementOpLogResponse extends ServiceResponseBase {
    private List<String> staffNameList;

    public List<String> getStaffNameList() {
        return staffNameList;
    }

    public void setStaffNameList(List<String> staffNameList) {
        this.staffNameList = staffNameList;
    }
}
