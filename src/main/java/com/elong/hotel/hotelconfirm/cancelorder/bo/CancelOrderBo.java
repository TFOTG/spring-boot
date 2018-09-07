package com.elong.hotel.hotelconfirm.cancelorder.bo;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.cancelorder.po.CancelOrderPo;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;
import com.elong.hotel.proxy.javaorder.getorder.GetOrderStatusChangeTimeBo;
import com.elong.hotel.proxy.javaorder.getorder.Order;

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

    private Integer isElongOrder;

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

    private String reserStatus;

    private Date orderTimestamp;

    public CancelOrderBo(CancelOrderPo po){

        this.setCancelOrder(po);

    }

    public CancelOrderBo(Order order,CancelOrderPo po, GetOrderStatusChangeTimeBo orderStatusChange, OperatorInfoBo operator,int vouchType){
        if(order != null && po != null){
            this.setCancelOrder(po);
            this.reserStatus = order.getStatus();
        }
        else if(order != null && po == null){
            this.reserNo = order.getOrderId().intValue();
            this.reserStatus = order.getStatus();
            this.arriveDate = order.getCheckInDate();
            this.leaveDate = order.getCheckOutDate();

            this.sHotelId = order.getHotelId();
            this.hotelName = order.getHotelName();

            //关于直连和直签

            this.supplierId = String.valueOf(order.getSupplierId());
            this.supplierName = order.getSupplierName();
            this.supplierOtaType = order.getSupplierOtaType();

            if(vouchType == 0)
            {
                this.orderPayType = 1;
            }
            else if(vouchType > 0){
                this.orderPayType = 2;
            }

            this.orderTimestamp = order.getOrderTimestamp();
        }
        else if(order == null && po != null){
            this.setCancelOrder(po);
        }
    }

    public void setCancelOrder(CancelOrderPo po) {
        this.reserNo = po.getReserNo();

        this.arriveDate = po.getArriveDate();

        this.leaveDate = po.getLeaveDate();

        this.enterTime = po.getEnterTime();

        this.sHotelId = po.getsHotelId();

        this.hotelName = po.getHotelName();

        this.orderPayType = po.getOrderPayType();

        this.canCancelTime = po.getCanCancelTime();

        this.isDC = po.getIsDC();

        this.isElongOrder = po.getIsElongOrder();

        this.supplierOtaType = po.getSupplierOtaType();

        this.isSupplier = po.getIsSupplier();

        this.supplierId = po.getSupplierId();

        this.supplierName = po.getSupplierName();

        this.cancelTime = po.getCancelTime();

        this.reserStatus = po.getReserStatus();
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

    public Integer getIsElongOrder() {
        return isElongOrder;
    }

    public void setIsElongOrder(Integer isElongOrder) {
        this.isElongOrder = isElongOrder;
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

    public String getReserStatus() {
        return reserStatus;
    }

    public void setReserStatus(String reserStatus) {
        this.reserStatus = reserStatus;
    }

    public Date getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(Date orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }
}
