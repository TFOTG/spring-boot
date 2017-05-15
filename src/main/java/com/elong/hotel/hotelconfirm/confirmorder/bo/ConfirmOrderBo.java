package com.elong.hotel.hotelconfirm.confirmorder.bo;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.common.enums.ElongOrderStatusEnum;
import com.elong.hotel.common.helper.DateHelper;
import com.elong.hotel.hotelconfirm.confirmorder.po.ConfirmOrderPo;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.proxy.javaorder.getorder.OrderHistory;

import java.util.Date;
import java.util.List;

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

    private Date orderTimestamp;

    private String reserStatus2End;
    private Date timeChange4PromiseTime;
    private Date rankChange4PromiseTime;
    private String ratePlanId;

    public ConfirmOrderBo(ConfirmOrderPo po) {
        this(null, po, null,null);
    }

    public ConfirmOrderBo(Order order, List<OrderHistory> orderHistoryList,OperatorInfoBo operator) {
        this(order, null, orderHistoryList,operator);
    }

    public ConfirmOrderBo(Order order, ConfirmOrderPo po, List<OrderHistory> orderHistoryList,OperatorInfoBo operator) {
        if (order != null && po != null) {      // 初始化 "目标数据", 此时订单在已审库
            this.reserNo = po.getReserNo();
            this.reserStatus = order.getStatus();
            this.mod = po.getMod();
            this.arriveDate = po.getArriveDate();
            this.leaveDate = po.getLeaveDate();
            this.timeEarly = po.getTimeEarly();
            this.timeLate = po.getTimeLate();
            this.hotelId = po.getHotelId();
            this.hotelName = po.getHotelName();
            this.supplierId = po.getSupplierId();
            this.supplierType = po.getSupplierType();
            this.supplierName = order.getSupplierName();
            this.supplierOtaType = po.getSupplierOtaType();
            this.proxyId = po.getProxyId();
            this.cityId = po.getCityId();
            this.distance = po.getDistance();
            this.confirmType = po.getConfirmType();
            this.bookingTime = po.getBookingTime();
            this.ratePlanId=order.getRatePlanId();

            if(po.getAmendTime() != null && po.getAmendTime().getTime() >= getAmendTimeFromHistory(order,orderHistoryList).getTime()) {

                this.amendTime = po.getAmendTime();
                this.priority = po.getPriority();
                this.groupId = po.getGroupId();
                this.rankId = po.getRankId();
                this.ebkStrategyId = po.getEbkStrategyId();
                this.staffName = po.getStaffName();
                this.distributeTime = po.getDistributeTime();
                this.promiseTime = po.getPromiseTime();
                this.promiseChangeTimes = po.getPromiseChangeTimes();
                this.isFaxReturn = po.getIsFaxReturn();
                this.isLinked = po.getIsLinked();
                this.urge = po.getUrge();
                this.respiteTime = po.getRespiteTime();
                this.nextServiceTime = po.getNextServiceTime();
                this.ivrGuid = po.getIvrGuid();
                this.ivrStatus = po.getIvrStatus();
                this.ivrStartTime = po.getIvrStartTime();
                this.enterTime = po.getEnterTime();
                this.sortTime = po.getSortTime();
                this.defaultSortTime = po.getDefaultSortTime();
                this.firstRefusedTime = po.getFirstRefusedTime();
                this.orderTimestamp = new Date(po.getOrderTimestampLong());

            }else if(po.getAmendTime() != null && po.getAmendTime().getTime() < getAmendTimeFromHistory(order,orderHistoryList).getTime()) {

                this.amendTime = getAmendTimeFromHistory(order,orderHistoryList);

                //TODO hualong.li entertime
                this.enterTime = operator.getOperatorTime();

                this.orderTimestamp = order.getOrderTimestamp();

            }else {

            }
        } else if (order != null && po == null) {   // 初始化 "目标数据", 此时订单还未入已审库
            // todo:王朋 入库数据缺少字段 this.mod,this.hotelname,this.suppliername,this.supplierotatype,this.distance,this.bookingtime,
            this.reserNo = order.getOrderId().intValue();
            this.reserStatus = order.getStatus();
            this.mod = this.reserNo%10;
            this.arriveDate = order.getCheckInDate();
            this.leaveDate = order.getCheckOutDate();
            this.timeEarly = order.getEarlyCheckInTime();
            this.timeLate = order.getLateCheckInTime();
            this.hotelId = order.getHotelId();
            this.hotelName = order.getHotelName();
            this.supplierId = order.getSupplierId().toString();
            this.supplierType = order.getSupplierType().toString();
            this.supplierName = order.getSupplierName();
            this.supplierOtaType = order.getSupplierOtaType().toString();

            this.proxyId = order.getProxy();
            this.cityId = order.getCityId();
            this.distance = order.getDistanceFromHotelWhenBooking();
            this.confirmType = order.getConfirmMethod();
            this.bookingTime = order.getCreateTime();                   // 缺少
            this.amendTime = getAmendTimeFromHistory(order, orderHistoryList);
            this.promiseTime = DateHelper.getMinDate();
            this.promiseChangeTimes = 0;
            this.staffName = "";
            this.orderTimestamp = order.getOrderTimestamp();
            this.enterTime = operator.getOperatorTime();
        } else if (order == null && po != null) {// 初始化"在库数据"
            this.reserNo = po.getReserNo();
            this.reserStatus = po.getReserStatus();
            this.mod = po.getMod();
            this.arriveDate = po.getArriveDate();
            this.leaveDate = po.getLeaveDate();
            this.timeEarly = po.getTimeEarly();
            this.timeLate = po.getTimeLate();
            this.hotelId = po.getHotelId();
            this.hotelName = po.getHotelName();
            this.supplierId = po.getSupplierId();
            this.supplierType = po.getSupplierType();
            this.supplierOtaType = po.getSupplierOtaType();
            this.supplierName = po.getSupplierName();
            this.proxyId = po.getProxyId();
            this.cityId = po.getCityId();
            this.distance = po.getDistance();
            this.confirmType = po.getConfirmType();
            this.bookingTime = po.getBookingTime();
            this.amendTime = po.getAmendTime();
            this.priority=po.getPriority();
            this.groupId = po.getGroupId();
            this.rankId = po.getRankId();
            this.ebkStrategyId = po.getEbkStrategyId();
            this.staffName = po.getStaffName();
            this.distributeTime = po.getDistributeTime();
            this.promiseTime = po.getPromiseTime();
            this.promiseChangeTimes = po.getPromiseChangeTimes();
            this.isFaxReturn = po.getIsFaxReturn();
            this.isLinked = po.getIsLinked();
            this.urge = po.getUrge();
            this.respiteTime = po.getRespiteTime();
            this.nextServiceTime = po.getNextServiceTime();
            this.ivrGuid = po.getIvrGuid();
            this.ivrStatus = po.getIvrStatus();
            this.ivrStartTime = po.getIvrStartTime();
            this.enterTime = po.getEnterTime();
            this.sortTime = po.getSortTime();
            this.defaultSortTime = po.getDefaultSortTime();
            this.firstRefusedTime = po.getFirstRefusedTime();
            this.orderTimestamp = new Date(po.getOrderTimestampLong());
        }
    }

    private Date getAmendTimeFromHistory(Order order,List<OrderHistory> orderHistoryList) {

        if (orderHistoryList != null) {
            //补上当前订单，最后一条历史
            OrderHistory lastHistory=new OrderHistory(order);
            orderHistoryList.add(lastHistory);
            for (int i = orderHistoryList.size() - 1; i >= 0; i--) {
                OrderHistory history = orderHistoryList.get(i);
                if (history.getReserveStatus().equals(ElongOrderStatusEnum.V.getStatus())) {
                    for (int j = i; j >= 0; j--) {
                        OrderHistory orderHistory = orderHistoryList.get(j);
                        if (!orderHistory.getReserveStatus().equals(ElongOrderStatusEnum.V.getStatus())) {
                            return orderHistoryList.get(j + 1).getModifyTime();
                        }
                    }
                }
            }
        }
        return null;
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
}
