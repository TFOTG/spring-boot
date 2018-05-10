package com.elong.hotel.hotelconfirm.examorder.bo;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.examorder.enums.OrderTypeEnum;
import com.elong.hotel.hotelconfirm.examorder.po.ExamOrderPo;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;
import com.elong.hotel.proxy.javaorder.consts.OrderAdditionalStatusConst;
import com.elong.hotel.proxy.javaorder.consts.OrderFlagConst;
import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

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

	public ExamOrderBo() {
	}


	public ExamOrderBo(ExamOrderPo po) {
		this.setExamOrder(po);
	}

	public ExamOrderBo(Order order,ExamOrderPo po,OperatorInfoBo operator) {
		if(order != null && po != null){
			this.setExamOrder(po);
			//终拒时间
			this.amendTime = operator.getOperatorTime();
			//会员等级
			this.memberLevel = order.getGradeId();
			if((order.getOrderFlag() & OrderFlagConst.IS_ARRIVE_NOW_ORDER) == OrderFlagConst.IS_ARRIVE_NOW_ORDER){
				userChoiceUrge4App = true;
			}
			//计算拒单时长
			calRejectTime();
			//计算是否超时
			calIsOutTime(order);
			//计算是否赔付
			calIsSupposed(order);
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
//			this.hotelStar = po.getHotelStar();
			this.supplierId = String.valueOf(order.getSupplierId());
			this.supplierName = order.getSupplierName();
			this.supplierType = String.valueOf(order.getSupplierType());
			this.supplierOtaType = String.valueOf(order.getSupplierOtaType());
			this.proxyId = order.getProxy();
			this.cityId = order.getCityId();
			this.distance = order.getDistanceFromHotelWhenBooking();
			this.bookingTime = order.getCreateTime();
			this.groupId = 5066;
			//判断订单类型
			setOrderType(order);
			if(order.getContact() != null && order.getContact().getIsConfirmed()){
				this.isConfirm = 1;
			}
//			this.isPms = po.getIsPms();
			//查询历史属否出现“H”
//			this.isH = po.getIsH();
//			this.isFaxReturn = po.getIsfaxReturn();
//			this.isLinked = po.getIsLinked();
//			this.isRepeat = po.getIsRepeat();
			if((order.getOrderFlag() & OrderFlagConst.IS_INSTANT_CONFIRM) == OrderFlagConst.IS_INSTANT_CONFIRM){
				this.isImmediately = 1;
			}
			//新标识字段
//			this.isNew = po.getIsNew();
			this.memberLevel = order.getGradeId();
			this.phone = order.getContact().getMobile();
			this.orderTimestamp = order.getOrderTimestamp();
			this.amendTime = operator.getOperatorTime();
			if((order.getOrderFlag() & OrderFlagConst.IS_ARRIVE_NOW_ORDER) == OrderFlagConst.IS_ARRIVE_NOW_ORDER){
				userChoiceUrge4App = true;
			}
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
	public void calIsOutTime(Order order){
		if(System.currentTimeMillis() > order.getLateCheckInTime().getTime()){
			this.isOutTime = 1;
		}
	}
	
	/**
	 * 
	 * 判断是否赔付 
	 *
	 * @param order
	 */
	public void calIsSupposed(Order order){
		/**
		 * 1.订单状态为“O”，“G	”且发送过确认短信
		 * 	1.1:固定代理ID
		 * 	1.2:艺龙自有
		 * 	1.3：非艺龙自有，且为预付/担保
		 */
	}
	
	/**
	 * 
	 * 计算拒单时长
	 *
	 */
	public void calRejectTime(){
		this.rejectTime = (int) ((System.currentTimeMillis() - this.amendTime.getTime()) / (1000 * 60 *60));
	}
}
