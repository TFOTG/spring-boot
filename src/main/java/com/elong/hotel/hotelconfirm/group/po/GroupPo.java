package com.elong.hotel.hotelconfirm.group.po;

import com.elong.hotel.common.groupfilter.bo.GroupBase;

import java.util.Date;
import java.util.Map;

/**
 * Created by yangboyu on 17/4/4.
 */
public class GroupPo {
    private String groupName;

    private Map<String, String> tags;

    private Integer sort;

    private Date opdate;

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOpdate() {
        return opdate;
    }

    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", opdate=" + opdate +
                ", sort=" + sort +
                ", tags=" + tags +
                ", groupName=" + groupName +
                '}';
    }
}
