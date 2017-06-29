package com.elong.hotel.proxy.hotel3.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.proxy.hotel3.bo.ConfirmFaxBo;

import java.util.List;

/**
 * Created by user on 17/6/23.
 */
public class GetConfirmFaxResponse extends ServiceResponseBase {
    public List<ConfirmFaxBo> getConfirmFaxList() {
        return ConfirmFaxList;
    }

    public void setConfirmFaxList(List<ConfirmFaxBo> confirmFaxList) {
        ConfirmFaxList = confirmFaxList;
    }

    private List<ConfirmFaxBo> ConfirmFaxList;

}
