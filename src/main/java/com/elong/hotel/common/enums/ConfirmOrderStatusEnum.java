package com.elong.hotel.common.enums;

/**
 * 确认订单状态枚举
 */
public enum ConfirmOrderStatusEnum {

    /**
     * 变价
     */
    G("G", "变价"),
    /**
     * NOSHOW
     */
    B("B", "NOSHOW"),
    /**
     * 有预订未查到
     */
    B1("B1", "有预订未查到"),
    /**
     * 待查
     */
    B2("B2", "待查"),
    /**
     * 暂不确认
     */
    B3("B3", "暂不确认"),
    /**
     * 已结帐
     */
    C("C", "已结帐"),
    /**
     * 删除
     */
    D("D", "删除"),
    /**
     * 取消
     */
    E("E", "取消"),
    /**
     * 已入住
     */
    F("F", "已入住"),
    /**
     * 满房
     */
    O("O", "满房"),
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
    O1("O1", "房间满"),
    /**
     * 酒店电话无效
     */
    O2("O2", "联系不上"),
    /**
     * 酒店不合作
     */
    O3("O3", "号码无效"),
    /**
     * 直连不接受线下
     */
    O4("O4", "不接线下"),
    /**
     * 直连不接受线下
     */
    O5("O5", "不合作"),
    /**
     * eb满房
     */
    O6("O6", "eb满房"),
    /**
     * 需担保
     */
    U1("U1", "需担保"),
    /**
     * 特殊满房
     */
    U2("U2", "其他"),
    /**
     * 需同意
     */
    U3("U3", "重复预订"),
    /**
     * 特殊满房
     */
    U4("U4", "客人订错***"),
    /**
     * 特殊满房
     */
    U5("U5", "核实客人取消"),
    /**
     * 特殊满房
     */
    U6("U6", "因****可能会影响入住"),/**
     * 特殊满房
     */
    U7("U7", "马上到店不处理"),
    /**
     * 特殊满房
     */
    U8("U8", "可为您免费升级到****"),
    /**
     * 特殊满房
     */
    U9("U9", "其他"),
    /**
     *
     */
    G1("G1","变价"),
    /**
     *
     */
    G2("G2","暂不接受预订"),
    /**
     *
     */
    G3("G3","价格未出");


    ConfirmOrderStatusEnum(String status, String description) {
        this.status = status;
        this.description = description;
    }

    public static String getDescriptionByStatus(String status){
        for(ConfirmOrderStatusEnum item: ConfirmOrderStatusEnum.values()){
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
