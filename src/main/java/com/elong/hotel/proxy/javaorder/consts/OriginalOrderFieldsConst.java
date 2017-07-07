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
	String FIELDS_FOR_STORAGE = "status,hotelId,payment,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,otaType,orderFlag,supplierId,supplierType,supplierOtaType,supplierName,promotion,isUrgentVerify,modifyName,roomNo,groupId,additionalStatus,confirmNo,guestName,proxy,createTime,hotelName,gradeId,sumPrice,sumCost,confirmMethod,contactPhone,cardNo,contactMobile,orderFrom,mHotelName,ratePlanId,distanceFromHotelWhenBooking,cityId,modifyTime,notesToHotel,notesToGuest,notesToElong";

	/**
	 * 确认ivr
	 */
	String FIELDS_FOR_CONFIRMIVR = "status,hotelId,payment,checkInDate,roomCount,mRoomTypeName,checkOutDate,earlyCheckInTime,lateCheckInTime,additionalStatus,guestName,guestSex,hotelName,mHotelName,roomNightStayDate,roomNightIsSpecial,roomNightCost,roomNightSalePrice,roomNightRealSalePrice,roomNightRealCost,roomNightBreakfastCount,notesToHotel";

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
	String FIELDS_FOR_PENDING = "hotelId,cooperationType,additionalStatus,confirmNo,roomTypeName,roomCount,payment,guestName,roomNightBreakfastCount,notesToHotel,notesToGuest,notesToElong,sumPrice,sumCost,cardNo,gradeId,contactPhone,contactMobile,createName,orderKeyValues,createTime";
}
