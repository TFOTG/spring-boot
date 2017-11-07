package com.elong.hotel.hotelconfirm.staff.response;

import com.elong.hotel.hotelconfirm.staff.bo.StaffBo;
import com.elong.hotel.mis.common.model.response.ResponseBase;

import java.util.List;

/**
 * Created by peng.wang on 17/6/28.
 */
public class GetStaffResponse extends ResponseBase{

    private List<StaffBo> list;

    private int totalSize;

    public List<StaffBo> getList() {
        return list;
    }

    public void setList(List<StaffBo> list) {
        this.list = list;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }
}
