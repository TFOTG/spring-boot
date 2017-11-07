package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * 执行command的结果
 */
public class  ServerAction4UrgeResponse extends ServerActionResponseBase implements Serializable{


	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	Date promiseTime ;

	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	Date originPromiseTime ;

	int rankingImproveCount ;

	String orderType ;

	Boolean isNightRange ;

	Boolean canUrge;

	public Boolean getIsNightRange() {
		return isNightRange;
	}

	public void setIsNightRange(Boolean nightRange) {
		isNightRange = nightRange;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Date getOriginPromiseTime() {
		return originPromiseTime;
	}

	public void setOriginPromiseTime(Date originPromiseTime) {
		this.originPromiseTime = originPromiseTime;
	}

	public Date getPromiseTime() {
		return promiseTime;
	}

	public void setPromiseTime(Date promiseTime) {
		this.promiseTime = promiseTime;
	}

	public int getRankingImproveCount() {
		return rankingImproveCount;
	}

	public void setRankingImproveCount(int rankingImproveCount) {
		this.rankingImproveCount = rankingImproveCount;
	}

	public Boolean getCanUrge() {
		return canUrge;
	}

	public void setCanUrge(Boolean canUrge) {
		this.canUrge = canUrge;
	}
}
