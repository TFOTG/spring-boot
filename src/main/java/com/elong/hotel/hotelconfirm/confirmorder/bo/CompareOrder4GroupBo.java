package com.elong.hotel.hotelconfirm.confirmorder.bo;


import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityAnnotations;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;
import com.elong.hotel.proxy.javaorder.consts.OrderAdditionalStatusConst;

/**
 * Created by yangboyu on 17/4/4.
 */
public class CompareOrder4GroupBo extends CompareEntityBase {

    private Integer orderId;

    /**
     * 订单状态
     */
    @CompareEntityAnnotations(name = "OrderStatus")
    private String reserStatus;


    /**
     * 供应商id
     */
    @CompareEntityAnnotations(name = "SupplierID")
    private String supplierId;

    /**
	 * 城市id
	 */
	@CompareEntityAnnotations(name = "CityID")
	private String cityId;

    /**
     * 是否及时
     */
    @CompareEntityAnnotations(name = "IsImmediately")
    private Integer instantConfirm;
	
    public CompareOrder4GroupBo(ConfirmOrderBo confirmOrderBo){
        this.orderId = confirmOrderBo.getReserNo();
        this.reserStatus = confirmOrderBo.getReserStatus();
        this.supplierId = confirmOrderBo.getSupplierId();
        this.cityId = confirmOrderBo.getCityId();
        this.instantConfirm = (confirmOrderBo.getAdditionalStatus() & OrderAdditionalStatusConst.INSTANT_CONFIRM) == OrderAdditionalStatusConst.INSTANT_CONFIRM ? 1 : 0;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }


    public String getReserStatus() {
		return reserStatus;
	}

	public void setReserStatus(String reserStatus) {
		this.reserStatus = reserStatus;
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

    public Integer getInstantConfirm() {
        return instantConfirm;
    }

    public void setInstantConfirm(Integer instantConfirm) {
        this.instantConfirm = instantConfirm;
    }
}
