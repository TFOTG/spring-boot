package com.elong.hotel.hotelconfirm.cancelorder.bo;

import com.elong.hotel.hotelconfirm.cancelorder.po.CancelOrderPo;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;

import java.util.Date;

/**
 * Created by liujunjie on 2018/7/27.
 */
public class CancelOrderBo extends CompareEntityBase {

    /**
     * 主键
     */
    private long id;

    /**
     * 订单号
     */
    private Integer reserNo;

    /**
     * 入住日
     */
    private Date arriveDate;

    /**
     * 离店日
     */
    private Date leaveDate;

    /**
     * 入库时间
     */
    private Date enterTime;

    /**
     * hotelId
     */
    private String sHotelId;

    /**
     * 酒店名称
     */
    private String hotelName;

    /**
     * 担保预付，1：预付，2：担保
     */
    private Integer orderPayType;

    /**
     * 可取消时间点，此时间点之后不能免费取消
     */
    private Date canCancelTime;

    /**
     * 是否直连
     */
    private Integer isDC;

    private Integer supplierOtaType;

    //是否供应商订单
    private Integer isSupplier;
    /**
     * 供应商Id
     */
    private String supplierId;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 置为取消状态时间
     */
    private Date cancelTime;

    private Date _timeStamp;

    public CancelOrderBo(CancelOrderPo po){

        this.reserNo = po.getReserNo();

        this.arriveDate = po.getArriveDate();

        this.leaveDate = po.getLeaveDate();

        this.enterTime = po.getEnterTime();

        this.sHotelId = po.getsHotelId();

        this.hotelName = po.getHotelName();

        this.orderPayType = po.getOrderPayType();

        this.canCancelTime = po.getCanCancelTime();

        this.isDC = po.getIsDC();

        this.supplierOtaType = po.getSupplierOtaType();

        this.isSupplier = po.getIsSupplier();

        this.supplierId = po.getsHotelId();

        this.supplierName = po.getSupplierName();

        this.cancelTime = po.getCancelTime();
    }

    public Integer getReserNo() {
        return reserNo;
    }

    public void setReserNo(Integer reserNo) {
        this.reserNo = reserNo;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    public String getsHotelId() {
        return sHotelId;
    }

    public void setsHotelId(String sHotelId) {
        this.sHotelId = sHotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getOrderPayType() {
        return orderPayType;
    }

    public void setOrderPayType(Integer orderPayType) {
        this.orderPayType = orderPayType;
    }

    public Date getCanCancelTime() {
        return canCancelTime;
    }

    public void setCanCancelTime(Date canCancelTime) {
        this.canCancelTime = canCancelTime;
    }

    public Integer getIsDC() {
        return isDC;
    }

    public void setIsDC(Integer isDC) {
        this.isDC = isDC;
    }

    public Integer getSupplierOtaType() {
        return supplierOtaType;
    }

    public void setSupplierOtaType(Integer supplierOtaType) {
        this.supplierOtaType = supplierOtaType;
    }

    public Integer getIsSupplier() {
        return isSupplier;
    }

    public void setIsSupplier(Integer isSupplier) {
        this.isSupplier = isSupplier;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Date get_timeStamp() {
        return _timeStamp;
    }

    public void set_timeStamp(Date _timeStamp) {
        this._timeStamp = _timeStamp;
    }
}
