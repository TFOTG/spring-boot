package com.elong.hotel.log.hotelconfirm.enums;

/**
 * Created by peng.wang on 2018/7/11.
 */
public enum NoticeLogStatusEnum {

    /**
     * 默认
     */
    NONE(0, "默认"),

    /**
     * 通知成功
     */
    SUCCEED(1, "通知成功"),

    /**
     * 联系方式校验失败
     */
    FAIL_CONTACT_ERROR(2, "联系方式校验失败"),

    /**
     * 系统发送失败
     */
    FAIL_SYS_ERROR(3, "系统发送失败");


    private int status;

    private String desc;

    NoticeLogStatusEnum(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }


    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
