/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmorder.po.PendingConfirmOrderPo.java]
 * Createion [2017年6月27日]
 */
package com.elong.hotel.hotelconfirm.confirmorder.po;

import java.math.BigDecimal;
import java.util.List;

import com.elong.hotel.proxy.javaorder.getorder.Guest;


/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class PendingConfirmOrderPo {

	/**
	 * 订单号
	 */
	private Integer reserno;
	
	/**
	 * 订单状态
	 */
	private String reserstatus;
	
	/**
	 * 到店时间
	 */
	private String arrivedate;
	
	/**
	 * 离店时间
	 */
	private String leavedate;
	
	/**
	 * 最早到店时间
	 */
	private String timeearly;
	
	/**
	 * 最晚到店时间
	 */
	private String timelate;
	
	/**
	 * 酒店id
	 */
	private String hotelid;
	
	/**
	 * 供应商id
	 */
	private Integer supplierid;
	
	/**
	 * 供应商类型
	 */
	private int suppliertype;
	
	/**
	 * 优先级
	 */
	private int priority;
	
	/**
	 * eb策略id
	 */
	private int ebkstrategyid;
	
	/**
	 * 承诺时间
	 */
	private String promisetime;
	
	/**
	 * 是否传真回传
	 */
	private int isfaxreturn;
	
	/**
	 * 是否联单重单
	 */
	private int islinked;
	
	/**
	 * 是否eb拒单
	 */
	private int isebrefuse;
	
	/**
	 * 是否催确认
	 */
	private int urge;
	
	/**
	 * 暂缓时间
	 */
	private String respitetime;
	
	/**
	 * 获取时间
	 */
	private String distributetime;

	/**
	 * 是否变更单
	 */
	private Integer ischangeorder;
	
	/**
	 * 签约
	 */
	private Integer signed;
	
	/**
	 * 签约数量
	 */
	private Integer signedcount;
	
	/**
	 * 添加
	 */
	private Integer increase;
	
	/**
	 * 添加数量
	 */
	private Integer increasecount;
	
	/**
	 * 买断
	 */
	private Integer buyout;
	
	/**
	 * 直连失败
	 */
	private Integer dcfail;
	
	/**
	 * 小时房
	 */
	private Integer hourroom;
	
	/**
	 * 发送短信确认
	 */
	private Integer sendmessage;
	
	/**
	 * 会员登记  钻石 龙萃
	 */
	private String gradeId;
	
	/**
	 * 给酒店的备注
	 */
	private String notesToHotel;
	
	/**
	 * 给客人的备注
	 */
	private String notesToGuest;
	
	/**
	 * 艺龙内部备注
	 */
	private String notesToElong;
	
	/**
	 * 是否直签
	 */
	private Integer cooperationType;
	
	/**
	 * 订单支付类型
	 */
	private Long additionalStatus;
	
	/**
	 * 确认号
	 */
	private String confirmNo;
	
	/**
	 * 房型
	 */
	private String roomTypeName;
	
	/**
	 * 房量
	 */
	private int roomCount;
	
	/**
	 * 支付类型
	 */
	private String payment;
	
	/**
	 * 支付类型
	 */
	private List<Guest> guests;
	
	/**
	 * 早餐
	 */
	private String roomNightBreakfastCount;
	
	/**
	 * 总价格
	 */
	private BigDecimal sumPrice;
	
	/**
	 * 总花费
	 */
	private BigDecimal sumCost;
	
	/**
	 * 联系电话
	 */
	private String contactPhone;
	
	/**
	 * 联系手机
	 */
	private String contactMobile;
	
	/**
	 * 预定人
	 */
	private String createName;
	
	/**
	 * 创建时间
	 */
	private String createTime;
	
	public Integer getReserno() {
		return reserno;
	}

	public void setReserno(Integer reserno) {
		this.reserno = reserno;
	}

	public String getReserstatus() {
		return reserstatus;
	}

	public void setReserstatus(String reserstatus) {
		this.reserstatus = reserstatus;
	}

	public String getArrivedate() {
		return arrivedate;
	}

	public void setArrivedate(String arrivedate) {
		this.arrivedate = arrivedate;
	}

	public String getLeavedate() {
		return leavedate;
	}

	public void setLeavedate(String leavedate) {
		this.leavedate = leavedate;
	}

	public String getTimeearly() {
		return timeearly;
	}

	public void setTimeearly(String timeearly) {
		this.timeearly = timeearly;
	}

	public String getTimelate() {
		return timelate;
	}

	public void setTimelate(String timelate) {
		this.timelate = timelate;
	}

	public String getHotelid() {
		return hotelid;
	}

	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}

	public Integer getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}

	public int getSuppliertype() {
		return suppliertype;
	}

	public void setSuppliertype(int suppliertype) {
		this.suppliertype = suppliertype;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getEbkstrategyid() {
		return ebkstrategyid;
	}

	public void setEbkstrategyid(int ebkstrategyid) {
		this.ebkstrategyid = ebkstrategyid;
	}

	public String getPromisetime() {
		return promisetime;
	}

	public void setPromisetime(String promisetime) {
		this.promisetime = promisetime;
	}

	public int getIsfaxreturn() {
		return isfaxreturn;
	}

	public void setIsfaxreturn(int isfaxreturn) {
		this.isfaxreturn = isfaxreturn;
	}

	public int getIslinked() {
		return islinked;
	}

	public void setIslinked(int islinked) {
		this.islinked = islinked;
	}

	public int getIsebrefuse() {
		return isebrefuse;
	}

	public void setIsebrefuse(int isebrefuse) {
		this.isebrefuse = isebrefuse;
	}

	public int getUrge() {
		return urge;
	}

	public void setUrge(int urge) {
		this.urge = urge;
	}

	public String getRespitetime() {
		return respitetime;
	}

	public void setRespitetime(String respitetime) {
		this.respitetime = respitetime;
	}

	public String getDistributetime() {
		return distributetime;
	}

	public void setDistributetime(String distributetime) {
		this.distributetime = distributetime;
	}

	public Integer getIschangeorder() {
		return ischangeorder;
	}

	public void setIschangeorder(Integer ischangeorder) {
		this.ischangeorder = ischangeorder;
	}

	public Integer getSigned() {
		return signed;
	}

	public void setSigned(Integer signed) {
		this.signed = signed;
	}

	public Integer getSignedcount() {
		return signedcount;
	}

	public void setSignedcount(Integer signedcount) {
		this.signedcount = signedcount;
	}

	public Integer getIncrease() {
		return increase;
	}

	public void setIncrease(Integer increase) {
		this.increase = increase;
	}

	public Integer getIncreasecount() {
		return increasecount;
	}

	public void setIncreasecount(Integer increasecount) {
		this.increasecount = increasecount;
	}

	public Integer getBuyout() {
		return buyout;
	}

	public void setBuyout(Integer buyout) {
		this.buyout = buyout;
	}

	public Integer getDcfail() {
		return dcfail;
	}

	public void setDcfail(Integer dcfail) {
		this.dcfail = dcfail;
	}

	public Integer getHourroom() {
		return hourroom;
	}

	public void setHourroom(Integer hourroom) {
		this.hourroom = hourroom;
	}

	public Integer getSendmessage() {
		return sendmessage;
	}

	public void setSendmessage(Integer sendmessage) {
		this.sendmessage = sendmessage;
	}

	public String getGradeId() {
		return gradeId;
	}

	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}

	public String getNotesToHotel() {
		return notesToHotel;
	}

	public void setNotesToHotel(String notesToHotel) {
		this.notesToHotel = notesToHotel;
	}

	public String getNotesToGuest() {
		return notesToGuest;
	}

	public void setNotesToGuest(String notesToGuest) {
		this.notesToGuest = notesToGuest;
	}

	public String getNotesToElong() {
		return notesToElong;
	}

	public void setNotesToElong(String notesToElong) {
		this.notesToElong = notesToElong;
	}

	public Integer getCooperationType() {
		return cooperationType;
	}

	public void setCooperationType(Integer cooperationType) {
		this.cooperationType = cooperationType;
	}

	public Long getAdditionalStatus() {
		return additionalStatus;
	}

	public void setAdditionalStatus(Long additionalStatus) {
		this.additionalStatus = additionalStatus;
	}

	public String getConfirmNo() {
		return confirmNo;
	}

	public void setConfirmNo(String confirmNo) {
		this.confirmNo = confirmNo;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

	public String getRoomNightBreakfastCount() {
		return roomNightBreakfastCount;
	}

	public void setRoomNightBreakfastCount(String roomNightBreakfastCount) {
		this.roomNightBreakfastCount = roomNightBreakfastCount;
	}

	public BigDecimal getSumPrice() {
		return sumPrice;
	}

	public void setSumPrice(BigDecimal sumPrice) {
		this.sumPrice = sumPrice;
	}

	public BigDecimal getSumCost() {
		return sumCost;
	}

	public void setSumCost(BigDecimal sumCost) {
		this.sumCost = sumCost;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactMobile() {
		return contactMobile;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
