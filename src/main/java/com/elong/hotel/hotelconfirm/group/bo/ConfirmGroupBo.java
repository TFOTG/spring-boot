package com.elong.hotel.hotelconfirm.group.bo;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.common.util.StringUtils;
import com.elong.hotel.hotelconfirm.group.enums.GettingTypeEnum;
import com.elong.hotel.hotelconfirm.group.enums.GroupOrderStatusEnum;
import com.elong.hotel.hotelconfirm.group.po.ConfirmGroupPo;
import com.elong.hotel.hotelconfirm.group.po.ConfirmGroupTagPo;

import java.util.Date;

/**
 * Created by user on 17/6/12.
 */
public class ConfirmGroupBo {

    private ConfirmGroupPo confirmGroupPo;
    private Integer idBo;
    private String groupNameBo;
    private String sortBo;
    private String cityBo;
    private String cityIdBo;
    private String cityStrBo;
    private String supplierBo;
    private String supplierIdBo;
    private String supplierStrBo;
    private String isImmediatelyBo;
    private String isImmediatelyIdBo;
    private String orderStatusBo;
    private String orderStatusIdBo;
    private String orderStatusStrBo;
    private String getTypeBo;
    private String staffBo;
    private String staffStrBo;
    private String operatorBo;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date opTimeBo;
    private boolean enableBo;

    public String getCityIdBo() {
        return cityIdBo;
    }

    public void setCityIdBo(String cityIdBo) {
        this.cityIdBo = cityIdBo;
    }

    public String getIsImmediatelyIdBo() {
        return isImmediatelyIdBo;
    }

    public void setIsImmediatelyIdBo(String isImmediatelyIdBo) {
        this.isImmediatelyIdBo = isImmediatelyIdBo;
    }

    public String getOrderStatusIdBo() {
        return orderStatusIdBo;
    }

    public void setOrderStatusIdBo(String orderStatusIdBo) {
        this.orderStatusIdBo = orderStatusIdBo;
    }

    public String getSupplierIdBo() {
        return supplierIdBo;
    }

    public void setSupplierIdBo(String supplierIdBo) {
        this.supplierIdBo = supplierIdBo;
    }

    public String getCityStrBo() {
        return cityStrBo;
    }

    public void setCityStrBo(String cityStrBo) {
        this.cityStrBo = cityStrBo;
    }

    public String getOrderStatusStrBo() {
        return orderStatusStrBo;
    }

    public void setOrderStatusStrBo(String orderStatusStrBo) {
        this.orderStatusStrBo = orderStatusStrBo;
    }

    public String getSupplierStrBo() {
        return supplierStrBo;
    }

    public void setSupplierStrBo(String supplierStrBo) {
        this.supplierStrBo = supplierStrBo;
    }

    public String getStaffStrBo() {
        return staffStrBo;
    }

    public void setStaffStrBo(String staffStrBo) {
        this.staffStrBo = staffStrBo;
    }

    public String getCityBo() {
        return cityBo;
    }

    public void setCityBo(String cityBo) {
        this.cityBo = cityBo;
    }

    public boolean isEnableBo() {
        return enableBo;
    }

    public void setEnableBo(boolean enableBo) {
        this.enableBo = enableBo;
    }

    public String getGetTypeBo() {
        return getTypeBo;
    }

    public void setGetTypeBo(String getTypeBo) {
        this.getTypeBo = getTypeBo;
    }

    public String getGroupNameBo() {
        return groupNameBo;
    }

    public void setGroupNameBo(String groupNameBo) {
        this.groupNameBo = groupNameBo;
    }

    public Integer getIdBo() {
        return idBo;
    }

    public void setIdBo(Integer idBo) {
        this.idBo = idBo;
    }

    public String getIsImmediatelyBo() {
        return isImmediatelyBo;
    }

    public void setIsImmediatelyBo(String isImmediatelyBo) {
        this.isImmediatelyBo = isImmediatelyBo;
    }

    public String getOperatorBo() {
        return operatorBo;
    }

    public void setOperatorBo(String operatorBo) {
        this.operatorBo = operatorBo;
    }

    public Date getOpTimeBo() {
        return opTimeBo;
    }

    public void setOpTimeBo(Date opTimeBo) {
        this.opTimeBo = opTimeBo;
    }

    public String getOrderStatusBo() {
        return orderStatusBo;
    }

    public void setOrderStatusBo(String orderStatusBo) {
        this.orderStatusBo = orderStatusBo;
    }

    public String getSortBo() {
        return sortBo;
    }

    public void setSortBo(String sortBo) {
        this.sortBo = sortBo;
    }

    public String getStaffBo() {
        return staffBo;
    }

    public void setStaffBo(String staffBo) {
        this.staffBo = staffBo;
    }

    public String getSupplierBo() {
        return supplierBo;
    }

    public void setSupplierBo(String supplierBo) {
        this.supplierBo = supplierBo;
    }
    public ConfirmGroupPo getConfirmGroupPo() {
        return confirmGroupPo;
    }

    public void setConfirmGroupPo(ConfirmGroupPo confirmGroupPo) {
        this.confirmGroupPo = confirmGroupPo;
    }

    public boolean fill(ConfirmGroupPo confirmGroupPo){
        if(confirmGroupPo==null){
            return false;
        }
        this.setConfirmGroupPo(confirmGroupPo);
        this.setIdBo(confirmGroupPo.getId());
        this.setSortBo(confirmGroupPo.getSort().toString());
        this.setEnableBo(confirmGroupPo.isEnable());
        this.setGetTypeBo(GettingTypeEnum.getValue(confirmGroupPo.getGettingtype()));
        this.setOpTimeBo(confirmGroupPo.getOpdate());
        this.setOperatorBo(confirmGroupPo.getOpname());
        this.setGroupNameBo(confirmGroupPo.getGroupname());
        if(confirmGroupPo.getGroupstaffs()!=null && confirmGroupPo.getGroupstaffs().size()>=0){
            this.setStaffBo(String.valueOf(confirmGroupPo.getGroupstaffs().size()));
            StringBuilder staffs=new StringBuilder();
            for (GroupStaffBo groupStaffBo : confirmGroupPo.getGroupstaffs()) {
                staffs.append(groupStaffBo.getStaffname());
                staffs.append("，");
            }
            if(!staffs.toString().equals("")){
                this.setStaffStrBo(staffs.substring(0,staffs.lastIndexOf("，")));
            }
        }else{
            this.setStaffBo("0");
        }
        if(confirmGroupPo.getGrouptags()!=null && confirmGroupPo.getGrouptags().size()>0){
            for (ConfirmGroupTagPo tag:confirmGroupPo.getGrouptags()) {
                switch (tag.getTagkey()){
                    case "OrderStatus":
                        this.setOrderStatusStrBo(tag.getTagvalue());
                        this.setOrderStatusIdBo(tag.getId().toString());
                        if(tag.getTagvalue().toUpperCase().equals("ALL")){
                            this.setOrderStatusBo("全部");
                            break;
                        }
                        StringBuilder status=new StringBuilder();
                        for (String s : tag.getTagvalue().split(",")) {
                            status.append(GroupOrderStatusEnum.getDescriptionByStatus(s.toUpperCase()));
                            status.append("，");
                        }
                        if(status.toString().equals("")){
                            this.setOrderStatusBo("不限");
                        }else{
                            this.setOrderStatusBo(status.substring(0,status.lastIndexOf("，")));
                        }
                        break;
                    case "CityID":
                        this.setCityBo(getCount(",",tag.getTagvalue()));
                        this.setCityStrBo(tag.getTagvalue());
                        this.setCityIdBo(tag.getId().toString());
                        break;
                    case "SupplierID":
                        this.setSupplierBo(getCount(",",tag.getTagvalue()));
                        this.setSupplierStrBo(tag.getTagvalue());
                        this.setSupplierIdBo(tag.getId().toString());
                        break;
                    case "IsImmediately":
                        this.setIsImmediatelyBo(tag.getTagvalue().equals("1")?"即时":tag.getTagvalue().equals("0")?"非即时":"不限");
                        this.setIsImmediatelyIdBo(tag.getId().toString());
                        break;
                }
            }
        }else{
            this.setCityStrBo("");
            this.setCityBo("");
            this.setSupplierBo("");
            this.setSupplierStrBo("");
            this.setIsImmediatelyBo("");
            this.setOrderStatusBo("");
            this.setOrderStatusStrBo("");
        }
        return true;
    }

    private String getCount(String delimier,String baseStr){
        if(baseStr.equals("ALL")){
            return "全部";
        }
        if(StringUtils.isBlank(baseStr)){
            return "0";
        }
        Integer count=baseStr.split(delimier).length;
        return count.toString();
    }

}
