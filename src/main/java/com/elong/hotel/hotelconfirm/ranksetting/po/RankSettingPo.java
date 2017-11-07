package com.elong.hotel.hotelconfirm.ranksetting.po;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangboyu on 17/4/4.
 */
public class RankSettingPo{

    protected Integer sort;

    protected Date opdate;

    protected Integer id;

    private Integer delayTime;

    private Integer ivrDelayTime;

    private Boolean useIvrService;

    private Boolean useEbkService;

    private Integer promiseTime;

    private List<RankSettingTagPo> ranktags;
    
    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    public Integer getIvrDelayTime() {
        return ivrDelayTime;
    }

    public void setIvrDelayTime(Integer ivrDelayTime) {
        this.ivrDelayTime = ivrDelayTime;
    }

    public Integer getPromiseTime() {
        return promiseTime;
    }

    public void setPromiseTime(Integer promiseTime) {
        this.promiseTime = promiseTime;
    }

    public Boolean getUseEbkService() {
        return useEbkService;
    }

    public void setUseEbkService(Boolean useEbkService) {
        this.useEbkService = useEbkService;
    }

    public Boolean getUseIvrService() {
        return useIvrService;
    }

    public void setUseIvrService(Boolean useIvrService) {
        this.useIvrService = useIvrService;
    }

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

	public List<RankSettingTagPo> getRanktags() {
		return ranktags;
	}

	public void setRanktags(List<RankSettingTagPo> ranktags) {
		this.ranktags = ranktags;
	}

	public Map<String, String> findTags4Map() {
		Map<String, String> map = new HashMap<String, String>();
		for (RankSettingTagPo tag : ranktags) {
			if (!map.containsKey(tag.getTagkey())) {
				map.put(tag.getTagkey(), tag.getTagvalue());
			}
		}
		return map;
	}
}
