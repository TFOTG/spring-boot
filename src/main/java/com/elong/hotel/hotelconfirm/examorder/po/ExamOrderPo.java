package com.elong.hotel.hotelconfirm.examorder.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.elong.hotel.hotelconfirm.examorder.bo.ExamOrderBo;

/**
 * 终拒订单表
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月2日 下午5:36:15   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class ExamOrderPo implements Serializable{

	/** 
	 * long ExamOrderPo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Long id;

	/**
	 * 订单编号
	 */
	private Integer reserNo;
	
	/**
	 * 订单状态
	 */
	private String reserStatus;
	
	/**
	 * 到店日期
	 */
	private Date arriveDate;
	
	/**
	 * 离店日期
	 */
	private Date leaveDate;
	
	/**
	 * 最早到店时间
	 */
	private Date timeEarly;
	
	/**
	 * 最晚到店时间
	 */
	private Date timeLate;
	
	/**
	 * 预订卡号
	 */
	private Long cardNo;
	
	/**
	 * 房间数量
	 */
	private Integer roomNum;
	
	/**
	 * 间夜数量
	 */
	private Integer nightNum;
	
	/**
	 * 联系人电话
	 */
	private String phone;
	
	/**
	 * 订单金额
	 */
	private BigDecimal orderMoney;
	
	/**
	 * 订单类型
	 */
	private Integer orderType;
	
	/**
	 * 酒店ID
	 */
	private String hotelId;
	
	/**
	 * 酒店名称
	 */
	private String hotelName;
	
	/**
	 * 酒店星级
	 */
	private Integer hotelStar;
	
	/**
	 * 供应商ID
	 */
	private Integer supplierId;
	
	/**
	 * 供应商名称
	 */
	private String supplierName;
	
	/**
	 * 供应商类型
	 */
	private String supplierType;
	
	/**
	 * 供应商OTA类型
	 */
	private String supplierOtaType;
	
	/**
	 * 代理ID
	 */
	private String proxyId;
	
	/**
	 * 城市ID
	 */
	private String cityId;
	
	/**
	 * 距离
	 */
	private Integer distance;
	
	/**
	 * 预订时间
	 */
	private Date bookingTime;
	
	/**
	 * 终拒时间
	 */
	private Date amendTime;
	
	/**
	 * 优先级
	 */
	private Integer priority;

	/**
	 * 分组ID
	 */
	private Integer groupId;
	
	/**
	 * 入库时间
	 */
	private Date enterTime;
	
	/**
	 * 员工姓名
	 */
	private String staffName;
	
	/**
	 * 获取时间
	 */
	private Date distributeTime;
	
	/**
	 * 暂缓时间
	 */
	private Date respiteTime;
	
	/**
	 * 是否传真回传
	 */
	private Integer isfaxReturn;
	
	/**
	 * 是否联单
	 */
	private Integer isLinked;
	
	/**
	 * 是否直连订单
	 */
	private Integer isPms;
	
	/**
	 * 是否确认
	 */
	private Integer isConfirm;
	
	/**
	 * 是否变更
	 */
	private Integer isH;
	
	/**
	 * 是否重复拒单
	 */
	private Integer isRepeat;
	
	/**
	 * 是否即时确认
	 */
	private Integer isImmediately;
	
	/**
	 * 是否另建新单
	 */
	private Integer isNew;
	
	/**
	 * 暂不处理
	 */
	private Integer isDelay;
	
	/**
	 * 短信发送ID
	 */
	private String smsTraceId;
	
	/**
	 * 短信发送状态
	 */
	private Integer smsStatus;
	
	/**
	 * 短信发送次数
	 */
	private Integer smsCount;
	
	/**
	 * 短信发送时间
	 */
	private Date smsSendTime;
	
	/**
	 * 订单时间戳
	 */
	private Long orderTimeStampLong;
	
	/**
	 * 按酒店?模
	 */
	private Integer mod;

	public ExamOrderPo() {
	}

	public ExamOrderPo(ExamOrderBo bo) {
	}

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

	public String getReserStatus() {
		return reserStatus;
	}

	public void setReserStatus(String reserStatus) {
		this.reserStatus = reserStatus;
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

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public Integer getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(Integer roomNum) {
		this.roomNum = roomNum;
	}

	public Integer getNightNum() {
		return nightNum;
	}

	public void setNightNum(Integer nightNum) {
		this.nightNum = nightNum;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(BigDecimal orderMoney) {
		this.orderMoney = orderMoney;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
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

	public Integer getHotelStar() {
		return hotelStar;
	}

	public void setHotelStar(Integer hotelStar) {
		this.hotelStar = hotelStar;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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

	public Date getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
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

	public Date getRespiteTime() {
		return respiteTime;
	}

	public void setRespiteTime(Date respiteTime) {
		this.respiteTime = respiteTime;
	}

	public Integer getIsfaxReturn() {
		return isfaxReturn;
	}

	public void setIsfaxReturn(Integer isfaxReturn) {
		this.isfaxReturn = isfaxReturn;
	}

	public Integer getIsLinked() {
		return isLinked;
	}

	public void setIsLinked(Integer isLinked) {
		this.isLinked = isLinked;
	}

	public Integer getIsPms() {
		return isPms;
	}

	public void setIsPms(Integer isPms) {
		this.isPms = isPms;
	}

	public Integer getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(Integer isConfirm) {
		this.isConfirm = isConfirm;
	}

	public Integer getIsH() {
		return isH;
	}

	public void setIsH(Integer isH) {
		this.isH = isH;
	}

	public Integer getIsRepeat() {
		return isRepeat;
	}

	public void setIsRepeat(Integer isRepeat) {
		this.isRepeat = isRepeat;
	}

	public Integer getIsImmediately() {
		return isImmediately;
	}

	public void setIsImmediately(Integer isImmediately) {
		this.isImmediately = isImmediately;
	}

	public Integer getIsNew() {
		return isNew;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public Integer getIsDelay() {
		return isDelay;
	}

	public void setIsDelay(Integer isDelay) {
		this.isDelay = isDelay;
	}

	public String getSmsTraceId() {
		return smsTraceId;
	}

	public void setSmsTraceId(String smsTraceId) {
		this.smsTraceId = smsTraceId;
	}

	public Integer getSmsStatus() {
		return smsStatus;
	}

	public void setSmsStatus(Integer smsStatus) {
		this.smsStatus = smsStatus;
	}

	public Integer getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(Integer smsCount) {
		this.smsCount = smsCount;
	}

	public Date getSmsSendTime() {
		return smsSendTime;
	}

	public void setSmsSendTime(Date smsSendTime) {
		this.smsSendTime = smsSendTime;
	}

	public Long getOrderTimeStampLong() {
		return orderTimeStampLong;
	}

	public void setOrderTimeStampLong(Long orderTimeStampLong) {
		this.orderTimeStampLong = orderTimeStampLong;
	}

	public Integer getMod() {
		return mod;
	}

	public void setMod(Integer mod) {
		this.mod = mod;
	}

	@Override
	public String toString() {
		return "ExamOrderPo [id=" + id + ", reserNo=" + reserNo + ", reserStatus=" + reserStatus + ", arriveDate=" + arriveDate
				+ ", leaveDate=" + leaveDate + ", timeEarly=" + timeEarly + ", timeLate=" + timeLate + ", cardNo=" + cardNo + ", roomNum="
				+ roomNum + ", nightNum=" + nightNum + ", phone=" + phone + ", orderMoney=" + orderMoney + ", orderType=" + orderType
				+ ", hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelStar=" + hotelStar + ", supplierId=" + supplierId
				+ ", supplierName=" + supplierName + ", supplierType=" + supplierType + ", supplierOtaType=" + supplierOtaType
				+ ", proxyId=" + proxyId + ", cityId=" + cityId + ", distance=" + distance + ", bookingTime=" + bookingTime + ", amendTime="
				+ amendTime + ", priority=" + priority + ", groupId=" + groupId + ", enterTime=" + enterTime + ", staffName=" + staffName
				+ ", distributeTime=" + distributeTime + ", respiteTime=" + respiteTime + ", isfaxReturn=" + isfaxReturn + ", isLinked="
				+ isLinked + ", isPms=" + isPms + ", isConfirm=" + isConfirm + ", isH=" + isH + ", isRepeat=" + isRepeat
				+ ", isImmediately=" + isImmediately + ", isNew=" + isNew + ", isDelay=" + isDelay + ", smsTraceId=" + smsTraceId
				+ ", smsStatus=" + smsStatus + ", smsCount=" + smsCount + ", smsSendTime=" + smsSendTime + ", orderTimeStampLong="
				+ orderTimeStampLong + ", mod=" + mod + "]";
	}
	
}
