package com.elong.hotel.proxy.indexlibrary.request;

import java.io.Serializable;
import java.util.Map;

/**
 * @author  jianjun.wang
 * @create 2018-01-08 下午12:35
 */

public class IndexLibraryTagValues implements Serializable{

    private static final long serialVersionUID = -579970778948906199L;

    private Map<String, Object> tagMap;

    private Object[] values;

    public Map<String, Object> getTagMap() {
        return tagMap;
    }

    public void setTagMap(Map<String, Object> tagMap) {
        this.tagMap = tagMap;
    }

    public Object[] getValues() {
        return values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }
}