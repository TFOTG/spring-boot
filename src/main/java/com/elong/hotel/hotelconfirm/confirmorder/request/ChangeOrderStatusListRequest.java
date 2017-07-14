package com.elong.hotel.hotelconfirm.confirmorder.request;

import com.elong.hotel.hotelconfirm.confirmorder.vo.ChangeOrderStatusVo;

import java.util.List;

/**
 * Created by Hualong.Li on 17/7/12.
 */
public class ChangeOrderStatusListRequest {

	private List<ChangeOrderStatusVo> list;

	public List<ChangeOrderStatusVo> getList() {
		return list;
	}

	public void setList(List<ChangeOrderStatusVo> list) {
		this.list = list;
	}
}
