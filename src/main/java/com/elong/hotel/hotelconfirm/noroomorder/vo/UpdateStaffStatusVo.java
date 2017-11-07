package com.elong.hotel.hotelconfirm.noroomorder.vo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * 
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年9月8日 上午9:33:18   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class UpdateStaffStatusVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 订单号
	 */
	@NotNull(message = "订单号不能为空")
	private Integer orderId;

	/**
	 * 员工处理状态
	 * 1:原房安排，2:免费升级，3:干预失败
	 */
	@NotNull(message = "处理状态不能为空")
	private Integer staffStatus;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getStaffStatus() {
		return staffStatus;
	}

	public void setStaffStatus(Integer staffStatus) {
		this.staffStatus = staffStatus;
	}

}
