package com.elong.hotel.hotelconfirm.confirmorder.vo;

import com.elong.hotel.common.config.ConfirmOrderConfig;
import com.elong.hotel.common.parameter.PaginationParameter;
import com.elong.hotel.hotelconfirm.confirmorder.po.ConfirmOrderPo;
import com.elong.hotel.hotelconfirm.group.bo.GroupGettingBo;
import com.elong.hotel.hotelconfirm.group.enums.GettingTypeEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by Hualong.Li on 17/6/12.
 */
public class ConfirmOrderVO  extends PaginationParameter {

	private Set<Integer> rankIds;

	private List<String> groupIds;

	private String ivrStartTimeL;

	private String staffName;

	private Integer reserNo;

	private String hotelId;

	private List<String> hotelIds;

	private String supplierId;

	private List<String> supplierIds;

	private String bussinessGuid;

	private String orderIds;

	private String reserStatus;

	private Integer ivrStatus;

	private Integer sortTimeL;

	private Integer respitetimeL;

	private Integer sortTimeN;

	public Set<Integer> getRankIds() {
		return rankIds;
	}

	public void setRankIds(Set<Integer> rankIds) {
		this.rankIds = rankIds;
	}

	public String getIvrStartTimeL() {
		return ivrStartTimeL;
	}

	public void setIvrStartTimeL(String ivrStartTimeL) {
		this.ivrStartTimeL = ivrStartTimeL;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getBussinessGuid() {
		return bussinessGuid;
	}

	public void setBussinessGuid(String bussinessGuid) {
		this.bussinessGuid = bussinessGuid;
	}

	public String getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(String orderIds) {
		this.orderIds = orderIds;
	}

	public String getReserStatus() {
		return reserStatus;
	}

	public void setReserStatus(String reserStatus) {
		this.reserStatus = reserStatus;
	}

	public Integer getIvrStatus() {
		return ivrStatus;
	}

	public void setIvrStatus(Integer ivrStatus) {
		this.ivrStatus = ivrStatus;
	}

	public Integer getSortTimeN() {
		return sortTimeN;
	}

	public void setSortTimeN(Integer sortTimeN) {
		this.sortTimeN = sortTimeN;
	}

	public List<String> getGroupIds() {
		return groupIds;
	}

	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public Integer getSortTimeL() {
		return sortTimeL;
	}

	public void setSortTimeL(Integer sortTimeL) {
		this.sortTimeL = sortTimeL;
	}

	public Integer getRespitetimeL() {
		return respitetimeL;
	}

	public void setRespitetimeL(Integer respitetimeL) {
		this.respitetimeL = respitetimeL;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public List<String> getHotelIds() {
		return hotelIds;
	}

	public void setHotelIds(List<String> hotelIds) {
		this.hotelIds = hotelIds;
	}

	public List<String> getSupplierIds() {
		return supplierIds;
	}

	public void setSupplierIds(List<String> supplierIds) {
		this.supplierIds = supplierIds;
	}

	public ConfirmOrderVO() {
	}

	public ConfirmOrderVO(List<ConfirmOrderPo> confirmOrders,GroupGettingBo bo,ConfirmOrderConfig config) {
		this.sortTimeL = 0;
		this.respitetimeL = 0;
		this.setOrderField("min(priority) asc,max(isfaxreturn) desc,max(urge) asc,max(isebrefuse) desc,min(sorttime) ");
		this.setOrderFieldType("asc");
		this.setStratItem(1);
		this.setSelectColumns("id, reserno, reserstatus, cardno, `mod`, arrivedate, leavedate, timeearly, timelate, hotelid,\n"
				+ "  hotelname, supplierid, suppliertype, suppliername, supplierotatype, proxyid, cityid,\n"
				+ "  distance, confirmtype, bookingtime, amendtime, priority, groupid, rankid, ebkstrategyid,\n"
				+ "  staffname, distributetime, promisetime, promisechangetimes, isfaxreturn, islinked, isebrefuse,\n"
				+ "  urge, respitetime, nextservicetime, ivrguid, ivrstatus, ivrstarttime, entertime,\n"
				+ "  sorttime, defaultsorttime, firstrefusedtime, ordertimestamplong");
		this.staffName = "";

		List<String> ids = new ArrayList<>();
		for(ConfirmOrderPo po:confirmOrders) {
			if(bo.getGettingtype() == GettingTypeEnum.Hotel.getKey()) {
				ids.add(po.getHotelId());

			}else if (bo.getGettingtype() == GettingTypeEnum.Hotel.getKey()) {
				ids.add(po.getSupplierId());
			}
		}

		if(bo.getGettingtype() == GettingTypeEnum.Hotel.getKey()) {
			this.hotelIds = ids;
			this.setPageSize(config.getHotelOrderSize());
		}else if (bo.getGettingtype() == GettingTypeEnum.Hotel.getKey()) {
			this.supplierIds = ids;
			this.setPageSize(config.getSupplierOrderSize());
		}
	}

	public ConfirmOrderVO(GroupGettingBo bo,ConfirmOrderConfig config) {
		this.groupIds = Arrays.asList(bo.getGroupIds().split(","));
		this.sortTimeL = 0;
		this.respitetimeL = 0;
		this.staffName = "";

		this.setOrderField("min(priority) asc,max(isfaxreturn) desc,max(urge) asc,max(isebrefuse) desc,min(sorttime) ");
		this.setOrderFieldType("asc");

		this.setStratItem(1);
		if(bo.getGettingtype() == GettingTypeEnum.Hotel.getKey()) {
			this.setGroupby("hotelid");
			this.setSelectColumns("hotelid");
			this.setPageSize(config.getHotelSize());
		}else if (bo.getGettingtype() == GettingTypeEnum.Hotel.getKey()) {
			this.setGroupby("supplierid");
			this.setSelectColumns("supplierid");
			this.setPageSize(config.getSupplierSize());
		}
	}
}
