package com.elong.hotel.hotelconfirm.confirmorder.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.confirmorder.bo.RepeatAndLinkedOrderBo;

/**
 * Created by zhangdapeng on 17/7/6.
 */
public class GetRepeatAndLinkedOrderResponse extends ServiceResponseBase {

	/**
	 * 订单列表
	 */
	private List<RepeatAndLinkedOrderBo> orderList;

	public List<RepeatAndLinkedOrderBo> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<RepeatAndLinkedOrderBo> orderList) {
		this.orderList = orderList;
	}

}
