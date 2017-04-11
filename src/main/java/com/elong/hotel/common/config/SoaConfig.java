package com.elong.hotel.common.config;

import com.alibaba.fastjson.JSON;

/**
 * Created by peng.wang on 17/3/9.
 *
 */
public class SoaConfig {


    private String platFormProduct;

    private String hotelProduct;

    private String identifyService;

    private int identifyTimeOut;

    private String identifyGetProxyInfo;

    private String identifyIsExistProxyContact;

    private String smsService;

    private int smsTimeOut;

    private String smsSend;

    private String hotel3Service;

    private int hotel3TimeOut;

    private String hotel3GetFaxNo;

    private String hotel3SendSMS;

    private String hotel3GetStaff;

    private String productService;

    private int productTimeOut;

    private String productGetHotelPhone;

    private String orderApiService;

    private int orderApiTimeOut;

    private String orderApiCreditValidate;

    private String orderApiCreditVerify;

    private String dcService;

    private int dcTimeOut;

    private String dcGetOrdersAudit;

    private String ebService;

    private int ebTimeOut;

    private String ebGetHotelOnline;

    private String csService;

    private int csTimeOut;

    private String csGetMemberInfo;

    private String commentService;

    private int commentTimeOut;

    private String commentGetOrderComment;

    private String indexService;

    private int indexTimeOut;

    private String indexGetIndexInfo;

    private String rmService;

    private int rmTimeOut;

    private String rmCompensate;

    private String ivrService;

    private int ivrTimeOut;

    private String ivrSend;

    private String ivrBoundCount;

    public String getPlatFormProduct() {
        return platFormProduct;
    }

    public void setPlatFormProduct(String platFormProduct) {
        this.platFormProduct = platFormProduct;
    }

    public String getHotelProduct() {
        return hotelProduct;
    }

    public void setHotelProduct(String hotelProduct) {
        this.hotelProduct = hotelProduct;
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

    public String getIdentifyIsExistProxyContact() {
        return identifyIsExistProxyContact;
    }

    public void setIdentifyIsExistProxyContact(String identifyIsExistProxyContact) {
        this.identifyIsExistProxyContact = identifyIsExistProxyContact;
    }

    public String getSmsService() {
        return smsService;
    }

    public void setSmsService(String smsService) {
        this.smsService = smsService;
    }

    public int getSmsTimeOut() {
        return smsTimeOut;
    }

    public void setSmsTimeOut(int smsTimeOut) {
        this.smsTimeOut = smsTimeOut;
    }

    public String getSmsSend() {
        return smsSend;
    }

    public void setSmsSend(String smsSend) {
        this.smsSend = smsSend;
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

    public String getHotel3GetFaxNo() {
        return hotel3GetFaxNo;
    }

    public void setHotel3GetFaxNo(String hotel3GetFaxNo) {
        this.hotel3GetFaxNo = hotel3GetFaxNo;
    }

    public String getHotel3SendSMS() {
        return hotel3SendSMS;
    }

    public void setHotel3SendSMS(String hotel3SendSMS) {
        this.hotel3SendSMS = hotel3SendSMS;
    }

    public String getHotel3GetStaff() {
        return hotel3GetStaff;
    }

    public void setHotel3GetStaff(String hotel3GetStaff) {
        this.hotel3GetStaff = hotel3GetStaff;
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

    public String getOrderApiService() {
        return orderApiService;
    }

    public void setOrderApiService(String orderApiService) {
        this.orderApiService = orderApiService;
    }

    public int getOrderApiTimeOut() {
        return orderApiTimeOut;
    }

    public void setOrderApiTimeOut(int orderApiTimeOut) {
        this.orderApiTimeOut = orderApiTimeOut;
    }

    public String getOrderApiCreditValidate() {
        return orderApiCreditValidate;
    }

    public void setOrderApiCreditValidate(String orderApiCreditValidate) {
        this.orderApiCreditValidate = orderApiCreditValidate;
    }

    public String getOrderApiCreditVerify() {
        return orderApiCreditVerify;
    }

    public void setOrderApiCreditVerify(String orderApiCreditVerify) {
        this.orderApiCreditVerify = orderApiCreditVerify;
    }

    public String getDcService() {
        return dcService;
    }

    public void setDcService(String dcService) {
        this.dcService = dcService;
    }

    public int getDcTimeOut() {
        return dcTimeOut;
    }

    public void setDcTimeOut(int dcTimeOut) {
        this.dcTimeOut = dcTimeOut;
    }

    public String getDcGetOrdersAudit() {
        return dcGetOrdersAudit;
    }

    public void setDcGetOrdersAudit(String dcGetOrdersAudit) {
        this.dcGetOrdersAudit = dcGetOrdersAudit;
    }

    public String getEbService() {
        return ebService;
    }

    public void setEbService(String ebService) {
        this.ebService = ebService;
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

    public String getCsService() {
        return csService;
    }

    public void setCsService(String csService) {
        this.csService = csService;
    }

    public int getCsTimeOut() {
        return csTimeOut;
    }

    public void setCsTimeOut(int csTimeOut) {
        this.csTimeOut = csTimeOut;
    }

    public String getCsGetMemberInfo() {
        return csGetMemberInfo;
    }

    public void setCsGetMemberInfo(String csGetMemberInfo) {
        this.csGetMemberInfo = csGetMemberInfo;
    }

    public String getCommentService() {
        return commentService;
    }

    public void setCommentService(String commentService) {
        this.commentService = commentService;
    }

    public int getCommentTimeOut() {
        return commentTimeOut;
    }

    public void setCommentTimeOut(int commentTimeOut) {
        this.commentTimeOut = commentTimeOut;
    }

    public String getCommentGetOrderComment() {
        return commentGetOrderComment;
    }

    public void setCommentGetOrderComment(String commentGetOrderComment) {
        this.commentGetOrderComment = commentGetOrderComment;
    }

    public String getIndexService() {
        return indexService;
    }

    public void setIndexService(String indexService) {
        this.indexService = indexService;
    }

    public int getIndexTimeOut() {
        return indexTimeOut;
    }

    public void setIndexTimeOut(int indexTimeOut) {
        this.indexTimeOut = indexTimeOut;
    }

    public String getIndexGetIndexInfo() {
        return indexGetIndexInfo;
    }

    public void setIndexGetIndexInfo(String indexGetIndexInfo) {
        this.indexGetIndexInfo = indexGetIndexInfo;
    }

    public String getRmService() {
        return rmService;
    }

    public void setRmService(String rmService) {
        this.rmService = rmService;
    }

    public int getRmTimeOut() {
        return rmTimeOut;
    }

    public void setRmTimeOut(int rmTimeOut) {
        this.rmTimeOut = rmTimeOut;
    }

    public String getRmCompensate() {
        return rmCompensate;
    }

    public void setRmCompensate(String rmCompensate) {
        this.rmCompensate = rmCompensate;
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

    public void setIvrBoundCount(String ivrBoundCount) {
        this.ivrBoundCount = ivrBoundCount;
    }

    public static void main(String[] args) {
        SoaConfig config=new SoaConfig();
        config.setPlatFormProduct("platform");
        config.setIdentifyService("member-identify");//测试member-mis\生产member-identify
        config.setIdentifyGetProxyInfo("getProxyInfosByProxyIds");
        config.setIdentifyIsExistProxyContact("isExistProxyContact");
        config.setIdentifyTimeOut(5000);
        config.setSmsService("sms-mis");
        config.setSmsSend("send");
        config.setSmsTimeOut(5000);
        config.setHotelProduct("hotel");
        config.setHotel3Service("mis");
        config.setHotel3TimeOut(5000);
        config.setHotel3GetFaxNo("GetFaxNoByHotelID");
        config.setHotel3SendSMS("SendSmsRest");
        config.setHotel3GetStaff("GetStaffByStaffName");
        config.setProductService("mis_product");
        config.setProductGetHotelPhone("BatchGetHotelAuditPhoneRequest");
        config.setProductTimeOut(5000);
        config.setOrderApiService("jorder-api");
        config.setOrderApiCreditValidate("creditValidate");
        config.setOrderApiCreditVerify("creditVerify");
        config.setOrderApiTimeOut(5000);
        config.setDcService("dc");
        config.setDcTimeOut(5000);
        config.setDcGetOrdersAudit("GetOrdersAuditInfoReq");
        config.setEbService("ebk-common");
        config.setEbTimeOut(5000);
        config.setEbGetHotelOnline("getEbkHotelOnlineStatusForMis");
        config.setCommentService("comment");
        config.setCommentTimeOut(5000);
        config.setCommentGetOrderComment("GetCommentsByOrderIds");
        config.setCsService("mis-customerservice");
        config.setCsTimeOut(5000);
        config.setCsGetMemberInfo("IdentifyMemberByCardNo");
        config.setIndexService("mis-index");
        config.setIndexTimeOut(5000);
        config.setIndexGetIndexInfo("getIndexInfo");
        config.setRmService("riskmanage");
        config.setRmTimeOut(5000);
        config.setRmCompensate("compensate");
        config.setIvrService("mis_ivr");
        config.setIvrSend("receive");
        config.setIvrBoundCount("getcount4business");
        config.setIvrTimeOut(5000);
        System.out.println(JSON.toJSONString(config));

    }

}
