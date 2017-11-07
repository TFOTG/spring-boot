package com.elong.hotel.hotelconfirm.targetdata.bo;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年10月17日 上午9:59:02   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class TargetDataParamBodyBo extends TargetDataBodyBo {

	private static final long serialVersionUID = 1L;

	private String indexName;

	public TargetDataParamBodyBo() {
		super();
	}

	public TargetDataParamBodyBo(TargetDataBodyBo bo, String collectTime, String indexName) {
		this.setCollectTime(collectTime);
		this.setTagValues(bo.getTagValues());
		this.indexName = indexName;
	}

	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}
}
