package com.elong.hotel.hotelconfirm.examorder.vo;

import com.elong.hotel.hotelconfirm.examorder.po.ExamOrderPo;

/**
 * Created by liujunjie on 2018/6/19.
 */
public class ExamMonitorOrderVo extends ExamOrderPo {
    private String leaderName;

    private String groupName;

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
