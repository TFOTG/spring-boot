package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmHotelBo;
import com.elong.hotel.hotelconfirm.group.po.GroupPo;
import com.elong.hotel.hotelconfirm.staff.po.StaffPo;

import java.util.List;

/**
 * Created by peng.wang on 17/6/6.
 */
public class GetSelectInfoResponse extends ServiceResponseBase {

    private List<GroupPo> groupList;

    private List<ConfirmHotelBo> hotelList;

    private List<StaffPo> staffList;

    public List<GroupPo> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<GroupPo> groupList) {
        this.groupList = groupList;
    }

    public List<ConfirmHotelBo> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<ConfirmHotelBo> hotelList) {
        this.hotelList = hotelList;
    }

    public List<StaffPo> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<StaffPo> staffList) {
        this.staffList = staffList;
    }
}
