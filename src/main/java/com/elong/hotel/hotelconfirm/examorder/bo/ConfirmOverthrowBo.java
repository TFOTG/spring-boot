package com.elong.hotel.hotelconfirm.examorder.bo;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * hotelmis
 *
 * @author jianjun.wang
 * @Date 2018-02-11 16:22  下午4:22
 */

public class ConfirmOverthrowBo implements Serializable {

    private static final long serialVersionUID = -1774166375638836460L;
    /**
     * 携程订单号
     */
    @NotEmpty(message = "携程订单号不能为空")
    private String ctripOrderId;

    /**
     * 艺龙订单号
     */
    @NotNull(message = "艺龙订单号不能为空")
    private Integer elongOrderId;

    /**
     * 类别标识
     */
    @NotEmpty(message = "类别标识不能为空")
    private String type;

    /**
     * 携程订单详细页URL
     */
    @NotEmpty(message = "携程订单详细页URL不能为空")
    private String ctripOrderDetailUrl;

    /**
     * 时间戳
     */
    @NotEmpty(message = "时间戳不能为空")
    private String operateTimeLong;

    /**
     * 操作者
     */
    @NotEmpty(message = "操作人不能为空")
    private String operatorName;

    /**
     * 操作者ip  系统获取记录
     */
    private String operatorIp;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCtripOrderDetailUrl() {
        return ctripOrderDetailUrl;
    }

    public void setCtripOrderDetailUrl(String ctripOrderDetailUrl) {
        this.ctripOrderDetailUrl = ctripOrderDetailUrl;
    }

    public String getOperateTimeLong() {
        return operateTimeLong;
    }

    public void setOperateTimeLong(String operateTimeLong) {
        this.operateTimeLong = operateTimeLong;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }
}