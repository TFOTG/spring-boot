package com.elong.hotel.hotelconfirm.group.enums;

import com.elong.hotel.common.enums.ConfirmOrderStatusEnum;

/**
 * Created by user on 17/6/13.
 */
public enum GroupOrderStatusEnum {
    /**
     * 变价
     */
    G("G", "初变"),
    /**
     * 满房
     */
    O("O", "初满-房间满"),
    /**
     * 特满
     */
    U("U", "特满"),
    /**
     * 已审
     */
    V("V", "已审"),
    /**
     * 已审
     */
    A("A", "已确认"),

    /**
     * 联系不到酒店
     */
    O1("O1", "初满-联系不到酒店"),
    /**
     * 酒店电话无效
     */
    O2("O2", "初满-酒店电话无效"),
    /**
     * 酒店不合作
     */
    O3("O3", "初满-酒店不合作"),
    /**
     * 直连不接受线下
     */
    O4("O4", "初满-直连不接受线下"),
    /**
     * 需担保
     */
    U1("U1", "需担保"),
    /**
     * 特殊满房
     */
    U2("U2", "特殊满房"),
    /**
     * 需同意
     */
    U3("U3", "需同意");


    GroupOrderStatusEnum(String status, String description) {
        this.status = status;
        this.description = description;
    }

    public static String getDescriptionByStatus(String status){
        for(GroupOrderStatusEnum item: GroupOrderStatusEnum.values()){
            if(item.getStatus().equals(status)){
                return item.getDescription();
            }
        }
        return "";
    }

    // 订单状态
    private String status;
    // 描述
    private String description;

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
