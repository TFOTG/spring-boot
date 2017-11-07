/**
 * ProjectName [verify-entity]
 * FileName [com.elong.hotel.verify.firstverify.response.GetWorkFlowStatuResponse.java]
 * Createion [2017年5月24日]
 */
package com.elong.hotel.proxy.workflow.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class GetWorkFlowStatuResponse extends ServiceResponseBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int retcode;
	
	private String retdesc;
	
	private String serverIp;
	
	private List<GetWorkFlowStatusPo> body;

	public int getRetcode() {
		return retcode;
	}

	public void setRetcode(int retcode) {
		this.retcode = retcode;
	}

	public String getRetdesc() {
		return retdesc;
	}

	public void setRetdesc(String retdesc) {
		this.retdesc = retdesc;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public List<GetWorkFlowStatusPo> getBody() {
		return body;
	}

	public void setBody(List<GetWorkFlowStatusPo> body) {
		this.body = body;
	}

}
