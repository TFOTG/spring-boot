package com.elong.hotel.proxy.dc.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.proxy.dc.bo.UrgeCtripBo;

import java.util.List;

/**
 * Created by peng.wang on 2017/7/6.
 */
public class UrgeCtripResponse extends ServiceResponseBase {


    private RealResponse realResponse;

    public RealResponse getRealResponse() {
        return realResponse;
    }

    public void setRealResponse(RealResponse realResponse) {
        this.realResponse = realResponse;
    }

    public class RealResponse{

        private List<UrgeCtripBo> reminderOrderRespItems;

        private String resultMsg;

        public List<UrgeCtripBo> getReminderOrderRespItems() {
            return reminderOrderRespItems;
        }

        public void setReminderOrderRespItems(List<UrgeCtripBo> reminderOrderRespItems) {
            this.reminderOrderRespItems = reminderOrderRespItems;
        }

        public String getResultMsg() {
            return resultMsg;
        }

        public void setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
        }
    }

}
