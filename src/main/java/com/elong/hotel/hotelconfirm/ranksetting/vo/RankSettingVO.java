/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.ranksetting.vo.RankSettingVO.java]
 * Createion [2017年6月6日]
 */
package com.elong.hotel.hotelconfirm.ranksetting.vo;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import com.elong.hotel.common.parameter.PaginationParameter;
import com.elong.hotel.hotelconfirm.valid.FirstValid;
import com.elong.hotel.hotelconfirm.valid.SecondValid;
import com.elong.hotel.hotelconfirm.valid.ThirdValid;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class RankSettingVO extends PaginationParameter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message="deptment不能为空",groups=SecondValid.class)
	@Min(1)
	private Integer deptment;
	
	@NotNull(message="enable不能为空",groups=ThirdValid.class)
	@Range(min=0,max=1,message="状态只能是0或1")
	private Integer enable;
	
	@NotNull(message="排序rankid不能为空",groups={FirstValid.class,ThirdValid.class})
	@Min(1)
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
