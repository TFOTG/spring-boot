package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.po.ConfirmOrderActionLogPo;
import com.elong.hotel.log.hotelconfirm.po.ConfirmOpLogPo;
import com.elong.hotel.log.hotelconfirm.po.ConfirmServiceLogPo;

import java.util.List;

/**
 * Created by liujunjie on 2017/7/18.
 */
public class GetInOutHistoryDataResponse extends ServiceResponseBase {

    private List<ConfirmOpLogPo> confirmOpLogList;

    private List<ConfirmServiceLogPo> confirmServiceLogList;

    private List<ConfirmOrderActionLogPo> confirmOrderActionLogPoList;




    public List<ConfirmOpLogPo> getConfirmOpLogList() {
        return confirmOpLogList;
    }

    public void setConfirmOpLogList(List<ConfirmOpLogPo> confirmOpLogList) {
        this.confirmOpLogList = confirmOpLogList;
    }

    public List<ConfirmServiceLogPo> getConfirmServiceLogList() {
        return confirmServiceLogList;
    }

    public void setConfirmServiceLogList(List<ConfirmServiceLogPo> confirmServiceLogList) {
        this.confirmServiceLogList = confirmServiceLogList;
    }

    public List<ConfirmOrderActionLogPo> getConfirmOrderActionLogPoList() {
        return confirmOrderActionLogPoList;
    }

    public void setConfirmOrderActionLogPoList(List<ConfirmOrderActionLogPo> confirmOrderActionLogPoList) {
        this.confirmOrderActionLogPoList = confirmOrderActionLogPoList;
    }
}
