package com.elong.hotel.hotelconfirm.confirmorder.bo;


import java.util.Calendar;
import java.util.Date;

import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityAnnotations;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;

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
   	
    public CompareOrder4RankSettingBo(ConfirmOrderBo confirmOrderBo){
        this.orderId = confirmOrderBo.getReserNo();
        this.orderType = confirmOrderBo.getPriority();
        this.shotelId = confirmOrderBo.getHotelId();
        this.supplierId = confirmOrderBo.getSupplierId();
        this.confirmType = confirmOrderBo.getConfirmType();
        this.cityId = confirmOrderBo.getCityId();
        int day = differentDays(confirmOrderBo.getArriveDate(),new Date());
        if(day<0){this.arriveDate=-1;} else  this.arriveDate = day>=1?1:0;
       
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

	public static int differentDays(Date arriveDate, Date now) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(arriveDate);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(now);
		int day1 = cal1.get(Calendar.DAY_OF_YEAR);
		int day2 = cal2.get(Calendar.DAY_OF_YEAR);
		int year1 = cal1.get(Calendar.YEAR);
		int year2 = cal2.get(Calendar.YEAR);
		if (year1 != year2) {// 同一年
			int timeDistance = 0;
			for (int i = year1; i < year2; i++) {
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) // 闰年
				{
					timeDistance += 366;
				} else // 不是闰年
				{
					timeDistance += 365;
				}
			}
			return timeDistance + (day1 - day2);
		} else {// 不同年
			return day1 - day2;
		}
	}
}
