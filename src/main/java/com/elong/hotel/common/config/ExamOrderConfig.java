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
    private Integer normalOrderLimit;
    
    /**
     * 海外省份ID
     */
    private String overSeasProvinceIds;

    private String operatorName;

    private String operatorTime;

    private String operatorIp;
    
    private String ctripOrderPayHisUrl;

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
    
    public ExamOrderConfig(){
    	super();
    	this.priority4UrgeMinute = 120;
    	this.priority4UrgeDistance = 3000;
    	this.refusedCancelNumSearchTimeInterval = 7;
    	this.supposedProxyIds = "AP0022170,AP0019548,AP0015596,AP4004228,AP0019754,AP0017194,AP0037110,AP0037351,AP0022895,AP0020332,AP0020211,AP4052993,AP0024335,AP0017455,AP0043710,AP0001643,AP4000285,AP4000288,AP0023369,AP0016114";
    	this.urgencyOrderLimit = 4;
    	this.normalOrderLimit = 3;
    	this.overSeasProvinceIds = "3200,3300,3400";
    	this.ctripOrderPayHisUrl = "http://htlint.fat2.qa.nt.ctripcorp.com/orderoperate/Order/ViewProcessLog/{ctripOrderId}/elong";
		this.executorMaxTimeOut = 30;
		this.executorThreads = 10;
		this.executorQueueSize = 500;
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

    public Integer getNormalOrderLimit() {
        return normalOrderLimit;
    }

    public void setNormalOrderLimit(Integer normalOrderLimit) {
        this.normalOrderLimit = normalOrderLimit;
    }

    public String getOverSeasProvinceIds() {
		return overSeasProvinceIds;
	}

	public void setOverSeasProvinceIds(String overSeasProvinceIds) {
		this.overSeasProvinceIds = overSeasProvinceIds;
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

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }

	public String getCtripOrderPayHisUrl() {
		return ctripOrderPayHisUrl;
	}

	public void setCtripOrderPayHisUrl(String ctripOrderPayHisUrl) {
		this.ctripOrderPayHisUrl = ctripOrderPayHisUrl;
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
    
}
