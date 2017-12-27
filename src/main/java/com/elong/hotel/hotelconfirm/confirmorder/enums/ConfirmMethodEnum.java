package com.elong.hotel.hotelconfirm.confirmorder.enums;

import java.nio.file.attribute.FileAttribute;

/**
 * @outhor jianjun.wang
 * @create 2017-12-18 下午4:53
 *
 * warnning ： 订单组返回的key值是大小写不确定的 用此枚举key值判断时 必须转换一直 （toLowerCase or toUpperCase）
 */

public enum ConfirmMethodEnum {

    NONEED("noneed", "不需要确认"),

    EMAIL("email", "简体中文邮件"),

    EMAILCN("emailcn", "简体中文邮件"),

    EMAILEN("emailen", "英文邮件"),

    FAX("fax", "简体传真"),

    PHONE("phone", "电话"),

    MOBILE("mobile", "简体中文短信"),

    SMS("sms", "简体中文短信"),

    SMSCN("smscn", "简体中文短信"),

    SMSEN("smsen", "英文短信"),

    MB("mb", "繁体短信"),

    EB("eb", "繁体中文邮件"),

    FB("fb", "繁体传真"),

    NOTNEEDCONFIRM("notneedconfirm", "不许确认");

    private String key;

    private String detail;

    ConfirmMethodEnum(String key, String detail) {
        this.key = key;
        this.detail = detail;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}