package com.elong.hotel.proxy.javaorder.consts;

/**
 * Created by wangwls on 15/10/20.
 */
public class OrderFlagConst {
    /**
     * 退款申诉
     */
    public static final int APPLY_REFUND = 1;
    /**
     * 订单生成人属性
     */
    public static final int CREATOR_TYPE = 32;
    /**
     * 携程订单即使确认
     */
    public static final int IS_CTRIP_IMMEDIATE = 64;
    /**
     * 是否是新版马甲产品策略
     */
    public static final int IS_NEW_MAJIA_STRATEGY_ID = 256;

    /**
     * 是否即时确认（订单取消后不会将该标识去掉）
     */
    public static final int IS_INSTANT_CONFIRM = 512;
    /**
     * 是否马上到店订单
     */
    public static final int IS_ARRIVE_NOW_ORDER = 1024;
    /**
     * 是否直连酒店
     */
    public static final int IS_PMS_HOTEL = 2048;
    /**
     * 是否存在mapping关系
     */
    public static final int HAS_PMS_MAPPING = 4096;

    /**
     * 8192不要使用，mis使用
     */
    public static final int FIRST_REFUESED_FOR_MIS = 8192;

    /**
     * 是否变更过OUG状态，首次变更到OUG时打标
     */
    public static final int ONCE_CHANGED_TO_OUG = 16384;

    /**
     * 从OUG 状态变更到取消删除时，打终拒标识
     */
    public static final int FINAL_REFUSED_TO_CANCEL = 32768;

    /**
     * 升级追单标识
     */
    public static final int IS_UPGRADE_TRACE = 65536;

    /**
     * 订单应该由直连确认标识
     */
    public static final int SHOULD_CONFIRMED_BY_DC = 131072;

    /**
     * 订单应该由EBooking确认标识
     */
    public static final int SHOULD_CONFIRMED_BY_EB = 262144;

    /**
     * 订单应该由直连审核标识
     */
    public static final int EXPRECTED_VERIFIED_BY_DC = 524288;
    /**
     * 是否包含双底价
     */
    public static final int IS_DOUBLE_COST_ORDER = 1048576;
    /**
     * 是否除酒店即时扩展条件之外
     */
    public static final int IS_INSTANT_CONFIRM_WITHOUT_EXTEND_RULE = 2097152;

    public static final int ORDER_INVENTORY_UN_LIMIT = 4194304;
    public static final int ORDER_INVENTORY_ADDITIONAL = 8388608;
    public static final int ORDER_INVENTORY_CONTRACT = 16777216;
    public static final int ORDER_INVENTORY_BUY = 33554432;

    public static final long ACCEPT_BY_DC = 67108864;
    /**
     * 满房前通知过客人
     */
    public static final int CONFIRMED_CLIENT_ORDER_REJECT_TO_O = 536870912;
    /**
     * 变价前通知过客人
     */
    public static final int CONFIRMED_CLIENT_ORDER_REJECT_TO_G = 1073741824;
    /**
     * 满房前没通知过客人
     */
    public static final int NOT_CONFIRMED_CLIENT_ORDER_REJECT_TO_O = 134217728;
    /**
     * 变价前没通知过客人
     */
    public static final int NOT_CONFIRMED_CLIENT_ORDER_REJECT_TO_G = 268435456;

    public static final long VIRTUAL_CARD_PAY = 2147483648L;

    /**
     * 直连OnRequest订单
     */
    public static final long DC_ON_REQUEST = 4294967296L;
    /**
     * 门票订单
     */
    public static final long SCENIC_TICKET_ORDER = 8589934592L;


    /**
     * 用平台名称代替代理名称
     */
    public static final long REPLACE_SUPPLIER_NAME_WITH_PLATFORM_NAME = 34359738368L;

    /**
     * 去哪儿预变更单
     */
    public static final long QUNAR_PRE_CHANGE = 68719476736L;

    /**
     * 是否被酒店拒单过（包括初拒、ivr拒单、EBooking拒单、终拒等）
     */
    public static long HAS_ORDER_BE_REFUSED_EVER = 17179869184L;

    /**
     * MIS取消订单退款
     */
    public static final long MIS_CANCEL_ORDER_REFUND = 137438953472L;

    /**
     * MIS间夜减少退款
     */
    public static final long MIS_UPDATE_ROOMNIGHT_REFUND = 274877906944L;

    /**
     * MIS间夜减少退款
     */
    public static long INVENTORY_CLOSED_WHEN_NOTICE_HOTEL = 549755813888L;
    /**
     * 官网预订
     */
    public static final long OFFICIAL_WEB_BOOKING_ORDER = 1099511627776L;
    /**
     * 入住日疑似恶意取消
     */
    public static final long ARRIVE_DAY_FRAUD_CANCEL = 2199023255552L;

    public static final long INVOICE_ON_CREATE = 4398046511104L;
    /**
     * 闪结订单标记
     */
    public static final long FLASH_SETTLEMENT = 8796093022208L;
    /**
     * 产品类型是长住省
     */
    public static final long LONG_LIVE_PRODUCT_TYPE=17592186044416L;
}