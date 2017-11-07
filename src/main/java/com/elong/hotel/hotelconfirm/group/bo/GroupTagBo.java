/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.common.groupfilter.domain.GroupTag.java]
 * Createion [2017年4月20日]
 */
package com.elong.hotel.hotelconfirm.group.bo;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class GroupTagBo {

	/**
	 * 主键
	 */
	private Integer id;
	
	/**
	 * 分组唯一标记位
	 */
	private Integer groupid;
	
	/**
	 * 关键字key
	 */
	private String tagkey;
	
	/**关键字value
	 * 
	 */
	private String tagvalue;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGroupid() {
		return groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	public String getTagkey() {
		return tagkey;
	}

	public void setTagkey(String tagkey) {
		this.tagkey = tagkey;
	}

	public String getTagvalue() {
		return tagvalue;
	}

	public void setTagvalue(String tagvalue) {
		this.tagvalue = tagvalue;
	}
}
