package com.elong.hotel.log.hotelconfirm.po;

import com.elong.hotel.hotelconfirm.examorder.bo.AutoNoticeGroupBo;

import java.util.Date;

/**
 * Created by peng.wang on 2018/7/9.
 */
public class OrderNoticeLogPo {

    private Integer id;

    private Integer orderId;

    private Integer groupId;

    private String groupName;
    //1,发送成功，2联系方式错误，3系统失败
    private Integer status;

    private Date noticeTime;
    //发送类型：1，短信，2邮件
    private Integer noticeType;
    //来源，1终拒自动通知分组
    private Integer noticeSource;

    private String contactInfo;

    private String creator;

    private Date createTime;

    private String createIp;


    public OrderNoticeLogPo() {
    }

    public OrderNoticeLogPo(AutoNoticeGroupBo autoNoticeGroupBo) {

        this.orderId=autoNoticeGroupBo.getOrderId();
        this.groupId=autoNoticeGroupBo.getGroupId();
        this.groupName=autoNoticeGroupBo.getGroupName();
        this.noticeSource=1;
        this.noticeTime=new Date();
        this.createTime=new Date();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public Integer getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp;
    }

    public Integer getNoticeSource() {
        return noticeSource;
    }

    public void setNoticeSource(Integer noticeSource) {
        this.noticeSource = noticeSource;
    }
}
