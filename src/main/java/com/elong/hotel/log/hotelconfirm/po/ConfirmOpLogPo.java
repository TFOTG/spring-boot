package com.elong.hotel.log.hotelconfirm.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class ConfirmOpLogPo {
    private Long id;

    private Integer reserNo;

    private String hotelId;

    private String hotelName;

    private String supplierName;

    private Long cardNo;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date arriveDate;

    private String opType;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date opDate;

    private String department;

    private Integer groupId;

    private Integer rankId;

    private Integer priority;

    private Integer ebkStrategyId;

    private String targetReserStatus;

    private String sourceReserStatus;

    private Long confirmType;

    private Long shouldConfirmType;

    private String staffName;

    private String operator;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date ivrStartTime;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date enterTime;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date respiteTime;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date sortTime;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date defaultSortTime;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date distributeTime;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date nextServiceTime;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date promiseTime;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date firstRefusedTime;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date bookingTime;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date amendTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReserNo() {
        return reserNo;
    }

    public void setReserNo(Integer reserNo) {
        this.reserNo = reserNo;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId == null ? null : hotelId.trim();
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEbkStrategyId() {
        return ebkStrategyId;
    }

    public void setEbkStrategyId(Integer ebkStrategyId) {
        this.ebkStrategyId = ebkStrategyId;
    }

    public String getTargetReserStatus() {
        return targetReserStatus;
    }

    public void setTargetReserStatus(String targetReserStatus) {
        this.targetReserStatus = targetReserStatus == null ? null : targetReserStatus.trim();
    }

    public String getSourceReserStatus() {
        return sourceReserStatus;
    }

    public void setSourceReserStatus(String sourceReserStatus) {
        this.sourceReserStatus = sourceReserStatus == null ? null : sourceReserStatus.trim();
    }

    public Long getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(Long confirmType) {
        this.confirmType = confirmType;
    }

    public Long getShouldConfirmType() {
        return shouldConfirmType;
    }

    public void setShouldConfirmType(Long shouldConfirmType) {
        this.shouldConfirmType = shouldConfirmType;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getIvrStartTime() {
        return ivrStartTime;
    }

    public void setIvrStartTime(Date ivrStartTime) {
        this.ivrStartTime = ivrStartTime;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
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

    public Date getDefaultSortTime() {
        return defaultSortTime;
    }

    public void setDefaultSortTime(Date defaultSortTime) {
        this.defaultSortTime = defaultSortTime;
    }

    public Date getDistributeTime() {
        return distributeTime;
    }

    public void setDistributeTime(Date distributeTime) {
        this.distributeTime = distributeTime;
    }

    public Date getNextServiceTime() {
        return nextServiceTime;
    }

    public void setNextServiceTime(Date nextServiceTime) {
        this.nextServiceTime = nextServiceTime;
    }

    public Date getPromiseTime() {
        return promiseTime;
    }

    public void setPromiseTime(Date promiseTime) {
        this.promiseTime = promiseTime;
    }

    public Date getFirstRefusedTime() {
        return firstRefusedTime;
    }

    public void setFirstRefusedTime(Date firstRefusedTime) {
        this.firstRefusedTime = firstRefusedTime;
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ConfirmOpLogPo other = (ConfirmOpLogPo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReserNo() == null ? other.getReserNo() == null : this.getReserNo().equals(other.getReserNo()))
            && (this.getHotelId() == null ? other.getHotelId() == null : this.getHotelId().equals(other.getHotelId()))
            && (this.getHotelName() == null ? other.getHotelName() == null : this.getHotelName().equals(other.getHotelName()))
            && (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
            && (this.getOpType() == null ? other.getOpType() == null : this.getOpType().equals(other.getOpType()))
            && (this.getOpDate() == null ? other.getOpDate() == null : this.getOpDate().equals(other.getOpDate()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getRankId() == null ? other.getRankId() == null : this.getRankId().equals(other.getRankId()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getEbkStrategyId() == null ? other.getEbkStrategyId() == null : this.getEbkStrategyId().equals(other.getEbkStrategyId()))
            && (this.getTargetReserStatus() == null ? other.getTargetReserStatus() == null : this.getTargetReserStatus().equals(other.getTargetReserStatus()))
            && (this.getSourceReserStatus() == null ? other.getSourceReserStatus() == null : this.getSourceReserStatus().equals(other.getSourceReserStatus()))

            && (this.getConfirmType() == null ? other.getConfirmType() == null : this.getConfirmType().equals(other.getConfirmType()))
            && (this.getShouldConfirmType() == null ? other.getShouldConfirmType() == null : this.getShouldConfirmType().equals(other.getShouldConfirmType()))
            && (this.getStaffName() == null ? other.getStaffName() == null : this.getStaffName().equals(other.getStaffName()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getIvrStartTime() == null ? other.getIvrStartTime() == null : this.getIvrStartTime().equals(other.getIvrStartTime()))
            && (this.getEnterTime() == null ? other.getEnterTime() == null : this.getEnterTime().equals(other.getEnterTime()))
            && (this.getRespiteTime() == null ? other.getRespiteTime() == null : this.getRespiteTime().equals(other.getRespiteTime()))
            && (this.getSortTime() == null ? other.getSortTime() == null : this.getSortTime().equals(other.getSortTime()))
            && (this.getDefaultSortTime() == null ? other.getDefaultSortTime() == null : this.getDefaultSortTime().equals(other.getDefaultSortTime()))
            && (this.getDistributeTime() == null ? other.getDistributeTime() == null : this.getDistributeTime().equals(other.getDistributeTime()))
            && (this.getNextServiceTime() == null ? other.getNextServiceTime() == null : this.getNextServiceTime().equals(other.getNextServiceTime()))
            && (this.getPromiseTime() == null ? other.getPromiseTime() == null : this.getPromiseTime().equals(other.getPromiseTime()))
            && (this.getFirstRefusedTime() == null ? other.getFirstRefusedTime() == null : this.getFirstRefusedTime().equals(other.getFirstRefusedTime()))
            && (this.getBookingTime() == null ? other.getBookingTime() == null : this.getBookingTime().equals(other.getBookingTime()))
            && (this.getAmendTime() == null ? other.getAmendTime() == null : this.getAmendTime().equals(other.getAmendTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReserNo() == null) ? 0 : getReserNo().hashCode());
        result = prime * result + ((getHotelId() == null) ? 0 : getHotelId().hashCode());
        result = prime * result + ((getHotelName() == null) ? 0 : getHotelName().hashCode());
        result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
        result = prime * result + ((getOpType() == null) ? 0 : getOpType().hashCode());
        result = prime * result + ((getOpDate() == null) ? 0 : getOpDate().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getRankId() == null) ? 0 : getRankId().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getEbkStrategyId() == null) ? 0 : getEbkStrategyId().hashCode());
        result = prime * result + ((getTargetReserStatus() == null) ? 0 : getTargetReserStatus().hashCode());
        result = prime * result + ((getSourceReserStatus() == null) ? 0 : getSourceReserStatus().hashCode());

        result = prime * result + ((getConfirmType() == null) ? 0 : getConfirmType().hashCode());
        result = prime * result + ((getShouldConfirmType() == null) ? 0 : getShouldConfirmType().hashCode());
        result = prime * result + ((getStaffName() == null) ? 0 : getStaffName().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getIvrStartTime() == null) ? 0 : getIvrStartTime().hashCode());
        result = prime * result + ((getEnterTime() == null) ? 0 : getEnterTime().hashCode());
        result = prime * result + ((getRespiteTime() == null) ? 0 : getRespiteTime().hashCode());
        result = prime * result + ((getSortTime() == null) ? 0 : getSortTime().hashCode());
        result = prime * result + ((getDefaultSortTime() == null) ? 0 : getDefaultSortTime().hashCode());
        result = prime * result + ((getDistributeTime() == null) ? 0 : getDistributeTime().hashCode());
        result = prime * result + ((getNextServiceTime() == null) ? 0 : getNextServiceTime().hashCode());
        result = prime * result + ((getPromiseTime() == null) ? 0 : getPromiseTime().hashCode());
        result = prime * result + ((getFirstRefusedTime() == null) ? 0 : getFirstRefusedTime().hashCode());
        result = prime * result + ((getBookingTime() == null) ? 0 : getBookingTime().hashCode());
        result = prime * result + ((getAmendTime() == null) ? 0 : getAmendTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reserNo=").append(reserNo);
        sb.append(", hotelId=").append(hotelId);
        sb.append(", hotelName=").append(hotelName);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", opType=").append(opType);
        sb.append(", opDate=").append(opDate);
        sb.append(", department=").append(department);
        sb.append(", groupId=").append(groupId);
        sb.append(", rankId=").append(rankId);
        sb.append(", priority=").append(priority);
        sb.append(", ebkStrategyId=").append(ebkStrategyId);
        sb.append(", targetReserStatus=").append(targetReserStatus);
        sb.append(", sourceReserStatus=").append(sourceReserStatus);

        sb.append(", confirmType=").append(confirmType);
        sb.append(", shouldConfirmType=").append(shouldConfirmType);
        sb.append(", staffName=").append(staffName);
        sb.append(", operator=").append(operator);
        sb.append(", ivrStartTime=").append(ivrStartTime);
        sb.append(", enterTime=").append(enterTime);
        sb.append(", respiteTime=").append(respiteTime);
        sb.append(", sortTime=").append(sortTime);
        sb.append(", defaultSortTime=").append(defaultSortTime);
        sb.append(", distributeTime=").append(distributeTime);
        sb.append(", nextServiceTime=").append(nextServiceTime);
        sb.append(", promiseTime=").append(promiseTime);
        sb.append(", firstRefusedTime=").append(firstRefusedTime);
        sb.append(", bookingTime=").append(bookingTime);
        sb.append(", amendTime=").append(amendTime);
        sb.append("]");
        return sb.toString();
    }
}