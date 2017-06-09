/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.ranksetting.vo.RankSettingVO.java]
 * Createion [2017年6月6日]
 */
package com.elong.hotel.hotelconfirm.ranksetting.vo;

import com.elong.hotel.common.parameter.PaginationParameter;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class RankSettingVO extends PaginationParameter{

	private Integer deptment;
	
	private Integer enable;
	
	private Integer rankid;

	private int ehcacheEnbale;

	public Integer getDeptment() {
		return deptment;
	}

	public void setDeptment(Integer deptment) {
		this.deptment = deptment;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public Integer getRankid() {
		return rankid;
	}

	public void setRankid(Integer rankid) {
		this.rankid = rankid;
	}

	public RankSettingVO(Integer deptment, Integer enable, int ehcacheEnbale) {
		this.deptment = deptment;
		this.enable = enable;
		this.ehcacheEnbale = ehcacheEnbale;
	}

	public int getEhcacheEnbale() {
		return ehcacheEnbale;
	}

	public void setEhcacheEnbale(int ehcacheEnbale) {
		this.ehcacheEnbale = ehcacheEnbale;
	}

	public RankSettingVO() {
		super();
	}
	
}
