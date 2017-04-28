package com.elong.hotel.hotelconfirm.confirmorder.po;

import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmOrderBo;

import java.util.Date;

/**
 * Created by yangboyu on 17/4/6.
 */
public class ConfirmOrderPo {
    private long id;
    private Integer reserNo;
    private String reserStatus;
    private Integer mod;
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
    private String confirmType;
    private Date bookingTime;
    private Date amendTime;
    private Integer priority;
    private Integer groupId;
    private Integer rankId;
    private Integer ebkStrategyId;
    private String staffName;
    private Date distributeTime;
    private Date promiseTime;
    private Integer promiseChangeTimes;
    private String isFaxReturn;
    private String isLinked;
    private String urge;
    private Date respiteTime;
    private Date nextServiceTime;
    private String ivrGuid;
    private String ivrStatus;
    private Date ivrStartTime;
    private Date enterTime;
    private Date sortTime;
    private Date defaultSortTime;
    private Date firstRefusedTime;
    private long orderTimeStampLong;

    public ConfirmOrderPo() {
    }

    public ConfirmOrderPo(ConfirmOrderBo bo) {
        this.reserNo = bo.getReserNo();
        this.reserStatus = bo.getReserStatus();
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

    public String getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(String confirmType) {
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

    public String getIsFaxReturn() {
        return isFaxReturn;
    }

    public void setIsFaxReturn(String isFaxReturn) {
        this.isFaxReturn = isFaxReturn;
    }

    public String getIsLinked() {
        return isLinked;
    }

    public void setIsLinked(String isLinked) {
        this.isLinked = isLinked;
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

    public String getIvrStatus() {
        return ivrStatus;
    }

    public void setIvrStatus(String ivrStatus) {
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

    public String getUrge() {
        return urge;
    }

    public void setUrge(String urge) {
        this.urge = urge;
    }

    public long getOrderTimeStampLong() {
        return orderTimeStampLong;
    }

    public void setOrderTimeStampLong(long orderTimeStampLong) {
        this.orderTimeStampLong = orderTimeStampLong;
    }
}
