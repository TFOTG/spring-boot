package com.elong.hotel.proxy.javaorder.request;

import edu.emory.mathcs.backport.java.util.Arrays;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class GetOrdersRequest {

	// 订单id
	private List<String> ordersId;
	// 要查询的字段
	private List<String> fields;


	public List<String> getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(List<String> ordersId) {
		this.ordersId = ordersId;
	}


	public String getFields() {
		if (this.fields == null || this.fields.size() == 0) {
			return "";
		}
		return StringUtils.join(fields.iterator(), ",");
	}

	public void addFields(String... fields) {
		if (this.fields == null) {
			this.fields = new ArrayList<String>();
		}
		if (fields != null && fields.length > 0) {
			this.fields.addAll(Arrays.asList(fields));
		}
	}

}
