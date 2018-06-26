package com.elong.hotel.hotelconfirm.examorder.vo;

/**
 * Created by peng.wang on 2018/6/26.
 */
public class ExamCityVo {

    //满房数量
    private int statusOCount;
    //变价数量
    private int statusGCount;
    //特满数量
    private int statusUCount;

    private String cityName;

    private String cityId;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public int getStatusOCount() {
        return statusOCount;
    }

    public void setStatusOCount(int statusOCount) {
        this.statusOCount = statusOCount;
    }

    public int getStatusGCount() {
        return statusGCount;
    }

    public void setStatusGCount(int statusGCount) {
        this.statusGCount = statusGCount;
    }

    public int getStatusUCount() {
        return statusUCount;
    }

    public void setStatusUCount(int statusUCount) {
        this.statusUCount = statusUCount;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
