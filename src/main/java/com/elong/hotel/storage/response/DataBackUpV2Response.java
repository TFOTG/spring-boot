package com.elong.hotel.storage.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * Created by user on 18/8/10.
 */
public class DataBackUpV2Response extends ServiceResponseBase {
    private long insertCount;
    private long deleteCount;

    public long getInsertCount() {
        return insertCount;
    }

    public void setInsertCount(long insertCount) {
        this.insertCount = insertCount;
    }

    public long getDeleteCount() {
        return deleteCount;
    }

    public void setDeleteCount(long deleteCount) {
        this.deleteCount = deleteCount;
    }
}
