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

    /**
     * 终拒取消数量查询间隔
     */
    private Integer refusedCancelNumSearchTimeInterval;
    
    /**
     * 赔付代理ID
     */
    private String supposedProxyIds;

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

	public Integer getRefusedCancelNumSearchTimeInterval() {
		return refusedCancelNumSearchTimeInterval;
	}

	public void setRefusedCancelNumSearchTimeInterval(Integer refusedCancelNumSearchTimeInterval) {
		this.refusedCancelNumSearchTimeInterval = refusedCancelNumSearchTimeInterval;
	}

	public String getSupposedProxyIds() {
		return supposedProxyIds;
	}

	public void setSupposedProxyIds(String supposedProxyIds) {
		this.supposedProxyIds = supposedProxyIds;
	}
    
}
