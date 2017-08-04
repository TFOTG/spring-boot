/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.response.DynamicResponse.java]
 * Createion [2017年8月3日]
 */
package com.elong.hotel.proxy.product.response;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class DynamicResponse extends ServiceResponseProductBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private DynamicHotelRealResponse realResponse;

	public DynamicHotelRealResponse getRealResponse() {
		return realResponse;
	}

	public void setRealResponse(DynamicHotelRealResponse realResponse) {
		this.realResponse = realResponse;
	}
	
}
