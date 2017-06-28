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
	String FIELDS_FOR_STORAGE = "status,hotelId,payment,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,otaType,orderFlag,supplierId,supplierType,supplierOtaType,supplierName,promotion,isUrgentVerify,modifyName,roomNo,groupId,additionalStatus,confirmNo,guestName,proxy,createTime,hotelName,gradeId,sumPrice,sumCost,confirmMethod,contactPhone,cardNo,contactMobile,orderFrom,mHotelName,ratePlanId,distanceFromHotelWhenBooking,cityId,modifyTime";

	/**
	 * 确认ivr
	 */
	String FIELDS_FOR_CONFIRMIVR = "status,hotelId,payment,checkInDate,roomCount,roomTypeName,checkOutDate,earlyCheckInTime,lateCheckInTime,additionalStatus,guestName,guestSex,hotelName,mHotelName,roomNightSalePrice,roomNightStayDate,roomNightBreakfastCount,notesToHotel";

	/**
	 * 初拒调用查询字段
	 */
	String FIELDS_FOR_FIRST_REFUSE = "hotelId,hotelName,mHotelId,mHotelName,cityId,cityName,provinceId,provinceName,cooperationType,createTime,modifyTime,roomCount,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,additionalStatus,additionalStatusI,notesToHotel,notesToGuest,notesToElong,roomNightsCount,orderFrom,createName,modifyName,roomTypeId,roomTypeName,ratePlanId,ratePlanName,mRoomTypeId,supplierId,supplierName,supplierType,roomNightStayDate,roomNightInventoryId,roomNightInventoryType";

}
