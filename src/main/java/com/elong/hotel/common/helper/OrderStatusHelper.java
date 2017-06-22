package com.elong.hotel.common.helper;

import com.elong.hotel.common.enums.ConfirmOrderStatusEnum;
import org.apache.commons.lang.StringUtils;

/**
 * 订单状态帮助类
 * 
 * @author zouyufei
 *
 */
public class OrderStatusHelper {

	/**
	 * 
	 * @param status
	 * @param statusArray
	 * @return 判断status是否在statusArray中
	 */
	public static boolean arrayContainStatus(String status, ConfirmOrderStatusEnum... statusArray) {
		for (ConfirmOrderStatusEnum item : statusArray) {
			if (StringUtils.equalsIgnoreCase(status, item.getStatus())) {
				return true;
			}
		}
		return false;
	}
}
