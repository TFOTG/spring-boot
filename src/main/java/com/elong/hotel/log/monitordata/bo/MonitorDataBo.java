package com.elong.hotel.log.monitordata.bo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @outhor jianjun.wang
 * @create 2017-12-05 下午4:41
 */

public class MonitorDataBo{
    /**
     * 采集时间
     */
    private String collectTime;

    /**
     * 酒店预订单量
     */
    private int hotelReserve;

    /**
     * 入库量
     */
    private int storage;

    /**
     * 已审待分配量（马上到店）
     */
    private int immediately;

    /**
     * 已审待分配量（普通当日）
     */
    private int ordinaryToday;

    /**
     * 已审待分配量（普通非当日）
     */
    private int ordinary;

    /**
     * 已审人工触碰订单量
     */
    private int touched;

    /**
     * 已审无人触碰量
     */
    private int untouched;

    /**
     * 已审员工实际可获取的待分配量
     */
    private int unfetched;

    /**
     * 员工处理量
     */
    private int staffHandled;

    /**
     * IVR处理量
     */
    private int ivrHandled;

    /**
     * EBK处理量
     */
    private int ebkHandled;

    /**
     * 直连处理量
     */
    private int directHandled;

    /**
     * 其他处理量
     */
    private int otherHandled;

    /**
     * 待分配订单总量
     */
    private int unallocated;

    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

    public int getHotelReserve() {
        return hotelReserve;
    }

    public void setHotelReserve(int hotelReserve) {
        this.hotelReserve = hotelReserve;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getImmediately() {
        return immediately;
    }

    public void setImmediately(int immediately) {
        this.immediately = immediately;
    }

    public int getOrdinaryToday() {
        return ordinaryToday;
    }

    public void setOrdinaryToday(int ordinaryToday) {
        this.ordinaryToday = ordinaryToday;
    }

    public int getOrdinary() {
        return ordinary;
    }

    public void setOrdinary(int ordinary) {
        this.ordinary = ordinary;
    }

    public int getTouched() {
        return touched;
    }

    public void setTouched(int touched) {
        this.touched = touched;
    }

    public int getUntouched() {
        return untouched;
    }

    public void setUntouched(int untouched) {
        this.untouched = untouched;
    }

    public int getUnfetched() {
        return unfetched;
    }

    public void setUnfetched(int unfetched) {
        this.unfetched = unfetched;
    }

    public int getStaffHandled() {
        return staffHandled;
    }

    public void setStaffHandled(int staffHandled) {
        this.staffHandled = staffHandled;
    }

    public int getIvrHandled() {
        return ivrHandled;
    }

    public void setIvrHandled(int ivrHandled) {
        this.ivrHandled = ivrHandled;
    }

    public int getEbkHandled() {
        return ebkHandled;
    }

    public void setEbkHandled(int ebkHandled) {
        this.ebkHandled = ebkHandled;
    }

    public int getDirectHandled() {
        return directHandled;
    }

    public void setDirectHandled(int directHandled) {
        this.directHandled = directHandled;
    }

    public int getOtherHandled() {
        return otherHandled;
    }

    public void setOtherHandled(int otherHandled) {
        this.otherHandled = otherHandled;
    }

    public int getUnallocated() {
        return unallocated;
    }

    public void setUnallocated(int unallocated) {
        this.unallocated = unallocated;
    }
}