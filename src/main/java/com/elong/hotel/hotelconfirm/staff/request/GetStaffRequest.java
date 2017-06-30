package com.elong.hotel.hotelconfirm.staff.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created by peng.wang on 17/6/28.
 */
public class GetStaffRequest {


    private String staffName;

    private String leaderName;

    private Integer department;

    @Min(value=1,message="页码从1开始")
    private int pageIndex;

    @Min(value=5,message="每页最少5条数据")
    @Max(value=100,message="每页最多100条数据")
    private int pageSize;

    private int startItem;

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

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartItem() {
        return startItem;
    }

    public void setStartItem(int startItem) {
        this.startItem = startItem;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }
}
