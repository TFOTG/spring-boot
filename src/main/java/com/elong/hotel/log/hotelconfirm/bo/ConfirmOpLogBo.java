package com.elong.hotel.log.hotelconfirm.bo;

import java.util.Date;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.common.config.FullRoomRateConfig;
import com.elong.hotel.common.helper.ConfigurationManager;
import com.elong.hotel.common.helper.StringUtils;
import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmOrderBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ConfirmType;
import com.elong.hotel.hotelconfirm.confirmorder.po.ConfirmOrderPo;
import com.elong.hotel.hotelconfirm.examorder.bo.ExamOrderBo;
import com.elong.hotel.hotelconfirm.group.enums.DepartmentEnum;
import com.elong.hotel.log.hotelconfirm.enums.ConfirmOpType;

/**
 * Created by peng.wang on 17/5/12.
 */
public class ConfirmOpLogBo {

    /**
     * 所查数据库名称（有可能查归档库）
     */
    private String logDBName;

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

    private Long cardNo;

    private Date arriveDate;

    private String opType;

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

    /**
     * 预测满房概率
     */
    private String fullRoomRates;
    
    public ConfirmOpLogBo(ConfirmOrderBo confirmOrderBo, ConfirmOpType confirmOpType, String preReserStatus, String targetReserStatus, OperatorInfoBo operator) {
        this.reserNo = confirmOrderBo.getReserNo();
        this.hotelId = confirmOrderBo.getHotelId();
        this.hotelName = confirmOrderBo.getHotelName();
        this.supplierName = confirmOrderBo.getSupplierName();
        this.cardNo = confirmOrderBo.getCardNo();
        this.arriveDate = confirmOrderBo.getTimeEarly();
        this.opType = confirmOpType.getKey()+"";
        this.opDate = new Date();
        this.department = DepartmentEnum.Confirm.getKey() + "";
        this.groupId = confirmOrderBo.getGroupId();
        this.rankId = confirmOrderBo.getRankId();
        this.priority = confirmOrderBo.getPriority();
        this.ebkStrategyId = confirmOrderBo.getEbkStrategyId();
        this.sourceReserStatus = confirmOpType.equals(ConfirmOpType.STORAGE_IN) ? preReserStatus : confirmOrderBo.getReserStatus();
        this.targetReserStatus = targetReserStatus;
        this.confirmType = getConfirmType(operator.getOperatorName());                                // 重复字段
        this.shouldConfirmType = confirmOrderBo.getConfirmType().longValue();        // 重复字段

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
        FullRoomRateConfig fullRoomRateConfig = ConfigurationManager.getHotSwitchConfig("FullRoomRateConfig", FullRoomRateConfig.class);
        this.fullRoomRates = confirmOrderBo.getFullRoomRate() + "," + fullRoomRateConfig.getMinrate() + "," + fullRoomRateConfig.getMaxrate() + "," + fullRoomRateConfig.getEnable();
    }

    public ConfirmOpLogBo(ConfirmOrderPo po,DepartmentEnum departmentEnum, ConfirmOpType confirmOpType, String operator) {
        this.reserNo = po.getReserNo();
        this.hotelId = po.getHotelId();
        this.hotelName = po.getHotelName();
        this.supplierName = po.getSupplierName();
        this.opType = confirmOpType.getKey()+"";
        this.department = departmentEnum.getKey()+"";
        this.groupId = po.getGroupId();
        this.rankId = po.getRankId();
        this.priority = po.getPriority();
        this.ebkStrategyId = po.getEbkStrategyId();
        this.sourceReserStatus = po.getReserStatus();
        this.targetReserStatus = po.getReserStatus();
        this.confirmType = po.getConfirmType().longValue();              // 重复字段
        this.shouldConfirmType = po.getConfirmType().longValue();        // 重复字段
        this.cardNo = po.getCardNo();
        this.arriveDate = po.getTimeEarly();
        this.staffName = po.getStaffName();
        this.operator = operator;
        this.ivrStartTime = po.getIvrStartTime();
        this.enterTime = po.getEnterTime();
        this.respiteTime = po.getRespiteTime();
        this.sortTime = po.getSortTime();
        this.defaultSortTime = po.getDefaultSortTime();
        this.distributeTime = po.getDistributeTime();
        this.nextServiceTime = po.getNextServiceTime();
        this.promiseTime = po.getPromiseTime();
        this.firstRefusedTime = po.getFirstRefusedTime();
        this.bookingTime = po.getBookingTime();
        this.amendTime = po.getAmendTime();
        FullRoomRateConfig fullRoomRateConfig = ConfigurationManager.getHotSwitchConfig("FullRoomRateConfig", FullRoomRateConfig.class);
        this.fullRoomRates = po.getFullRoomRates() + "," + fullRoomRateConfig.getMinrate() + "," + fullRoomRateConfig.getMaxrate() + "," + fullRoomRateConfig.getEnable();
    }



    public ConfirmOpLogBo(ExamOrderBo confirmOrderBo, ConfirmOpType confirmOpType, String preReserStatus, String targetReserStatus, OperatorInfoBo operator) {
        this.reserNo = confirmOrderBo.getReserNo();
        this.hotelId = confirmOrderBo.getHotelId();
        this.hotelName = confirmOrderBo.getHotelName();
        this.supplierName = confirmOrderBo.getSupplierName();
        this.cardNo = confirmOrderBo.getCardNo();
        this.arriveDate = confirmOrderBo.getTimeEarly();
        this.opType = confirmOpType.getKey()+"";
        this.opDate = new Date();
        this.department = DepartmentEnum.Confirm.getKey() + "";
        this.groupId = confirmOrderBo.getGroupId();
        this.priority = confirmOrderBo.getPriority();
        this.sourceReserStatus = confirmOpType.equals(ConfirmOpType.STORAGE_IN) ? preReserStatus : confirmOrderBo.getReserStatus();
        this.targetReserStatus = targetReserStatus;
        this.confirmType = getConfirmType(operator.getOperatorName());                                // 重复字段
        this.shouldConfirmType = confirmOrderBo.getConfirmType().longValue();        // 重复字段

        this.staffName = confirmOrderBo.getStaffName();
        this.operator = operator.getOperatorName();
        this.enterTime = confirmOrderBo.getEnterTime();
        this.respiteTime = confirmOrderBo.getRespiteTime();
        this.distributeTime = confirmOrderBo.getDistributeTime();
        this.bookingTime = confirmOrderBo.getBookingTime();
        this.amendTime = confirmOrderBo.getAmendTime();
        FullRoomRateConfig fullRoomRateConfig = ConfigurationManager.getHotSwitchConfig("FullRoomRateConfig", FullRoomRateConfig.class);
    }



    public ConfirmOpLogBo()
    {}

    public String getLogDBName() {
        return logDBName;
    }

    public void setLogDBName(String logDBName) {
        this.logDBName = logDBName;
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

    public String getFullRoomRates() {
		return fullRoomRates;
	}

	public void setFullRoomRates(String fullRoomRates) {
		this.fullRoomRates = fullRoomRates;
	}

	public long getConfirmType(String staffName) {
        long confirmType = 0;
        if (StringUtils.isBlank(staffName)) {
            confirmType = ConfirmType.MIS.getKey();
        } else if (staffName.toLowerCase().indexOf("pmsautouser") > -1) {
            confirmType = ConfirmType.DC.getKey();
        } else if (staffName.toLowerCase().endsWith("h") || staffName.toLowerCase().endsWith("m") || staffName.toLowerCase().endsWith("w")) {
            confirmType = ConfirmType.EBooking.getKey();
        } else if (staffName.toLowerCase().endsWith("confirmivr")) {
            confirmType = ConfirmType.IVR.getKey();
        } else if (staffName.toLowerCase().indexOf("autoexaminetask") > -1) {
            confirmType = ConfirmType.CONFIRMTASK.getKey();
        } else {
            confirmType = ConfirmType.MIS.getKey();
        }

        return confirmType;
    }

    @Override public String toString() {
        return "ConfirmOpLogBo{" +
                "logDBName='" + logDBName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", reserNo=" + reserNo +
                ", hotelId='" + hotelId + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", cardNo=" + cardNo +
                ", arriveDate=" + arriveDate +
                ", opType='" + opType + '\'' +
                ", opDate=" + opDate +
                ", department='" + department + '\'' +
                ", groupId=" + groupId +
                ", rankId=" + rankId +
                ", priority=" + priority +
                ", ebkStrategyId=" + ebkStrategyId +
                ", targetReserStatus='" + targetReserStatus + '\'' +
                ", sourceReserStatus='" + sourceReserStatus + '\'' +
                ", confirmType=" + confirmType +
                ", shouldConfirmType=" + shouldConfirmType +
                ", staffName='" + staffName + '\'' +
                ", operator='" + operator + '\'' +
                ", ivrStartTime=" + ivrStartTime +
                ", enterTime=" + enterTime +
                ", respiteTime=" + respiteTime +
                ", sortTime=" + sortTime +
                ", defaultSortTime=" + defaultSortTime +
                ", distributeTime=" + distributeTime +
                ", nextServiceTime=" + nextServiceTime +
                ", promiseTime=" + promiseTime +
                ", firstRefusedTime=" + firstRefusedTime +
                ", bookingTime=" + bookingTime +
                ", amendTime=" + amendTime +
                ", fullRoomRates='" + fullRoomRates + '\'' +
                '}';
    }
}
