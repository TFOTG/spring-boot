package com.elong.hotel.proxy.hotel3.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by peng.wang on 17/4/25.
 */
public class GetHotelNightRequest {

    @JSONField(name = "HotelIDs")
    private List<Map<String,String>> hotelIds;

    public List<Map<String, String>> getHotelIds() {
        return hotelIds;
    }

    public void setHotelIds(List<Map<String, String>> hotelIds) {
        this.hotelIds = hotelIds;
    }

    public GetHotelNightRequest(List<String> hotelIds) {

        List<Map<String,String>> hotelIdMaps=new ArrayList<>();
        for (String hotelId : hotelIds) {
            Map<String, String> map=new HashMap<>();
            map.put("HotelId",hotelId);
            hotelIdMaps.add(map);
        }
        this.hotelIds = hotelIdMaps;
    }

    public GetHotelNightRequest() {
    }

}


