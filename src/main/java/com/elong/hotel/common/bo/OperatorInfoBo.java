package com.elong.hotel.common.bo;

import com.elong.hotel.proxy.javaorder.request.OperatorInfo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Hualong.Li on 17/4/24.
 */
public class OperatorInfoBo implements Serializable {
    private static final long serialVersionUID = -500733771286000939L;
    private String operatorName;

    private String operatorIP;

    private Date operatorTime;

    public OperatorInfoBo(OperatorInfo bo){
        this.operatorIP = bo.getOperatorIP();
        this.operatorName = bo.getOperatorName();
        this.operatorTime = bo.getOperatorTime();
    }

    public OperatorInfoBo() {
    }

    public OperatorInfoBo(String opName,Date opDate,String operatorIP) {
        this.operatorName=opName;
        this.operatorTime=opDate;
        this.operatorIP=operatorIP;

    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorIP() {
        return operatorIP;
    }

    public void setOperatorIP(String operatorIP) {
        this.operatorIP = operatorIP;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}
