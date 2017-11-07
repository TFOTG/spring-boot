package com.elong.hotel.hotelconfirm.ivr.bo;

import java.util.List;

/**
 * Created by Hualong.Li on 17/6/15.
 */
public class Menu {
	private List<OrderPrompt> menu;

	public Menu(List<OrderPrompt> menu) {
		this.menu = menu;
	}

	public Menu() {
	}

	public List<OrderPrompt> getMenu() {
		return menu;
	}

	public void setMenu(List<OrderPrompt> menu) {
		this.menu = menu;
	}
}
