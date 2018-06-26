package com.elong.hotel.common.config;

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
    
    /**
     * 员工获取紧急数量上限
     */
    private Integer urgencyOrderLimit;
    
    /**
     * 员工获取非紧急数量上限
     */
    private Integer nonemergencyOrderLimit;
    
    /**
     * 海外省份ID
     */
    private String overSeasProvinceIds;
    
    public ExamOrderConfig(){
    	super();
    	this.priority4UrgeMinute = 120;
    	this.priority4UrgeDistance = 3000;
    	this.refusedCancelNumSearchTimeInterval = 7;
    	this.supposedProxyIds = "AP0022170,AP0019548,AP0015596,AP4004228,AP0019754,AP0017194,AP0037110,AP0037351,AP0022895,AP0020332,AP0020211,AP4052993,AP0024335,AP0017455,AP0043710,AP0001643,AP4000285,AP4000288,AP0023369,AP0016114";
    	this.urgencyOrderLimit = 4;
    	this.nonemergencyOrderLimit = 3;
    	overSeasProvinceIds = "3200,3300,3400";
    }

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

	public Integer getUrgencyOrderLimit() {
		return urgencyOrderLimit;
	}

	public void setUrgencyOrderLimit(Integer urgencyOrderLimit) {
		this.urgencyOrderLimit = urgencyOrderLimit;
	}

	public Integer getNonemergencyOrderLimit() {
		return nonemergencyOrderLimit;
	}

	public void setNonemergencyOrderLimit(Integer nonemergencyOrderLimit) {
		this.nonemergencyOrderLimit = nonemergencyOrderLimit;
	}

	public String getOverSeasProvinceIds() {
		return overSeasProvinceIds;
	}

	public void setOverSeasProvinceIds(String overSeasProvinceIds) {
		this.overSeasProvinceIds = overSeasProvinceIds;
	}
    
}
