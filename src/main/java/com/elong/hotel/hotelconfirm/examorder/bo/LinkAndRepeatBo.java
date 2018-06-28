package com.elong.hotel.hotelconfirm.examorder.bo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.elong.hotel.common.enums.ElongOrderStatusEnum;
import com.elong.hotel.proxy.javaorder.getorder.Guest;
import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月28日 上午8:59:03   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class LinkAndRepeatBo implements Serializable{

	/** 
	 * long LinkAndRepeatBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 订单ID
	 */
	private Integer orderId;
	
	/**
	 * 入住日期
	 */
	private String checkInDate;
	
	/**
	 * 离店日期
	 */
	private String checkOutDate;
	
	/**
	 * 酒店ID
	 */
	private String hotelId;
	
	/**
	 * 酒店名称
	 */
	private String hotelName;
	
	/**
	 * 来源
	 */
	private Integer originFrom;
	
	private Integer otaType;
	
	/**
	 * 代理ID
	 */
	private String proxyId;
	
	/**
	 * 服务名义
	 */
	private String serviceName;
	
	/**
	 * 房型
	 */
	private String roomTypeId;
	
	/**
	 * 房间名称
	 */
	private String roomTypeName;
	
	/**
	 * 房量
	 */
	private Integer roomCount;
	
	/**
	 * 订单状态
	 */
	private String status;
	
	/**
	 * 订单状态（中文显示名称）
	 */
	private String statusZn;
	
	/**
	 * 客人信息
	 */
	private List<GuestBo> guests;
	
	public LinkAndRepeatBo(){
		super();
	}
	
	public LinkAndRepeatBo(Order order){
		super();
		this.orderId = order.getOrderId().intValue();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.checkInDate = sdf.format(order.getCheckInDate());
		this.checkOutDate = sdf.format(order.getCheckOutDate());
		this.hotelId = order.getHotelId();
		this.originFrom = order.getOriginFrom();
		this.otaType = order.getOtaType();
		this.proxyId = order.getProxy();
		this.roomTypeId = order.getRoomTypeId();
		this.roomTypeName = order.getRoomTypeName();
		this.roomCount = order.getRoomCount();
		this.status = order.getStatus();
		this.statusZn = ElongOrderStatusEnum.getDescriptionByStatus(order.getStatus());
		if(order.getGuests() != null && order.getGuests().size() != 0){
			this.guests = new ArrayList<>();
			GuestBo bo = null;
			for(Guest guest : order.getGuests()){
				bo = new GuestBo();
				bo.setGuestName(guest.getName());
				bo.setGuestSex(guest.getSex());
				guests.add(bo);
			}
			
		}
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public Integer getOriginFrom() {
		return originFrom;
	}

	public void setOriginFrom(Integer originFrom) {
		this.originFrom = originFrom;
	}

	public Integer getOtaType() {
		return otaType;
	}

	public void setOtaType(Integer otaType) {
		this.otaType = otaType;
	}

	public String getProxyId() {
		return proxyId;
	}

	public void setProxyId(String proxyId) {
		this.proxyId = proxyId;
	}

	public String getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<GuestBo> getGuests() {
		return guests;
	}

	public void setGuests(List<GuestBo> guests) {
		this.guests = guests;
	}

	public Integer getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getStatusZn() {
		return statusZn;
	}

	public void setStatusZn(String statusZn) {
		this.statusZn = statusZn;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
}
