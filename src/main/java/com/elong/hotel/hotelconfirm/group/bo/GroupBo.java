package com.elong.hotel.hotelconfirm.group.bo;

import com.elong.hotel.hotelconfirm.group.po.GroupPo;
import com.elong.hotel.hotelconfirm.groupfilter.bo.GroupBase;

/**
 * Created by yangboyu on 17/4/4.
 */
public class GroupBo extends GroupBase {
    private String groupName;

    public GroupBo(GroupPo po){
        this.setTags(po.findTags4Map());
        this.setId(po.getId());
        this.setSort(po.getSort());
        this.setGroupName(po.getGroupName());
        this.setOpdate(po.getOpdate());
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
