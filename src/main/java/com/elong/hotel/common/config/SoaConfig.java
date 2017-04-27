package com.elong.hotel.common.config;

import com.alibaba.fastjson.JSON;

/**
 * Created by peng.wang on 17/3/9.
 *
 */
public class SoaConfig {

    private String hotelProduct;

    private String javaOrderQueryService;

    private int javaOrderQueryTimeOut;

    private String getOrderHistory;

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

	public static void main(String[] args) {
        SoaConfig config=new SoaConfig();
        config.setHotelProduct("hotel");
        config.setJavaOrderQueryService("");
        config.setGetOrderHistory("data_historyInfoForRecheck");
        config.setJavaOrderQueryTimeOut(5000);
        System.out.println(JSON.toJSONString(config));

    }
}
