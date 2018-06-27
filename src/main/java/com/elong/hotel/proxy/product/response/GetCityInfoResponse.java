package com.elong.hotel.proxy.product.response;

import com.elong.hotel.proxy.product.bo.CityInfoBo;

import java.util.List;

/**
 * Created by peng.wang on 2018/6/27.
 */
public class GetCityInfoResponse extends ServiceResponseProductBase {

    private CityInfoBody realResponse;

    public class CityInfoBody{

        private List<CityInfoBo> cityList;

        public List<CityInfoBo> getCityList() {
            return cityList;
        }

        public void setCityList(List<CityInfoBo> cityList) {
            this.cityList = cityList;
        }
    }

    public CityInfoBody getRealResponse() {
        return realResponse;
    }

    public void setRealResponse(CityInfoBody realResponse) {
        this.realResponse = realResponse;
    }
}
