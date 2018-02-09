package com.elong.hotel.hotelconfirm.examorder.bo;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.examorder.po.ExamOrderPo;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;
import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.util.Date;

public class ExamOrderBo extends CompareEntityBase {

	private Integer reserNo;
	private String reserStatus;
	private Integer mod;
	private Date arriveDate;
	private Date leaveDate;
	private Date timeEarly;
	private Date timeLate;
	private int roomNum;
	private int nightNum;
	private int orderMoney;
	private Long cardNo;
	private String hotelId;
	private String hotelName;
	private String supplierId;
	private String supplierName;
	private int hotelStar;
	private String supplierType;
	private String supplierOtaType;
	private String proxyId;
	private String cityId;
	private Integer distance;
	private Integer confirmType;
	private Date bookingTime;
	private Date amendTime;
	private Integer priority;
	private Integer groupId;
	private String staffName;
	private Date distributeTime;
	private Integer isFaxReturn;
	private Integer isLinked;
	private Integer urge;
	private Date respiteTime;
	private Date enterTime;

	private Date orderTimestamp;

	private String reserStatus2End;
	private String ratePlanId;
	private Long additionalStatus;

	private String note2Elong;
	private String note2Hotel;
	private String note2Client;
	private String confirmNo;
	private String delayReason;
	private Integer isChangeOrder;

	private int ordertype;
	private int ispms;
	private int isconfirm;
	private int ish;

	public ExamOrderBo() {
	}


	public ExamOrderBo(ExamOrderPo po) {
	}

	public ExamOrderBo(Order order,ExamOrderPo po,OperatorInfoBo operator) {
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public String getReserStatus() {
		return reserStatus;
	}

	public void setReserStatus(String reserStatus) {
		this.reserStatus = reserStatus;
	}

	public Integer getMod() {
		return mod;
	}

	public void setMod(Integer mod) {
		this.mod = mod;
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

	public Date getTimeEarly() {
		return timeEarly;
	}

	public void setTimeEarly(Date timeEarly) {
		this.timeEarly = timeEarly;
	}

	public Date getTimeLate() {
		return timeLate;
	}

	public void setTimeLate(Date timeLate) {
		this.timeLate = timeLate;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public int getNightNum() {
		return nightNum;
	}

	public void setNightNum(int nightNum) {
		this.nightNum = nightNum;
	}

	public int getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(int orderMoney) {
		this.orderMoney = orderMoney;
	}

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
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

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public int getHotelStar() {
		return hotelStar;
	}

	public void setHotelStar(int hotelStar) {
		this.hotelStar = hotelStar;
	}

	public String getSupplierType() {
		return supplierType;
	}

	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}

	public String getSupplierOtaType() {
		return supplierOtaType;
	}

	public void setSupplierOtaType(String supplierOtaType) {
		this.supplierOtaType = supplierOtaType;
	}

	public String getProxyId() {
		return proxyId;
	}

	public void setProxyId(String proxyId) {
		this.proxyId = proxyId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Integer getConfirmType() {
		return confirmType;
	}

	public void setConfirmType(Integer confirmType) {
		this.confirmType = confirmType;
	}

	public Date getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}

	public Date getAmendTime() {
		return amendTime;
	}

	public void setAmendTime(Date amendTime) {
		this.amendTime = amendTime;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Date getDistributeTime() {
		return distributeTime;
	}

	public void setDistributeTime(Date distributeTime) {
		this.distributeTime = distributeTime;
	}

	public Integer getIsFaxReturn() {
		return isFaxReturn;
	}

	public void setIsFaxReturn(Integer isFaxReturn) {
		this.isFaxReturn = isFaxReturn;
	}

	public Integer getIsLinked() {
		return isLinked;
	}

	public void setIsLinked(Integer isLinked) {
		this.isLinked = isLinked;
	}

	public Integer getUrge() {
		return urge;
	}

	public void setUrge(Integer urge) {
		this.urge = urge;
	}

	public Date getRespiteTime() {
		return respiteTime;
	}

	public void setRespiteTime(Date respiteTime) {
		this.respiteTime = respiteTime;
	}

	public Date getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}

	public Date getOrderTimestamp() {
		return orderTimestamp;
	}

	public void setOrderTimestamp(Date orderTimestamp) {
		this.orderTimestamp = orderTimestamp;
	}

	public String getReserStatus2End() {
		return reserStatus2End;
	}

	public void setReserStatus2End(String reserStatus2End) {
		this.reserStatus2End = reserStatus2End;
	}

	public String getRatePlanId() {
		return ratePlanId;
	}

	public void setRatePlanId(String ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	public Long getAdditionalStatus() {
		return additionalStatus;
	}

	public void setAdditionalStatus(Long additionalStatus) {
		this.additionalStatus = additionalStatus;
	}

	public String getNote2Elong() {
		return note2Elong;
	}

	public void setNote2Elong(String note2Elong) {
		this.note2Elong = note2Elong;
	}

	public String getNote2Hotel() {
		return note2Hotel;
	}

	public void setNote2Hotel(String note2Hotel) {
		this.note2Hotel = note2Hotel;
	}

	public String getNote2Client() {
		return note2Client;
	}

	public void setNote2Client(String note2Client) {
		this.note2Client = note2Client;
	}

	public String getConfirmNo() {
		return confirmNo;
	}

	public void setConfirmNo(String confirmNo) {
		this.confirmNo = confirmNo;
	}

	public String getDelayReason() {
		return delayReason;
	}

	public void setDelayReason(String delayReason) {
		this.delayReason = delayReason;
	}

	public Integer getIsChangeOrder() {
		return isChangeOrder;
	}

	public void setIsChangeOrder(Integer isChangeOrder) {
		this.isChangeOrder = isChangeOrder;
	}

	public int getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(int ordertype) {
		this.ordertype = ordertype;
	}

	public int getIspms() {
		return ispms;
	}

	public void setIspms(int ispms) {
		this.ispms = ispms;
	}

	public int getIsconfirm() {
		return isconfirm;
	}

	public void setIsconfirm(int isconfirm) {
		this.isconfirm = isconfirm;
	}

	public int getIsh() {
		return ish;
	}

	public void setIsh(int ish) {
		this.ish = ish;
	}
}
