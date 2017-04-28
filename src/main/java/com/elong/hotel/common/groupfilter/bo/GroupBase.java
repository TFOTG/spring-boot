package com.elong.hotel.common.groupfilter.bo;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.elong.hotel.hotelconfirm.group.bo.GroupTagBo;

public abstract class GroupBase{

    protected Map<String, String> tags;

    protected Integer sort;

    protected Date opdate;

    protected Integer id;

    protected List<GroupTagBo> grouptags;
    
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
    	for (GroupTagBo tag : grouptags) {
			if(!tags.containsKey(tag.getTagkey())){
				tags.put(tag.getTagkey(), tag.getTagvalue());
			}
		}
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

	public List<GroupTagBo> getGrouptags() {
		return grouptags;
	}

	public void setGrouptags(List<GroupTagBo> grouptags) {
		this.grouptags = grouptags;
	}
    
}
