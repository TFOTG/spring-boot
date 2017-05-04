package com.elong.hotel.proxy.javaorder.request;

/**
 * Created by peng.wang on 17/5/3.
 */
public class ConfirmOrderRequest extends ChangeOrderStatusRequestBase {

    //口头确认信息
    private String oralConfirmInfo;
    //预期的审核方式：0-Mis，1-DC
    private int expectedVerifyMethod;

    public ConfirmOrderRequest(int orderId, String operatorName, String operatorIp) {
        super(orderId, operatorName, operatorIp);
    }

    public ConfirmOrderRequest(int orderId, String operatorName, String operatorIp, String oralConfirmInfo, int expectedVerifyMethod) {
        super(orderId, operatorName, operatorIp);
        this.oralConfirmInfo = oralConfirmInfo;
        this.expectedVerifyMethod = expectedVerifyMethod;
    }
}
