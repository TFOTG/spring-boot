package com.elong.hotel.hotelconfirm.staff.bo;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

public class StaffMonitorBo implements Serializable, Comparable<StaffMonitorBo> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主管姓名
	 */
	private String leaderName;

	/**
	 * 员工姓名
	 */
	private String staffName;

	/**
	 * 分组名称
	 */
	private String groupName;

	/**
	 * 在线状态
	 */
	private Integer online;

	/**
	 * 在线时长/分
	 */
	private int onlineTime;

	/**
	 * 持续时长/分
	 */
	private int keepOnlineTime;

	/**
	 * 当前待处理量
	 */
	private int currentPendingCount;

	/**
	 * 当前暂缓量
	 */
	private int currentSuspensionCount;

	/**
	 * 4:00 - 5:00 	获取量
	 */
	private int fetchCount;

	/**
	 * 4:00 - 5:00 处理量
	 */
	private int pendingCount;

	/**
	 * 4:00 - 5:00 确认量
	 */
	private int confirmCount;

	/**
	 * 4:00 - 5:00 下午4-5点在线时长
	 */
	private int pm4Topm5OnlineTime;
	/**
	 * 当天获取量
	 */
	private int todayFetchCount;

	/**
	 * 当天处理量
	 */
	private int todayPendingCount;

	/**
	 * 当天确认量
	 */
	private int todayConfirmCount;

	/**
	 * 排序方式
	 */
	private int sort;

	public StaffMonitorBo() {
		super();
	}

	public StaffMonitorBo(String leaderName, String staffName, Integer online, int sort) {
		super();
		this.leaderName = leaderName;
		this.staffName = staffName;
		this.groupName = "";
		this.online = online;
		this.sort = sort;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getOnline() {
		return online;
	}

	public void setOnline(Integer online) {
		this.online = online;
	}

	public int getOnlineTime() {
		return onlineTime;
	}

	public void setOnlineTime(int onlineTime) {
		this.onlineTime = onlineTime;
	}

	public int getKeepOnlineTime() {
		return keepOnlineTime;
	}

	public void setKeepOnlineTime(int keepOnlineTime) {
		this.keepOnlineTime = keepOnlineTime;
	}

	public Integer getCurrentPendingCount() {
		return currentPendingCount;
	}

	public void setCurrentPendingCount(int currentPendingCount) {
		this.currentPendingCount = currentPendingCount;
	}

	public int getCurrentSuspensionCount() {
		return currentSuspensionCount;
	}

	public void setCurrentSuspensionCount(int currentSuspensionCount) {
		this.currentSuspensionCount = currentSuspensionCount;
	}

	public int getFetchCount() {
		return fetchCount;
	}

	public void setFetchCount(int fetchCount) {
		this.fetchCount = fetchCount;
	}

	public int getPendingCount() {
		return pendingCount;
	}

	public void setPendingCount(int pendingCount) {
		this.pendingCount = pendingCount;
	}

	public int getConfirmCount() {
		return confirmCount;
	}

	public void setConfirmCount(int confirmCount) {
		this.confirmCount = confirmCount;
	}

	public int getTodayFetchCount() {
		return todayFetchCount;
	}

	public void setTodayFetchCount(int todayFetchCount) {
		this.todayFetchCount = todayFetchCount;
	}

	public int getTodayPendingCount() {
		return todayPendingCount;
	}

	public void setTodayPendingCount(int todayPendingCount) {
		this.todayPendingCount = todayPendingCount;
	}

	public int getTodayConfirmCount() {
		return todayConfirmCount;
	}

	public void setTodayConfirmCount(int todayConfirmCount) {
		this.todayConfirmCount = todayConfirmCount;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getPm4Topm5OnlineTime() {
		return pm4Topm5OnlineTime;
	}

	public void setPm4Topm5OnlineTime(int pm4Topm5OnlineTime) {
		this.pm4Topm5OnlineTime = pm4Topm5OnlineTime;
	}

	@Override
	public int compareTo(StaffMonitorBo o) {
		// 默认，字典序
		if (this.sort == 0) {
			try {
				String s1 = new String(this.leaderName.getBytes("GB2312"), "ISO-8859-1");
				String s2 = new String(o.leaderName.getBytes("GB2312"), "ISO-8859-1");
				return s1.compareTo(s2);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		// 处理量降序
		if (this.sort == 1) {
			return o.todayPendingCount - this.todayPendingCount;
		}
		// 获取量降序
		if (this.sort == 2) {
			return o.todayFetchCount - this.todayFetchCount;
		}
		// 确认量降序
		if (this.sort == 3) {
			return o.todayConfirmCount - this.todayConfirmCount;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "StaffMonitorBo [leaderName=" + leaderName + ", staffName=" + staffName + ", groupName=" + groupName + ", online=" + online
				+ ", onlineTime=" + onlineTime + ", keepOnlineTime=" + keepOnlineTime + ", currentPendingCount=" + currentPendingCount
				+ ", currentSuspensionCount=" + currentSuspensionCount + ", fetchCount=" + fetchCount + ", pendingCount=" + pendingCount
				+ ", confirmCount=" + confirmCount + ", todayFetchCount=" + todayFetchCount + ", todayPendingCount=" + todayPendingCount
				+ ", todayConfirmCount=" + todayConfirmCount + ", sort=" + sort + "]";
	}

}
