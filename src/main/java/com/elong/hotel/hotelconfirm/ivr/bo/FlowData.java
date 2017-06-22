package com.elong.hotel.hotelconfirm.ivr.bo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Hualong.Li on 17/6/13.
 */
public class FlowData implements Serializable {

	private List<ConfirmIvrMenu> menu;

	public List<ConfirmIvrMenu> getMenu() {
		return menu;
	}

	public void setMenu(List<ConfirmIvrMenu> menu) {
		this.menu = menu;
	}
}
