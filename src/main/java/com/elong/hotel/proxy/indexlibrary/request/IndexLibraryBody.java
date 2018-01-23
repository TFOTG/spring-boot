package com.elong.hotel.proxy.indexlibrary.request;

import java.io.Serializable;
import java.util.List;

/**
 * @author  jianjun.wang
 * @create 2018-01-08 下午12:46
 */

public class IndexLibraryBody implements Serializable{

    private static final long serialVersionUID = -7787031453583068662L;

    private String indexName;

    private String collectTime;

    private List<IndexLibraryTagValues> tagValues;

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

    public List<IndexLibraryTagValues> getTagValues() {
        return tagValues;
    }

    public void setTagValues(List<IndexLibraryTagValues> tagValues) {
        this.tagValues = tagValues;
    }
}