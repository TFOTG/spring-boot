package com.elong.hotel.hotelconfirm.noroomorder.bo;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年9月3日 下午1:07:16   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class NoRoomFlowData implements Serializable {

	private static final long serialVersionUID = 1L;

	List<NoRoomIvrMenu> menu;

	public List<NoRoomIvrMenu> getMenu() {
		return menu;
	}

	public void setMenu(List<NoRoomIvrMenu> menu) {
		this.menu = menu;
	}

}
