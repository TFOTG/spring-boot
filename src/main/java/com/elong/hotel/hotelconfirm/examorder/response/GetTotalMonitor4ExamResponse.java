package com.elong.hotel.hotelconfirm.examorder.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.examorder.vo.ExamCityVo;
import com.elong.hotel.hotelconfirm.examorder.vo.ExamGroupOrderVo;

import java.util.Date;
import java.util.List;

/**
 * Created by peng.wang on 2018/6/26.
 */
public class GetTotalMonitor4ExamResponse extends ServiceResponseBase {

    //分组信息
    private List<ExamGroupOrderVo> groupOrderInfo;
    //分组信息合计
    private ExamGroupOrderVo groupTotal;

    private List<ExamCityVo> statusCityInfo;

    private ExamCityVo cityTotal;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date systemDate;


    public List<ExamGroupOrderVo> getGroupOrderInfo() {
        return groupOrderInfo;
    }

    public void setGroupOrderInfo(List<ExamGroupOrderVo> groupOrderInfo) {
        this.groupOrderInfo = groupOrderInfo;
    }

    public ExamGroupOrderVo getGroupTotal() {
        return groupTotal;
    }

    public void setGroupTotal(ExamGroupOrderVo groupTotal) {
        this.groupTotal = groupTotal;
    }

    public List<ExamCityVo> getStatusCityInfo() {
        return statusCityInfo;
    }

    public void setStatusCityInfo(List<ExamCityVo> statusCityInfo) {
        this.statusCityInfo = statusCityInfo;
    }

    public ExamCityVo getCityTotal() {
        return cityTotal;
    }

    public void setCityTotal(ExamCityVo cityTotal) {
        this.cityTotal = cityTotal;
    }

    public Date getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(Date systemDate) {
        this.systemDate = systemDate;
    }
}
