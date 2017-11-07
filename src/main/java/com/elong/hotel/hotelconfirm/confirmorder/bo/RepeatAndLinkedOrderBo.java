package com.elong.hotel.hotelconfirm.confirmorder.bo;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by zhangdapeng on 17/7/6.
 */
public class RepeatAndLinkedOrderBo implements Serializable, Comparable<RepeatAndLinkedOrderBo> {

	/**
	 * 服务名义
	 */
	private String serviceName;

	/**
	 * 订单ID
	 */
	private Long orderId;

	/**
	 * 酒店名称
	 */
	private String hotelName;

	/**
	 * 客人名称
	 */
	private String guestName;

	/**
	 * 入住日期
	 */
	@JSONField(format = "yyyy-MM-dd")
	private Date arriveDate;

	/**
	 * 离店日期
	 */
	@JSONField(format = "yyyy-MM-dd")
	private Date leftDate;

	/**
	 * 房量
	 */
	private Integer roomCount;

	/**
	 * 房型
	 */
	private String roomType;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 预付
	 */
	private String payment;

	/**
	 * 即时
	 */
	private Long instantConfirm;

	/**
	 * 支付状态名称
	 */
	private String payStatusName;

	public RepeatAndLinkedOrderBo() {
		super();
	}

	public RepeatAndLinkedOrderBo(Long orderId, String hotelName, Date arriveDate, Date leftDate, Integer roomCount, String roomType,
			String status, String payment, Long instantConfirm) {
		super();
		this.orderId = orderId;
		this.hotelName = hotelName;
		this.arriveDate = arriveDate;
		this.leftDate = leftDate;
		this.roomCount = roomCount;
		this.roomType = roomType;
		this.status = status;
		this.payment = payment;
		this.instantConfirm = instantConfirm;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public Date getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(Date arriveDate) {
		this.arriveDate = arriveDate;
	}

	public Date getLeftDate() {
		return leftDate;
	}

	public void setLeftDate(Date leftDate) {
		this.leftDate = leftDate;
	}

	public Integer getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Long getInstantConfirm() {
		return instantConfirm;
	}

	public void setInstantConfirm(Long instantConfirm) {
		this.instantConfirm = instantConfirm;
	}

	public String getPayStatusName() {
		return payStatusName;
	}

	public void setPayStatusName(String payStatusName) {
		this.payStatusName = payStatusName;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof RepeatAndLinkedOrderBo) {

			if (((RepeatAndLinkedOrderBo) obj).getOrderId().longValue() == this.orderId.longValue()) {
				return true;
			}
		}

		return false;
	}

	@Override
	public int compareTo(RepeatAndLinkedOrderBo o) {

		return (int) (this.getArriveDate().getTime() - o.getArriveDate().getTime());
	}

}
