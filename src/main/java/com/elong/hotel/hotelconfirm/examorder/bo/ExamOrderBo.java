package com.elong.hotel.hotelconfirm.examorder.bo;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.common.config.ExamOrderConfig;
import com.elong.hotel.common.helper.ConfigurationManager;
import com.elong.hotel.hotelconfirm.examorder.enums.HotelStarEnum;
import com.elong.hotel.hotelconfirm.examorder.enums.OrderTypeEnum;
import com.elong.hotel.hotelconfirm.examorder.po.ExamOrderPo;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;
import com.elong.hotel.proxy.javaorder.consts.OrderAdditionalStatusConst;
import com.elong.hotel.proxy.javaorder.consts.OrderFlagConst;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.proxy.javaorder.getorder.OrderHistory;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
	private int orderType;
	private int isPms;
	private int isConfirm;
	private int isH;
	private int isRepeat;
	private int isImmediately;
	private int isNew;
	private String phone;

	private String memberLevel;

    //拒单时长
	private int rejectTime;

	//是否赔付
	private int isSupposed;

	//是否超时
    private int isOutTime;

	//客人app选择马上到点(&OrderFlagConst.IS_ARRIVE_NOW_ORDER=1024)
	private boolean userChoiceUrge4App;

	//自动通知状态
	private int smsStatus;

	public ExamOrderBo() {
	}


	public ExamOrderBo(ExamOrderPo po) {
		this.setExamOrder(po);
	}

	public ExamOrderBo(Order order,ExamOrderPo po,OperatorInfoBo operator,List<OrderHistory> orderHistory, Integer refusedCancelNum, Integer repeatRefusedNum) {
		if(order != null && po != null){
			this.setExamOrder(po);
			//终拒时间
			this.amendTime = operator.getOperatorTime();
			//是否选择马上到店
			userChoiceUrge4App = (order.getOrderFlag() & OrderFlagConst.IS_ARRIVE_NOW_ORDER) == OrderFlagConst.IS_ARRIVE_NOW_ORDER;
			//计算拒单时长
			this.rejectTime = calRejectTime();
			//计算是否超时
			this.isOutTime = calIsOutTime(order);
			//计算是否赔付
			this.isSupposed = calIsSupposed(order);
			this.reserStatus = order.getStatus();
			this.memberLevel = order.getGradeId();
			this.smsStatus=po.getSmsStatus();
			this.mod = order.getOrderId().intValue() % 10;
			this.isConfirm = order.getContact() != null && order.getContact().getIsConfirmed() ? 1 : 0;
		}else if(order != null && po == null){
			this.reserNo = order.getOrderId().intValue();
			this.reserStatus = order.getStatus();
			this.arriveDate = order.getCheckInDate();
			this.leaveDate = order.getCheckOutDate();
			this.timeEarly = order.getEarlyCheckInTime();
			this.timeLate = order.getLateCheckInTime();
			this.roomNum = order.getRoomCount();
			this.nightNum = order.getRoomNightsCount();
			this.orderMoney = order.getSumPrice().doubleValue();
			this.cardNo = order.getCardNo();
			this.hotelId = order.getHotelId();
			this.hotelName = order.getHotelName();
			this.hotelStar = order.getStar() == null ? HotelStarEnum.Default.getKey() : order.getStar();
			this.supplierId = String.valueOf(order.getSupplierId());
			this.supplierName = order.getSupplierName();
			this.supplierType = String.valueOf(order.getSupplierType());
			this.supplierOtaType = String.valueOf(order.getSupplierOtaType());
			this.proxyId = order.getProxy();
			this.cityId = order.getCityId();
			this.distance = order.getDistanceFromHotelWhenBooking();
			this.bookingTime = order.getCreateTime();
			this.isConfirm = order.getContact() != null && order.getContact().getIsConfirmed() ? 1 : 0;
			this.isPms = order.getIsAcceptDcOfflineProcess();
			this.isH = calOrderHistoryStatus("H", 1, orderHistory) >= 1 ? 1 : 0;
			this.isRepeat = repeatRefusedNum == null ? 0 : repeatRefusedNum > 1 ? 1 : 0;
			this.isImmediately = (order.getOrderFlag() & OrderFlagConst.IS_INSTANT_CONFIRM) == OrderFlagConst.IS_INSTANT_CONFIRM ? 1 : 0;
			this.isNew = refusedCancelNum != null ? refusedCancelNum > 0 ? 1 : 0 : 0;
			this.memberLevel = order.getGradeId();
			this.phone = order.getContact().getMobile();
			this.orderTimestamp = order.getOrderTimestamp();
			setOrderType(order);
			//终拒时间
			this.amendTime = operator.getOperatorTime();
			//是否选择马上到店
			userChoiceUrge4App = (order.getOrderFlag() & OrderFlagConst.IS_ARRIVE_NOW_ORDER) == OrderFlagConst.IS_ARRIVE_NOW_ORDER;
			//计算拒单时长
			this.rejectTime = calRejectTime();
			//计算是否超时
			this.isOutTime = calIsOutTime(order);
			//计算是否赔付
			this.isSupposed = calIsSupposed(order);
			//计算mod
			this.mod = order.getOrderId().intValue() % 10;
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
		this.isFaxReturn = po.getIsFaxReturn();
		this.isLinked = po.getIsLinked();
		this.respiteTime = po.getRespiteTime();
		this.enterTime = po.getEnterTime();
		this.orderTimestamp = new Date(po.getOrderTimeStampLong());
		this.orderType = po.getOrderType();
		this.isPms = po.getIsPms();
		this.isConfirm = po.getIsConfirm();
		this.isH = po.getIsH();
		this.isRepeat = po.getIsRepeat();
		this.isImmediately = po.getIsImmediately();
		this.isNew = po.getIsNew();
		this.phone = po.getPhone();
		this.smsStatus=po.getSmsStatus();
		this.mod = po.getMod();
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


	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	public int getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(int isConfirm) {
		this.isConfirm = isConfirm;
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


    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }

    public int getRejectTime() {
        return rejectTime;
    }

    public void setRejectTime(int rejectTime) {
        this.rejectTime = rejectTime;
    }

    public int getIsSupposed() {
        return isSupposed;
    }

    public void setIsSupposed(int isSupposed) {
        this.isSupposed = isSupposed;
    }

    public int getIsOutTime() {
        return isOutTime;
    }

    public void setIsOutTime(int isOutTime) {
        this.isOutTime = isOutTime;
    }


	public int getIsPms() {
		return isPms;
	}


	public void setIsPms(int isPms) {
		this.isPms = isPms;
	}


	public int getIsH() {
		return isH;
	}


	public void setIsH(int isH) {
		this.isH = isH;
	}


	public int getIsRepeat() {
		return isRepeat;
	}


	public void setIsRepeat(int isRepeat) {
		this.isRepeat = isRepeat;
	}


	public int getIsImmediately() {
		return isImmediately;
	}


	public void setIsImmediately(int isImmediately) {
		this.isImmediately = isImmediately;
	}


	public int getIsNew() {
		return isNew;
	}


	public void setIsNew(int isNew) {
		this.isNew = isNew;
	}

    public int getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(int smsStatus) {
        this.smsStatus = smsStatus;
    }

    /**
	 * 
	 * 计算订单类型 
	 *
	 * @param order
	 */
	public void setOrderType(Order order){
		this.orderType = OrderTypeEnum.Oridinary.getKey();
		//判断担保订单
		if((order.getAdditionalStatus() & OrderAdditionalStatusConst.CREDIT_CARD_VOUCH) == OrderAdditionalStatusConst.CREDIT_CARD_VOUCH){
			//预付订单
			if(StringUtils.equalsIgnoreCase("D", order.getPayment())){
				this.orderType = OrderTypeEnum.Prepay.getKey();
			}else if(StringUtils.equalsIgnoreCase("P", order.getPayment())){//现付订单
				if((order.getAdditionalStatus() & OrderAdditionalStatusConst.FULL_PRICE_VOUCH) == OrderAdditionalStatusConst.FULL_PRICE_VOUCH ||
						order.getBaseVouchRule() != null){
					this.orderType = OrderTypeEnum.Voucher.getKey();
				}
			}
		}
	}
	
	/**
	 * 
	 * 计算订单是否超时
	 *
	 */
	public int calIsOutTime(Order order){
		if(System.currentTimeMillis() > order.getLateCheckInTime().getTime()){
			return 1;
		}
		return 0;
	}
	
	/**
	 * 
	 * 判断是否赔付 
	 *
	 * @param order
	 */
	public int calIsSupposed(Order order){
		/**
		 * 1.订单状态为“O”，“G	”且发送过确认短信
		 * 	1.1:固定代理ID
		 * 	1.2:艺龙自有 （otaType = 1 && （supplierOtaType = 1 or cooperationType = 1））
		 * 	1.3：非艺龙自有，且为预付/担保
		 */
		if((order.getStatus().equalsIgnoreCase("O") || order.getStatus().equalsIgnoreCase("G")) && order.getContact().getIsConfirmed()){

			if(order.getOtaType() == 1){//艺龙自有
				if(order.getSupplierOtaType() == 1){
					return 1;
				}
			}else if (order.getCooperationType() == 1){
				return 1;
			}else{//非艺龙自有
				 if(this.orderType == OrderTypeEnum.Prepay.getKey() || this.orderType == OrderTypeEnum.Voucher.getKey()){
					 return 1;
				 } 
			}
			
			String supposedProxyIds = ConfigurationManager.getHotSwitchConfig("ExamOrderConfig", ExamOrderConfig.class).getSupposedProxyIds();
			if(Arrays.asList(supposedProxyIds).contains(order.getProxy())){
				return 1;
			}
		}
		
		return 0;
	
	}
	
	/**
	 * 
	 * 计算拒单时长
	 *
	 */
	public Integer calRejectTime(){
		long timeDiff = System.currentTimeMillis() - this.amendTime.getTime();
		if(timeDiff > 0){
			int second = (int) timeDiff / (1000 * 60);
			int minute = second / 60;
			if((second % 60) > 0){
				minute += 1;
			}
			return minute;
		}
		return 0;
	}
	
	/**
	 * 
	 * 计算订单状态出现次数
	 *
	 * @return
	 */
	public int calOrderHistoryStatus(String targetStatus, int count, List<OrderHistory> orderHistory){
		int c = 0;
		
		if(orderHistory != null && orderHistory.size() != 0){
			for(OrderHistory his: orderHistory){
				
				if(targetStatus.equalsIgnoreCase(his.getReserveStatus())){
					c++;
				}
				
				if(c >= count){
					break;
				}
			}
		}
		
		return c;
	}
}
