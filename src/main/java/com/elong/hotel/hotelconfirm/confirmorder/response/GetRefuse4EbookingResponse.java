package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.confirmorder.po.ConfirmOrderPo;

import java.util.List;

/**
 * Created by Hualong.Li on 17/7/6.
 */
public class GetRefuse4EbookingResponse extends ServiceResponseBase {

	private List<ConfirmOrderPo> list;

	private int size;

	public List<ConfirmOrderPo> getList() {
		return list;
	}

	public void setList(List<ConfirmOrderPo> list) {
		this.list = list;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
