package com.elong.hotel.hotelconfirm.examorder.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by user on 18/6/25.
 */
public class GetExamRelationOrderBo  implements Serializable {
    private Integer orderId;
    private Integer relationOrderId;
    private String staffName;
    private String operatorDate;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getRelationOrderId() {
        return relationOrderId;
    }

    public void setRelationOrderId(Integer relationOrderId) {
        this.relationOrderId = relationOrderId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getOperatorDate() {
        return operatorDate;
    }

    public void setOperatorDate(String operatorDate) {
        this.operatorDate = operatorDate;
    }
}
