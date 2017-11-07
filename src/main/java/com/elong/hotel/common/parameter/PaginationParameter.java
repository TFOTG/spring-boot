/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.common.parameter.java]
 * Createion [2017年4月24日]
 */
package com.elong.hotel.common.parameter;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class PaginationParameter {
	
	private Integer stratItem;// 当前页，从1开始计

	private Integer pageSize;// 每页包含的条目数量

	private String orderField;// 排序字段

	private String orderFieldType;// 排序类型
	
	private String groupby;

	private String wheres;
	
	private String whereid;

	private String selectColumns;//查询列

	public Integer getStratItem() {
		return stratItem;
	}

	/**
	 * 传入页数
	 * @param stratItem
	 */
	public void setStratItem(Integer stratItem) {
		this.stratItem = stratItem;
		setStartIndex();
	}

	/**
	 * 传入limit 起始数
	 * @param startItem
	 */
	public void setStartItem(Integer startItem) {
		this.stratItem = startItem;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		setStartIndex();
	}

	private void setStartIndex() {
		if (stratItem != null && pageSize != null) {
			this.stratItem = (stratItem - 1) * pageSize;
		}
	}

	public String getOrderField() {
		return orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public String getOrderFieldType() {
		return orderFieldType;
	}

	public void setOrderFieldType(String orderFieldType) {
		this.orderFieldType = orderFieldType;
	}

	public String getGroupby() {
		return groupby;
	}

	public void setGroupby(String groupby) {
		this.groupby = groupby;
	}

	public String getWheres() {
		return wheres;
	}

	public void setWheres(String wheres) {
		this.wheres = wheres;
	}

	public String getWhereid() {
		return whereid;
	}

	public void setWhereid(String whereid) {
		this.whereid = whereid;
	}

	public String getSelectColumns() {
		return selectColumns;
	}

	public void setSelectColumns(String selectColumns) {
		this.selectColumns = selectColumns;
	}
}
