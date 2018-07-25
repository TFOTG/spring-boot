/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmorder.po.PendingConfirmOrderPo.java]
 * Createion [2017年6月27日]
 */
package com.elong.hotel.hotelconfirm.confirmorder.po;

import java.util.ArrayList;
import java.util.List;

import com.elong.common.util.StringUtils;
import com.elong.hotel.proxy.product.bo.ContactInfoList;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class PendingHotelPo {
	
	/**
	 * 酒店名称
	 */
	private String hotelname;
	
	/**
	 * 供应商名称
	 */
	private String suppliername;
	
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
	private Integer suppliertype;
	
	/**
	 * 酒店特殊注释
	 */
	private String specialnote;

	
	/**
	 * 酒店订单数量
	 */
	private int orderCount;
	
	/**
	 * 是否ebk在线
	 */
	private int ebonline;
	
	/**
	 * 酒店传真号码
	 */
	private String shotelfax;

	/**
	 * 供应商订单号
	 */
	private String cooperationOrderId;

	/**
	 * 是否展示同程标识 originfrom=1
	 */
	private int originFrom;

	/**
	 * 是否展示同程标识 otatype=3
	 */
	private int otaType;

	private List<PendingConfirmOrderPo> orderlist;
	
	private int roomContactSwitch;
	
	/**
	 * 酒店电话
	 */
	private String hotelContacter;
	
	/**
	 * 酒店前台电话
	 */
	private String hotelLobbyTel;
	
	/**
	 * 联系人电话
	 */
	private String hotelPhone;
	
	/**
	 * 房量确认联系人电话
	 */
	private String roomContact;
	
	public PendingHotelPo(){
		super();
	}
	
	public PendingHotelPo(PendingHotelPo po1, PendingConfirmOrderPo po2){
		super();
		this.cooperationOrderId = po1.getCooperationOrderId();
		this.ebonline = po1.getEbonline();
		this.hotelContacter = po1.getHotelContacter();
		this.hotelid = po1.getHotelid();
		this.hotelLobbyTel = po1.getHotelLobbyTel();
		this.hotelname = po1.getHotelname();
		this.hotelPhone = po1.getHotelPhone();
		this.orderCount = po1.getOrderCount();
		this.originFrom = po1.getOriginFrom();
		this.otaType = po1.getOtaType();
		this.roomContact = po1.getRoomContact();
		this.roomContactSwitch = po1.getRoomContactSwitch();
		this.shotelfax = po1.getShotelfax();
		this.specialnote = po1.getSpecialnote();
		this.supplierid = po1.getSupplierid();
		this.suppliername = po1.getSuppliername();
		this.suppliertype = po1.getSuppliertype();
		this.orderlist = new ArrayList<>();
		this.orderlist.add(po2);
	}
	
	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public String getHotelid() {
		return hotelid;
	}

	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public Integer getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}

	public Integer getSuppliertype() {
		return suppliertype;
	}

	public void setSuppliertype(Integer suppliertype) {
		this.suppliertype = suppliertype;
	}

	public String getSpecialnote() {
		return specialnote;
	}

	public void setSpecialnote(String specialnote) {
		this.specialnote = specialnote;
	}

	public List<PendingConfirmOrderPo> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<PendingConfirmOrderPo> orderlist) {
		this.orderlist = orderlist;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public int getEbonline() {
		return ebonline;
	}

	public void setEbonline(int ebonline) {
		this.ebonline = ebonline;
	}

	public String getShotelfax() {
		return shotelfax;
	}

	public void setShotelfax(String shotelfax) {
		this.shotelfax = shotelfax;
	}

	public int getRoomContactSwitch() {
		return roomContactSwitch;
	}

	public void setRoomContactSwitch(int roomContactSwitch) {
		this.roomContactSwitch = roomContactSwitch;
	}

	public String getCooperationOrderId() {
		return cooperationOrderId;
	}

	public void setCooperationOrderId(String cooperationOrderId) {
		this.cooperationOrderId = cooperationOrderId;
	}


	public int getOriginFrom() {
		return originFrom;
	}

	public void setOriginFrom(int originFrom) {
		this.originFrom = originFrom;
	}

	public int getOtaType() {
		return otaType;
	}

	public void setOtaType(int otaType) {
		this.otaType = otaType;
	}

	public String getHotelContacter() {
		return hotelContacter;
	}

	public void setHotelContacter(String hotelContacter) {
		this.hotelContacter = hotelContacter;
	}

	public String getHotelLobbyTel() {
		return hotelLobbyTel;
	}

	public void setHotelLobbyTel(String hotelLobbyTel) {
		this.hotelLobbyTel = hotelLobbyTel;
	}

	public String getHotelPhone() {
		return hotelPhone;
	}

	public void setHotelPhone(String hotelPhone) {
		this.hotelPhone = hotelPhone;
	}

	public String getRoomContact() {
		return roomContact;
	}

	public void setRoomContact(String roomContact) {
		this.roomContact = roomContact;
	}

	@Override
	public boolean equals(Object obj) {
		PendingHotelPo target = (PendingHotelPo) obj;
		if(StringUtils.equalsIgnoreCase(this.hotelid, target.getHotelid()) && 
				StringUtils.equalsIgnoreCase(this.hotelContacter, target.getHotelContacter()) && 
				StringUtils.equalsIgnoreCase(this.hotelPhone, target.getHotelPhone()) && 
				StringUtils.equalsIgnoreCase(this.roomContact, target.getRoomContact())){
			
			return true;
			
		}
		return false;
	}
	
	/**
	 * 初始化酒店电话信息
	 *
	 * @param info
	 */
	public void setHotelPhoneInfo(ContactInfoList info){
		if(info != null){
			this.hotelContacter = info.getHotelContacter();
			this.hotelLobbyTel = info.getHotelLobbyTel();
			this.hotelPhone = info.getHotelPhone();
			this.roomContact = info.getRoomContact();
		}
	}
	
}
