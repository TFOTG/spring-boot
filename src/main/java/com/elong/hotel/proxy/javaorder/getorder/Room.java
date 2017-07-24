package com.elong.hotel.proxy.javaorder.getorder;

/**
 * 原单房间信息
 * 
 * @author zouyufei
 *
 */
public class Room {

	private String confirmNo;
	private Long id;
	private String roomNo;
    private String cooperationOrderId;

    public String getCooperationOrderId() {
        return cooperationOrderId;
    }

    public void setCooperationOrderId(String cooperationOrderId) {
        this.cooperationOrderId = cooperationOrderId;
    }

    public String getConfirmNo() {
		return confirmNo;
	}

	public void setConfirmNo(String confirmNo) {
		this.confirmNo = confirmNo;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
