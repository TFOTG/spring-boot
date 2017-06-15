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

    private String javaOrderApiService;

    private int javaOrderApiTimeOut;

    private String rejectOrder;

    private String confirmOrder;

    private int javaOrderQueryTimeOut;

    private String getOrderHistory;

    private String ivrService;

    private int ivrTimeOut;

    private String ivrSend;

    private String ivrBoundCount;

    private String productService;

    private int productTimeOut;

    private String productGetHotelPhone;

    /**
     * 调用ebk延迟接口service
     */
    private String ebkDelayOrderService;
    
    /**
     * 调用ebk延迟接口方法
     */
    private String ebkDelayOrderMethod;

    /**
     * 调用ebk延迟接口方法  超时时间
     */
    private int ebkDelayOrderTimeOut;

    public String getHotelProduct() {
        return hotelProduct;
    }

    public void setHotelProduct(String hotelProduct) {
        this.hotelProduct = hotelProduct;
    }

    public String getIvrService() {
        return ivrService;
    }

    public void setIvrService(String ivrService) {
        this.ivrService = ivrService;
    }

    public int getIvrTimeOut() {
        return ivrTimeOut;
    }

    public void setIvrTimeOut(int ivrTimeOut) {
        this.ivrTimeOut = ivrTimeOut;
    }

    public String getIvrSend() {
        return ivrSend;
    }

    public void setIvrSend(String ivrSend) {
        this.ivrSend = ivrSend;
    }

    public String getIvrBoundCount() {
        return ivrBoundCount;
    }

    public String getProductService() {
        return productService;
    }

    public void setProductService(String productService) {
        this.productService = productService;
    }

    public int getProductTimeOut() {
        return productTimeOut;
    }

    public void setProductTimeOut(int productTimeOut) {
        this.productTimeOut = productTimeOut;
    }

    public String getProductGetHotelPhone() {
        return productGetHotelPhone;
    }

    public void setProductGetHotelPhone(String productGetHotelPhone) {
        this.productGetHotelPhone = productGetHotelPhone;
    }

    public void setIvrBoundCount(String ivrBoundCount) {
        this.ivrBoundCount = ivrBoundCount;
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
    
    public String getEbkDelayOrderService() {
		return ebkDelayOrderService;
	}

	public void setEbkDelayOrderService(String ebkDelayOrderService) {
		this.ebkDelayOrderService = ebkDelayOrderService;
	}

	public String getEbkDelayOrderMethod() {
		return ebkDelayOrderMethod;
	}

	public void setEbkDelayOrderMethod(String ebkDelayOrderMethod) {
		this.ebkDelayOrderMethod = ebkDelayOrderMethod;
	}

	public int getEbkDelayOrderTimeOut() {
		return ebkDelayOrderTimeOut;
	}

	public void setEbkDelayOrderTimeOut(int ebkDelayOrderTimeOut) {
		this.ebkDelayOrderTimeOut = ebkDelayOrderTimeOut;
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

    public String getJavaOrderApiService() {
        return javaOrderApiService;
    }

    public void setJavaOrderApiService(String javaOrderApiService) {
        this.javaOrderApiService = javaOrderApiService;
    }

    public int getJavaOrderApiTimeOut() {
        return javaOrderApiTimeOut;
    }

    public void setJavaOrderApiTimeOut(int javaOrderApiTimeOut) {
        this.javaOrderApiTimeOut = javaOrderApiTimeOut;
    }

    public String getRejectOrder() {
        return rejectOrder;
    }

    public void setRejectOrder(String rejectOrder) {
        this.rejectOrder = rejectOrder;
    }

    public String getConfirmOrder() {
        return confirmOrder;
    }

    public void setConfirmOrder(String confirmOrder) {
        this.confirmOrder = confirmOrder;
    }

    public static void main(String[] args) {
        SoaConfig config=new SoaConfig();
        config.setHotelProduct("hotel");
        config.setJavaOrderQueryService("jorder-query");
        config.setGetOrderHistory("data_historyInfoForRecheck");
        config.setJavaOrderQueryTimeOut(5000);
        config.setJavaOrderApiService("jorder-api");
        config.setJavaOrderApiTimeOut(5000);
        config.setConfirmOrder("confirm");
        config.setRejectOrder("reject");
        config.setHotel3Service("mis");
        config.setHotel3TimeOut(5000);
        config.setHotel3GetOrderServerTime("GetOrderServerTime");
        config.setHotel3GetOrderNightMode("GetOrderNightMode");
        config.setEbkDelayOrderService("");
        config.setEbkDelayOrderMethod("");
        config.setEbkDelayOrderTimeOut(5000);
        System.out.println(JSON.toJSONString(config));

    }


}
