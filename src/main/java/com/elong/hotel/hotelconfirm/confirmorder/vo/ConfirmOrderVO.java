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

	private List<Integer> reserNos;

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

	private String respiteTime;

	private Integer sortTimeN;

	private Integer isEbRefuse;

	private Integer mod;

	private Integer islinked;

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

	public String getRespiteTime() {
		return respiteTime;
	}

	public void setRespiteTime(String respiteTime) {
		this.respiteTime = respiteTime;
	}

	public ConfirmOrderVO() {
	}

	public ConfirmOrderVO(List<ConfirmOrderPo> confirmOrders,GroupGettingBo bo,ConfirmOrderConfig config,int size) {
		this.sortTimeL = 0;
		this.respitetimeL = 0;
		this.groupIds = Arrays.asList(bo.getGroupIds().split(","));

		this.setStratItem(1);
		this.setSelectColumns("id, reserno, reserstatus, cardno, `mod`, arrivedate, leavedate, timeearly, timelate, hotelid,\n"
				+ "  hotelname, supplierid, suppliertype, suppliername, supplierotatype, proxyid, cityid,\n"
				+ "  distance, confirmtype, bookingtime, amendtime, priority, groupid, rankid, ebkstrategyid,\n"
				+ "  staffname, distributetime, promisetime, promisechangetimes, isfaxreturn, islinked, isebrefuse,\n"
				+ "  urge, respitetime, nextservicetime, ivrguid, ivrstatus, ivrstarttime, entertime,\n"
				+ "  sorttime, defaultsorttime, firstrefusedtime, ordertimestamplong");
		this.staffName = "";

		StringBuilder idSB = new StringBuilder();
		List<String> ids = new ArrayList<>();
		for(ConfirmOrderPo po:confirmOrders) {
			if(bo.getGettingtype() == GettingTypeEnum.Hotel.getKey()) {
				ids.add(po.getHotelId());
				idSB.append(",'").append(po.getHotelId()).append("'");

			}else if (bo.getGettingtype() == GettingTypeEnum.Supplier.getKey()) {
				ids.add(po.getSupplierId());
				idSB.append(",'").append(po.getSupplierId()).append("'");
			}
		}

		if(bo.getGettingtype() == GettingTypeEnum.Hotel.getKey()) {
			this.setOrderField(String.format("FIELD(`hotelid` %s),priority asc,isfaxreturn desc,urge desc,isebrefuse desc,sorttime ",idSB.toString()));
		}else if (bo.getGettingtype() == GettingTypeEnum.Supplier.getKey()) {
			this.setOrderField(String.format("FIELD(`supplierid` %s),priority asc,isfaxreturn desc,urge desc,isebrefuse desc,sorttime ",idSB.toString()));
		}



		this.setOrderFieldType("asc");

		if(bo.getGettingtype() == GettingTypeEnum.Hotel.getKey()) {
			this.hotelIds = ids;
			this.setPageSize(config.getHotelOrderSize()-size);
		}else if (bo.getGettingtype() == GettingTypeEnum.Supplier.getKey()) {
			this.supplierIds = ids;
			this.setPageSize(config.getSupplierOrderSize()-size);
		}
	}

	public ConfirmOrderVO(GroupGettingBo bo,ConfirmOrderConfig config) {
		this.groupIds = Arrays.asList(bo.getGroupIds().split(","));
		this.sortTimeL = 0;
		this.respitetimeL = 0;
		this.staffName = "";

		this.setOrderField("min(priority) asc,max(isfaxreturn) desc,max(urge) desc,max(isebrefuse) desc,min(sorttime) ");
		this.setOrderFieldType("asc");

		this.setStratItem(1);
		if(bo.getGettingtype() == GettingTypeEnum.Hotel.getKey()) {
			this.setGroupby("hotelid");
			this.setSelectColumns("hotelid");
			this.setPageSize(config.getHotelSize());
		}else if (bo.getGettingtype() == GettingTypeEnum.Supplier.getKey()) {
			this.setGroupby("supplierid");
			this.setSelectColumns("supplierid");
			this.setPageSize(config.getSupplierSize());
		}
	}

	public ConfirmOrderVO(List<Integer> reserNos, Integer isEbRefuse) {
		this.reserNos = reserNos;
		this.isEbRefuse = isEbRefuse;
	}

	public ConfirmOrderVO(List<String> hotelIds) {
		this.hotelIds = hotelIds;
	}

	public ConfirmOrderVO(String staffName, String respiteTime) {
		this.staffName = staffName;
		this.respiteTime = respiteTime;
	}

	public Integer getIsEbRefuse() {
		return isEbRefuse;
	}

	public void setIsEbRefuse(Integer isEbRefuse) {
		this.isEbRefuse = isEbRefuse;
	}

	public List<Integer> getReserNos() {
		return reserNos;
	}

	public void setReserNos(List<Integer> reserNos) {
		this.reserNos = reserNos;
	}

	public Integer getIslinked() {
		return islinked;
	}

	public void setIslinked(Integer islinked) {
		this.islinked = islinked;
	}

	public Integer getMod() {
		return mod;
	}

	public void setMod(Integer mod) {
		this.mod = mod;
	}
}
