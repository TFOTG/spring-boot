/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.ranksetting.po.RankSettingTagPo.java]
 * Createion [2017年5月3日]
 */
package com.elong.hotel.hotelconfirm.ranksetting.po;

import java.io.Serializable;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class RankSettingTagPo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String rankid;
	
	private String tagvalue;
	
	private String tagkey;


	public RankSettingTagPo() {
		super();
	}

	public RankSettingTagPo(String rankid, String tagvalue, String tagkey) {
		super();
		this.rankid = rankid;
		this.tagvalue = tagvalue;
		this.tagkey = tagkey;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRankid() {
		return rankid;
	}

	public void setRankid(String rankid) {
		this.rankid = rankid;
	}

	public String getTagvalue() {
		return tagvalue;
	}

	public void setTagvalue(String tagvalue) {
		this.tagvalue = tagvalue;
	}

	public String getTagkey() {
		return tagkey;
	}

	public void setTagkey(String tagkey) {
		this.tagkey = tagkey;
	}
	
	
}
