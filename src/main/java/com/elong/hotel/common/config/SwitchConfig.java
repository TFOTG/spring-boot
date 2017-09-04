package com.elong.hotel.common.config;

import com.alibaba.fastjson.JSON;

/**
 * Created by peng.wang on 17/3/9.
 */
public class SwitchConfig {

	private Integer groupEhCacheEnable;

	private Integer rankEnCacheEnable;

	private Integer urgeVisualizationEnable;

	private Integer changePromiseTimeVisualizationEnable;

	private Integer misConfirmVisualizationEnable;

	/**
	 * 到店无房外呼次数
	 */
	private Integer noRoomIvrCallingCount;

	/**
	 * 到店无房外呼延迟时间（单位：分钟）
	 */
	private Integer noRoomIvrDelayTime;

	/**
	 * 到店无房外呼延迟次数
	 */
	private Integer noRoomIvrDelayCount;

	public SwitchConfig() {
		groupEhCacheEnable = 0;
		rankEnCacheEnable = 0;
		urgeVisualizationEnable = 0;
		changePromiseTimeVisualizationEnable = 0;
		misConfirmVisualizationEnable = 0;
		noRoomIvrCallingCount = 0;
		noRoomIvrDelayTime = 0;
		noRoomIvrDelayCount = 0;
	}

	public Integer getGroupEhCacheEnable() {
		return groupEhCacheEnable;
	}

	public void setGroupEhCacheEnable(Integer groupEhCacheEnable) {
		this.groupEhCacheEnable = groupEhCacheEnable;
	}

	public Integer getRankEnCacheEnable() {
		return rankEnCacheEnable;
	}

	public void setRankEnCacheEnable(Integer rankEnCacheEnable) {
		this.rankEnCacheEnable = rankEnCacheEnable;
	}

	public static void main(String[] args) {
		SwitchConfig config = new SwitchConfig();
		System.out.println(JSON.toJSONString(config));
	}

	public Integer getChangePromiseTimeVisualizationEnable() {
		return changePromiseTimeVisualizationEnable;
	}

	public void setChangePromiseTimeVisualizationEnable(Integer changePromiseTimeVisualizationEnable) {
		this.changePromiseTimeVisualizationEnable = changePromiseTimeVisualizationEnable;
	}

	public Integer getMisConfirmVisualizationEnable() {
		return misConfirmVisualizationEnable;
	}

	public void setMisConfirmVisualizationEnable(Integer misConfirmVisualizationEnable) {
		this.misConfirmVisualizationEnable = misConfirmVisualizationEnable;
	}

	public Integer getUrgeVisualizationEnable() {
		return urgeVisualizationEnable;
	}

	public void setUrgeVisualizationEnable(Integer urgeVisualizationEnable) {
		this.urgeVisualizationEnable = urgeVisualizationEnable;
	}

	public Integer getNoRoomIvrCallingCount() {
		return noRoomIvrCallingCount;
	}

	public void setNoRoomIvrCallingCount(Integer noRoomIvrCallingCount) {
		this.noRoomIvrCallingCount = noRoomIvrCallingCount;
	}

	public Integer getNoRoomIvrDelayTime() {
		return noRoomIvrDelayTime;
	}

	public void setNoRoomIvrDelayTime(Integer noRoomIvrDelayTime) {
		this.noRoomIvrDelayTime = noRoomIvrDelayTime;
	}

	public Integer getNoRoomIvrDelayCount() {
		return noRoomIvrDelayCount;
	}

	public void setNoRoomIvrDelayCount(Integer noRoomIvrDelayCount) {
		this.noRoomIvrDelayCount = noRoomIvrDelayCount;
	}

}
