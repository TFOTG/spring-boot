package com.elong.hotel.proxy.product.request;

import java.util.Date;

/**
 * Created by yangboyu on 17/6/28.
 */
public class RoomNightInfo {
    Date roomNightBeginDate;

    Date roomNightEndDate;

    int inventoryType;

    public int getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(int inventoryType) {
        this.inventoryType = inventoryType;
    }

    public Date getRoomNightBeginDate() {
        return roomNightBeginDate;
    }

    public void setRoomNightBeginDate(Date roomNightBeginDate) {
        this.roomNightBeginDate = roomNightBeginDate;
    }

    public Date getRoomNightEndDate() {
        return roomNightEndDate;
    }

    public void setRoomNightEndDate(Date roomNightEndDate) {
        this.roomNightEndDate = roomNightEndDate;
    }
}
