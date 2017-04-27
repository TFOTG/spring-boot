package com.elong.hotel.common.config;

import com.alibaba.fastjson.JSON;

/**
 * Created by peng.wang on 17/3/9.
 *
 */
public class SoaConfig {

    private String hotelProduct;


    private String hotel3Service;

    private int hotel3TimeOut;

    private String hotel3GetOrderServerTime;

    private String hotel3GetOrderNightMode;

    private String javaOrderQueryService;

    private int javaOrderQueryTimeOut;

    private String getOrderHistory;


    public String getHotelProduct() {
        return hotelProduct;
    }

    public void setHotelProduct(String hotelProduct) {
        this.hotelProduct = hotelProduct;
    }

    public String getJavaOrderQueryService() {
        return javaOrderQueryService;
    }

    public void setJavaOrderQueryService(String javaOrderQueryService) {
        this.javaOrderQueryService = javaOrderQueryService;
    }

    public String getGetOrderHistory() {
        return getOrderHistory;
    }

    public void setGetOrderHistory(String getOrderHistory) {
        this.getOrderHistory = getOrderHistory;
    }

    public int getJavaOrderQueryTimeOut() {
        return javaOrderQueryTimeOut;
    }

    public void setJavaOrderQueryTimeOut(int javaOrderQueryTimeOut) {
        this.javaOrderQueryTimeOut = javaOrderQueryTimeOut;
    }

    public String getHotel3Service() {
        return hotel3Service;
    }

    public void setHotel3Service(String hotel3Service) {
        this.hotel3Service = hotel3Service;
    }

    public int getHotel3TimeOut() {
        return hotel3TimeOut;
    }

    public void setHotel3TimeOut(int hotel3TimeOut) {
        this.hotel3TimeOut = hotel3TimeOut;
    }

    public String getHotel3GetOrderServerTime() {
        return hotel3GetOrderServerTime;
    }

    public void setHotel3GetOrderServerTime(String hotel3GetOrderServerTime) {
        this.hotel3GetOrderServerTime = hotel3GetOrderServerTime;
    }

    public String getHotel3GetOrderNightMode() {
        return hotel3GetOrderNightMode;
    }

    public void setHotel3GetOrderNightMode(String hotel3GetOrderNightMode) {
        this.hotel3GetOrderNightMode = hotel3GetOrderNightMode;
    }

    public static void main(String[] args) {
        SoaConfig config=new SoaConfig();
        config.setHotelProduct("hotel");
        config.setJavaOrderQueryService("");
        config.setGetOrderHistory("data_historyInfoForRecheck");
        config.setJavaOrderQueryTimeOut(5000);
        config.setHotel3Service("mis");
        config.setHotel3TimeOut(5000);
        config.setHotel3GetOrderServerTime("GetOrderServerTime");
        config.setHotel3GetOrderNightMode("GetOrderNightMode");
        System.out.println(JSON.toJSONString(config));

    }
}
