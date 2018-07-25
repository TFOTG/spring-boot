package com.elong.hotel.proxy.product.bo;

import java.io.Serializable;

/**
 * Created by peng.wang on 2018/6/27.
 */
public class CityInfoBo implements Serializable{

    private String cityId;
    private String cityName;
    private String provinceId;
    private String provinceName;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
