package com.elong.hotel.hotelconfirm.group.po;

import com.elong.hotel.hotelconfirm.group.bo.GroupStaffBo;
import com.elong.hotel.hotelconfirm.group.bo.GroupTagBo;
import com.elong.hotel.hotelconfirm.groupfilter.bo.GroupBase;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 17/6/8.
 */
public class ConfirmGroupPo {

    private Integer id;

    private Integer groupguid;

    private String groupname;

    private Date opdate;

    private Integer deptment;

    private boolean enable;

    private Integer sort;

    private Integer gettingtype;

    private String opname;

    private String opip;

    private List<ConfirmGroupTagPo> grouptags;

    private List<GroupStaffBo> groupstaffs;

    public String getOpip() {
        return opip;
    }

    public void setOpip(String opip) {
        this.opip = opip;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getOpname() {
        return opname;
    }

    public void setOpname(String opname) {
        this.opname = opname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getGettingtype() {
        return gettingtype;
    }

    public void setGettingtype(Integer gettingtype) {
        this.gettingtype = gettingtype;
    }

    public Integer getGroupguid() {
        return groupguid;
    }

    public void setGroupguid(Integer groupguid) {
        this.groupguid = groupguid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
    public Integer getDeptment() {
        return deptment;
    }

    public void setDeptment(Integer deptment) {
        this.deptment = deptment;
    }

    public Map<String, String> findTags4Map(){
        Map<String, String> map = new HashMap<String, String>();
        for (ConfirmGroupTagPo tag : grouptags) {
            if(!map.containsKey(tag.getTagkey())){
                map.put(tag.getTagkey(), tag.getTagvalue());
            }
        }
        return map;
    }

    public Date getOpdate() {
        return opdate;
    }

    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }
    public List<ConfirmGroupTagPo> getGrouptags() {
        return grouptags;
    }

    public void setGrouptags(List<ConfirmGroupTagPo> grouptags) {
        this.grouptags = grouptags;
    }

    public List<GroupStaffBo> getGroupstaffs() {
        return groupstaffs;
    }

    public void setGroupstaffs(List<GroupStaffBo> groupstaffs) {
        this.groupstaffs = groupstaffs;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", opdate=" + opdate +
                ", sort=" + sort +
                ", groupname=" + groupname +
                '}';
    }
}
