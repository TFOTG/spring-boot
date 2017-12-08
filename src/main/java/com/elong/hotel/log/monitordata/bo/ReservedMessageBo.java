package com.elong.hotel.log.monitordata.bo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年12月8日 上午11:11:56   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class ReservedMessageBo implements Serializable {

	/** 
	 * long ReservedMessageBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private Date createTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
