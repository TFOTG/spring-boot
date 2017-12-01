/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmorder.po.PendingConfirmOrderPo.java]
 * Createion [2017年6月27日]
 */
package com.elong.hotel.hotelconfirm.confirmorder.po;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.elong.hotel.proxy.javaorder.getorder.Guest;
import com.elong.hotel.proxy.javaorder.getorder.OrderVouchRule;
import com.elong.hotel.proxy.javaorder.getorder.RoomNight;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class PendingConfirmOrderPo {

	/**
	 * 订单号
	 */
	private Integer reserno;

	/**
	 * 订单状态
	 */
	private String reserstatus;

	/**
	 * 到店时间
	 */
	private String arrivedate;

	/**
	 * 离店时间
	 */
	private String leavedate;

	/**
	 * 最早到店时间
	 */
	private String timeearly;

	/**
	 * 最晚到店时间
	 */
	private String timelate;

	/**
	 * 酒店id
	 */
	private String hotelid;

	private String mhotelId;
	/**
	 * 供应商id
	 */
	private Integer supplierid;

	/**
	 * eb策略id
	 */
	private int ebkstrategyid;

	/**
	 * 承诺时间
	 */
	private String promisetime;

	/**
	 * 暂缓时间
	 */
	private String respitetime;

	/**
	 * 获取时间
	 */
	private String distributetime;

	/**
	 * 给酒店的备注
	 */
	private String notesToHotel;

	/**
	 * 给客人的备注
	 */
	private String notesToGuest;

	/**
	 * 艺龙内部备注
	 */
	private String notesToElong;

	/**
	 * 是否直签
	 */
	private Integer cooperationType;

	/**
	 * 订单支付类型
	 */
	private Long additionalStatus;

	/**
	 * 确认号
	 */
	private String confirmNo;

	/**
	 * 房型
	 */
	private String roomTypeName;

	private String roomTypeId;

	/**
	 * 房量
	 */
	private int roomCount;

	/**
	 * 支付类型
	 */
	private String payment;

	/**
	 * 支付类型
	 */
	private List<Guest> guests;

	/**
	 * 早餐
	 */
	private String roomNightBreakfastCount;

	/**
	 * 总价格
	 */
	private BigDecimal sumPrice;

	/**
	 * 总花费
	 */
	private BigDecimal sumCost;

	/**
	 * 联系电话
	 */
	private String contactPhone;

	/**
	 * 联系手机
	 */
	private String contactMobile;

	/**
	 * 预定人
	 */
	private String createName;

	/**
	 * 创建时间
	 */
	private String createTime;

	/**
	 * 货币
	 */
	private String currencyCode;
	/**
	 * 最后一次已申时间
	 */
	private String amendtime;

	/**
	 * 房间信息
	 */
	private List<RoomNight> roomNights;
	/**
	 * 订单图标
	 */
	private PendingOrderIconPo pendingOrderIconPo;

	private Date checkInDate;
	private Date checkOutDate;
	private String ratePlanId;
	/**
	 * 供应商订单号
	 */
	private String cooperationOrderId;

	/**
	 * 代理id
	 */
	private String proxy;

	/**
	 * 担保信息
	 */
	private OrderVouchRule baseVouchRule;

	/**
	 * 新订单（新担保）：1，旧订单：0
	 */
	private int orderType;

	public PendingOrderIconPo getPendingOrderIconPo() {
		return pendingOrderIconPo;
	}

	public void setPendingOrderIconPo(PendingOrderIconPo pendingOrderIconPo) {
		this.pendingOrderIconPo = pendingOrderIconPo;
	}

	public Integer getReserno() {
		return reserno;
	}

	public void setReserno(Integer reserno) {
		this.reserno = reserno;
	}

	public String getReserstatus() {
		return reserstatus;
	}

	public void setReserstatus(String reserstatus) {
		this.reserstatus = reserstatus;
	}

	public String getArrivedate() {
		return arrivedate;
	}

	public void setArrivedate(String arrivedate) {
		this.arrivedate = arrivedate;
	}

	public String getLeavedate() {
		return leavedate;
	}

	public void setLeavedate(String leavedate) {
		this.leavedate = leavedate;
	}

	public String getTimeearly() {
		return timeearly;
	}

	public void setTimeearly(String timeearly) {
		this.timeearly = timeearly;
	}

	public String getTimelate() {
		return timelate;
	}

	public void setTimelate(String timelate) {
		this.timelate = timelate;
	}

	public String getHotelid() {
		return hotelid;
	}

	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}

	public Integer getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}

	public int getEbkstrategyid() {
		return ebkstrategyid;
	}

	public void setEbkstrategyid(int ebkstrategyid) {
		this.ebkstrategyid = ebkstrategyid;
	}

	public String getPromisetime() {
		return promisetime;
	}

	public void setPromisetime(String promisetime) {
		this.promisetime = promisetime;
	}

	public String getRespitetime() {
		return respitetime;
	}

	public void setRespitetime(String respitetime) {
		this.respitetime = respitetime;
	}

	public String getDistributetime() {
		return distributetime;
	}

	public void setDistributetime(String distributetime) {
		this.distributetime = distributetime;
	}

	public String getNotesToHotel() {
		return notesToHotel;
	}

	public void setNotesToHotel(String notesToHotel) {
		this.notesToHotel = notesToHotel;
	}

	public String getNotesToGuest() {
		return notesToGuest;
	}

	public void setNotesToGuest(String notesToGuest) {
		this.notesToGuest = notesToGuest;
	}

	public String getNotesToElong() {
		return notesToElong;
	}

	public void setNotesToElong(String notesToElong) {
		this.notesToElong = notesToElong;
	}

	public Integer getCooperationType() {
		return cooperationType;
	}

	public void setCooperationType(Integer cooperationType) {
		this.cooperationType = cooperationType;
	}

	public Long getAdditionalStatus() {
		return additionalStatus;
	}

	public void setAdditionalStatus(Long additionalStatus) {
		this.additionalStatus = additionalStatus;
	}

	public String getConfirmNo() {
		return confirmNo;
	}

	public void setConfirmNo(String confirmNo) {
		this.confirmNo = confirmNo;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

	public String getRoomNightBreakfastCount() {
		return roomNightBreakfastCount;
	}

	public void setRoomNightBreakfastCount(String roomNightBreakfastCount) {
		this.roomNightBreakfastCount = roomNightBreakfastCount;
	}

	public BigDecimal getSumPrice() {
		return sumPrice;
	}

	public void setSumPrice(BigDecimal sumPrice) {
		this.sumPrice = sumPrice;
	}

	public BigDecimal getSumCost() {
		return sumCost;
	}

	public void setSumCost(BigDecimal sumCost) {
		this.sumCost = sumCost;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactMobile() {
		return contactMobile;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getAmendtime() {
		return amendtime;
	}

	public void setAmendtime(String amendtime) {
		this.amendtime = amendtime;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getRatePlanId() {
		return ratePlanId;
	}

	public void setRatePlanId(String ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	public List<RoomNight> getRoomNights() {
		return roomNights;
	}

	public void setRoomNights(List<RoomNight> roomNights) {
		this.roomNights = roomNights;
	}

	public String getMhotelId() {
		return mhotelId;
	}

	public void setMhotelId(String mhotelId) {
		this.mhotelId = mhotelId;
	}

	public String getRoomTypeId() {
		return roomTypeId;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getCooperationOrderId() {
		return cooperationOrderId;
	}

	public void setCooperationOrderId(String cooperationOrderId) {
		this.cooperationOrderId = cooperationOrderId;
	}

	public String getProxy() {
		return proxy;
	}

	public void setProxy(String proxy) {
		this.proxy = proxy;
	}

	public OrderVouchRule getBaseVouchRule() {
		return baseVouchRule;
	}

	public void setBaseVouchRule(OrderVouchRule baseVouchRule) {
		this.baseVouchRule = baseVouchRule;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

}
