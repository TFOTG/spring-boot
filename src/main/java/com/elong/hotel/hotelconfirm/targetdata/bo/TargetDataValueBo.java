package com.elong.hotel.hotelconfirm.targetdata.bo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年10月9日 上午10:16:25   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class TargetDataValueBo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Map<String, String> tagMap;

	private Integer[] values;

	public TargetDataValueBo() {
		super();
	}

	public TargetDataValueBo(Integer[] values) {
		tagMap = new HashMap<>();
		tagMap.put("verify", "needHandingCount");
		this.values = values;
	}

	public TargetDataValueBo(String[] keys, Integer[] values) {
		tagMap = new HashMap<>();

		tagMap.put("confirmChannel", keys[1]);
		tagMap.put("confirmSupplier", keys[0]);

		this.values = values;
	}

	public Map<String, String> getTagMap() {
		return tagMap;
	}

	public void setTagMap(Map<String, String> tagMap) {
		this.tagMap = tagMap;
	}

	public Integer[] getValues() {
		return values;
	}

	public void setValues(Integer[] values) {
		this.values = values;
	}

}
