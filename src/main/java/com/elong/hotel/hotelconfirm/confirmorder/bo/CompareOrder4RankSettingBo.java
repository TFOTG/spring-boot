package com.elong.hotel.hotelconfirm.confirmorder.bo;


import java.util.Calendar;
import java.util.Date;

import com.elong.hotel.common.helper.DateHelper;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityAnnotations;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;
import com.elong.hotel.hotelconfirm.ranksetting.enums.ArriveDateEnum;

/**
 * Created by yangboyu on 17/4/4.
 */
public class CompareOrder4RankSettingBo extends CompareEntityBase {

    private Integer orderId;

    /**
     * name = 'ordertype' 订单类型 必须小写
     */
    @CompareEntityAnnotations(name = "OrderType")
    private Integer orderType;

    /**
     * name = 'shotelid' 酒店id 必须小写
     */
    @CompareEntityAnnotations(name = "HotelID")
    private String shotelId;

    /**
     * name = 'supplierid' 供应商id 必须小写
     */
    @CompareEntityAnnotations(name = "SupplierID")
    private String supplierId;

//    /**
//     * name = 'suppliertype' 供应商类型 必须小写
//     */
//    @CompareEntityAnnotations(name = "suppliertype")
//    private String supplierType;

    /**
     * name = 'confirmtype' 确认方式,Ebooking,直连,人工 必须小写
     */
    @CompareEntityAnnotations(name = "ConfirmType")
    private Integer confirmType;

    /**
     * 城市id
     */
    @CompareEntityAnnotations(name = "CityID")
    private String cityId;

    /**
     * 到店时间
     */
    @CompareEntityAnnotations(name = "ArriveDate")
    private Integer arriveDate;

    public CompareOrder4RankSettingBo(ConfirmOrderBo confirmOrderBo) {
        this.orderId = confirmOrderBo.getReserNo();
        this.orderType = confirmOrderBo.getPriority();
        this.shotelId = confirmOrderBo.getHotelId();
        this.supplierId = confirmOrderBo.getSupplierId();
        this.confirmType = confirmOrderBo.getConfirmType();
        this.cityId = confirmOrderBo.getCityId();
        int day = DateHelper.getDayCount(confirmOrderBo.getArriveDate(), new Date());
        if (day <= 0) {
            this.arriveDate = ArriveDateEnum.TODAY.getKey();
        } else if (day == 1) {
            this.arriveDate = ArriveDateEnum.TOMORROW.getKey();
        } else {
            this.arriveDate = ArriveDateEnum.AFTERT_OMORROW.getKey();
        }
    }

    public Integer getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(Integer confirmType) {
        this.confirmType = confirmType;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getShotelId() {
        return shotelId;
    }

    public void setShotelId(String shotelId) {
        this.shotelId = shotelId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Integer getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Integer arriveDate) {
        this.arriveDate = arriveDate;
    }
}
