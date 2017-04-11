package com.elong.hotel.hotelconfirm.confirmorder.bo;

import com.elong.hotel.common.groupfilter.bo.CompareEntityAnnotations;
import com.elong.hotel.common.groupfilter.bo.CompareEntityBase;
import com.elong.hotel.common.groupfilter.bo.GroupBase;

/**
 * Created by yangboyu on 17/4/4.
 */
public class CompareOrder4RankSettingBo extends CompareEntityBase {

    private Integer orderId;

    @CompareEntityAnnotations(name = "ordertype")
    private Integer orderType;

    @CompareEntityAnnotations(name = "shotelid")
    private String shotelId;

    @CompareEntityAnnotations(name = "supplierid")
    private String supplierId;

    @CompareEntityAnnotations(name = "suppliertype")
    private String supplierType;

    @CompareEntityAnnotations(name = "confirmtype")
    private String confirmType;

    public CompareOrder4RankSettingBo(ConfirmOrderBo confirmOrderBo){

    }

    public String getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(String confirmType) {
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

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }
}
