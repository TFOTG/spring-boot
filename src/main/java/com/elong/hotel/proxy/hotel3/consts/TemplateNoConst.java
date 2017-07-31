package com.elong.hotel.proxy.hotel3.consts;

/**
 * Created by yangboyu on 17/6/12.
 */
public interface TemplateNoConst {

    /**
     * 新单
     */
    String  CREATEORDERTEMPLATENO = "1001";

    /**
     * 修改订单
     */
    String  MODIFYORDERTEMPLATENO = "1002";

    /**
     * 未入住
     */
    String  ORDERSTATUSTOVTEMPLATENO = "1003";

    /**
     * 已确认
     */
    String  ORDERSTATUSTOATEMPLATENO = "1004";

    /**
     * 未入住
     */
    String  ORDERSTATUSTOBTEMPLATENO = "1005";

    /**
     * 已经入住
     */
    String  ORDERSTATUSTOFTEMPLATENO = "1006";

    /**
     * 已经结账
     */
    String  ORDERSTATUSTOCTEMPLATENO = "1007";

    /**
     * 已取消
     */
    String  ORDERCANCELTEMPLATENO = "1008";

    /**
     * 担保/预付支付成功
     */
    String  PAYMENTPROCESSSUCCESSEDTEMPLATENO = "1009";

    /**
     * 担保/预付订单支付失败
     */
    String  PAYMENTPROCESSFAILTEMPLATENO = "1010";

    /**
     * 拒单
     */
    String  REFUSEORDERTEMPLATENO = "1011";

    /**
     * 催确认
     */
    String  URGECONFIRMTEMPLATENO = "1012";

    /**
     * 员工延迟
     */
    String  DELAYCONFIRMTEMPLATENO = "1013";

    /**
     * 入住反馈-已入住
     */
    String  COMMITFEEDBACKTEMPLATENO = "1014";

    /**
     * 入住反馈-未入住
     */
    String  VERIFYCHECKINTEMPLATENO = "1015";

    /**
     * 追加消费卷
     */
    String  ADDCOUPONTEMPLATENO = "1016";

    /**
     * 到入住日+1
     */
    String  ISAFTERCHECKIINTEMPLATENO = "1017";

    /**
     * 催确认短信 版本1
     */
    String  URGECONFIRMTEMPLATENO2 = "1018";

    /**
     * 延迟确认短信
     */
    String  PROMISESMS = "1019";

    /**
     * 满房担保预付订单自动取消短信
     */
    String  ROOMFULLAUTOCANCELTEMPLATENO = "1021";

    /**
     * 申领返现
     */
    String  APPLYCOUPONCASHBACKTEMPLATENO = "1024";

    /**
     * 延迟确认短信(新-20160506)
     */
    String  PROMISESMSNEW = "1030";

    /**
     * 延迟确认短信(新-20170720)
     */
    String  SENDMSG = "1033";
    /**
     * 拒单
     */
    String  REFUSEORDERTEMPLATENO_NEW = "1034";
}
