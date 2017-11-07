package com.elong.hotel.hotelconfirm.targetdata.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年10月17日 上午9:18:17   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class TargetDataResponse extends ServiceResponseBase {

	private static final long serialVersionUID = 1L;

	// 指标库返回状态码
	private int tdRetCode;

	// 指标库返回描述
	private String tdRetDesc;

	// 指标库返回IP
	private String tdServerIp;

	public TargetDataResponse() {
		super();
	}

	public TargetDataResponse(TargetDataReturnResponse response) {
		this.tdRetCode = response.getRetcode();
		this.tdRetDesc = response.getRetdesc();
		this.tdServerIp = response.getServerIp();
	}

	public int getTdRetCode() {
		return tdRetCode;
	}

	public void setTdRetCode(int tdRetCode) {
		this.tdRetCode = tdRetCode;
	}

	public String getTdRetDesc() {
		return tdRetDesc;
	}

	public void setTdRetDesc(String tdRetDesc) {
		this.tdRetDesc = tdRetDesc;
	}

	public String getTdServerIp() {
		return tdServerIp;
	}

	public void setTdServerIp(String tdServerIp) {
		this.tdServerIp = tdServerIp;
	}
}
