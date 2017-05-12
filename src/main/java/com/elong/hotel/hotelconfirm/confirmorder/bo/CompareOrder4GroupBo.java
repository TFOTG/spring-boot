package com.elong.hotel.hotelconfirm.confirmorder.bo;


import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityAnnotations;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;

/**
 * Created by yangboyu on 17/4/4.
 */
public class CompareOrder4GroupBo extends CompareEntityBase {

    private Integer orderId;

    @CompareEntityAnnotations(name = "reserstatus")
    private String reserStatus;

    @CompareEntityAnnotations(name = "shotelid")
    private String shotelId;

    @CompareEntityAnnotations(name = "supplierid")
    private String supplierId;

    /**
	 * 城市id
	 */
	@CompareEntityAnnotations(name = "cityid")
	private String cityId;
	
    public CompareOrder4GroupBo(ConfirmOrderBo confirmOrderBo){
        this.orderId = confirmOrderBo.getReserNo();
        this.reserStatus = confirmOrderBo.getReserStatus();
        this.shotelId = confirmOrderBo.getHotelId();
        this.supplierId = confirmOrderBo.getSupplierId();
        this.cityId = confirmOrderBo.getCityId();
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
    
}
