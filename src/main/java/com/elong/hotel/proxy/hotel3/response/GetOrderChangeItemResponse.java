package com.elong.hotel.proxy.hotel3.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by user on 17/8/16.
 */
public class GetOrderChangeItemResponse extends Hotel3ResponseBase {
    @JSONField(name = "ChangItemInfoStr")
    private String changItemInfoStr;

    public String getChangItemInfoStr() {
        return changItemInfoStr;
    }

    public void setChangItemInfoStr(String changItemInfoStr) {
        this.changItemInfoStr = changItemInfoStr;
    }
}
