package com.elong.hotel.common.helper;

/**
 *
 */
public class OrderPropertyHelper {

    /**
     * 计算消息平台channel
     *
     * @param businessSystemId
     * @param appClientType
     * @param orderFrom
     * @return 1:APP订单   2:微信订单   3:H5订单   4:PC订单   5:callcenter   6:其他
     */
    public static Integer calcChannel(Integer businessSystemId, Integer appClientType, Integer orderFrom) {
        int result = 6;
        if (businessSystemId == null) {
            return result;
        }
        switch (businessSystemId) {
            case 0:
                result = 5;
                break;
            case 1:
                result = 4;
                break;
            case 2:
                result = 6;
                break;
            case 3:
                result = 6;
                break;
            case 4:
                if (appClientType != null && appClientType.equals(1)) {
                    result = 1;
                } else if (appClientType != null && appClientType.equals(3)) {
                    result = 1;
                } else if (appClientType != null && appClientType.equals(7)) {
                    if (orderFrom != null && orderFrom.equals(60001)) {
                        result = 2;
                    } else {
                        result = 3;
                    }
                } else {
                    result = 6;
                }
                break;
            default:
                result = 6;
                break;
        }
        return result;
    }

}
