package com.peng.common;

import java.util.*;

/**
 * Created by peng.wang on 2018/4/12.
 */
public class StringUtils {

    /**
     * 按照length切割字符串,从0遍历，故把第一个值最后输出
     *
     * @param str    字符串
     * @param length 切割长度
     */
    public static void splitStringByLength(String str, int length) {

        String[] orderIdArray = str.split(",");
        String orderId = "";
        for (int i = 1; i < orderIdArray.length; i++) {
            orderId += orderIdArray[i] + ",";
            if (i % length == 0) {
                System.out.println(orderId.substring(0, orderId.length() - 1));
                orderId = "";
            }
        }
        System.out.println(orderId.substring(0, orderId.length() - 1) + "," + orderIdArray[0]);

    }

    public static String getStringListCommonField(List<String> list) {

        StringBuffer result = new StringBuffer();

        Set<String> fieldSet = new HashSet<String>();
        for (String s : list) {
            List<String> fieldStr = Arrays.asList(s.split(","));
            for (String o : fieldStr) {
                fieldSet.add(o);
            }
        }
        for (String field : fieldSet) {
            result.append(field).append(",");
        }
        return result.toString().substring(0,result.length()-1);
    }

    public static void main(String[] args) {

        List<String> fieldList = new ArrayList<>();
        //审核ota
        String FIELDS_FOR_OTA = "status,roomCount,otaType,orderKeyValues,payment,additionalStatus,noticeCtripCount,guestName,roomNo,cooperationOrderId,orderFlagsForProduct";

        //确认ivr
        String FIELDS_FOR_CONFIRMIVR = "status,hotelId,payment,checkInDate,roomCount,mRoomTypeName,checkOutDate,earlyCheckInTime,lateCheckInTime,additionalStatus,guestName,guestSex,hotelName,mHotelName,roomNightStayDate,roomNightIsSpecial,roomNightCost,roomNightSalePrice,roomNightRealSalePrice,roomNightRealCost,roomNightBreakfastCount,notesToHotel,notesToElong,otaType,originFrom,cooperationType,supplierOtaType";

        //到店无房ivr
        String NO_ROOM_ORDER_IVR = "hotelId,roomTypeId,roomTypeName,ratePlanId,payment,status,notesToHotel,cooperationOrderId,guestName,roomCount,mRoomTypeName,earlyCheckInTime,lateCheckInTime,checkInDate,checkOutDate,supplierOtaType,cooperationType,otaType,additionalStatus,additionalStatusI,notesToElong,roomNightStayDate,roomNightIsSpecial,roomNightCost,roomNightSalePrice,roomNightRealSalePrice,roomNightRealCost,roomNightBreakfastCount";

        //详情页获取承诺时间
        String FIELDS_FOR_GET_PROMISE_TIME = "otaType,pmsConfirmTime,additionalStatus,supplierId";

        fieldList.add(FIELDS_FOR_OTA);
        fieldList.add(FIELDS_FOR_CONFIRMIVR);
        fieldList.add(NO_ROOM_ORDER_IVR);
        fieldList.add(FIELDS_FOR_GET_PROMISE_TIME);

        String commonField = getStringListCommonField(fieldList);
        System.out.println(commonField);
    }
}
