package com.elong.hotel.hotelconfirm.examorder.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 终拒关联处理订单PO
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月13日 下午3:31:20   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class ExamRelationOrderPo implements Serializable{

	/** 
	 * long ExamRelationOrderPo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;
	
	/**
	 * 订单号
	 */
	private Integer reserNo;
	
	/**
	 * 关联处理订单号
	 */
	private Integer relationReserNo;
	
	/**
	 * 操作人
	 */
	private String operator;
	
	/**
	 * 操作IP
	 */
	private String opIp;
	
	/**
	 * 操作时间
	 */
	private Date opDate;

	public ExamRelationOrderPo(){
		super();
	}
	
	public ExamRelationOrderPo(Integer id, Integer reserNo, Integer relationReserNo, String operator, String opIp, Date opDate) {
		super();
		this.id = id;
		this.reserNo = reserNo;
		this.relationReserNo = relationReserNo;
		this.operator = operator;
		this.opIp = opIp;
		this.opDate = opDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public Integer getRelationReserNo() {
		return relationReserNo;
	}

	public void setRelationReserNo(Integer relationReserNo) {
		this.relationReserNo = relationReserNo;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOpIp() {
		return opIp;
	}

	public void setOpIp(String opIp) {
		this.opIp = opIp;
	}

	public Date getOpDate() {
		return opDate;
	}

	public void setOpDate(Date opDate) {
		this.opDate = opDate;
	}
	
}
