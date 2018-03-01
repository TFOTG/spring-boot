package com.elong.hotel.hotelconfirm.examorder.bo;


import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.examorder.po.ExamOrderPo;
import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 * 执行action操作的参数来源
 * 
 */
public class ServerRunningActionEntity {
    ExamOrderBo examOrderBo;

    OperatorInfoBo operatorInfoBo;

    ExamOrderPo examOrderPo;

    Order order;

    public ServerRunningActionEntity(ExamOrderPo examOrderPo){
        this.examOrderPo = examOrderPo;
    }

    public ServerRunningActionEntity(ExamOrderBo examOrderBo, OperatorInfoBo operatorInfoBo, Order order, ExamOrderPo examOrderPo) {
        this.examOrderBo = examOrderBo;
        this.operatorInfoBo = operatorInfoBo;
        this.order = order;
        this.examOrderPo = examOrderPo;
    }

    public ExamOrderBo getExamOrderBo() {
        return examOrderBo;
    }

    public void setExamOrderBo(ExamOrderBo examOrderBo) {
        this.examOrderBo = examOrderBo;
    }

    public OperatorInfoBo getOperatorInfoBo() {
        return operatorInfoBo;
    }

    public void setOperatorInfoBo(OperatorInfoBo operatorInfoBo) {
        this.operatorInfoBo = operatorInfoBo;
    }

    public ExamOrderPo getExamOrderPo() {
        return examOrderPo;
    }

    public void setExamOrderPo(ExamOrderPo examOrderPo) {
        this.examOrderPo = examOrderPo;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
