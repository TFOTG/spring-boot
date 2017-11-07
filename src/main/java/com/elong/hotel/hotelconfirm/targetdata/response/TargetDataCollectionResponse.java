package com.elong.hotel.hotelconfirm.targetdata.response;

import java.io.Serializable;

import com.elong.hotel.hotelconfirm.targetdata.bo.TargetDataBodyBo;

/**
 * 指标：已审待处理量
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年10月9日 上午10:03:26   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class TargetDataCollectionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private int retcode;

	private String retdesc = "正常";

	private String serverIp;

	private TargetDataBodyBo body;

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

	public TargetDataBodyBo getBody() {
		return body;
	}

	public void setBody(TargetDataBodyBo body) {
		this.body = body;
	}

}
