package com.elong.hotel.proxy.javaorder.getorder;

public class OrderComment {
	
	
	// 订单号
	private long orderId;
	
	// 酒店备注
	private String notesToHotel;
	
	// 内部备注
	private String notesToElong;

    //客人备注
    private String notesToGuest;

    public OrderComment() {
        this.notesToHotel = "";
        this.notesToElong = "";
        this.notesToGuest = "";
    }

    public String getNotesToGuest() {
        return notesToGuest;
    }

    public void setNotesToGuest(String notesToGuest) {
        this.notesToGuest = notesToGuest;
    }

    public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getNotesToHotel() {
		return notesToHotel;
	}

	public void setNotesToHotel(String notesToHotel) {
		this.notesToHotel = notesToHotel;
	}

	public String getNotesToElong() {
		return notesToElong;
	}

	public void setNotesToElong(String notesToElong) {
		this.notesToElong = notesToElong;
	}
	
	

}
