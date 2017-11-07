/**
 * ProjectName [verify-entity]
 * FileName [com.elong.hotel.verify.firstverify.po.WorkFlowPo.java]
 * Createion [2017年5月22日]
 */
package com.elong.hotel.proxy.workflow.request;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class WorkFlowStatusPo {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 工作流类型
	 */
	private String workflowType;
	
	/**
	 * 工作流状态
	 */
	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWorkflowType() {
		return workflowType;
	}

	public void setWorkflowType(String workflowType) {
		this.workflowType = workflowType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
