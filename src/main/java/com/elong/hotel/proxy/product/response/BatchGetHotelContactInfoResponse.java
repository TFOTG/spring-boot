/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.response.BatchGetHotelContactInfoResponse.java]
 * Createion [2017年6月30日]
 */
package com.elong.hotel.proxy.product.response;

import java.util.List;

import com.elong.hotel.proxy.product.bo.ContactInfoListBo;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class BatchGetHotelContactInfoResponse extends ServiceResponseProductBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ContactInfoListBo> contactInfoList;
	
	private int retcode ;
	
	private String retdesc;
	
	private String serverIp;

	public List<ContactInfoListBo> getContactInfoList() {
		return contactInfoList;
	}

	public void setContactInfoList(List<ContactInfoListBo> contactInfoList) {
		this.contactInfoList = contactInfoList;
	}

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

}
