package com.elong.hotel.proxy.javaorder.getorder;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 调取java getorder接口返回的实体
 * 
 * @author zouyufei
 *
 */
public class Order {

	// shotel id
	private String hotelId;
	// shotel id
	private String hotelName;
	// 实体酒店id
	private String mHotelId;
	// 订单id
	private Long orderId;
	// 客人信息
	private List<Guest> guests;
	// 房间信息
	private List<Room> rooms;
	// 房间数量
	private int roomCount;
	// 间夜信息
	private List<RoomNight> roomNights;
	//
	private Long additionalStatus;
	// 会员卡号
	private Long cardNo;
	// 会员级别
	private String gradeId;
	// 入住日期
	private Date checkInDate;
	// 离店日期
	private Date checkOutDate;
	// 最早到店日期
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date earlyCheckInTime;
	// 最晚到店日期
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date lateCheckInTime;
	// 酒店备注
	private String notesToHotel;
	// 预付：addtionalStatus&256==256&payment=D
	private String payment;
	// 订单状态
	private String status;
	// 父订单id
	private Long sourceOrderId;
	// 订单来源
	private Integer orderFrom;
	// rpid
	private String ratePlanId;
	// rp name
	private String ratePlanName;
	// 房型id
	private String roomTypeId;
	// 房型名称
	private String roomTypeName;
	// m房型id
	private String mRoomTypeId;
	// m房型名称
	private String mRoomTypeName;
	// 订单日期数
	private Integer roomNightsCount;
	// 代理id
	private String proxy;
	// 总卖价
	private BigDecimal sumPrice;
	// 总底价
	private BigDecimal sumCost;
	// 订单时间戳
	private Date orderTimestamp;
	// 订单创建时间
	private Date createTime;
	// 内部备注
	private String notesToElong;
	// 客人备注,该字段已废弃
	private String notesToGuest;

	private int otaType;
	// orderflag&18014398509481984L=18014398509481984L:新单
	private long orderFlag;

	private Integer supplierId;

	private String supplierName;

	private Integer supplierType;

	private List<OrderAction> orderActionList;

	// orderKeyValue
	private List<OrderKeyValue> orderKeyValues;
	// 促销汇总
	private List<OrderPromotion> promotions;
	// 促销明细
	private List<OrderPromotionDetail> promotionDetails;
	// 货币
	private String currencyCode;
	// 是否是灰名单
	private boolean isGreyList;
	// 担保类型
	private Byte vouchType;
	// 联系人
	private Contact contact;
	// 确认方法
	private Integer confirmMethodCode;
	// 确认方法
	private String confirmMethod;
	// 客人类型
	private String guestType;
	// 客人类型编码
	private Integer guestTypeCode;
	// 促销编码
	private String promotionChannelCode;
	// 促销描述
	private String promotionChannelDesc;
	// 加床个数
	private Integer addBedCount;
	// 加床价
	private BigDecimal addBedPrice;
	// 是否加床
	private boolean addBed;
	// 是否催审核
	private boolean isUrgentVerify;
	// 修改人
	private String modifyName;

	private Date modifyTime;
	// 支付状态
	private Integer payStatus;
	// 支付金额RMB
	private BigDecimal payAmount;
	// 集团Id
	private Integer groupId;

	private String mHotelName;

	private String cityId;

	private String cityName;

	private String provinceId;

	private String provinceName;

	private Integer supplierOtaType;

	private Integer cooperationType;

	/**
	 * 预测满房概率
	 */
	private String fullRoomRate;

	/**
	 *  酒店传真号码
	 */
	private String sHotelFax;

	/**
	 * 供应商订单号
	 */
	private String cooperationOrderId;

	/**
	 * 担保信息
	 */
	private OrderVouchRule baseVouchRule;

	// 预定距离
	private Integer distanceFromHotelWhenBooking;

	private String createName;

    private Integer businessSystemId;

    private Integer appClientType;

	/**
	 * 订单来源 ；同程标展示字段
	 */
	private int originFrom;

    private Date pmsConfirmTime;

    public Integer getBusinessSystemId() {
        return businessSystemId;
    }

    public void setBusinessSystemId(Integer businessSystemId) {
        this.businessSystemId = businessSystemId;
    }

    public Integer getAppClientType() {
        return appClientType;
    }

    public void setAppClientType(Integer appClientType) {
        this.appClientType = appClientType;
    }

    public String getmRoomTypeId() {
        return mRoomTypeId;
    }

    public void setmRoomTypeId(String mRoomTypeId) {
        this.mRoomTypeId = mRoomTypeId;
    }

	public Date getOrderTimestamp() {
		return orderTimestamp;
	}

	public void setOrderTimestamp(Date orderTimestamp) {
		this.orderTimestamp = orderTimestamp;
	}

	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public Long getAdditionalStatus() {
		return additionalStatus;
	}

	public void setAdditionalStatus(long additionalStatus) {
		this.additionalStatus = additionalStatus;
	}

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public String getNotesToHotel() {
		return notesToHotel;
	}

	public void setNotesToHotel(String notesToHotel) {
		this.notesToHotel = notesToHotel;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getOrderFrom() {
		return orderFrom;
	}

	public void setOrderFrom(int orderFrom) {
		this.orderFrom = orderFrom;
	}

	public String getRatePlanId() {
		return ratePlanId;
	}

	public void setRatePlanId(String ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	public String getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getProxy() {
		return proxy;
	}

	public void setProxy(String proxy) {
		this.proxy = proxy;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public BigDecimal getSumPrice() {
		return sumPrice;
	}

	public void setSumPrice(BigDecimal sumPrice) {
		this.sumPrice = sumPrice;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getSourceOrderId() {
		return sourceOrderId;
	}

	public void setSourceOrderId(Long sourceOrderId) {
		this.sourceOrderId = sourceOrderId;
	}

	public void setAdditionalStatus(Long additionalStatus) {
		this.additionalStatus = additionalStatus;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public void setOrderFrom(Integer orderFrom) {
		this.orderFrom = orderFrom;
	}

	public List<RoomNight> getRoomNights() {
		return roomNights;
	}

	public void setRoomNights(List<RoomNight> roomNights) {
		this.roomNights = roomNights;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Date getEarlyCheckInTime() {
		return earlyCheckInTime;
	}

	public void setEarlyCheckInTime(Date earlyCheckInTime) {
		this.earlyCheckInTime = earlyCheckInTime;
	}

	public Date getLateCheckInTime() {
		return lateCheckInTime;
	}

	public void setLateCheckInTime(Date lateCheckInTime) {
		this.lateCheckInTime = lateCheckInTime;
	}

	public String getNotesToElong() {
		return notesToElong;
	}

	public Integer getOtaType() {
		return otaType;
	}

	public void setOtaType(int otaType) {
		this.otaType = otaType;
	}

	public void setNotesToElong(String notesToElong) {
		this.notesToElong = notesToElong;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public List<OrderPromotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<OrderPromotion> promotions) {
		this.promotions = promotions;
	}

	public List<OrderPromotionDetail> getPromotionDetails() {
		return promotionDetails;
	}

	public void setPromotionDetails(List<OrderPromotionDetail> promotionDetails) {
		this.promotionDetails = promotionDetails;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public boolean isGreyList() {
		return isGreyList;
	}

	public void setGreyList(boolean isGreyList) {
		this.isGreyList = isGreyList;
	}

	public Byte getVouchType() {
		return vouchType;
	}

	public void setVouchType(Byte vouchType) {
		this.vouchType = vouchType;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Integer getConfirmMethodCode() {
		return confirmMethodCode;
	}

	public void setConfirmMethodCode(Integer confirmMethodCode) {
		this.confirmMethodCode = confirmMethodCode;
	}

	public String getConfirmMethod() {
		return confirmMethod;
	}

	public void setConfirmMethod(String confirmMethod) {
		this.confirmMethod = confirmMethod;
	}

	public String getGuestType() {
		return guestType;
	}

	public void setGuestType(String guestType) {
		this.guestType = guestType;
	}

	public Integer getGuestTypeCode() {
		return guestTypeCode;
	}

	public void setGuestTypeCode(Integer guestTypeCode) {
		this.guestTypeCode = guestTypeCode;
	}

	public String getPromotionChannelCode() {
		return promotionChannelCode;
	}

	public void setPromotionChannelCode(String promotionChannelCode) {
		this.promotionChannelCode = promotionChannelCode;
	}

	public String getPromotionChannelDesc() {
		return promotionChannelDesc;
	}

	public void setPromotionChannelDesc(String promotionChannelDesc) {
		this.promotionChannelDesc = promotionChannelDesc;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getRatePlanName() {
		return ratePlanName;
	}

	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public Integer getRoomNightsCount() {
		return roomNightsCount;
	}

	public void setRoomNightsCount(Integer roomNightsCount) {
		this.roomNightsCount = roomNightsCount;
	}

	public boolean isUrgentVerify() {
		return isUrgentVerify;
	}

	public void setIsGreyList(boolean isGreyList) {
		this.isGreyList = isGreyList;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public List<OrderKeyValue> getOrderKeyValues() {
		return orderKeyValues;
	}

	public void setOrderKeyValues(List<OrderKeyValue> orderKeyValues) {
		this.orderKeyValues = orderKeyValues;
	}

	public Integer getAddBedCount() {
		return addBedCount;
	}

	public void setAddBedCount(Integer addBedCount) {
		this.addBedCount = addBedCount;
	}

	public BigDecimal getAddBedPrice() {
		return addBedPrice;
	}

	public void setAddBedPrice(BigDecimal addBedPrice) {
		this.addBedPrice = addBedPrice;
	}

	public boolean isAddBed() {
		return addBed;
	}

	public void setAddBed(boolean addBed) {
		this.addBed = addBed;
	}

	public void setIsUrgentVerify(boolean isUrgentVerify) {
		this.isUrgentVerify = isUrgentVerify;
	}

	public String getModifyName() {
		return modifyName;
	}

	public void setModifyName(String modifyName) {
		this.modifyName = modifyName;
	}

	public Integer getSupplierType() {
		return supplierType;
	}

	public void setSupplierType(Integer supplierType) {
		this.supplierType = supplierType;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getMhotelId() {
		return mHotelId;
	}

	public void setMhotelId(String mHotelId) {
		this.mHotelId = mHotelId;
	}

	public long getOrderFlag() {
		return orderFlag;
	}

	public void setOrderFlag(long orderFlag) {
		this.orderFlag = orderFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getGradeId() {
		return gradeId;
	}

	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public BigDecimal getSumCost() {
		return sumCost;
	}

	public void setSumCost(BigDecimal sumCost) {
		this.sumCost = sumCost;
	}

	public String getMHotelName() {
		return mHotelName;
	}

	public void setMHotelName(String mHotelName) {
		this.mHotelName = mHotelName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Integer getDistanceFromHotelWhenBooking() {
		return distanceFromHotelWhenBooking;
	}

	public void setDistanceFromHotelWhenBooking(Integer distanceFromHotelWhenBooking) {
		this.distanceFromHotelWhenBooking = distanceFromHotelWhenBooking;
	}

	public Integer getSupplierOtaType() {
		return supplierOtaType;
	}

	public void setSupplierOtaType(Integer supplierOtaType) {
		this.supplierOtaType = supplierOtaType;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getCooperationType() {
		return cooperationType;
	}

	public void setCooperationType(Integer cooperationType) {
		this.cooperationType = cooperationType;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getMRoomTypeName() {
		return mRoomTypeName;
	}

	public void setMRoomTypeName(String mRoomTypeName) {
		this.mRoomTypeName = mRoomTypeName;
	}

	public String getNotesToGuest() {
		return notesToGuest;
	}

	public void setNotesToGuest(String notesToGuest) {
		this.notesToGuest = notesToGuest;
	}

	public String getsHotelFax() {
		return sHotelFax;
	}

	public void setsHotelFax(String sHotelFax) {
		this.sHotelFax = sHotelFax;
	}

	public List<OrderAction> getOrderActionList() {
		return orderActionList;
	}

	public void setOrderActionList(List<OrderAction> orderActionList) {
		this.orderActionList = orderActionList;
	}

	public String getFullRoomRate() {
		return fullRoomRate;
	}

	public void setFullRoomRate(String fullRoomRate) {
		this.fullRoomRate = fullRoomRate;
	}

	public String getCooperationOrderId() {
		return cooperationOrderId;
	}

	public void setCooperationOrderId(String cooperationOrderId) {
		this.cooperationOrderId = cooperationOrderId;
	}

	public OrderVouchRule getBaseVouchRule() {
		return baseVouchRule;
	}

	public void setBaseVouchRule(OrderVouchRule baseVouchRule) {
		this.baseVouchRule = baseVouchRule;
	}


	public int getOriginFrom() {
		return originFrom;
	}

	public void setOriginFrom(int originFrom) {
		this.originFrom = originFrom;
	}

    public Date getPmsConfirmTime() {
        return pmsConfirmTime;
    }

    public void setPmsConfirmTime(Date pmsConfirmTime) {
        this.pmsConfirmTime = pmsConfirmTime;
    }

	/**
	 * // ota type = 3 或者 originfrom = 1 则订单是同程艺龙
	 * @return
	 */
	public int checkTcyl() {
		return (this.getOtaType() == 3 || this.getOriginFrom() == 1) ? 1 : 0;
	}
}
