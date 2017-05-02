package com.elong.hotel.hotelconfirm.group.po;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.elong.hotel.hotelconfirm.group.bo.GroupTagBo;

/**
 * Created by yangboyu on 17/4/4.
 */
public class GroupPo {
    private String groupName;

    private Map<String, String> tags;

    private Integer sort;

    private Date opdate;

    private Integer id;

    private List<GroupTagBo> grouptags;
    
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
    	if(tags==null){
        	for (GroupTagBo tag : grouptags) {
    			if(!tags.containsKey(tag.getTagkey())){
    				tags.put(tag.getTagkey(), tag.getTagvalue());
    			}
    		}
    	}
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

    public List<GroupTagBo> getGrouptags() {
		return grouptags;
	}

	public void setGrouptags(List<GroupTagBo> grouptags) {
		this.grouptags = grouptags;
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
