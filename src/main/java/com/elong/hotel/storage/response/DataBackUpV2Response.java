package com.elong.hotel.storage.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * Created by user on 18/8/10.
 */
public class DataBackUpV2Response extends ServiceResponseBase {
    private int executeCount;

    public int getExecuteCount() {
        return executeCount;
    }

    public void setExecuteCount(int executeCount) {
        this.executeCount = executeCount;
    }
}
