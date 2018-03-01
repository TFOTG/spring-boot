package com.elong.hotel.hotelconfirm.examorder.bo;

import com.elong.hotel.proxy.javaorder.request.OperatorInfo;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

/**
 * hotelmis
 *
 * @author jianjun.wang
 * @Date 2018-02-09 15:40  下午3:40
 */

public class ForceGuaranteeBo {

    /**
     * 携程订单号
     */
    @NotEmpty(message = "携程订单号不能为空")
    private String ctripOrderId;

    /**
     * 艺龙订单号
     */
    @NotEmpty(message = "艺龙订单号不能为空")
    private Integer elongOrderId;

    /**
     * 担保类别
     */
    @NotEmpty(message = "担保类别不能为空")
    private String guaranteeType;

    // 操作ip
    private String operatorIP;
    // 操作人姓名
    @NotEmpty(message = "操作人不能为空")
    private String operatorName;
    // 操作时间
    @NotEmpty(message = "操作时间不能为空")
    private Date operatorTime;

    public String getCtripOrderId() {
        return ctripOrderId;
    }

    public void setCtripOrderId(String ctripOrderId) {
        this.ctripOrderId = ctripOrderId;
    }

    public Integer getElongOrderId() {
        return elongOrderId;
    }

    public void setElongOrderId(Integer elongOrderId) {
        this.elongOrderId = elongOrderId;
    }

    public String getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    public String getOperatorIP() {
        return operatorIP;
    }

    public void setOperatorIP(String operatorIP) {
        this.operatorIP = operatorIP;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}