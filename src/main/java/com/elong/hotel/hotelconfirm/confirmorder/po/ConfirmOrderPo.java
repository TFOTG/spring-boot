package com.elong.hotel.hotelconfirm.confirmorder.po;

import java.util.Date;

import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmOrderBo;

/**
 * Created by yangboyu on 17/4/6.
 */
public class ConfirmOrderPo {
    private long id;
    private Integer reserNo;
    private String reserStatus;
    private Integer mod;
    private Long cardNo;
    private Date arriveDate;
    private Date leaveDate;
    private Date timeEarly;
    private Date timeLate;
    private String hotelId;
    private String hotelName;
    private String supplierId;
    private String supplierName;
    private String supplierType;
    private String supplierOtaType;
    private String proxyId;
    private String cityId;
    private Integer distance;
    private Integer confirmType;
    //预定时间、订单创建时间
    private Date bookingTime;
    //最后一次已审时间
    private Date amendTime;
    private Integer priority;
    private Integer groupId;
    private Integer rankId;
    private Integer ebkStrategyId;
    private String staffName;
    //员工获取时间
    private Date distributeTime;
    private Date promiseTime;
    private Integer promiseChangeTimes;
    private Integer isFaxReturn;
    private Integer isLinked;
    private Integer urge;
    private Date respiteTime;
    private Date nextServiceTime;
    private String ivrGuid;
    private Integer ivrStatus;
    private Date ivrStartTime;
    private Date enterTime;
    //员工可获取时间
    private Date sortTime;
    private Date defaultSortTime;
    private Date firstRefusedTime;
    private Integer isEbRefuse;
    private Integer isChangeOrder;

    private Long orderTimestampLong;

    private String fullRoomRates;
    
    public ConfirmOrderPo() {
    }

    public ConfirmOrderPo(ConfirmOrderBo bo) {
        this.reserNo = bo.getReserNo();
        this.reserStatus = bo.getReserStatus();
        this.cardNo = bo.getCardNo();
        this.mod = bo.getMod();
        this.arriveDate = bo.getArriveDate();
        this.leaveDate = bo.getLeaveDate();
        this.timeEarly = bo.getTimeEarly();
        this.timeLate = bo.getTimeLate();
        this.hotelId = bo.getHotelId();
        this.hotelName = bo.getHotelName();
        this.supplierId = bo.getSupplierId();
        this.supplierName = bo.getSupplierName();
        this.supplierType = bo.getSupplierType();
        this.supplierOtaType = bo.getSupplierOtaType();
        this.proxyId = bo.getProxyId();
        this.cityId = bo.getCityId();
        this.distance = bo.getDistance();
        this.confirmType = bo.getConfirmType();
        this.bookingTime = bo.getBookingTime();
        this.amendTime = bo.getAmendTime();
        this.priority = bo.getPriority();
        this.groupId = bo.getGroupId();
        this.rankId = bo.getRankId();
        this.ebkStrategyId = bo.getEbkStrategyId();
        this.staffName = bo.getStaffName();
        this.distributeTime = bo.getDistributeTime();
        this.promiseTime = bo.getPromiseTime();
        this.promiseChangeTimes = bo.getPromiseChangeTimes();
        this.isFaxReturn = bo.getIsFaxReturn();
        this.isLinked = bo.getIsLinked();
        this.isEbRefuse = bo.getIsEbRefuse();
        this.urge = bo.getUrge();
        this.respiteTime = bo.getRespiteTime();
        this.nextServiceTime = bo.getNextServiceTime();
        this.ivrGuid = bo.getIvrGuid();
        this.ivrStatus = bo.getIvrStatus();
        this.ivrStartTime = bo.getIvrStartTime();
        this.enterTime = bo.getEnterTime();
        this.sortTime = bo.getSortTime();
        this.defaultSortTime = bo.getDefaultSortTime();
        this.firstRefusedTime = bo.getFirstRefusedTime();
        this.isChangeOrder=bo.getIsChangeOrder();
        this.orderTimestampLong = bo.getOrderTimestamp().getTime();

    }

    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }

    public Date getAmendTime() {
        return amendTime;
    }

    public void setAmendTime(Date amendTime) {
        this.amendTime = amendTime;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Integer getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(Integer confirmType) {
        this.confirmType = confirmType;
    }

    public Date getDefaultSortTime() {
        return defaultSortTime;
    }

    public void setDefaultSortTime(Date defaultSortTime) {
        this.defaultSortTime = defaultSortTime;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Date getDistributeTime() {
        return distributeTime;
    }

    public void setDistributeTime(Date distributeTime) {
        this.distributeTime = distributeTime;
    }

    public Integer getEbkStrategyId() {
        return ebkStrategyId;
    }

    public void setEbkStrategyId(Integer ebkStrategyId) {
        this.ebkStrategyId = ebkStrategyId;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    public Date getFirstRefusedTime() {
        return firstRefusedTime;
    }

    public void setFirstRefusedTime(Date firstRefusedTime) {
        this.firstRefusedTime = firstRefusedTime;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Integer getIsEbRefuse() {
        return isEbRefuse;
    }

    public void setIsEbRefuse(Integer isEbRefuse) {
        this.isEbRefuse = isEbRefuse;
    }

    public String getIvrGuid() {
        return ivrGuid;
    }

    public void setIvrGuid(String ivrGuid) {
        this.ivrGuid = ivrGuid;
    }

    public Date getIvrStartTime() {
        return ivrStartTime;
    }

    public void setIvrStartTime(Date ivrStartTime) {
        this.ivrStartTime = ivrStartTime;
    }

    public Integer getIvrStatus() {
        return ivrStatus;
    }

    public void setIvrStatus(Integer ivrStatus) {
        this.ivrStatus = ivrStatus;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Integer getMod() {
        return mod;
    }

    public void setMod(Integer mod) {
        this.mod = mod;
    }

    public Date getNextServiceTime() {
        return nextServiceTime;
    }

    public void setNextServiceTime(Date nextServiceTime) {
        this.nextServiceTime = nextServiceTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPromiseChangeTimes() {
        return promiseChangeTimes;
    }

    public void setPromiseChangeTimes(Integer promiseChangeTimes) {
        this.promiseChangeTimes = promiseChangeTimes;
    }

    public Date getPromiseTime() {
        return promiseTime;
    }

    public void setPromiseTime(Date promiseTime) {
        this.promiseTime = promiseTime;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
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

    public Date getRespiteTime() {
        return respiteTime;
    }

    public void setRespiteTime(Date respiteTime) {
        this.respiteTime = respiteTime;
    }

    public Date getSortTime() {
        return sortTime;
    }

    public void setSortTime(Date sortTime) {
        this.sortTime = sortTime;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
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

    public String getSupplierOtaType() {
        return supplierOtaType;
    }

    public void setSupplierOtaType(String supplierOtaType) {
        this.supplierOtaType = supplierOtaType;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
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

    public Integer getUrge() {
        return urge;
    }

    public void setUrge(Integer urge) {
        this.urge = urge;
    }

    public Long getOrderTimestampLong() {
        return orderTimestampLong;
    }

    public void setOrderTimestampLong(Long orderTimestampLong) {
        this.orderTimestampLong = orderTimestampLong;
    }

    public Integer getIsChangeOrder() {
        return isChangeOrder;
    }

    public void setIsChangeOrder(Integer isChangeOrder) {
        this.isChangeOrder = isChangeOrder;
    }

	public String getFullRoomRates() {
		return fullRoomRates;
	}

	public void setFullRoomRates(String fullRoomRates) {
		this.fullRoomRates = fullRoomRates;
	}
    
}
