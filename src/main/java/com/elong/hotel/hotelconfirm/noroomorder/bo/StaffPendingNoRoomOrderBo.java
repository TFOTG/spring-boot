package com.elong.hotel.hotelconfirm.noroomorder.bo;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.common.enums.ElongOrderStatusEnum;
import com.elong.hotel.hotelconfirm.noroomorder.enums.NoRoomEbStatusEnum;
import com.elong.hotel.hotelconfirm.noroomorder.enums.NoRoomIVRStatusEnum;
import com.elong.hotel.hotelconfirm.noroomorder.po.NoRoomOrderPo;

/**
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年9月7日 上午9:27:21   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class StaffPendingNoRoomOrderBo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Long noRoomOrderId;

	/**
	 * 订单ID
	 */
	private Integer orderId;

	/**
	 * 酒店ID
	 */
	private String hotelId;

	/**
	 * 酒店名称
	 */
	private String hotelName;

	/**
	 * 酒店电话
	 */
	private String hotelPhone;

	/**
	 * 订单状态
	 */
	private String orderStatus;

	/**
	 * 订状态名称
	 */
	private String orderStatusName;

	/**
	 * 到店日期
	 */
	@JSONField(format = "yyyy-MM-dd")
	private Date arriveDate;

	/**
	 * 离店日期
	 */
	@JSONField(format = "yyyy-MM-dd")
	private Date leaveDate;

	/**
	 * 房型
	 */
	private String roomTypeName;

	/**
	 * 房量
	 */
	private Integer roomCount;

	/**
	 * EB处理状态
	 */
	private String EBStatus;

	/**
	 * IVR处理状态
	 */
	private String ivrStatusName;

	/**
	 * 是否马上到店
	 */
	private Integer immdiately;

	public StaffPendingNoRoomOrderBo() {
		super();
	}

	public StaffPendingNoRoomOrderBo(NoRoomOrderPo po) {
		super();
		this.noRoomOrderId = po.getId();
		this.orderId = po.getReserNo();
		this.hotelId = po.getHotelId();
		this.hotelName = po.getHotelName();
		this.hotelPhone = po.getHotelPhone();
		this.orderStatus = po.getReserStatus();
		this.orderStatusName = ElongOrderStatusEnum.getDescriptionByStatus(po.getReserStatus());
		this.arriveDate = po.getArriveDate();
		this.leaveDate = po.getLeaveDate();
		this.EBStatus = NoRoomEbStatusEnum.getDescByStatus(po.getEbookingStatus());
		this.ivrStatusName = NoRoomIVRStatusEnum.getDescByStatus(po.getIvrStatus());
		this.immdiately = po.getImmediately();
	}

	public Long getNoRoomOrderId() {
		return noRoomOrderId;
	}

	public void setNoRoomOrderId(Long noRoomOrderId) {
		this.noRoomOrderId = noRoomOrderId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelPhone() {
		return hotelPhone;
	}

	public void setHotelPhone(String hotelPhone) {
		this.hotelPhone = hotelPhone;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusName() {
		return orderStatusName;
	}

	public void setOrderStatusName(String orderStatusName) {
		this.orderStatusName = orderStatusName;
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

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public Integer getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
	}

	public String getEBStatus() {
		return EBStatus;
	}

	public void setEBStatus(String eBStatus) {
		EBStatus = eBStatus;
	}

	public String getIvrStatusName() {
		return ivrStatusName;
	}

	public void setIvrStatusName(String ivrStatusName) {
		this.ivrStatusName = ivrStatusName;
	}

	public Integer getImmdiately() {
		return immdiately;
	}

	public void setImmdiately(Integer immdiately) {
		this.immdiately = immdiately;
	}

}
