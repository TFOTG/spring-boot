package com.elong.hotel.hotelconfirm.group.po;

/**
 * Created by user on 17/6/9.
 */
public class ConfirmGroupTagPo {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 分组唯一标记位
     */
    private Integer groupguid;

    /**
     * 关键字key
     */
    private String tagkey;

    /**关键字value
     *
     */
    private String tagvalue;

    private ConfirmGroupPo confirmGroupPo;

    public ConfirmGroupPo getConfirmGroupPo() {
        return confirmGroupPo;
    }

    public void setConfirmGroupPo(ConfirmGroupPo confirmGroupPo) {
        this.confirmGroupPo = confirmGroupPo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagkey() {
        return tagkey;
    }

    public void setTagkey(String tagkey) {
        this.tagkey = tagkey;
    }

    public String getTagvalue() {
        return tagvalue;
    }

    public void setTagvalue(String tagvalue) {
        this.tagvalue = tagvalue;
    }


    public Integer getGroupguid() {
        return groupguid;
    }

    public void setGroupguid(Integer groupguid) {
        this.groupguid = groupguid;
    }
}
