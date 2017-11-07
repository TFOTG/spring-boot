package com.elong.hotel.hotelconfirm.staff.bo;

import java.io.Serializable;

/**
 * 
 * 根据用户名查询员工信息接口
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * Apr 22, 2015 8:54:25 PM   hualong.li     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		hualong.li 
 * @version		1.0  
 * @since		JDK1.7
 */
public class StaffFromMisBo implements Serializable {

	private String CTI_AgentID;

	private String CTI_GroupID;

	private String Staff_ID;

	private String Staff_Name;

	private String Staff_Name_En;

	public String getCTI_AgentID() {
		return CTI_AgentID;
	}

	public void setCTI_AgentID(String cTI_AgentID) {
		CTI_AgentID = cTI_AgentID;
	}

	public String getCTI_GroupID() {
		return CTI_GroupID;
	}

	public void setCTI_GroupID(String cTI_GroupID) {
		CTI_GroupID = cTI_GroupID;
	}

	public String getStaff_ID() {
		return Staff_ID;
	}

	public void setStaff_ID(String staff_ID) {
		Staff_ID = staff_ID;
	}

	public String getStaff_Name() {
		return Staff_Name;
	}

	public void setStaff_Name(String staff_Name) {
		Staff_Name = staff_Name;
	}

	public String getStaff_Name_En() {
		return Staff_Name_En;
	}

	public void setStaff_Name_En(String staff_Name_En) {
		Staff_Name_En = staff_Name_En;
	}

}
