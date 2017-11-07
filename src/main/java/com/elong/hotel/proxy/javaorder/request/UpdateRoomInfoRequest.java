package com.elong.hotel.proxy.javaorder.request;

import com.elong.hotel.common.helper.StringUtils;
import com.elong.hotel.proxy.javaorder.consts.StringFieldLengthConst;
import com.elong.hotel.proxy.javaorder.getorder.Guest;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.proxy.javaorder.getorder.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * 更新房间信息(更新房号／客人名字／内部备注)request
 * 
 * @author zouyufei
 *
 */
public class UpdateRoomInfoRequest {

	// 操作者信息
	private OperatorInfo clientOperatorInfo;
	// 订单号
	private Integer orderId;
	// 内部备注
	private String notesToElong;
	// 房间信息
	private List<Room> rooms;

	public UpdateRoomInfoRequest() {
		this.rooms = new ArrayList<>();
	}

    public UpdateRoomInfoRequest(OperatorInfo operatorInfo, String confirmNo, String notesToElong, Order order) {
        this.clientOperatorInfo = operatorInfo;
        this.orderId = Integer.valueOf(order.getOrderId().toString());
        if(StringUtils.isNotEmpty(notesToElong)){
            this.notesToElong=StringUtils.subStringFromEnd(notesToElong, StringFieldLengthConst.NOTES_TO_ELONG);
        }
        List<UpdateRoomInfoRequest.Room> rooms = new ArrayList<>();
        for (com.elong.hotel.proxy.javaorder.getorder.Room item : order.getRooms()) {
            UpdateRoomInfoRequest.Room room = new Room();
            room.setId(item.getId());// 房间id
            room.setRoomNo(item.getRoomNo()); // 房号
            room.setConfirmNo(confirmNo);  // 确认号
            room.setGuests(findGuest(item.getId(),order));
            rooms.add(room);
        }
        this.rooms = rooms;
    }

    public List<UpdateRoomInfoRequest.Guest> findGuest(Long roomId,Order order) {
        UpdateRoomInfoRequest request = new UpdateRoomInfoRequest();
        List<UpdateRoomInfoRequest.Guest> list = new ArrayList<>();
        for (com.elong.hotel.proxy.javaorder.getorder.Guest item : order.getGuests()) {
            if (item.getRoomId().equals(roomId)) {
                UpdateRoomInfoRequest.Guest guest = request.new Guest();
                guest.setId(item.getId());
                guest.setName(item.getName());

                list.add(guest);
            }
        }
        return list;
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

	public String getNotesToElong() {
		return notesToElong;
	}

	public void setNotesToElong(String notesToElong) {
		this.notesToElong = notesToElong;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	/**
	 * 内部类 客人信息
	 * 
	 * @author zouyufei
	 *
	 */
	public class Guest {
		// 客人id
		private Long id;
		// 客人姓名
		private String name;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	/**
	 * 内部类 房间信息
	 * 
	 * @author zouyufei
	 *
	 */
	public class Room {
		// 房间id
		private Long id;
		// 房号
		private String roomNo;
		// 确认号
		private String confirmNo;
		// 房间客人信息； 如果该房间3位客人，而只传了一个客人，则修改该名客人信息，其余两位客人删除
		private List<Guest> guests;

		public Room() {
			this.guests = new ArrayList<>();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRoomNo() {
			return roomNo;
		}

		public void setRoomNo(String roomNo) {
			this.roomNo = roomNo;
		}

		public List<Guest> getGuests() {
			return guests;
		}

		public void setGuests(List<Guest> guests) {
			this.guests = guests;
		}

		public String getConfirmNo() { return confirmNo; }

		public void setConfirmNo(String confirmNo) { this.confirmNo = confirmNo; }
	}
}
