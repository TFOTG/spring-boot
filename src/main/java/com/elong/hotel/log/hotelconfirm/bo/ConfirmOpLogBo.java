package com.elong.hotel.log.hotelconfirm.bo;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.common.helper.StringUtils;
import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmOrderBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ConfirmType;
import com.elong.hotel.hotelconfirm.group.enums.DepartmentEnum;
import com.elong.hotel.log.hotelconfirm.enums.ConfirmOpType;

import java.util.Date;

/**
 * Created by peng.wang on 17/5/12.
 */
public class ConfirmOpLogBo {


    /**
     * 查询开始时间
     */
    private String startTime;

    /**
     * 查询结束时间
     */
    private String endTime;

    private Integer reserNo;

    private String hotelId;

    private String hotelName;

    private String supplierName;

    private String opType;

    private Date opDate;

    private String department;

    private Integer groupId;

    private Integer rankId;

    private Integer priority;

    private Integer ebkStrategyId;

    private String targetReserStatus;

    private String sourceReserStatus;

    private String auditFrom;

    private String shouldAuditFrom;

    private Long confirmType;

    private Long shouldConfirmType;

    private String staffName;

    private String operator;

    private Date ivrStartTime;

    private Date enterTime;

    private Date respiteTime;

    private Date sortTime;

    private Date defaultSortTime;

    private Date distributeTime;

    private Date nextServiceTime;

    private Date promiseTime;

    private Date firstRefusedTime;

    private Date bookingTime;

    private Date amendTime;

    public ConfirmOpLogBo(ConfirmOrderBo confirmOrderBo, ConfirmOpType confirmOpType, String targetReserStatus, OperatorInfoBo operator){
        this.reserNo = confirmOrderBo.getReserNo();
        this.hotelId = confirmOrderBo.getHotelId();
        this.hotelName = confirmOrderBo.getHotelName();
        this.supplierName = confirmOrderBo.getSupplierName();
        this.opType = confirmOpType.getKey();
        this.opDate = new Date();
        this.department = DepartmentEnum.Confirm.getKey() + "";
        this.groupId = confirmOrderBo.getGroupId();
        this.rankId = confirmOrderBo.getRankId();
        this.priority = confirmOrderBo.getPriority();
        this.ebkStrategyId = confirmOrderBo.getEbkStrategyId();
        this.sourceReserStatus = confirmOrderBo.getReserStatus();
        this.targetReserStatus = targetReserStatus;
        this.confirmType = getConfirmType(operator.getOperatorName());                                // 重复字段
        this.shouldConfirmType= confirmOrderBo.getConfirmType().longValue();        // 重复字段

        this.auditFrom = confirmOrderBo.getConfirmType() + "";                      // 重复字段
        this.shouldAuditFrom  = confirmOrderBo.getConfirmType() + "";               // 重复字段
        this.staffName = confirmOrderBo.getStaffName();
        this.operator = operator.getOperatorName();
        this.ivrStartTime = confirmOrderBo.getIvrStartTime();
        this.enterTime = confirmOrderBo.getEnterTime();
        this.respiteTime = confirmOrderBo.getRespiteTime();
        this.sortTime = confirmOrderBo.getSortTime();
        this.defaultSortTime = confirmOrderBo.getDefaultSortTime();
        this.distributeTime = confirmOrderBo.getDistributeTime();
        this.nextServiceTime = confirmOrderBo.getNextServiceTime();
        this.promiseTime = confirmOrderBo.getPromiseTime();
        this.firstRefusedTime = confirmOrderBo.getFirstRefusedTime();
        this.bookingTime = confirmOrderBo.getBookingTime();
        this.amendTime = confirmOrderBo.getAmendTime();
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
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
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
        this.department = department;
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
        this.targetReserStatus = targetReserStatus;
    }

    public String getSourceReserStatus() {
        return sourceReserStatus;
    }

    public void setSourceReserStatus(String sourceReserStatus) {
        this.sourceReserStatus = sourceReserStatus;
    }

    public String getAuditFrom() {
        return auditFrom;
    }

    public void setAuditFrom(String auditFrom) {
        this.auditFrom = auditFrom;
    }

    public String getShouldAuditFrom() {
        return shouldAuditFrom;
    }

    public void setShouldAuditFrom(String shouldAuditFrom) {
        this.shouldAuditFrom = shouldAuditFrom;
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
        this.staffName = staffName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public long getConfirmType(String staffName){
        long auditfrom = 0;
        if(StringUtils.isBlank(staffName)){
            auditfrom = ConfirmType.Manual.getKey();
        } else if(staffName.toLowerCase().indexOf("pmsautouser") > -1) {
            auditfrom = ConfirmType.DC.getKey();
        } else if(staffName.toLowerCase().endsWith("h") || staffName.toLowerCase().endsWith("m") || staffName.toLowerCase().endsWith("w")) {
            auditfrom = ConfirmType.EBooking.getKey();
        } else if(staffName.indexOf("去哪儿投放状态") > -1 || staffName.toLowerCase().indexOf("dc4qunar") > -1) {
            auditfrom = ConfirmType.Qunar.getKey();
        } else if(staffName.toLowerCase().indexOf("web") > -1) {
            auditfrom = ConfirmType.WEB.getKey();
        } else if(staffName.toLowerCase().indexOf("app") > -1) {
            auditfrom = ConfirmType.APP.getKey();
        } else if(staffName.toLowerCase().indexOf("ivr") > -1) {
            auditfrom = ConfirmType.IVR.getKey();
        } else if(staffName.indexOf("携程投放状态") > -1 || staffName.toLowerCase().indexOf("dc4ctrip") > -1) {
            auditfrom = ConfirmType.Ctrip.getKey();
        } else if(staffName.indexOf("短信上行任务") > -1 || staffName.toLowerCase().indexOf("sms") > -1){
            auditfrom = ConfirmType.ReviewSMS.getKey();
        } else if(staffName.toLowerCase().indexOf("autonoshowtask") > -1){
            auditfrom = ConfirmType.AutoNoshowTask.getKey();
        } else {
            auditfrom = ConfirmType.Manual.getKey();
        }

        return auditfrom;
    }
}
