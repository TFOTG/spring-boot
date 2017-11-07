package com.elong.hotel.hotelconfirm.ranksetting.bo;

import com.elong.hotel.hotelconfirm.groupfilter.bo.GroupBase;
import com.elong.hotel.hotelconfirm.ranksetting.po.RankSettingPo;

/**
 * Created by yangboyu on 17/4/4.
 */
public class RankSettingBo extends GroupBase {

    private Integer delayTime;

    private Integer ivrDelayTime;

    private Boolean useIvrService;

    private Boolean useEbkService;

    private Integer promiseTime;

    public RankSettingBo(RankSettingPo po){
        this.setTags(po.findTags4Map());
        this.setId(po.getId());
        this.setSort(po.getSort());
        this.setOpdate(po.getOpdate());
        this.setDelayTime(po.getDelayTime());
        this.setIvrDelayTime(po.getIvrDelayTime());
        this.setUseIvrService(po.getUseIvrService());
        this.setUseEbkService(po.getUseEbkService());
        this.setPromiseTime(po.getPromiseTime());
    }

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

    @Override
    public String toString() {
        return "RankSetting{" +
                "id=" + id +
                ", opdate=" + opdate +
                ", sort=" + sort +
                ", tags=" + tags +
                ", delayTime=" + delayTime +
                ", ivrDelayTime=" + ivrDelayTime +
                ", useIvrService=" + useIvrService +
                ", useEbkService=" + useEbkService +
                ", promiseTime=" + promiseTime +
                '}';
    }
}
