package com.elong.hotel.proxy.ivr.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.proxy.ivr.bo.GetIvrCountToOutBoundBo;

import java.util.List;

public class GetIvrBoundCountResponse  extends ServiceResponseBase {

    private List<GetIvrCountToOutBoundBo> result;

    public List<GetIvrCountToOutBoundBo> getResult() {
        return result;
    }

    public void setResult(List<GetIvrCountToOutBoundBo> result) {
        this.result = result;
    }

}