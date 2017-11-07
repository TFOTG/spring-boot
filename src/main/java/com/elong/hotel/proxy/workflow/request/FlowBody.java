/**
 * ProjectName [verify-entity]
 * FileName [com.elong.hotel.verify.firstverify.request.FlowBody.java]
 * Createion [2017年5月19日]
 */
package com.elong.hotel.proxy.workflow.request;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class FlowBody{
	
	public FlowBody(String workflowType, String keys, String keyType) {
		super();
		this.workflowType = workflowType;
		this.keys = keys;
		this.keyType = keyType;
	}

	/**
	 * 工作流类型
	 */
	private String workflowType;
	
	/**
	 * 查询关键字
	 */
	private String keys;
	
	/**
	 * 关键字类型
	 */
	private String keyType;

	public String getWorkflowType() {
		return workflowType;
	}

	public void setWorkflowType(String workflowType) {
		this.workflowType = workflowType;
	}

	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

	public String getKeyType() {
		return keyType;
	}

	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}
}
