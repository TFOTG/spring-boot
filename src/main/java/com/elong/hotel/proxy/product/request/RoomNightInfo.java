package com.elong.hotel.proxy.product.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by yangboyu on 17/6/28.
 */
public class RoomNightInfo {

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    Date roomNightBeginDate;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
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
