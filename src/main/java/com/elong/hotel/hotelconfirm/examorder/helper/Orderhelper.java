package com.elong.hotel.hotelconfirm.examorder.helper;

import org.apache.commons.lang.StringUtils;

import com.elong.hotel.proxy.javaorder.enums.OrderVouchType;
import com.elong.hotel.proxy.javaorder.getorder.Order;


/**
 * 订单辅助类
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年7月24日 上午8:58:29   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class Orderhelper {

	/**
	 * 担保
	 */
	public static long VOUCH = 256L;
	
	/**
	 * 新担保流程
	 */
	public static long NEW_ORDER = 18014398509481984L;
	
	/**
	 * 全额担保
	 */
	public static long VOUCH_ALL = 1073741824L;
	
	/**
	 * 兼容原判断订单担保类型
	 * -1：未知，0：预付，1：现付首晚，2：现付全额，3：现付部分, 4:现付非担保
	 *
	 * @return
	 */
	public static int calOrderVouchType(Order order) {
		if (order == null)
			return -1;

		if ((order.getAdditionalStatus() & VOUCH) == VOUCH) {
			// 预付
			if (StringUtils.equalsIgnoreCase("D", order.getPayment())) {
				return 0;
			}

			// 现付
			if (StringUtils.equalsIgnoreCase("P", order.getPayment())) {
				// 新担保规则
				if ((order.getOrderFlag() & NEW_ORDER) == NEW_ORDER && order.getBaseVouchRule() != null) {
					// 异常担保类型判断，以原担保规则判断
					if (order.getBaseVouchRule().getVouchMoneyType() != OrderVouchType.FIRSTNIGHT.getValue()
							&& order.getBaseVouchRule().getVouchMoneyType() != OrderVouchType.ALL.getValue()
							&& order.getBaseVouchRule().getVouchMoneyType() != OrderVouchType.PART.getValue()) {
						// 原担保规则
						if ((order.getAdditionalStatus() & VOUCH_ALL) == VOUCH_ALL) {
							// 全额担保
							return OrderVouchType.ALL.getValue();
						} else {
							// 首晚担保
							return OrderVouchType.FIRSTNIGHT.getValue();
						}
					} else {
						return order.getBaseVouchRule().getVouchMoneyType();
					}
				} else {
					// 原担保规则
					if ((order.getAdditionalStatus() & VOUCH_ALL) == VOUCH_ALL) {
						// 全额担保
						return OrderVouchType.ALL.getValue();
					} else {
						// 首晚担保
						return OrderVouchType.FIRSTNIGHT.getValue();
					}
				}
			}
		}
		return 4;
	}
}
