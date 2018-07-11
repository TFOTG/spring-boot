package com.elong.hotel.proxy.javaorder.consts;

/**
 * 查询原始订单 字段常量
 * 
 * @author zouyufei
 *
 */
public interface OriginalOrderFieldsConst {

	/**
	 * 入库 
	 */
	String FIELDS_FOR_STORAGE = "status,hotelId,payment,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,otaType,orderFlag,supplierId,supplierType,supplierOtaType,supplierName,promotion,isUrgentVerify,modifyName,roomNo,groupId,additionalStatus,confirmNo,guestName,proxy,createTime,hotelName,gradeId,sumPrice,sumCost,confirmMethod,contactPhone,cardNo,contactMobile,orderFrom,mHotelName,ratePlanId,distanceFromHotelWhenBooking,cityId,modifyTime,notesToHotel,notesToGuest,notesToElong,cooperationOrderId,fullRoomRate,cooperationType,businessSystemId,appClientType,pmsConfirmTime,orderKeyValues,roomCount,roomNightsCount,isAcceptDcOfflineProcess,star,starType,roomTypeName";

	/**
	 * 确认ivr
	 */
	String FIELDS_FOR_CONFIRMIVR = "status,hotelId,payment,checkInDate,roomCount,mRoomTypeName,checkOutDate,earlyCheckInTime,lateCheckInTime,additionalStatus,guestName,guestSex,hotelName,mHotelName,roomNightStayDate,roomNightIsSpecial,roomNightCost,roomNightSalePrice,roomNightRealSalePrice,roomNightRealCost,roomNightBreakfastCount,notesToHotel,notesToElong,otaType,originFrom";

	/**
	 * 初拒调用查询字段
	 */
	String FIELDS_FOR_FIRST_REFUSE = "hotelId,hotelName,mHotelId,mHotelName,cityId,cityName,provinceId,provinceName,cooperationType,createTime,modifyTime,roomCount,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,additionalStatus,additionalStatusI,notesToHotel,notesToGuest,notesToElong,roomNightsCount,orderFrom,createName,modifyName,roomTypeId,roomTypeName,ratePlanId,ratePlanName,mRoomTypeId,supplierId,supplierName,supplierType,roomNightStayDate,roomNightInventoryId,roomNightInventoryType";

	/**
	 * mis确认
	 */
	String FIELDS_FOR_MISCONFIRM = "status,hotelId,payment,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,otaType,orderFlag,supplierId,supplierType,supplierOtaType,supplierName,promotion,isUrgentVerify,modifyName,roomNo,groupId,additionalStatus,confirmNo,guestName,proxy,createTime,hotelName,gradeId,sumPrice,sumCost,confirmMethod,contactPhone,cardNo,contactMobile,orderFrom,mHotelName,ratePlanId,distanceFromHotelWhenBooking,cityId,modifyTime,notesToHotel,notesToGuest,notesToElong";

	/**
	 * 待处理／暂缓
	 */
	String FIELDS_FOR_PENDING = "hotelId,cooperationType,additionalStatus,confirmNo,roomTypeName,roomCount,payment,guestName,roomNightBreakfastCount,notesToHotel,notesToGuest,notesToElong,sumPrice,sumCost,cardNo,gradeId,contactPhone,contactMobile,createName,orderKeyValues,createTime,currencyCode,roomNo,roomNightInventoryType,ratePlanId,hotelfax,roomNightRealCost,roomNightRealSalePrice,status,roomNightStayDate,mHotelId,roomTypeId,checkInDate,checkOutDate,cooperationOrderId,proxy,baseRuleInfo,orderFlag,originFrom,otaType,businessSystemId";

	/**
	 * 联单，重单
	 */
	String REPEAT_AND_LINKED = "hotelName,orderFrom,status,additionalStatus,payment,guestName,roomCount,checkInDate,checkOutDate,roomTypeName,mRoomTypeName,proxy";

	/**
	 * 发短信
	 */
	String SEND_MSG = "cardNo,contactPhone,contactMobile,businessSystemId,appClientType,orderFrom";

	/**
	 * 关房
	 */
	String CLOSE_ROOM = "roomTypeId,hotelId,ratePlanId";

	String FIELDS_FOR_NOTES = "notesToElong,notesToHotel,actionStrExt1,actionType";

	/**
	 * 无房风险订单
	 */
	String NO_ROOM_ORDER = "roomCount,roomTypeName,checkInDate,checkOutDate";

	/**
	 * 代理订单 确认方式 短信确认 还是email  或不允许确认
	 */
	String ORDER_CONFIRMMETHOD = "confirmMethod,businessSystemId,appClientType,orderFrom";

	/**
	 * 确认后推翻，强制担保原订单状态
	 */
	String OVERTHROW_STATUS = "status,notesToElong";
	
	/**
	 * 终拒/员工待处理查询
	 */
	String SEARCH_FOR_EXAM = "status,hotelId,payAmount,otaType,isUrgentVerify,additionalStatus,guestName,proxy,hotelName,gradeId,sumPrice,sumCost,contactPhone,contactMobile,orderFrom,ratePlanId,notesToHotel,notesToGuest,notesToElong,businessSystemId,roomCount,roomNightsCount,roomTypeId,roomTypeName,roomNightStayDate,roomNightIsSpecial,roomNightCost,roomNightSalePrice,roomNightRealSalePrice,roomNightRealCost,roomNightBreakfastCount,exchangedSumPrice,provinceId,orderKeyValues,additionalStatusI,promotionSettlementType,cityName,promotionChannelCode,tcOrderId,tcSubOrderId,tcCardNo,baiduLatitude,baiduLongitude,cooperationOrderId";
	
	/**
	 * 终拒查询备注信息
	 */
	String SEARCH_NOTES_FOR_EXAM = "notesToElong,notesToHotel";
}
