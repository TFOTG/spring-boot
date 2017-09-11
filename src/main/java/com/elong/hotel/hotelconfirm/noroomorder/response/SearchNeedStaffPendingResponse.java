package com.elong.hotel.hotelconfirm.noroomorder.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.noroomorder.bo.StaffPendingNoRoomOrderBo;

/**
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年9月7日 上午9:25:51   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class SearchNeedStaffPendingResponse extends ServiceResponseBase {

	private static final long serialVersionUID = 1L;

	private int totalCount;

	private List<StaffPendingNoRoomOrderBo> list;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<StaffPendingNoRoomOrderBo> getList() {
		return list;
	}

	public void setList(List<StaffPendingNoRoomOrderBo> list) {
		this.list = list;
	}

}
