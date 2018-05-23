package com.elong.hotel.hotelconfirm.group.bo;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.common.util.StringUtils;
import com.elong.hotel.hotelconfirm.examorder.enums.GroupOrderStatusEnum;
import com.elong.hotel.hotelconfirm.examorder.enums.HotelStarEnum;
import com.elong.hotel.hotelconfirm.examorder.enums.OrderTypeEnum;
import com.elong.hotel.hotelconfirm.examorder.enums.PriorityEnum;
import com.elong.hotel.hotelconfirm.group.po.ConfirmGroupPo;
import com.elong.hotel.hotelconfirm.group.po.ConfirmGroupTagPo;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月15日 下午3:34:53   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class ExamGroupBo implements Serializable{

	/** 
	 * long ExamGroupBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer groupId;
	
	private String groupName;
	
	private boolean enable;
	
	private String operator;
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date operatedTime;
	
	private String orderStatus = "";
	
	private String cityId = "";
	
	private String isOutTime = "";
	
	private String hotelStar = "";
	
	private String memberLevel = "";
	
	private String proxyId = "";
	
	private String isConfirmed = "";
	
	private String orderType = "";
	
	private String supplierId = "";
	
	private String isSupposed = "";
	
	private String orderMoney = "";
	
	private String rejectTime = "";
	
	private String roomNight = "";
	
	private String priority = "";
	
	private String isNew = "";
	
	private Integer sort;

	public ExamGroupBo() {
		super();
	}
	
	public ExamGroupBo(ConfirmGroupPo po) {
		super();
		this.groupId = po.getId();
		this.groupName = po.getGroupname();
		this.enable = po.isEnable();
		this.operator = po.getOpname();
		this.operatedTime = po.getOpdate();
		this.sort = po.getSort();
		
		if(po.getGrouptags() != null && po.getGrouptags().size() != 0){
			final String allZn = "不限";
			final String allEn = "ALL";
			final String yes = "是";
			final String no = "否";
			final String separator = ",";
			for(ConfirmGroupTagPo tag : po.getGrouptags()){
				StringBuilder sb = null;
				switch (tag.getTagkey()) {
				case "orderStatus":
					if(tag.getTagvalue().equalsIgnoreCase(allEn)){
						this.orderStatus = allZn;
					}else{
						sb = new StringBuilder();
						for(String s : tag.getTagvalue().split(separator)){
							sb.append(GroupOrderStatusEnum.getValueDesc(s)).append(separator);
						}
						this.orderStatus = StringUtils.isEmpty(sb.toString()) ? allZn : sb.substring(0, sb.lastIndexOf(separator));
					}
					break;
				case "cityId":
					this.cityId = tag.getTagvalue().equalsIgnoreCase(allEn) ? allZn : tag.getTagvalue();
					break;
				case "isOutTime":
					if(tag.getTagvalue().equalsIgnoreCase(allEn)){
						this.isOutTime = allZn;
					}else{
						this.isOutTime = Integer.valueOf(tag.getTagvalue()) == 0 ? no : yes;
					}
					break;
				case "hotelStar":
					if(tag.getTagvalue().equalsIgnoreCase(allEn)){
						this.hotelStar = allZn;
					}else{
						sb = new StringBuilder();
						for(String s : tag.getTagvalue().split(separator)){
							sb.append(HotelStarEnum.getValueDesc(Integer.valueOf(s))).append(separator);
						}
						this.hotelStar = StringUtils.isEmpty(sb.toString()) ? allZn : sb.substring(0, sb.lastIndexOf(separator));
					}
					break;
				case "memberLevel":
					this.memberLevel = tag.getTagvalue().equalsIgnoreCase(allEn) ? allZn : tag.getTagvalue();
					break;
				case "proxyId":
					this.proxyId = tag.getTagvalue().equalsIgnoreCase(allEn) ? allZn : tag.getTagvalue();
					break;
				case "isConfirmed":
					if(tag.getTagvalue().equalsIgnoreCase(allEn)){
						this.isConfirmed = allZn;
					}else{
						this.isConfirmed = Integer.valueOf(tag.getTagvalue()) == 0 ? no : yes;
					}
					break;
				case "orderType":
					if(tag.getTagvalue().equalsIgnoreCase(allEn)){
						this.orderType = allZn;
					}else{
						sb = new StringBuilder();
						for(String s : tag.getTagvalue().split(separator)){
							sb.append(OrderTypeEnum.getValueDesc(Integer.valueOf(s))).append(separator);
						}
						
						this.orderType = StringUtils.isEmpty(sb.toString()) ? allZn : sb.substring(0, sb.lastIndexOf(separator));
					}
					break;
				case "supplierId":
					this.supplierId = tag.getTagvalue().equalsIgnoreCase(allEn) ? allZn : tag.getTagvalue();
					break;
				case "isSupposed":
					if(tag.getTagvalue().equalsIgnoreCase(allEn)){
						this.isSupposed = allZn;
					}else{
						this.isSupposed = Integer.valueOf(tag.getTagvalue()) == 0 ? no : yes;
					}
					break;
				case "orderMoney":
					this.orderMoney = tag.getTagvalue().equalsIgnoreCase(allEn) ? allZn : tag.getTagvalue();
					break;
				case "rejectTime":
					this.rejectTime = tag.getTagvalue().equalsIgnoreCase(allEn) ? allZn : tag.getTagvalue();
					break;
				case "roomNight":
					this.roomNight = tag.getTagvalue().equalsIgnoreCase(allEn) ? allZn : tag.getTagvalue();
					break;
				case "priority":
					if(tag.getTagvalue().equalsIgnoreCase(allEn)){
						this.priority = allZn;
					}else{
						sb = new StringBuilder();
						for(String s : tag.getTagvalue().split(separator)){
							sb.append(PriorityEnum.getValueDesc(Integer.valueOf(s))).append(separator);
						}
						
						this.priority = StringUtils.isEmpty(sb.toString()) ? allZn : sb.substring(0, sb.lastIndexOf(separator));
					}
					break;
				case "isNew":
					if(tag.getTagvalue().equalsIgnoreCase(allEn)){
						this.isNew = allZn;
					}else{
						this.isNew = Integer.valueOf(tag.getTagvalue()) == 0 ? no : yes;
					}
					break;					
				default:
					break;
				}
				
			}
		}
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public boolean getEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getOperatedTime() {
		return operatedTime;
	}

	public void setOperatedTime(Date operatedTime) {
		this.operatedTime = operatedTime;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getIsOutTime() {
		return isOutTime;
	}

	public void setIsOutTime(String isOutTime) {
		this.isOutTime = isOutTime;
	}

	public String getHotelStar() {
		return hotelStar;
	}

	public void setHotelStar(String hotelStar) {
		this.hotelStar = hotelStar;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public String getProxyId() {
		return proxyId;
	}

	public void setProxyId(String proxyId) {
		this.proxyId = proxyId;
	}

	public String getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(String isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getIsSupposed() {
		return isSupposed;
	}

	public void setIsSupposed(String isSupposed) {
		this.isSupposed = isSupposed;
	}

	public String getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(String orderMoney) {
		this.orderMoney = orderMoney;
	}

	public String getRejectTime() {
		return rejectTime;
	}

	public void setRejectTime(String rejectTime) {
		this.rejectTime = rejectTime;
	}

	public String getRoomNight() {
		return roomNight;
	}

	public void setRoomNight(String roomNight) {
		this.roomNight = roomNight;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getIsNew() {
		return isNew;
	}

	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
}
