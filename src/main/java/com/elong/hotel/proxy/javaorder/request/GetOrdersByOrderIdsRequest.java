package com.elong.hotel.proxy.javaorder.request;

import edu.emory.mathcs.backport.java.util.Arrays;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 批量获取原始订单request
 * 
 * @author zouyufei
 *
 */
public class GetOrdersByOrderIdsRequest implements Serializable {

	private static final long serialVersionUID = 8251288774722684444L;

	// 订单id集合
	private List<Integer> orderIds;
	// 要查询的字段
	private List<String> fields;

	public GetOrdersByOrderIdsRequest(List<Integer> orderIds, String... fields) {
		this.orderIds = orderIds;
		this.addFields(fields);
	}

	public GetOrdersByOrderIdsRequest(){
		
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

	public List<Integer> getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(List<Integer> orderIds) {
		this.orderIds = orderIds;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

}
