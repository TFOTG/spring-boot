package com.elong.hotel.proxy.product.response;

import com.elong.hotel.proxy.product.bo.CityInfoBo;

import java.util.List;

/**
 * Created by peng.wang on 2018/6/27.
 */
public class GetCityInfoResponse {

    private CityInfoBody body;

    private int retcode;

    private String retdesc;

    private String serverIp;

    public CityInfoBody getBody() {
        return body;
    }

    public void setBody(CityInfoBody body) {
        this.body = body;
    }

    public int getRetcode() {
        return retcode;
    }

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public String getRetdesc() {
        return retdesc;
    }

    public void setRetdesc(String retdesc) {
        this.retdesc = retdesc;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public class CityInfoBody{

        private List<CityInfoBo> cityList;

        public List<CityInfoBo> getCityList() {
            return cityList;
        }

        public void setCityList(List<CityInfoBo> cityList) {
            this.cityList = cityList;
        }
    }




}
