package com.elong.hotel.hotelconfirm.group.po;

import com.elong.hotel.common.groupfilter.bo.GroupBase;

/**
 * Created by yangboyu on 17/4/4.
 */
public class GroupPo extends GroupBase {
    private String groupName;

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
