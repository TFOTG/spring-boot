package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.staff.po.StaffPo;

import java.util.List;

/**
 * Created by liujunjie on 2017/7/17.
 */
public class GetInOutHistoryInitDataResponse extends ServiceResponseBase {

    private List<StaffPo> staffList;

    private List<String> leaderName;

    public List<StaffPo> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<StaffPo> staffList) {
        this.staffList = staffList;
    }

    public List<String> getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(List<String> leaderName) {
        this.leaderName = leaderName;
    }
}
