package com.elong.hotel.common.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by peng.wang on 17/3/9.
 */
public class ConfirmOrderConfig {

    /**
     * 马上到店时间
     */
    private Integer priority4HighMinute;

    /**
     * 马上到店距离
     */
    private Integer priority4HighDistance;

    /**
     * 距离已审超时时间
     */
    private Integer overTime4V;

    /**
     * 距离初拒超时时间
     */
    private Integer overTime4O;

    /**
     * 延迟时间 For 已审
     */
    private Integer delayTime4V;

    /**
     * 延迟时间 For 初拒
     */
    private Integer delayTime4O;

    /**
     * 延迟次数
     */
    private Integer delayTimes;

    /**
     * 夜班模式起始时间
     */
    private String priority4NightBegin;

    /**
     * 夜班模式截止时间
     */
    private String priority4NightEnd;

    /**
     * 确认兜底任务时间间隔
     */
    private int confirmOrderInDBTaskInterval;

    /**
     * 调用订单接口超时时间
     */
    private int getOrderTimeOut;

    /**
     * 入库消息名称
     */
    private String messageName;

    /**
     * 进出库服务,日志记录,是否记录ConfirmServiceLog
     */
    private Boolean log4ConfirmServiceLog;

    /**
     * 进出库服务,日志记录,是否记录ConfirmOpLog
     */
    private Boolean log4ConfirmOpLog;

    /**
     * 异步执行最大时间
     */
    private Integer executorMaxTimeOut;

    /**
     * 异步并行线程数量
     */
    private Integer executorThreads;

    /**
     * 异步并行线程队列大小
     */
    private Integer executorQueueSize;

//    private Integer groupEhCacheEnable;

//    private Integer rankEnCacheEnable;

    /**
     * 主管回收承诺时间与当前时间差
     */
    private Integer chargeReclaimPromise;

    /**
     * 催确认增加的承诺时间
     */
    private Integer urgeAddMins;

    /**
     * 初拒 - 10 分钟
     * (当前时间 + 10分钟 > 给客人承诺时间) && 给客人延迟过承诺时间 直接投放终拒
     */
    private Integer firstRefuseTime;

    /**
     * 初拒供应商Ids
     */
    private String firstRefuseSupplierIds;

    /**
     * 主管名称
     */
    private String managerName;

    //更新配置人的姓名
    private String operatorName;

    //更新配置的时间
    private String operatorTime;

    /**
     * 获取订单时间间隔
     */
    private int getOrderInterval;

    private int hotelSize;

    private int hotelOrderSize;

    private int supplierSize;

    private int supplierOrderSize;



    public ConfirmOrderConfig() {
        priority4HighMinute = 60;
        priority4HighDistance = 3000;
        priority4NightBegin = "19:00:00";
        priority4NightEnd = "08:30:00";
        overTime4V = 8;
        overTime4O = 10;
        delayTime4V = 30;
        delayTime4O = 10;
        delayTimes = 1;
        confirmOrderInDBTaskInterval = 5;
        getOrderTimeOut = 3000;
        messageName = "OrderUrgentVerifyTagChange,OrderAllChange,BaseOrderStatusChange,ProductChange,ReserveChange,SetDCProcessStatusForOTA,ConfirmOrderStorageIn,ConfirmOrderTimestamp,SetOTADCProcessStatus";
        log4ConfirmOpLog = true;
        log4ConfirmServiceLog = true;
        executorMaxTimeOut = 30;
        executorThreads = 10;
        executorQueueSize = 500;
        chargeReclaimPromise = 10;
        urgeAddMins = 15;
//        rankEnCacheEnable = 0;
//        groupEhCacheEnable = 0;
    }

    public Integer getChargeReclaimPromise() {
        return chargeReclaimPromise;
    }

    public void setChargeReclaimPromise(Integer chargeReclaimPromise) {
        this.chargeReclaimPromise = chargeReclaimPromise;
//        rankEnCacheEnable = 0;
//        groupEhCacheEnable = 0;
        urgeAddMins = 15;
        firstRefuseTime = 10;
        firstRefuseSupplierIds = "";
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPriority4NightEnd() {
        return priority4NightEnd;
    }

    public void setPriority4NightEnd(String priority4NightEnd) {
        this.priority4NightEnd = priority4NightEnd;
    }

    public String getPriority4NightBegin() {
        return priority4NightBegin;
    }

    public void setPriority4NightBegin(String priority4NightBegin) {
        this.priority4NightBegin = priority4NightBegin;
    }

    public Integer getPriority4HighMinute() {
        return priority4HighMinute;
    }

    public void setPriority4HighMinute(Integer priority4HighMinute) {
        this.priority4HighMinute = priority4HighMinute;
    }

    public Integer getPriority4HighDistance() {
        return priority4HighDistance;
    }

    public void setPriority4HighDistance(Integer priority4HighDistance) {
        this.priority4HighDistance = priority4HighDistance;
    }

    public Integer getDelayTime4O() {
        return delayTime4O;
    }

    public void setDelayTime4O(Integer delayTime4O) {
        this.delayTime4O = delayTime4O;
    }

    public Integer getDelayTime4V() {
        return delayTime4V;
    }

    public void setDelayTime4V(Integer delayTime4V) {
        this.delayTime4V = delayTime4V;
    }

    public Integer getOverTime4O() {
        return overTime4O;
    }

    public void setOverTime4O(Integer overTime4O) {
        this.overTime4O = overTime4O;
    }

    public Integer getOverTime4V() {
        return overTime4V;
    }

    public void setOverTime4V(Integer overTime4V) {
        this.overTime4V = overTime4V;
    }

    public Integer getDelayTimes() {
        return delayTimes;
    }

    public void setDelayTimes(Integer delayTimes) {
        this.delayTimes = delayTimes;
    }

    public int getConfirmOrderInDBTaskInterval() {
        return confirmOrderInDBTaskInterval;
    }

    public void setConfirmOrderInDBTaskInterval(int confirmOrderInDBTaskInterval) {
        this.confirmOrderInDBTaskInterval = confirmOrderInDBTaskInterval;
    }

    public int getGetOrderTimeOut() {
        return getOrderTimeOut;
    }

    public void setGetOrderTimeOut(int getOrderTimeOut) {
        this.getOrderTimeOut = getOrderTimeOut;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public Boolean getLog4ConfirmOpLog() {
        return log4ConfirmOpLog;
    }

    public void setLog4ConfirmOpLog(Boolean log4ConfirmOpLog) {
        this.log4ConfirmOpLog = log4ConfirmOpLog;
    }

    public Boolean getLog4ConfirmServiceLog() {
        return log4ConfirmServiceLog;
    }

    public void setLog4ConfirmServiceLog(Boolean log4ConfirmServiceLog) {
        this.log4ConfirmServiceLog = log4ConfirmServiceLog;
    }

    public Integer getExecutorMaxTimeOut() {
        return executorMaxTimeOut;
    }

    public void setExecutorMaxTimeOut(Integer executorMaxTimeOut) {
        this.executorMaxTimeOut = executorMaxTimeOut;
    }

    public Integer getExecutorThreads() {
        return executorThreads;
    }

    public void setExecutorThreads(Integer executorThreads) {
        this.executorThreads = executorThreads;
    }

    public Integer getExecutorQueueSize() {
        return executorQueueSize;
    }

    public void setExecutorQueueSize(Integer executorQueueSize) {
        this.executorQueueSize = executorQueueSize;
    }

//    public Integer getGroupEhCacheEnable() {
//        return groupEhCacheEnable;
//    }
//
//    public void setGroupEhCacheEnable(Integer groupEhCacheEnable) {
//        this.groupEhCacheEnable = groupEhCacheEnable;
//    }
//
//    public Integer getRankEnCacheEnable() {
//        return rankEnCacheEnable;
//    }
//
//    public void setRankEnCacheEnable(Integer rankEnCacheEnable) {
//        this.rankEnCacheEnable = rankEnCacheEnable;
//    }

    public Integer getUrgeAddMins() {
        return urgeAddMins;
    }

    public void setUrgeAddMins(Integer urgeAddMins) {
        this.urgeAddMins = urgeAddMins;
    }

    public Integer getFirstRefuseTime() {
        return firstRefuseTime;
    }

    public void setFirstRefuseTime(Integer firstRefuseTime) {
        this.firstRefuseTime = firstRefuseTime;
    }

    public String getFirstRefuseSupplierIds() {
        return firstRefuseSupplierIds;
    }

    public void setFirstRefuseSupplierIds(String firstRefuseSupplierIds) {
        this.firstRefuseSupplierIds = firstRefuseSupplierIds;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(String operatorTime) {
        this.operatorTime = operatorTime;
    }

    public static void main(String[] args) {
        ConfirmOrderConfig config = new ConfirmOrderConfig();
        System.out.println(JSON.toJSONString(config));
    }

    public int getGetOrderInterval() {
        return getOrderInterval;
    }

    public void setGetOrderInterval(int getOrderInterval) {
        this.getOrderInterval = getOrderInterval;
    }

    public int getHotelSize() {
        return hotelSize;
    }

    public void setHotelSize(int hotelSize) {
        this.hotelSize = hotelSize;
    }

    public int getSupplierSize() {
        return supplierSize;
    }

    public void setSupplierSize(int supplierSize) {
        this.supplierSize = supplierSize;
    }

    public int getHotelOrderSize() {
        return hotelOrderSize;
    }

    public void setHotelOrderSize(int hotelOrderSize) {
        this.hotelOrderSize = hotelOrderSize;
    }

    public int getSupplierOrderSize() {
        return supplierOrderSize;
    }

    public void setSupplierOrderSize(int supplierOrderSize) {
        this.supplierOrderSize = supplierOrderSize;
    }
}
