package com.elong.hotel.hotelconfirm.groupfilter.bo;

import java.util.Date;
import java.util.Map;

public abstract class GroupBase{

    protected Map<String, String> tags;

    protected Integer sort;

    protected Date opdate;

    protected Integer id;

    
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getOpdate() {
        return opdate;
    }

    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
