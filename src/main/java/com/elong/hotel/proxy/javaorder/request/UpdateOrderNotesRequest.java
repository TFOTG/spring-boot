package com.elong.hotel.proxy.javaorder.request;

import com.elong.hotel.hotelconfirm.confirmorder.request.UpdateOrderNotesAndConfirmNoRequest;

import java.io.Serializable;

/**
 * 
 * 更新订单备注request
 * 
 * @author zouyufei
 *
 */
public class UpdateOrderNotesRequest implements Serializable{
	// 订单号
	private Integer orderId;
	// 内部备注
	private String notesToElong;
	// 客人备注（存疑）
	private String notesToGuest;
	// 酒店备注
	private String notesToHotel;
	// 操作者信息
	private OperatorInfo clientOperatorInfo;

    public UpdateOrderNotesRequest() {
    }

    public UpdateOrderNotesRequest(UpdateOrderNotesAndConfirmNoRequest request) {
        this.orderId = request.getOrderId();
        this.notesToElong=request.getNotesToElong();
        this.clientOperatorInfo=request.getClientOperatorInfo();
    }

    public String getNotesToElong() {
		return notesToElong;
	}

	public void setNotesToElong(String notesToElong) {
		this.notesToElong = notesToElong;
	}

	public String getNotesToGuest() {
		return notesToGuest;
	}

	public void setNotesToGuest(String notesToGuest) {
		this.notesToGuest = notesToGuest;
	}

	public String getNotesToHotel() {
		return notesToHotel;
	}

	public void setNotesToHotel(String notesToHotel) {
		this.notesToHotel = notesToHotel;
	}

    public OperatorInfo getClientOperatorInfo() {
        return clientOperatorInfo;
    }

    public void setClientOperatorInfo(OperatorInfo clientOperatorInfo) {
        this.clientOperatorInfo = clientOperatorInfo;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

}
