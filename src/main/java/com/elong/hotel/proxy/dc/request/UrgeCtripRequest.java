package com.elong.hotel.proxy.dc.request;

import com.elong.hotel.proxy.dc.bo.UrgeCtripBo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peng.wang on 2017/7/6.
 */
public class UrgeCtripRequest {

    private String from;

    private String logId;

    private RealRequest realRequest;

    public UrgeCtripRequest(String ctripOrderId,Integer elongOrderId) {

        this.realRequest=new RealRequest(ctripOrderId,elongOrderId);

    }

    public UrgeCtripRequest(){

    }

    public class RealRequest{

        private List<UrgeCtripBo> orderIdList;

        public RealRequest(String ctripOrderId,Integer elongOrderId) {
            List<UrgeCtripBo> list=new ArrayList<>();
            UrgeCtripBo bo=new UrgeCtripBo();
            bo.setCtripOrderId(ctripOrderId);
            bo.setElongOrderId(elongOrderId);
            list.add(bo);
            this.orderIdList = list;
        }

        public RealRequest() {
        }

        public List<UrgeCtripBo> getOrderIdList() {
            return orderIdList;
        }

        public void setOrderIdList(List<UrgeCtripBo> orderIdList) {
            this.orderIdList = orderIdList;
        }
    }



    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public RealRequest getRealRequest() {
        return realRequest;
    }

    public void setRealRequest(RealRequest realRequest) {
        this.realRequest = realRequest;
    }
}
