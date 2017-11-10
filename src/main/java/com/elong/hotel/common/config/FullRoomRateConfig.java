/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.common.config.FullRoomRateConfig.java]
 * Createion [2017年10月20日]
 */
package com.elong.hotel.common.config;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;


/**
 * 预测满房模型接入配置
 * @author jianjun.wang
 * @version 1.0.0
 */
public class FullRoomRateConfig {

	
	/**
	 * 操作人
	 */
	private String operatorName;
	
	/**
	 * 操作时间
	 */
	private String operatorTime;
	
	/**
	 * 操作者ip
	 */
	private String operatorIp;
	
	/**
	 * 最小百分比
	 */
	@NotNull(message="最小满房率不能为空")
	private BigDecimal minrate;
	
	/**
	 * 最大百分比
	 */
	@NotNull(message="最大满房率不能为空")
	private BigDecimal maxrate;
	
	/**
	 * 是否启用 0 废弃  1启用
	 */
	@NotNull(message="开关不能为空")
	@Range(min=0,max=1,message="开关参数不合法")
	private Integer enable;

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorTime() {
		return operatorTime;
	}

	public void setOperatorTime(String operatorTime) {
		this.operatorTime = operatorTime;
	}

	public BigDecimal getMinrate() {
		return minrate;
	}

	public void setMinrate(BigDecimal minrate) {
		this.minrate = minrate;
	}

	public BigDecimal getMaxrate() {
		return maxrate;
	}

	public void setMaxrate(BigDecimal maxrate) {
		this.maxrate = maxrate;
	}

	public String getOperatorIp() {
		return operatorIp;
	}

	public void setOperatorIp(String operatorIp) {
		this.operatorIp = operatorIp;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	
}
