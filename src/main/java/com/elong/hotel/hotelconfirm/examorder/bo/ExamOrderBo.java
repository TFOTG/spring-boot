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
	private double orderMoney;
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
	private Date respiteTime;
	private Date enterTime;
	private Date orderTimestamp;
	private int ordertype;
	private int ispms;
	private int isconfirm;
	private int ish;
	private int isrepeat;
	private int isimmediately;
	private int isnew;
	private String phone;
	//客人app选择马上到点(&OrderFlagConst.IS_ARRIVE_NOW_ORDER=1024)
	private boolean userChoiceUrge4App;

	public ExamOrderBo() {
	}


	public ExamOrderBo(ExamOrderPo po) {
		this.setExamOrder(po);
	}

	public ExamOrderBo(Order order,ExamOrderPo po,OperatorInfoBo operator) {
		if(order != null && po != null){
			this.setExamOrder(po);
			this.amendTime = operator.getOperatorTime();

		}else if(order != null && po == null){

		}else if(order == null && po != null){
			this.setExamOrder(po);
		}
	}

	public void setExamOrder(ExamOrderPo po){
		this.reserNo = po.getReserNo();
		this.reserStatus = po.getReserStatus();
		this.mod = po.getMod();
		this.arriveDate = po.getArriveDate();
		this.leaveDate = po.getLeaveDate();
		this.timeEarly = po.getTimeEarly();
		this.timeLate = po.getTimeLate();
		this.roomNum = po.getRoomNum();
		this.nightNum = po.getNightNum();
		this.orderMoney = po.getOrderMoney().doubleValue();
		this.cardNo = po.getCardNo();
		this.hotelId = po.getHotelId();
		this.hotelName = po.getHotelName();
		this.hotelStar = po.getHotelStar();
		this.supplierId = po.getSupplierId();
		this.supplierName = po.getSupplierName();
		this.supplierType = po.getSupplierType();
		this.supplierOtaType = po.getSupplierOtaType();
		this.proxyId = po.getProxyId();
		this.cityId = po.getCityId();
		this.distance = po.getDistance();
		this.bookingTime = po.getBookingTime();
		this.amendTime = po.getAmendTime();
		this.priority = po.getPriority();
		this.groupId = po.getGroupId();
		this.staffName = po.getStaffName();
		this.distributeTime = po.getDistributeTime();
		this.isFaxReturn = po.getIsfaxReturn();
		this.isLinked = po.getIsLinked();
		this.respiteTime = po.getRespiteTime();
		this.enterTime = po.getEnterTime();
		this.orderTimestamp = new Date(po.getOrderTimeStampLong());
		this.ordertype = po.getOrderType();
		this.ispms = po.getIsPms();
		this.isconfirm = po.getIsConfirm();
		this.ish = po.getIsH();
		this.isrepeat = po.getIsRepeat();
		this.isimmediately = po.getIsImmediately();
		this.isnew = po.getIsNew();
		this.phone = po.getPhone();
		this.ordertype = po.getOrderType();
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

	public double getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(double orderMoney) {
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


	public int getIsrepeat() {
		return isrepeat;
	}


	public void setIsrepeat(int isrepeat) {
		this.isrepeat = isrepeat;
	}


	public int getIsimmediately() {
		return isimmediately;
	}


	public void setIsimmediately(int isimmediately) {
		this.isimmediately = isimmediately;
	}


	public int getIsnew() {
		return isnew;
	}


	public void setIsnew(int isnew) {
		this.isnew = isnew;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}



    public boolean getUserChoiceUrge4App() {
        return userChoiceUrge4App;
    }

    public void setUserChoiceUrge4App(boolean userChoiceUrge4App) {
        this.userChoiceUrge4App = userChoiceUrge4App;
    }

	@Override
	public String toString() {
		return "ExamOrderBo [reserNo=" + reserNo + ", reserStatus=" + reserStatus + ", mod=" + mod + ", arriveDate=" + arriveDate
				+ ", leaveDate=" + leaveDate + ", timeEarly=" + timeEarly + ", timeLate=" + timeLate + ", roomNum=" + roomNum
				+ ", nightNum=" + nightNum + ", orderMoney=" + orderMoney + ", cardNo=" + cardNo + ", hotelId=" + hotelId + ", hotelName="
				+ hotelName + ", supplierId=" + supplierId + ", supplierName=" + supplierName + ", hotelStar=" + hotelStar
				+ ", supplierType=" + supplierType + ", supplierOtaType=" + supplierOtaType + ", proxyId=" + proxyId + ", cityId=" + cityId
				+ ", distance=" + distance + ", confirmType=" + confirmType + ", bookingTime=" + bookingTime + ", amendTime=" + amendTime
				+ ", priority=" + priority + ", groupId=" + groupId + ", staffName=" + staffName + ", distributeTime=" + distributeTime
				+ ", isFaxReturn=" + isFaxReturn + ", isLinked=" + isLinked + ", respiteTime=" + respiteTime + ", enterTime=" + enterTime
				+ ", orderTimestamp=" + orderTimestamp + ", ordertype=" + ordertype + ", ispms=" + ispms + ", isconfirm=" + isconfirm
				+ ", ish=" + ish + ", isrepeat=" + isrepeat + ", isimmediately=" + isimmediately + ", isnew=" + isnew + ", phone=" + phone
				+ "]";
	}


}
