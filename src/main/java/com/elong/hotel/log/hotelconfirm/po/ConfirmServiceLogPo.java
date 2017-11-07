package com.elong.hotel.log.hotelconfirm.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class ConfirmServiceLogPo {
    private Long id;

    private Integer reserNo;

    private Integer groupId;

    private Integer rankId;

    private String proxyId;

    private String department;

    private String sourceInfo;

    private String opType;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date opDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReserNo() {
        return reserNo;
    }

    public void setReserNo(Integer reserNo) {
        this.reserNo = reserNo;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId == null ? null : proxyId.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo == null ? null : sourceInfo.trim();
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ConfirmServiceLogPo other = (ConfirmServiceLogPo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReserNo() == null ? other.getReserNo() == null : this.getReserNo().equals(other.getReserNo()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getRankId() == null ? other.getRankId() == null : this.getRankId().equals(other.getRankId()))
            && (this.getProxyId() == null ? other.getProxyId() == null : this.getProxyId().equals(other.getProxyId()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getSourceInfo() == null ? other.getSourceInfo() == null : this.getSourceInfo().equals(other.getSourceInfo()))
            && (this.getOpType() == null ? other.getOpType() == null : this.getOpType().equals(other.getOpType()))
            && (this.getOpDate() == null ? other.getOpDate() == null : this.getOpDate().equals(other.getOpDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReserNo() == null) ? 0 : getReserNo().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getRankId() == null) ? 0 : getRankId().hashCode());
        result = prime * result + ((getProxyId() == null) ? 0 : getProxyId().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getSourceInfo() == null) ? 0 : getSourceInfo().hashCode());
        result = prime * result + ((getOpType() == null) ? 0 : getOpType().hashCode());
        result = prime * result + ((getOpDate() == null) ? 0 : getOpDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reserNo=").append(reserNo);
        sb.append(", groupId=").append(groupId);
        sb.append(", rankId=").append(rankId);
        sb.append(", proxyId=").append(proxyId);
        sb.append(", department=").append(department);
        sb.append(", sourceInfo=").append(sourceInfo);
        sb.append(", opType=").append(opType);
        sb.append(", opDate=").append(opDate);
        sb.append("]");
        return sb.toString();
    }
}