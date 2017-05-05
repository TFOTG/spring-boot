package com.elong.hotel.common.config;

import com.alibaba.fastjson.JSON;

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

    public ConfirmOrderConfig(){
        priority4HighMinute = 60;
        priority4HighDistance = 3000;
        priority4NightBegin = "19:00:00";
        priority4NightEnd = "08:30:00";
        overTime4V = 8;
        overTime4O = 10;
        delayTime4V = 30;
        delayTime4O = 10;
        delayTimes = 1;
        confirmOrderInDBTaskInterval=5;
        getOrderTimeOut=3000;
        messageName="OrderTimestampChange";

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

    public static void main(String[] args) {
        ConfirmOrderConfig config=new ConfirmOrderConfig();
        System.out.println(JSON.toJSONString(config));
    }
}
