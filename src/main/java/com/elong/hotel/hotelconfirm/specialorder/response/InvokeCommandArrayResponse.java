package com.elong.hotel.hotelconfirm.specialorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujunjie on 2018/7/30.
 */
public class InvokeCommandArrayResponse extends ServiceResponseBase {

    // 批量执行的结果status
    private long status;
    // 批量执行的结果
    private List<CommandExecuteResponse> results;

    public InvokeCommandArrayResponse() {
        status = 0;
        this.results = new ArrayList<>();
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public List<CommandExecuteResponse> getResults() {
        return results;
    }

    public void setResults(List<CommandExecuteResponse> results) {
        this.results = results;
    }
}
