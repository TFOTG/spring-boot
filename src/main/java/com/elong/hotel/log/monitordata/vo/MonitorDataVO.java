package com.elong.hotel.log.monitordata.vo;

import java.util.Date;

import com.elong.hotel.common.parameter.PaginationParameter;

/**
 * @outhor jianjun.wang
 * @create 2017-12-05 下午4:50
 */

public class MonitorDataVO extends PaginationParameter {

	/**
	 * 获取数据类型
	 */
	private Integer dataType;

	/**
	 *时间轴参数 start
	 */
	private Date startCollectTime;

	/**
	 * 时间轴参数 end
	 */
	private Date endCollectTime;

	public Date getStartCollectTime() {
		return startCollectTime;
	}

	public void setStartCollectTime(Date startCollectTime) {
		this.startCollectTime = startCollectTime;
	}

	public Date getEndCollectTime() {
		return endCollectTime;
	}

	public void setEndCollectTime(Date endCollectTime) {
		this.endCollectTime = endCollectTime;
	}

	public Integer getDataType() {
		return dataType;
	}

	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}

}