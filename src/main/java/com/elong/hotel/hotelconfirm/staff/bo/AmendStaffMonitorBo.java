package com.elong.hotel.hotelconfirm.staff.bo;

import java.util.*;
import java.io.Serializable;

/**
 * Created by pony.ma on 18/6/7.
 */
public class AmendStaffMonitorBo implements Serializable {
    private String staffName; //员工名
    private String leaderName; //主管名
    private Map<Long, String> groupMap; //所属分组集合
    private int online; //员工是否在线
    private int keepOnlineMinutes; //持续时长
    private int onlineMinutes; //登录时长
    private int pendingCount; //待处理量
    private int respiteCount; //暂缓量
    private AmendStaffMonitorStatisticsBo dateStats; //当天总计
    private List<AmendStaffMonitorStatisticsBo> hourStats; //分时段统计
    private int efficiency; //效率(单/小时)

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public Map<Long, String> getGroupMap() {
        return groupMap;
    }

    public void setGroupMap(Map<Long, String> groupMap) {
        this.groupMap = groupMap;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    public int getKeepOnlineMinutes() {
        return keepOnlineMinutes;
    }

    public void setKeepOnlineMinutes(int keepOnlineMinutes) {
        this.keepOnlineMinutes = keepOnlineMinutes;
    }

    public int getOnlineMinutes() {
        return onlineMinutes;
    }

    public void setOnlineMinutes(int onlineMinutes) {
        this.onlineMinutes = onlineMinutes;
    }

    public int getPendingCount() {
        return pendingCount;
    }

    public void setPendingCount(int pendingCount) {
        this.pendingCount = pendingCount;
    }

    public int getRespiteCount() {
        return respiteCount;
    }

    public void setRespiteCount(int respiteCount) {
        this.respiteCount = respiteCount;
    }

    public AmendStaffMonitorStatisticsBo getDateStats() {
        return dateStats;
    }

    public void setDateStats(AmendStaffMonitorStatisticsBo dateStats) {
        this.dateStats = dateStats;
    }

    public List<AmendStaffMonitorStatisticsBo> getHourStats() {
        return hourStats;
    }

    public void setHourStats(List<AmendStaffMonitorStatisticsBo> hourStats) {
        this.hourStats = hourStats;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }
}