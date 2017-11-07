package com.elong.hotel.proxy.hotel3.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.proxy.hotel3.bo.GetHotelNoServiceBo;

import java.util.List;

/**
 * Created by peng.wang on 17/4/25.
 */
public class BroadcastMessage4VisualizationResponse {

    @JSONField(name = "ResponseCode")
    private int responseCode;

    @JSONField(name = "ErrorMessage")
    private String errorMessage;

    @JSONField(name = "InServerTimeResult")
    private List<GetHotelNoServiceBo> inServerTimeResult;

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<GetHotelNoServiceBo> getInServerTimeResult() {
        return inServerTimeResult;
    }

    public void setInServerTimeResult(List<GetHotelNoServiceBo> inServerTimeResult) {
        this.inServerTimeResult = inServerTimeResult;
    }
}
