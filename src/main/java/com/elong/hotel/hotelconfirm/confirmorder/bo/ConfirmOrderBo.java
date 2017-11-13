package com.elong.hotel.hotelconfirm.confirmorder.bo;

import java.util.Date;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.common.enums.ElongOrderStatusEnum;
import com.elong.hotel.common.helper.DateHelper;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ConfirmType;
import com.elong.hotel.hotelconfirm.confirmorder.po.ConfirmOrderPo;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;
import com.elong.hotel.proxy.javaorder.consts.OrderFlagConst;
import com.elong.hotel.proxy.javaorder.getorder.GetOrderStatusChangeTimeBo;
import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 * Created by yangboyu on 17/4/4.
 */
public class ConfirmOrderBo extends CompareEntityBase {

    private Integer reserNo;
    private String reserStatus;
    private Integer mod;
    private Date arriveDate;
    private Date leaveDate;
    private Date timeEarly;
    private Date timeLate;
    private Long cardNo;
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
    private Integer isFaxReturn;
    private Integer isLinked;
    private Integer urge;
    private Date respiteTime;
    private Date nextServiceTime;
    private String ivrGuid;
    private Integer ivrStatus;
    private Date ivrStartTime;
    private Date enterTime;
    private Date sortTime;
    private Date defaultSortTime;
    private Date firstRefusedTime;
    private Integer isEbRefuse;

    private Date orderTimestamp;

    private String reserStatus2End;
    private Date timeChange4PromiseTime;
    private Date rankChange4PromiseTime;
    private String ratePlanId;
    private Long additionalStatus;

    private String note2Elong;
    private String note2Hotel;
    private String note2Client;
    private String confirmNo;
    private String delayReason;
    private Integer isChangeOrder;

    /**
     * 预测满房概率
     */
    private String fullRoomRate;
    
    public ConfirmOrderBo(){

    }

    public ConfirmOrderBo(ConfirmOrderPo po) {
        this(null, po, null, null);
    }

    public ConfirmOrderBo(Order order, GetOrderStatusChangeTimeBo orderStatusChange, OperatorInfoBo operator) {
        this(order, null, orderStatusChange, operator);
    }

    public ConfirmOrderBo(Order order, ConfirmOrderPo confirmOrder, GetOrderStatusChangeTimeBo orderStatusChange, OperatorInfoBo operator) {
        if (order != null && confirmOrder != null) {      // 初始化 "目标数据", 此时订单在已审库
            if(orderStatusChange!=null){
                this.amendTime=orderStatusChange.getOperatorTime();
                if(orderStatusChange.getPreStatus().equalsIgnoreCase(ElongOrderStatusEnum.H.getStatus())){
                    this.isChangeOrder=1;
                }
            }else{
                this.amendTime = confirmOrder.getAmendTime();
                this.isChangeOrder=confirmOrder.getIsChangeOrder();
            }
            this.reserNo = confirmOrder.getReserNo();
            this.reserStatus = order.getStatus();
            this.mod = confirmOrder.getMod();
            this.arriveDate = confirmOrder.getArriveDate();
            this.leaveDate = confirmOrder.getLeaveDate();
            this.timeEarly = confirmOrder.getTimeEarly();
            this.timeLate = confirmOrder.getTimeLate();
            this.hotelId = confirmOrder.getHotelId();
            this.hotelName = confirmOrder.getHotelName();
            this.supplierId = confirmOrder.getSupplierId();
            this.supplierType = confirmOrder.getSupplierType();
            this.supplierName = order.getSupplierName();
            this.supplierOtaType = confirmOrder.getSupplierOtaType();
            this.proxyId = confirmOrder.getProxyId();
            this.cityId = confirmOrder.getCityId();
            this.distance = order.getDistanceFromHotelWhenBooking();
            this.confirmType = confirmOrder.getConfirmType();
            this.bookingTime = confirmOrder.getBookingTime();
            this.ratePlanId = order.getRatePlanId();
            this.additionalStatus = order.getAdditionalStatus();
            this.cardNo = order.getCardNo();
            this.amendTime = confirmOrder.getAmendTime();
            this.priority = confirmOrder.getPriority();
            this.groupId = confirmOrder.getGroupId();
            this.rankId = confirmOrder.getRankId();
            this.ebkStrategyId = confirmOrder.getEbkStrategyId();
            this.staffName = confirmOrder.getStaffName();
            this.distributeTime = confirmOrder.getDistributeTime();
            this.promiseTime = confirmOrder.getPromiseTime();
            this.promiseChangeTimes = confirmOrder.getPromiseChangeTimes();
            this.isFaxReturn = confirmOrder.getIsFaxReturn();
            this.isLinked = confirmOrder.getIsLinked();
            this.urge = confirmOrder.getUrge();
            this.respiteTime = confirmOrder.getRespiteTime();
            this.nextServiceTime = confirmOrder.getNextServiceTime();
            this.ivrGuid = confirmOrder.getIvrGuid();
            this.ivrStatus = confirmOrder.getIvrStatus();
            this.ivrStartTime = confirmOrder.getIvrStartTime();
            this.enterTime = confirmOrder.getEnterTime();
            this.sortTime = confirmOrder.getSortTime();
            this.defaultSortTime = confirmOrder.getDefaultSortTime();
            this.firstRefusedTime = confirmOrder.getFirstRefusedTime();
            this.orderTimestamp = new Date(confirmOrder.getOrderTimestampLong());

        } else if (order != null && confirmOrder == null) {   // 初始化 "目标数据", 此时订单还未入已审库
            if(orderStatusChange!=null){
                this.amendTime=orderStatusChange.getOperatorTime();
                if(orderStatusChange.getPreStatus().equalsIgnoreCase(ElongOrderStatusEnum.H.getStatus())){
                    this.isChangeOrder=1;
                }
            }else{
                this.amendTime=order.getModifyTime();
            }
            this.reserNo = order.getOrderId().intValue();
            this.reserStatus = order.getStatus();
            this.mod = this.reserNo % 10;
            this.arriveDate = order.getCheckInDate();
            this.leaveDate = order.getCheckOutDate();
            this.timeEarly = order.getEarlyCheckInTime();
            this.timeLate = order.getLateCheckInTime();
            this.hotelId = order.getHotelId();
            this.hotelName = order.getHotelName();
            this.cardNo = order.getCardNo();
            this.supplierId = order.getSupplierId().toString();
            this.supplierType = order.getSupplierType().toString();
            this.supplierName = order.getSupplierName();
            this.supplierOtaType = order.getSupplierOtaType().toString();
            this.proxyId = order.getProxy();
            this.cityId = order.getCityId();
            this.ratePlanId = order.getRatePlanId();
            this.distance = order.getDistanceFromHotelWhenBooking();
            this.confirmType = getConfirmType(order.getOrderFlag());
            this.bookingTime = order.getCreateTime();
            this.additionalStatus = order.getAdditionalStatus();
            this.promiseTime = DateHelper.getMinDate();
            this.promiseChangeTimes = 0;
            this.staffName = "";
            this.orderTimestamp = order.getOrderTimestamp();
            this.enterTime = operator.getOperatorTime();

        } else if (order == null && confirmOrder != null) {// 初始化"在库数据"
            this.reserNo = confirmOrder.getReserNo();
            this.reserStatus = confirmOrder.getReserStatus();
            this.cardNo = confirmOrder.getCardNo();
            this.mod = confirmOrder.getMod();
            this.arriveDate = confirmOrder.getArriveDate();
            this.leaveDate = confirmOrder.getLeaveDate();
            this.timeEarly = confirmOrder.getTimeEarly();
            this.timeLate = confirmOrder.getTimeLate();
            this.hotelId = confirmOrder.getHotelId();
            this.hotelName = confirmOrder.getHotelName();
            this.supplierId = confirmOrder.getSupplierId();
            this.supplierType = confirmOrder.getSupplierType();
            this.supplierOtaType = confirmOrder.getSupplierOtaType();
            this.supplierName = confirmOrder.getSupplierName();
            this.proxyId = confirmOrder.getProxyId();
            this.cityId = confirmOrder.getCityId();
            this.distance = confirmOrder.getDistance();
            this.confirmType = confirmOrder.getConfirmType();
            this.bookingTime = confirmOrder.getBookingTime();
            this.amendTime = confirmOrder.getAmendTime();
            this.priority = confirmOrder.getPriority();
            this.groupId = confirmOrder.getGroupId();
            this.rankId = confirmOrder.getRankId();
            this.ebkStrategyId = confirmOrder.getEbkStrategyId();
            this.staffName = confirmOrder.getStaffName();
            this.distributeTime = confirmOrder.getDistributeTime();
            this.promiseTime = confirmOrder.getPromiseTime();
            this.promiseChangeTimes = confirmOrder.getPromiseChangeTimes();
            this.isFaxReturn = confirmOrder.getIsFaxReturn();
            this.isLinked = confirmOrder.getIsLinked();
            this.isEbRefuse = confirmOrder.getIsEbRefuse();
            this.urge = confirmOrder.getUrge();
            this.respiteTime = confirmOrder.getRespiteTime();
            this.nextServiceTime = confirmOrder.getNextServiceTime();
            this.ivrGuid = confirmOrder.getIvrGuid();
            this.ivrStatus = confirmOrder.getIvrStatus();
            this.ivrStartTime = confirmOrder.getIvrStartTime();
            this.enterTime = confirmOrder.getEnterTime();
            this.sortTime = confirmOrder.getSortTime();
            this.defaultSortTime = confirmOrder.getDefaultSortTime();
            this.firstRefusedTime = confirmOrder.getFirstRefusedTime();
            this.orderTimestamp = new Date(confirmOrder.getOrderTimestampLong());
        }
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

    public Date getRankChange4PromiseTime() {
        return rankChange4PromiseTime;
    }

    public void setRankChange4PromiseTime(Date rankChange4PromiseTime) {
        this.rankChange4PromiseTime = rankChange4PromiseTime;
    }

    public Date getTimeChange4PromiseTime() {
        return timeChange4PromiseTime;
    }

    public void setTimeChange4PromiseTime(Date timeChange4PromiseTime) {
        this.timeChange4PromiseTime = timeChange4PromiseTime;
    }

    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getIsEbRefuse() {
        return isEbRefuse;
    }

    public void setIsEbRefuse(Integer isEbRefuse) {
        this.isEbRefuse = isEbRefuse;
    }

    public String getReserStatus2End() {
        return reserStatus2End;
    }

    public void setReserStatus2End(String reserStatus2End) {
        this.reserStatus2End = reserStatus2End;
    }

    public Date getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(Date orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
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

    public String getNote2Client() {
        return note2Client;
    }

    public void setNote2Client(String note2Client) {
        this.note2Client = note2Client;
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

    private Integer getConfirmType(long orderFlag) {
        //直连确认
        if ((orderFlag & OrderFlagConst.SHOULD_CONFIRMED_BY_DC) == OrderFlagConst.SHOULD_CONFIRMED_BY_DC) {
            return ConfirmType.DC.getKey();
        }
        //EB确认
        else if ((orderFlag & OrderFlagConst.SHOULD_CONFIRMED_BY_EB) == OrderFlagConst.SHOULD_CONFIRMED_BY_EB) {
            return ConfirmType.EBooking.getKey();
        } else {
            //mis员工确认
            return ConfirmType.MIS.getKey();
        }

    }

	public String getFullRoomRate() {
		return fullRoomRate;
	}

	public void setFullRoomRate(String fullRoomRate) {
		this.fullRoomRate = fullRoomRate;
	}
    
}
