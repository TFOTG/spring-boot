package com.elong.hotel.hotelconfirm.examorder.vo;

import java.util.List;

import com.elong.hotel.common.parameter.PaginationParameter;

/**
 * Created by peng.wang on 2018/5/4.
 */
public class ExamOrderVO extends PaginationParameter {

     private Integer mod;
     
     private Integer isLinked;
     
     private List<Integer> reserNos;
     
     private List<String> hotelIds;
     
     private String staffName;
     
     private String hotelId;

    public Integer getMod() {
        return mod;
    }

    public void setMod(Integer mod) {
        this.mod = mod;
    }

	public Integer getIsLinked() {
		return isLinked;
	}

	public void setIsLinked(Integer isLinked) {
		this.isLinked = isLinked;
	}

	public List<Integer> getReserNos() {
		return reserNos;
	}

	public void setReserNos(List<Integer> reserNos) {
		this.reserNos = reserNos;
	}

	public List<String> getHotelIds() {
		return hotelIds;
	}

	public void setHotelIds(List<String> hotelIds) {
		this.hotelIds = hotelIds;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
    
}
