package com.elong.hotel.common.config;

import com.alibaba.fastjson.JSON;

/**
 * Created by peng.wang on 17/3/9.
 *
 */
public class SoaConfig {

	private String hotelProduct;

	private String dcProduct;

	private String dcOrderService;

	private int dcOrderTimeOut;

	private String urgeCtripOrder;

	private String hotel3Service;

	private int hotel3TimeOut;

	private String hotel3GetOrderServerTime;

	private String hotel3GetOrderNightMode;

	private String hotel3GetStaff;

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

	/**调用获取确认传真接口*/
	private String confirmFax;
	private int confirmFaxTimeOut;

	public String getConfirmFax() {
		return confirmFax;
	}

	public void setConfirmFax(String confirmFax) {
		this.confirmFax = confirmFax;
	}

	public int getConfirmFaxTimeOut() {
		return confirmFaxTimeOut;
	}

	public void setConfirmFaxTimeOut(int confirmFaxTimeOut) {
		this.confirmFaxTimeOut = confirmFaxTimeOut;
	}

	private String platFormProduct;
	private String identifyService;
	private int identifyTimeOut;
	private String identifyGetProxyInfo;

	public String getPlatFormProduct() {
		return platFormProduct;
	}

	public void setPlatFormProduct(String platFormProduct) {
		this.platFormProduct = platFormProduct;
	}

	public String getIdentifyService() {
		return identifyService;
	}

	public void setIdentifyService(String identifyService) {
		this.identifyService = identifyService;
	}

	public int getIdentifyTimeOut() {
		return identifyTimeOut;
	}

	public void setIdentifyTimeOut(int identifyTimeOut) {
		this.identifyTimeOut = identifyTimeOut;
	}

	public String getIdentifyGetProxyInfo() {
		return identifyGetProxyInfo;
	}

	public void setIdentifyGetProxyInfo(String identifyGetProxyInfo) {
		this.identifyGetProxyInfo = identifyGetProxyInfo;
	}

	private String batchGetHotelContactRequest;
	private String productGetHotelContactMethod;

	private String xworkflowService;

	private String xworkflowMethod;

	private int xworkflowTimeout;

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

	public String getDcProduct() {
		return dcProduct;
	}

	public void setDcProduct(String dcProduct) {
		this.dcProduct = dcProduct;
	}

	public String getDcOrderService() {
		return dcOrderService;
	}

	public void setDcOrderService(String dcOrderService) {
		this.dcOrderService = dcOrderService;
	}

	public int getDcOrderTimeOut() {
		return dcOrderTimeOut;
	}

	public void setDcOrderTimeOut(int dcOrderTimeOut) {
		this.dcOrderTimeOut = dcOrderTimeOut;
	}

	public String getUrgeCtripOrder() {
		return urgeCtripOrder;
	}

	public void setUrgeCtripOrder(String urgeCtripOrder) {
		this.urgeCtripOrder = urgeCtripOrder;
	}

	public String getHotelProduct() {
		return hotelProduct;
	}

    
    private String ebCommonService;

    private int ebTimeOut;

    private String ebGetHotelOnline;
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

	public String getXworkflowService() {
		return xworkflowService;
	}

	public void setXworkflowService(String xworkflowService) {
		this.xworkflowService = xworkflowService;
	}

	public String getXworkflowMethod() {
		return xworkflowMethod;
	}

	public void setXworkflowMethod(String xworkflowMethod) {
		this.xworkflowMethod = xworkflowMethod;
	}

	public int getXworkflowTimeout() {
		return xworkflowTimeout;
	}

	public void setXworkflowTimeout(int xworkflowTimeout) {
		this.xworkflowTimeout = xworkflowTimeout;
	}

	public String getProductGetHotelContactMethod() {
		return productGetHotelContactMethod;
	}

	public void setProductGetHotelContactMethod(String productGetHotelContactMethod) {
		this.productGetHotelContactMethod = productGetHotelContactMethod;
	}

	public String getBatchGetHotelContactRequest() {
		return batchGetHotelContactRequest;
	}

	public void setBatchGetHotelContactRequest(String batchGetHotelContactRequest) {
		this.batchGetHotelContactRequest = batchGetHotelContactRequest;
	}

	public String getHotel3GetStaff() {
		return hotel3GetStaff;
	}

	public void setHotel3GetStaff(String hotel3GetStaff) {
		this.hotel3GetStaff = hotel3GetStaff;
	}

	public String getEbCommonService() {
		return ebCommonService;
	}

	public void setEbCommonService(String ebCommonService) {
		this.ebCommonService = ebCommonService;
	}

	public int getEbTimeOut() {
		return ebTimeOut;
	}

	public void setEbTimeOut(int ebTimeOut) {
		this.ebTimeOut = ebTimeOut;
	}

	public String getEbGetHotelOnline() {
		return ebGetHotelOnline;
	}

	public void setEbGetHotelOnline(String ebGetHotelOnline) {
		this.ebGetHotelOnline = ebGetHotelOnline;
	}

	public static void main(String[] args) {
		SoaConfig config = new SoaConfig();
		config.setHotelProduct("hotel");
		config.setDcProduct("dc");
		config.setDcOrderService("order");
		config.setDcOrderTimeOut(5000);
		config.setUrgeCtripOrder("urgeCtripOrder");
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