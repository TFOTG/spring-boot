package com.elong.hotel.proxy.javaorder.consts;

/**
 * 查询原始订单 字段常量
 * 
 * @author zouyufei
 *
 */
public interface OriginalOrderFieldsConst {

	/**
	 * 一审Task 专用
	 */
	String FIELDS_FOR_FIRSTVERIFY_SCHEDULE = "status,hotelId,payment,checkInDate,checkOutDate,otaType,orderFlag,supplierId,supplierType,supplierName,promotion,isUrgentVerify,modifyName,roomNo,groupId,additionalStatus,confirmNo,guestName,hotelName";


	String FIELDS_FOR_STORAGE = "status,hotelId,payment,checkInDate,checkOutDate,otaType,orderFlag,supplierId,supplierType,supplierOtaType,supplierName,promotion,isUrgentVerify,modifyName,roomNo,groupId,additionalStatus,confirmNo,guestName,proxy,createTime,hotelName,gradeId,sumPrice,sumCost,confirmMethod,contactPhone,cardNo,contactMobile,orderFrom,mHotelName";

	/**
	 * NS通知DC
	 */
	String FIELDS_FOR_OTA="status,roomCount,otaType";
	/**
	 * 一审ivr
	 */
	String FIELDS_FOR_FIRSTIVR = "status,guestName,roomNo,checkOutDate,checkInDate,hotelId,hotelName";

	/**
	 * 复审ivr
	 */
	String FIELDS_FOR_REVIEWIVR = "status,additionalStatus,gradeId,isUrgentVerify,contactMobile,roomCount,checkInDate,proxy";
	/**
	 * 为获取订单使用
	 */
	String FIELDS_FOR_GET = "status,hotelId,cardNo,createTime,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,payment,additionalStatus,additionalStatusI,notesToHotel,notesToGuest,notesToElong,orderKeyValues,roomTypeId,roomTypeName,ratePlanId,ratePlanName,roomNo,confirmNo,guestType,guestName,guestSex,guestCountry,sumPrice,sumCost,roomNightStayDate,roomNightCost,roomNightSalePrice,roomNightRealSalePrice,currencyCode,roomNightCurrencyCode,otaType,vouchType,contactName,contactMobile,contactEmail,contactPhone,roomNightRealCost,payStatus,payAmount,sourceOrderId,promotion,promotionDetail,promotionChannelCode,isUrgentVerify,roomNightsCount,mHotelId,groupId,hotelName,proxy,gradeId,supplierName,supplierType,orderFlag";
	
	/**
	 * 通用字段，目前用于入住反馈校验填充原单信息
	 */
	String COMMON_FIELDS = "notesToElong,hotelId,cardNo,status,createTime,checkInDate,checkOutDate,payment,additionalStatus,orderFrom,roomNo,confirmNo,guestName,sourceOrderId,ratePlanId,roomTypeId,proxy,guestSex,lateCheckInTime,mHotelId,otaType";
	
	/**
	 * 为创建订单获取原单信息的字段，字段较多
	 */
	String FIELDS_FOR_CREATE = "changeTimeStamp,cardNo,status,createTime,modifyTime,roomCount,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,payment,guestType,currencyCode,sumPrice,sumCost,maxInventoryType,additionalStatus,additionalStatusI,notesToHotel,notesToGuest,notesToElong,roomNightsCount,orderFrom,createName,modifyName,vouchType,hotelId,hotelName,roomTypeId,roomTypeName,ratePlanId,ratePlanName,mRoomTypeId,supplierId,supplierName,supplierAbbr,supplierType,isUrgentVerify,isGreyList,paySequenceType,exchangedSumPrice,otaType,orderFlag,proxy,roomNo,confirmNo,guestName,guestSex,guestCountry,sourceOrderId,settlementDate,roomNightStayDate,roomNightInventoryId,roomNightInventoryType,roomNightPriceId,roomNightCost,roomNightSalePrice,roomNightRealSalePrice,roomNightRealCost,roomNightCurrencyCode,roomNightRackRate,roomNightExchangeRate,roomNightExchangePrice,roomNightHalfDayStatus,roomNightIsSpecial,roomNightIsPromotion,roomNightIsWeekend,roomNightHotelDcRateCode,roomNightBreakfastId,roomNightBreakfastCount,roomNightBreakfastUnitPrice,addValueBusinessCode,addValueIsInclude,addValueShare,addValuePriceDefaultOption,addValuePrice,addValueIsAdd,addValueSinglePriceDefaultOption,addValueSinglePrice,addValueMemo,addValueStatus,promotion,promotionDetail,promotionChannelCode,promotionChannelDesc,confirmMethod,contactName,contactSex,contactCountry,contactMobile,contactEmail,contactPhone,contactFax,contactCustomerId,contactSupplierCardNo";

	/**
	 * 为修改订单获取原单信息的字段，字段较多
	 */
	String FIELDS_FOR_MODIFY = "changeTimeStamp,cardNo,status,createTime,modifyTime,roomCount,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,payment,guestType,currencyCode,sumPrice,sumCost,maxInventoryType,additionalStatus,additionalStatusI,notesToHotel,notesToGuest,notesToElong,roomNightsCount,orderFrom,createName,modifyName,vouchType,hotelId,hotelName,roomTypeId,roomTypeName,ratePlanId,ratePlanName,mRoomTypeId,supplierId,supplierName,supplierAbbr,supplierType,isUrgentVerify,isGreyList,paySequenceType,exchangedSumPrice,otaType,orderFlag,proxy,roomNo,confirmNo,guestName,guestSex,guestCountry,sourceOrderId,settlementDate,roomNightStayDate,roomNightInventoryId,roomNightInventoryType,roomNightPriceId,roomNightCost,roomNightSalePrice,roomNightRealSalePrice,roomNightRealCost,roomNightCurrencyCode,roomNightRackRate,roomNightExchangeRate,roomNightExchangePrice,roomNightHalfDayStatus,roomNightIsSpecial,roomNightIsPromotion,roomNightIsWeekend,roomNightHotelDcRateCode,roomNightBreakfastId,roomNightBreakfastCount,roomNightBreakfastUnitPrice,addValueBusinessCode,addValueIsInclude,addValueShare,addValuePriceDefaultOption,addValuePrice,addValueIsAdd,addValueSinglePriceDefaultOption,addValueSinglePrice,addValueMemo,addValueStatus,promotion,promotionDetail,promotionChannelCode,promotionChannelDesc,confirmMethod,contactName,contactSex,contactCountry,contactMobile,contactEmail,contactPhone,contactFax,contactCustomerId,contactSupplierCardNo,addBedCount,addBedPrice,addBed,orderKeyValues";

	/**
	 * 切客队列使用
	 */
	String FIELDS_FOR_STEAL_CUSTOMER = "status,hotelId,hotelName,mHotelId,mHotelName,payment,checkInDate,checkOutDate,supplierId,supplierName,additionalStatus,cityId,cityName,provinceId,provinceName";
	
	/**
	 * 联单重单表字段
	 */
	String FIELDS_FOR_REPEATLINKED = "payment,checkInDate,checkOutDate,createTime,hotelId,modifyName,contactName,contactMobile,contactPhone,contactEmail,hotelName,status,additionalStatus,roomTypeName,roomTypeId,guestName,mHotelId";
}
