package com.elong.hotel.hotelconfirm.staff.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.hotelconfirm.staff.po.GroupStaffRelationPo;

/**
 * 分组员工信息
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月24日 下午3:38:16   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GroupStaffInfoBo implements Serializable{

	/** 
	 * long GroupStaffInfoBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 分组ID
	 */
	private Integer groupId;
	
	/**
	 * 分组名称
	 */
	private String groupName;
	
	/**
	 * 操作人
	 */
	private String opName;
	
	/**
	 * 操作时间
	 */
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date opDate;
	
	/**
	 * 员工信息
	 */
	private List<GroupStaffRelationPo> groupStaffs;

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public Date getOpDate() {
		return opDate;
	}

	public void setOpDate(Date opDate) {
		this.opDate = opDate;
	}

	public List<GroupStaffRelationPo> getGroupStaffs() {
		return groupStaffs;
	}

	public void setGroupStaffs(List<GroupStaffRelationPo> groupStaffs) {
		this.groupStaffs = groupStaffs;
	}
	
}
