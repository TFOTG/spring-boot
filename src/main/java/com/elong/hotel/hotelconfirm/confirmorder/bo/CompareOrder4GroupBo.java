package com.elong.hotel.hotelconfirm.confirmorder.bo;

import com.elong.hotel.common.groupfilter.bo.CompareEntityAnnotations;
import com.elong.hotel.common.groupfilter.bo.CompareEntityBase;

/**
 * Created by yangboyu on 17/4/4.
 */
public class CompareOrder4GroupBo extends CompareEntityBase {

    private Integer orderId;

    @CompareEntityAnnotations(name = "orderid")
    private String orderStatus;

    @CompareEntityAnnotations(name = "shotelid")
    private String shotelId;

    @CompareEntityAnnotations(name = "supplierid")
    private String supplierId;

    public CompareOrder4GroupBo(ConfirmOrderBo confirmOrderBo){
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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
}
