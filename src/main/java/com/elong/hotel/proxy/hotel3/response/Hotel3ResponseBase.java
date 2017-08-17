package com.elong.hotel.proxy.hotel3.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by user on 17/8/16.
 */
public class Hotel3ResponseBase {

    @JSONField(name = "Result")
    private Hotel3RoomInfoResult result;

    
    public Hotel3RoomInfoResult getResult() {
        return result;
    }

    public void setResult(Hotel3RoomInfoResult result) {
        this.result = result;
    }
}
