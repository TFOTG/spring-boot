package com.elong.hotel.hotelconfirm.examordermonitor.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.examordermonitor.vo.MonitOrorderSelectVo;
import com.elong.hotel.hotelconfirm.group.po.ConfirmGroupPo;
import com.elong.hotel.hotelconfirm.staff.po.StaffPo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liujunjie on 2018/6/7.
 */
public class MonitorOrderResponse extends ServiceResponseBase implements Serializable {

    //分组信息
    private List<ConfirmGroupPo> groupList;

    //全部追单员工
    private List<StaffPo> staffPoList;

    //搜索条件
    private MonitOrorderSelectVo monitOrorderSelectVo;

    public MonitOrorderSelectVo getMonitOrorderSelectVo() {
        return monitOrorderSelectVo;
    }

    public void setMonitOrorderSelectVo(MonitOrorderSelectVo monitOrorderSelectVo) {
        this.monitOrorderSelectVo = monitOrorderSelectVo;
    }

    public List<ConfirmGroupPo> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<ConfirmGroupPo> groupList) {
        this.groupList = groupList;
    }

    public List<StaffPo> getStaffPoList() {
        return staffPoList;
    }

    public void setStaffPoList(List<StaffPo> staffPoList) {
        this.staffPoList = staffPoList;
    }
}
