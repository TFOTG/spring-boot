package com.elong.hotel.proxy.javaorder.request;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Hualong.Li on 16/12/20.
 */
public class GetLinkedOrderRequest implements Serializable {

	private static final long serialVersionUID = 2147250111408706753L;

	private String contacterMobile;
	private Date arriveDateUpperBound;
	private Date arriveDateLowerBound;
	private int queryLimit;

	public GetLinkedOrderRequest() {
	}

	public GetLinkedOrderRequest(String mobile, Date arriveDate, Integer days, Integer size) {
		this.contacterMobile = mobile;
		this.arriveDateUpperBound = arriveDate;
		Calendar date = Calendar.getInstance();
		date.setTime(arriveDate);
		date.set(Calendar.DATE, date.get(Calendar.DATE) - days);
		this.arriveDateLowerBound = date.getTime();
		this.queryLimit = size;
	}

	public String getContacterMobile() {
		return contacterMobile;
	}

	public void setContacterMobile(String contacterMobile) {
		this.contacterMobile = contacterMobile;
	}

	public Date getArriveDateUpperBound() {
		return arriveDateUpperBound;
	}

	public void setArriveDateUpperBound(Date arriveDateUpperBound) {
		this.arriveDateUpperBound = arriveDateUpperBound;
	}

	public Date getArriveDateLowerBound() {
		return arriveDateLowerBound;
	}

	public void setArriveDateLowerBound(Date arriveDateLowerBound) {
		this.arriveDateLowerBound = arriveDateLowerBound;
	}

	public int getQueryLimit() {
		return queryLimit;
	}

	public void setQueryLimit(int queryLimit) {
		this.queryLimit = queryLimit;
	}
}
