package com.elong.hotel.proxy.javaorder.consts;

/**
 * 订单附加标志位
 */
public class OrderAdditionalStatusConst {

    /**
     * 无特殊标志
     */
    public static final int NONE = 0;
    /**
     * 变价特例
     */
    public static final int CHANGE_PRICE_SPECIAL = 1;
    /**
     * 酒店日审后
     */
    public static final int AFTER_HOTEL_DAY_AUDIT = 2;
    /**
     * 公司担保
     */
    public static final int COMPANY_VOUCH = 4;
    /**
     * HBA系统中创建的订单
     */
    public static final int HBA_CREATE = 8;
    /**
     * 特殊价格
     */
    public static final int SPECIAL_PRICE = 16;
    /**
     * 有预留房
     */
    public static final int HAS_RESERVED_ROOM = 32;
    /**
     * 外网修改过
     */
    public static final int WEB_CHANGED = 64;
    /**
     * 客人修改过后无预订员操作
     */
    public static final int GUEST_CHANGED_WITHOUT_STAFF_OPERATION = 128;
    /**
     * 担保或预付订单
     */
    public static final int CREDIT_CARD_VOUCH = 256;
    /**
     * 使用半天价
     */
    public static final int USE_HALF_DAY = 512;
    /**
     * 即时确认
     */
    public static final int INSTANT_CONFIRM = 1024;
    /**
     * 个人担保
     */
    public static final int PERSONAL_VOUCH = 2048;
    /**
     * 强制不担保
     */
    public static final int NO_VOUCH = 4096;
    /**
     * 一单一结国际酒店订单
     */
    public static final int IS_PRE_ORDER_SETTLE = 8192;
    /**
     * 订单从新单变删除会记下此标记
     */
    public static final int NEW_TO_DELETE = 16384;
    /**
     * 灰名单强制担保订单
     */
    public static final int GREY_ORDER_MANUAL_VOUCH = 131072;
    /**
     * 订单修改为变更状态时添加标志，有此标志表示订单现在或曾经改为过变更状态
     */
    public static final int CHANGE_STATUS = 536870912;
    /**
     * 全额担保
     */
    public static final int FULL_PRICE_VOUCH = 1073741824;
}