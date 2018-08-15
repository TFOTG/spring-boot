package com.elong.hotel.storage.bo;

import java.io.Serializable;

/**
 * Created by user on 15/1/1.
 */
public class DBDataConnectionV2Bo implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected String driverName;
    /**
     * 需要处理的数据库链接地址
     */
    private String originDBUrl;

    /**
     * 数据库用户名
     */
    private String originDBUser;

    /**
     * 数据库密码
     */
    private String originDBPassword;

    /**
     * 目标数据库链接地址
     */
    private String targetDBUrl;

    /**
     * 用户名
     */
    private String targetDBUser;

    /**
     * 密码
     */
    private String targetDBPassword;

    /**
     * 需要处理的数据表
     */
    private String originDBTable;

    /**
     * 需要倒入的数据库表名
     */
    private String targetDBTable;

    /**
     * 需要倒入的数据库表名后缀
     */
    private String targetDBTableSuffix;

    /**
     * 处理类型  0 删除数据 1 备份及删除数据
     */
    private int processType;

    /**
     * 处理数据条数
     */
    private int processCount;

    /**
     * 最大处理数据条数
     */
    private int limitProcessCount;

    /**
     * 备份的数据月份1 前一个月
     */
    private Integer monthBefore;

    /**
     * 保留多少天前的数据
     */
    private Integer dayBefore;

    /**
     * 索引检索字段 默认null  使用_timestamp
     */
    private String indexField;

    public DBDataConnectionV2Bo() {
        this.driverName = "com.alibaba.druid.proxy.DruidDriver";
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getOriginDBUrl() {
        return originDBUrl;
    }

    public void setOriginDBUrl(String originDBUrl) {
        this.originDBUrl = originDBUrl;
    }

    public String getOriginDBUser() {
        return originDBUser;
    }

    public void setOriginDBUser(String originDBUser) {
        this.originDBUser = originDBUser;
    }

    public String getOriginDBPassword() {
        return originDBPassword;
    }

    public void setOriginDBPassword(String originDBPassword) {
        this.originDBPassword = originDBPassword;
    }

    public String getTargetDBUrl() {
        return targetDBUrl;
    }

    public void setTargetDBUrl(String targetDBUrl) {
        this.targetDBUrl = targetDBUrl;
    }

    public String getTargetDBUser() {
        return targetDBUser;
    }

    public void setTargetDBUser(String targetDBUser) {
        this.targetDBUser = targetDBUser;
    }

    public String getTargetDBPassword() {
        return targetDBPassword;
    }

    public void setTargetDBPassword(String targetDBPassword) {
        this.targetDBPassword = targetDBPassword;
    }

    public String getOriginDBTable() {
        return originDBTable;
    }

    public void setOriginDBTable(String originDBTable) {
        this.originDBTable = originDBTable;
    }

    public String getTargetDBTable() {
        return targetDBTable;
    }

    public void setTargetDBTable(String targetDBTable) {
        this.targetDBTable = targetDBTable;
    }

    public String getTargetDBTableSuffix() {
        return targetDBTableSuffix;
    }

    public void setTargetDBTableSuffix(String targetDBTableSuffix) {
        this.targetDBTableSuffix = targetDBTableSuffix;
    }

    public int getProcessType() {
        return processType;
    }

    public void setProcessType(int processType) {
        this.processType = processType;
    }

    public int getProcessCount() {
        return processCount;
    }

    public void setProcessCount(int processCount) {
        this.processCount = processCount;
    }

    public int getLimitProcessCount() {
        return limitProcessCount;
    }

    public void setLimitProcessCount(int limitProcessCount) {
        this.limitProcessCount = limitProcessCount;
    }

    public Integer getMonthBefore() {
        return monthBefore;
    }

    public void setMonthBefore(Integer monthBefore) {
        this.monthBefore = monthBefore;
    }

    public Integer getDayBefore() {
        return dayBefore;
    }

    public void setDayBefore(Integer dayBefore) {
        this.dayBefore = dayBefore;
    }

    public String getIndexField() {
        return indexField;
    }

    public void setIndexField(String indexField) {
        this.indexField = indexField;
    }
}
