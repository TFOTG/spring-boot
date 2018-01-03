package com.elong.hotel.hotelconfirm.group.enums;

import com.elong.hotel.common.enums.ConfirmOrderStatusEnum;

/**
 * Created by user on 17/6/13.
 */
public enum GroupOrderStatusEnum {
    V("V","已审"),
    O1("O1","满房-房间满"),
    O2("O2","满房-联系不上"),
    O3("O3","满房-号码无效"),
    O4("O4","满房-不接线下"),
    O5("O5","满房-不合作"),
    O6("O6","满房-eb满房"),
    //2017-12-20 添加 O7 O8 两个状态
    O7("O7","满房-全满"),
    O8("O8","满房-部分满"),
    G1("G1","变价-价格已出"), //2017-12-20 修改G1名称 变价 --）变价-价格已出
    G2("G2","变价-暂不接受预订"),
    G3("G3","变价-价格未出"),
    U1("U1","需担保"),
    U2("U2","需担保-其它"),
    U3("U3","特满-重复预订"),
    U4("U4","特满-客人订错***"),
    U5("U5","特满-核实客人取消"),
    U6("U6","特满-因***可能会影响入住"),
    U7("U7","特满-马上到店不处理"),
    U8("U8","特满-可为您免费升级到***"),
    U9("U9","特满-其它");

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
