package com.elong.hotel.proxy.javaorder.getorder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单担保信息
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年11月27日 上午9:49:20   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class OrderVouchRule implements Serializable {

	/** 
	 * long OrderVouchRule.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 担保金额原币
	 */
	private BigDecimal vouchMoney;

	/**
	 * 担保人民币金额
	 */
	private BigDecimal vouchMoneyRMB;

	/**
	 * 担保金额汇率
	 */
	private BigDecimal exchangeRate;

	/**
	 * 担保金额类型  1：首晚，2：全额，3：部分
	 */
	private Integer vouchMoneyType;

	/**
	 * 最晚取消时间
	 */
	private Date lastCancelTime;

	public BigDecimal getVouchMoney() {
		return vouchMoney;
	}

	public void setVouchMoney(BigDecimal vouchMoney) {
		this.vouchMoney = vouchMoney;
	}

	public BigDecimal getVouchMoneyRMB() {
		return vouchMoneyRMB;
	}

	public void setVouchMoneyRMB(BigDecimal vouchMoneyRMB) {
		this.vouchMoneyRMB = vouchMoneyRMB;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Integer getVouchMoneyType() {
		return vouchMoneyType;
	}

	public void setVouchMoneyType(Integer vouchMoneyType) {
		this.vouchMoneyType = vouchMoneyType;
	}

	public Date getLastCancelTime() {
		return lastCancelTime;
	}

	public void setLastCancelTime(Date lastCancelTime) {
		this.lastCancelTime = lastCancelTime;
	}

}
