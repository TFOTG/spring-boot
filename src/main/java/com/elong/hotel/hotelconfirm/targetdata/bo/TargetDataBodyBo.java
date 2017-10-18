package com.elong.hotel.hotelconfirm.targetdata.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年10月12日 上午10:34:17   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class TargetDataBodyBo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String collectTime;

	private List<TargetDataValueBo> tagValues;

	public String getCollectTime() {
		return collectTime;
	}

	public void setCollectTime(String collectTime) {
		this.collectTime = collectTime;
	}

	public List<TargetDataValueBo> getTagValues() {
		return tagValues;
	}

	public void setTagValues(List<TargetDataValueBo> tagValues) {
		this.tagValues = tagValues;
	}

	public void addTagValue(TargetDataValueBo bo) {
		if (tagValues == null) {
			tagValues = new ArrayList<>();
		}

		tagValues.add(bo);
	}
}
