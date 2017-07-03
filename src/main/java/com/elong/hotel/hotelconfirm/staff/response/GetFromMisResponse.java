package com.elong.hotel.hotelconfirm.staff.response;


import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.staff.bo.BaseFromMisBo;
import com.elong.hotel.hotelconfirm.staff.bo.StaffFromMisBo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * Apr 22, 2015 9:00:23 PM   hualong.li     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		hualong.li 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetFromMisResponse extends ServiceResponseBase implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 6440465516573460988L;

	private BaseFromMisBo result;

	private List<StaffFromMisBo> staffList;

	public BaseFromMisBo getResult() {
		return result;
	}

	public void setResult(BaseFromMisBo result) {
		this.result = result;
	}

	public List<StaffFromMisBo> getStaffList() {
		return staffList;
	}

	public void setStaffList(List<StaffFromMisBo> staffList) {
		this.staffList = staffList;
	}

	

}
