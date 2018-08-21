package com.elong.hotel.hotelconfirm.staff.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.staff.po.StaffPo;

/**
 * 
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年8月21日 上午10:28:45   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetExamStaffResponse extends ServiceResponseBase{

	/** 
	 * long GetExamStaffResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private List<StaffPo> staffs;

	public List<StaffPo> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<StaffPo> staffs) {
		this.staffs = staffs;
	}
	
}
