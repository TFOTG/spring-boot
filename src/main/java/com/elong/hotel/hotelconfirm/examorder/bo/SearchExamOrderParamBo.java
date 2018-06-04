package com.elong.hotel.hotelconfirm.examorder.bo;

import java.io.Serializable;
import java.util.List;

/**
 * 查询参数类
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月1日 下午2:01:18   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class SearchExamOrderParamBo implements Serializable{

	/** 
	 * long SearchExamOrderParamBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 员工姓名
	 */
	private String staffName;
	
	/**
	 * 优先级集合
	 */
	private List<Integer> prioritys;
	
	/**
	 * 分组ID集合
	 */
	private List<Integer> groupIds;

	/**
	 * 是否暂缓 0:未暂缓，1:暂缓
	 */
	private Integer isRespited;
	
	/**
	 * 是否未被获取 0:未被获取，1:已被获取
	 */
	private Integer isUnfetched;
	
	/**
	 * 分组条件
	 */
	private String groupByCond;
	
	/**
	 * 排序条件
	 */
	private String orderByCond;
	
	/**
	 * 查询其实行数
	 */
	private Integer startRow;
	
	/**
	 * limit 数量
	 */
	private Integer size;

	public SearchExamOrderParamBo(){
		super();
	}
	
	public SearchExamOrderParamBo(List<Integer> groupIds, List<Integer> prioritys, Integer size, String orderByCond){
		super();
		this.groupIds = groupIds;
		this.prioritys = prioritys;
		this.size = size;
		this.orderByCond = orderByCond;
	}
	
	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public List<Integer> getPrioritys() {
		return prioritys;
	}

	public void setPrioritys(List<Integer> prioritys) {
		this.prioritys = prioritys;
	}

	public List<Integer> getGroupIds() {
		return groupIds;
	}

	public void setGroupIds(List<Integer> groupIds) {
		this.groupIds = groupIds;
	}

	public Integer getIsRespited() {
		return isRespited;
	}

	public void setIsRespited(Integer isRespited) {
		this.isRespited = isRespited;
	}

	public Integer getIsUnfetched() {
		return isUnfetched;
	}

	public void setIsUnfetched(Integer isUnfetched) {
		this.isUnfetched = isUnfetched;
	}

	public String getGroupByCond() {
		return groupByCond;
	}

	public void setGroupByCond(String groupByCond) {
		this.groupByCond = groupByCond;
	}

	public String getOrderByCond() {
		return orderByCond;
	}

	public void setOrderByCond(String orderByCond) {
		this.orderByCond = orderByCond;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	
}
