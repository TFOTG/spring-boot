/**
 * ProjectName [verify-entity]
 * FileName [com.elong.hotel.verify.firstverify.response.GetWorkFlowStatusResponse.java]
 * Createion [2017年5月19日]
 */
package com.elong.hotel.proxy.workflow.response;

import java.io.Serializable;
import java.util.List;

import com.elong.hotel.proxy.workflow.request.WorkFlowStatusPo;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class GetWorkFlowStatusPo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 工作流关键字
	 */
	private String key;
	
	/**
	 * 对应的状态list
	 */
	private List<WorkFlowStatusPo> status;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<WorkFlowStatusPo> getStatus() {
		return status;
	}

	public void setStatus(List<WorkFlowStatusPo> status) {
		this.status = status;
	}
	
}
