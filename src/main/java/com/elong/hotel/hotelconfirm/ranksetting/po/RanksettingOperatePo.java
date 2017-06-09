/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.ranksetting.RanksettingEntity.java]
 * Createion [2017年6月2日]
 */
package com.elong.hotel.hotelconfirm.ranksetting.po;

import java.util.Date;
import java.util.List;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class RanksettingOperatePo {

	private String rankid;
	private String rankname;
	private Integer deptment;
	private Integer enable;
	private int sort;
	private int useivrservice;
	private int ivrdelaytime;
	private int useebkservice;
	private int delaytime;
	private int promisetime;
	private int urgetime;
	private Date opdate;
	private String opname;
	private String opip;
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
