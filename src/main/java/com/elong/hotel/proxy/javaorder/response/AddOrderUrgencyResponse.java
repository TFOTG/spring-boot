package com.elong.hotel.proxy.javaorder.response;

import com.elong.hotel.proxy.javaorder.addorderurgency.AddOrderUrgency;

/**
 * 更新订单房间信息repsonse
 * 
 * @author zouyufei
 *
 */
public class AddOrderUrgencyResponse extends OrderResponseBase {
    AddOrderUrgency body;

    public AddOrderUrgency getBody() {
        return body;
    }

    public void setBody(AddOrderUrgency body) {
        this.body = body;
    }
}
