package com.elong.hotel.hotelconfirm.noroomorder.bo;

import java.util.Date;
import java.util.List;

import com.elong.hotel.hotelconfirm.ivr.bo.ConfirmIvrMenu;
import com.elong.hotel.proxy.javaorder.getorder.Guest;
import com.elong.hotel.proxy.javaorder.getorder.RoomNight;

/**
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年9月3日 下午1:05:00   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class NoRoomIvrMenu extends ConfirmIvrMenu {

	private static final long serialVersionUID = 1L;

	public NoRoomIvrMenu(Integer orderId, List<Guest> guest, Date checkInDate, Date checkOutDate, String roomTypeName, int roomCount,
			Date earlyCheckInTime, Date lateCheckInTime, List<RoomNight> roomNights, String notesToHotel, String orderType,
			Boolean hStatus) {
		super(orderId, guest, checkInDate, checkOutDate, roomTypeName, roomCount, earlyCheckInTime, lateCheckInTime, roomNights,
				notesToHotel, orderType, hStatus);
	}

}
