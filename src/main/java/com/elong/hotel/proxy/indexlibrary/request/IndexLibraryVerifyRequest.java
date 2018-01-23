package com.elong.hotel.proxy.indexlibrary.request;

import java.io.Serializable;

/**
 * verify
 *
 * @author jianjun.wang
 * @Date 2018-01-10 17:09  下午5:09
 */

public class IndexLibraryVerifyRequest implements Serializable{

    private static final long serialVersionUID = 9102709078473212361L;
    /**
     * 操作时间
     */
    private String opdate;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 分组id
     */
    private String groupids;

    private Integer processstatus;

    private String tablesuffix;

    private String department;

    private String optype;

    public String getOpdate() {
        return opdate;
    }

    public void setOpdate(String opdate) {
        this.opdate = opdate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getGroupids() {
        return groupids;
    }

    public void setGroupids(String groupids) {
        this.groupids = groupids;
    }

    public Integer getProcessstatus() {
        return processstatus;
    }

    public void setProcessstatus(Integer processstatus) {
        this.processstatus = processstatus;
    }

    public String getTablesuffix() {
        return tablesuffix;
    }

    public void setTablesuffix(String tablesuffix) {
        this.tablesuffix = tablesuffix;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOptype() {
        return optype;
    }

    public void setOptype(String optype) {
        this.optype = optype;
    }
}