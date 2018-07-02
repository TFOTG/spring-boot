package com.elong.hotel.hotelconfirm.examorder.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.common.util.StringUtils;
import com.elong.hotel.common.config.ExamOrderConfig;
import com.elong.hotel.common.helper.ConfigurationManager;
import com.elong.hotel.hotelconfirm.examorder.enums.OrderTypeEnum;
import com.elong.hotel.hotelconfirm.examorder.po.ExamOrderPo;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.proxy.javaorder.getorder.OrderKeyValue;
import com.elong.hotel.proxy.javaorder.getorder.RoomNight;

/**
 * 待处理终拒订单BO
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月6日 下午3:21:44   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class PendingExamOrderBo implements Serializable{

	/** 
	 * long PendingExamOrderBo.java serialVersionUID
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
	@JSONField(format = "yyyy-MM-dd(u)")
	private Date arriveDate;
	
	/**
	 * 离店日期
	 */
	@JSONField(format = "yyyy-MM-dd(u)")
	private Date leaveDate;
	
	/**
	 * 最早到店时间
	 */
	@JSONField(format="HH:mm")
	private Date timeEarly;
	
	/**
	 * 最晚到店时间
	 */
	@JSONField(format="HH:mm")
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
	private String supplierId;
	
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
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date enterTime;
	
	/**
	 * 员工姓名
	 */
	private String staffName;
	
	/**
	 * 获取时间
	 */
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date distributeTime;
	
	/**
	 * 暂缓时间
	 */
	@JSONField(format = "yyyy-MM-dd HH:mm")
	private Date respiteTime;
	
	/**
	 * 是否传真回传
	 */
	private Integer isFaxReturn;
	
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
	 * 聚合唯一key
	 */
	private String groupByKey;
	
	/**
	 * 订单信息
	 */
	private Order order;
	
	/**
	 * 订单状态中文
	 */
	private String orderStatusZn;
	
	/**
	 * 进库时长（单位：分钟）
	 */
	private Integer enterTimeMinute;
	
	/**
	 * 入屏时长（单位：分钟）
	 */
	private Integer enterScreenMinute;
	
	/**
	 * 是否直连订单
	 */
	private int isDCOrder;
	
	/**
	 * 是否赔付
	 */
	private int isSupposed;
	
	/**
	 * 是否国际
	 */
	private int isInternational;
	
	/**
	 * 是否海外
	 */
	private int isOverSeas;
	
	/**
	 * 是否华住
	 */
	private int isHuaZhu;
	
	/**
	 * 是否确认后推翻
	 */
	private int isConfirmOverFlow;

	/**
	 * 是否小时房
	 */
	private int isHourRoom;
	
	/**
	 * 买断
	 */
	private Integer buyOut;
	
	/**
	 * 转让
	 */
	private Integer increaseCount;
	
	/**
	 * 是否超过暂缓时间
	 */
	private int isOverRespiteTime;
	
	/**
	 * 携程支付历史URL
	 */
	private String ctripPayUrl;
	
	public PendingExamOrderBo() {
		super();
	}

	public PendingExamOrderBo(ExamOrderPo bo) {
		this.reserNo = bo.getReserNo();
		this.reserStatus = bo.getReserStatus();
		this.arriveDate = bo.getArriveDate();
		this.leaveDate = bo.getLeaveDate();
		this.timeEarly = bo.getTimeEarly();
		this.timeLate = bo.getTimeLate();
		this.cardNo = bo.getCardNo();
		this.roomNum = bo.getRoomNum();
		this.nightNum = bo.getNightNum();
		this.phone = bo.getPhone();
		this.orderMoney = bo.getOrderMoney();
		this.orderType = bo.getOrderType();
		this.hotelId = bo.getHotelId();
		this.hotelName = bo.getHotelName();
		this.hotelStar = bo.getHotelStar();
		this.supplierId = bo.getSupplierId();
		this.supplierName = bo.getSupplierName();
		this.supplierType = bo.getSupplierType();
		this.supplierOtaType = bo.getSupplierOtaType();
		this.proxyId = bo.getProxyId();
		this.cityId = bo.getCityId();
		this.distance = bo.getDistance();
		this.bookingTime = bo.getBookingTime();
		this.amendTime = bo.getAmendTime();
		this.priority = bo.getPriority();
		this.groupId = bo.getGroupId();
		this.isFaxReturn = bo.getIsFaxReturn();
		this.isLinked = bo.getIsLinked();
		this.isPms = bo.getIsPms();
		this.isConfirm = bo.getIsConfirm();
		this.isH = bo.getIsH();
		this.isRepeat = bo.getIsRepeat();
		this.isImmediately = bo.getIsImmediately();
		this.isNew = bo.getIsNew();
		if(bo.getRespiteTime().getTime() >= System.currentTimeMillis()){
			this.isOverRespiteTime = 1;
		}
	}
	
	public String getGroupByKey() {
		return groupByKey;
	}

	public void setGroupByKey(String groupByKey) {
		this.groupByKey = groupByKey;
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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
		if((order.getAdditionalStatus()&67108864) == 67108864){//判断是否直连订单
			this.isDCOrder = 1;
		}
		this.isSupposed = calIsSupposed(order);//判断订单是否赔付
		if((order.getAdditionalStatusI()&1073741824) == 1073741824){//判断订单是否国际
			this.isInternational = 1;
		}
		if(order.getOrderKeyValues() != null){//判断订单是否华住
			for(OrderKeyValue keyValue : order.getOrderKeyValues()){
				if(keyValue.getKey().equalsIgnoreCase("FirstJoinPromotionType") && keyValue.getValue().equalsIgnoreCase("1001")){
					this.isHuaZhu = 1;
					continue;
				}
				if(keyValue.getKey().equalsIgnoreCase("HourRoomStay")){//判断小时房
					this.isHourRoom = 1;
					continue;
				}
			}
		}
		if(StringUtils.isNotEmpty(order.getProvinceId())){//判断是否海外
			String overSeasProvinceIds = ConfigurationManager.getHotSwitchConfig("ExamOrderConfig", ExamOrderConfig.class).getOverSeasProvinceIds();
			if(overSeasProvinceIds.matches(order.getProvinceId())){
				this.isOverSeas = 1;
			}
		}
		if((order.getOrderFlag()&144115188075855872L) == 144115188075855872L){//判断是否确认后推翻
			this.isConfirmOverFlow = 1;
		}
		if(order.getRoomNights() != null && order.getRoomNights().size() != 0){//判断“转让”，买断
			int buy = 0, increase = 0;
			for(RoomNight room : order.getRoomNights()){
				if(room.getInventoryType() != null){
					if(room.getInventoryType() == 1){
						increase += 1;
					}else if(room.getInventoryType() == 3){
						buy += 1;
					}
				}
			}
			if(buy != 0){
				this.buyOut = buy;
			}
			if(increase != 0){
				this.increaseCount = increase;
			}
		}
	}

	public String getOrderStatusZn() {
		return orderStatusZn;
	}

	public void setOrderStatusZn(String orderStatusZn) {
		this.orderStatusZn = orderStatusZn;
	}

	public Integer getEnterTimeMinute() {
		return enterTimeMinute;
	}

	public void setEnterTimeMinute(Integer enterTimeMinute) {
		this.enterTimeMinute = enterTimeMinute;
	}

	public Integer getEnterScreenMinute() {
		return enterScreenMinute;
	}

	public void setEnterScreenMinute(Integer enterScreenMinute) {
		this.enterScreenMinute = enterScreenMinute;
	}

	public int getIsDCOrder() {
		return isDCOrder;
	}

	public void setIsDCOrder(int isDCOrder) {
		this.isDCOrder = isDCOrder;
	}
	
	public int getIsSupposed() {
		return isSupposed;
	}

	public void setIsSupposed(int isSupposed) {
		this.isSupposed = isSupposed;
	}

	public int getIsInternational() {
		return isInternational;
	}

	public void setIsInternational(int isInternational) {
		this.isInternational = isInternational;
	}

	public int getIsOverSeas() {
		return isOverSeas;
	}

	public void setIsOverSeas(int isOverSeas) {
		this.isOverSeas = isOverSeas;
	}

	public int getIsHuaZhu() {
		return isHuaZhu;
	}

	public void setIsHuaZhu(int isHuaZhu) {
		this.isHuaZhu = isHuaZhu;
	}

	public int getIsConfirmOverFlow() {
		return isConfirmOverFlow;
	}

	public void setIsConfirmOverFlow(int isConfirmOverFlow) {
		this.isConfirmOverFlow = isConfirmOverFlow;
	}

	public int getIsHourRoom() {
		return isHourRoom;
	}

	public void setIsHourRoom(int isHourRoom) {
		this.isHourRoom = isHourRoom;
	}

	public Integer getBuyOut() {
		return buyOut;
	}

	public void setBuyOut(Integer buyOut) {
		this.buyOut = buyOut;
	}

	public Integer getIncreaseCount() {
		return increaseCount;
	}

	public void setIncreaseCount(Integer increaseCount) {
		this.increaseCount = increaseCount;
	}
	
	public int getIsOverRespiteTime() {
		return isOverRespiteTime;
	}

	public void setIsOverRespiteTime(int isOverRespiteTime) {
		this.isOverRespiteTime = isOverRespiteTime;
	}

	public String getCtripPayUrl() {
		return ctripPayUrl;
	}

	public void setCtripPayUrl(String ctripPayUrl) {
		this.ctripPayUrl = ctripPayUrl;
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
}
