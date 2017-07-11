package com.elong.hotel.hotelconfirm.confirmorderactionlog.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.po.ConfirmOrderActionLogPo;

/**
 * Created by Hualong.Li on 17/7/11.
 */
public class IsHotelAgreedResponse extends ServiceResponseBase {

	private ConfirmOrderActionLogPo po;

	public ConfirmOrderActionLogPo getPo() {
		return po;
	}

	public void setPo(ConfirmOrderActionLogPo po) {
		this.po = po;
	}
}
