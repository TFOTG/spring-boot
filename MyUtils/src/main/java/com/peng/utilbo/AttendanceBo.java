package com.peng.utilbo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by peng.wang on 2018/12/6.
 */
public class AttendanceBo {

    @JSONField(name = "AttendanceHours")
    private double attendanceHours;
    @JSONField(name = "AccountingHours")
    private double accountingHours;
    @JSONField(name = "AttendanceDate", format = "yyyy-MM-dd")
    private Date attendanceDate;
    @JSONField(name = "EmployeeName")
    private String employeeName;
    @JSONField(name = "DepartmentName")
    private String departmentName;
    @JSONField(name = "WeekAccountRange")
    private String weekAccountRange;
    @JSONField(name = "CreditCardData")
    private String creditCardData;

    //我要计算下时间
    @JSONField(name = "Day")
    private String day;

    public String getCreditCardData() {
        return creditCardData;
    }

    public void setCreditCardData(String creditCardData) {
        this.creditCardData = creditCardData;
    }

    public double getAttendanceHours() {
        return attendanceHours;
    }

    public void setAttendanceHours(double attendanceHours) {
        this.attendanceHours = attendanceHours;
    }

    public double getAccountingHours() {
        return accountingHours;
    }

    public void setAccountingHours(double accountingHours) {
        this.accountingHours = accountingHours;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getWeekAccountRange() {
        return weekAccountRange;
    }

    public void setWeekAccountRange(String weekAccountRange) {
        this.weekAccountRange = weekAccountRange;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
