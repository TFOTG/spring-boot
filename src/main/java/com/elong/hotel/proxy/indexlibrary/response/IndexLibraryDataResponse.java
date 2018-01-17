package com.elong.hotel.proxy.indexlibrary.response;

import java.util.List;

/**
 * verify
 *
 * @author jianjun.wang
 * @Date 2018-01-11 10:45  上午10:45
 */

public class IndexLibraryDataResponse<T> {

    private String collectTime;

    private List<T> dataList;

    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}