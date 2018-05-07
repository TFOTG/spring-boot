package com.elong.hotel.hotelconfirm.examorder.config;

/**
 * 终拒基础配置
 */
public class ExamOrderConfig {

    /**
     * 紧急订单到店时间
     */
    private Integer priority4UrgeMinute;

    /**
     * 紧急订单到店距离
     */
    private Integer priority4UrgeDistance;


    public Integer getPriority4UrgeMinute() {
        return priority4UrgeMinute;
    }

    public void setPriority4UrgeMinute(Integer priority4UrgeMinute) {
        this.priority4UrgeMinute = priority4UrgeMinute;
    }

    public Integer getPriority4UrgeDistance() {
        return priority4UrgeDistance;
    }

    public void setPriority4UrgeDistance(Integer priority4UrgeDistance) {
        this.priority4UrgeDistance = priority4UrgeDistance;
    }
}
