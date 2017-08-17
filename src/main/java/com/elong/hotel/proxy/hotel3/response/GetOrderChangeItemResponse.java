package com.elong.hotel.proxy.hotel3.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by user on 17/8/16.
 */
public class GetOrderChangeItemResponse extends Hotel3ResponseBase {

    /**
     * 示例:客人姓名`张三|在店日期`2017/07/12至2017/07/13|抵店时间`6:00至7:00|房型`RTName-RPName|房间数量`3|总价`$10.23
     */
    @JSONField(name = "ChangItemInfoStr")
    private String changItemInfoStr;

    public String getChangItemInfoStr() {
        return changItemInfoStr;
    }

    public void setChangItemInfoStr(String changItemInfoStr) {
        this.changItemInfoStr = changItemInfoStr;
    }
}
