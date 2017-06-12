/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.ranksetting.RanksettingEntity.java]
 * Createion [2017年6月2日]
 */
package com.elong.hotel.hotelconfirm.ranksetting.po;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.elong.hotel.hotelconfirm.valid.FirstValid;
import com.elong.hotel.hotelconfirm.valid.SecondValid;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class RanksettingOperatePo {

	@NotNull(message="排序设置rankid不能为空",groups=SecondValid.class)
	private String rankid;//排序设置ID
	@NotBlank
	@Length(min=0, max=20 , message="名称不要超过20个字",groups={FirstValid.class,SecondValid.class})
	private String rankname;//排序名称
	@NotNull(message="部门不能为空",groups=SecondValid.class)
	@Min(1)
	@Max(2)
	private Integer deptment;//部门 1确认
	@NotNull(message="是否启用不能为空",groups=SecondValid.class)
	@Min(0)
	@Max(1)
	private Integer enable;//是否启用 1启用 0废弃
	private int sort;//排序优先级  数字越大 优先级越高
	@Min(0)
	@Max(1)
	private int useivrservice;// 是否启用ivr  0不启用 1启用
	@Min(0)
	private int ivrdelaytime; //ivr 延迟时间
	@Min(0)
	@Max(1)
	private int useebkservice; //是否使用ebking 0不使用  1使用
	@Min(0)
	private int delaytime;//可获取时间
	@Min(0)
	private int promisetime;//承诺时间
	@Min(0)
	private int urgetime; //催可确认时间
	private Date opdate; //操作时间
	private String opname;//操作人
	private String opip;//操作ip
	private String timestamp;
	private List<RankSettingTagPo> ranktags;
	public String getRankid() {
		return rankid;
	}
	public void setRankid(String rankid) {
		this.rankid = rankid;
	}
	public String getRankname() {
		return rankname;
	}
	public void setRankname(String rankname) {
		this.rankname = rankname;
	}
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
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getUseivrservice() {
		return useivrservice;
	}
	public void setUseivrservice(int useivrservice) {
		this.useivrservice = useivrservice;
	}
	public int getIvrdelaytime() {
		return ivrdelaytime;
	}
	public void setIvrdelaytime(int ivrdelaytime) {
		this.ivrdelaytime = ivrdelaytime;
	}
	public int getUseebkservice() {
		return useebkservice;
	}
	public void setUseebkservice(int useebkservice) {
		this.useebkservice = useebkservice;
	}
	public int getDelaytime() {
		return delaytime;
	}
	public void setDelaytime(int delaytime) {
		this.delaytime = delaytime;
	}
	public int getPromisetime() {
		return promisetime;
	}
	public void setPromisetime(int promisetime) {
		this.promisetime = promisetime;
	}
	public int getUrgetime() {
		return urgetime;
	}
	public void setUrgetime(int urgetime) {
		this.urgetime = urgetime;
	}
	public Date getOpdate() {
		return opdate;
	}
	public void setOpdate(Date opdate) {
		this.opdate = opdate;
	}
	public String getOpname() {
		return opname;
	}
	public void setOpname(String opname) {
		this.opname = opname;
	}
	public String getOpip() {
		return opip;
	}
	public void setOpip(String opip) {
		this.opip = opip;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public List<RankSettingTagPo> getRanktags() {
		return ranktags;
	}
	public void setRanktags(List<RankSettingTagPo> ranktags) {
		this.ranktags = ranktags;
	}
	
}
