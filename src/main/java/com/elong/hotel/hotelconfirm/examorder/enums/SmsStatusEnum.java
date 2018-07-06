package com.elong.hotel.hotelconfirm.examorder.enums;

/**
 * 自动通知状态
 */
public enum SmsStatusEnum {

    None(0,"默认"),

    Success(1,"发送成功"),

    //发送失败，如手机号格式不对、邮箱格式不对
    Fault(2,"发送失败"),
    //调用发送接口异常，包括系统和业务异常
    Error(3,"发送异常");

    int status;

    String desc;

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    SmsStatusEnum(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
