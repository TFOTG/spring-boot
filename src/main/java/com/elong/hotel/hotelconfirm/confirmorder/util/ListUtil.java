package com.elong.hotel.hotelconfirm.confirmorder.util;

import java.util.List;

/**
 * Created by Hualong.Li on 17/7/3.
 */
public class ListUtil {

	public static Boolean sizeLength(List list,int length) {
		if(list != null && list.size() > 0 && list.size() < length) {
			return true;
		}else {
			return false;
		}

	}
}
