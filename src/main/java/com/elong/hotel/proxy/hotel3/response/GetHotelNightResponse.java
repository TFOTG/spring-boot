package com.elong.hotel.proxy.hotel3.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
import java.util.Map;

/**
 * Created by peng.wang on 17/4/25.
 */
public class GetHotelNightResponse {

    @JSONField(name = "HotelNightModeList")
    private List<Map<String,Object>> hotelNightModeList;

    public List<Map<String, Object>> getHotelNightModeList() {
        return hotelNightModeList;
    }

    public void setHotelNightModeList(List<Map<String, Object>> hotelNightModeList) {
        this.hotelNightModeList = hotelNightModeList;
    }
}
