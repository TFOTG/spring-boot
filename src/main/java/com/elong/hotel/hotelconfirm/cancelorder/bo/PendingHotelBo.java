package com.elong.hotel.hotelconfirm.cancelorder.bo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年9月4日 上午8:58:57   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class PendingHotelBo implements Serializable{

	/** 
	 * long PendingHotelBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * SHotelId
	 */
	private String sHotelId;
	
	/**
	 * 酒店名称
	 */
	private String hotelName;
	
    /**
     * 供应商Id
     */
    private String supplierId;

    /**
     * 供应商名称
     */
    private String supplierName;
    
    /**
     * 待处理订单集合
     */
    private List<PendingCancelOrderBo> pendingOrders;

	public PendingHotelBo() {
		super();
	}

	public PendingHotelBo(PendingCancelOrderBo pendingCancelOrderBo) {
		super();
		this.sHotelId = pendingCancelOrderBo.getsHotelId();
		this.hotelName = pendingCancelOrderBo.getHotelName();
		this.supplierId = pendingCancelOrderBo.getSupplierId();
		this.supplierName = pendingCancelOrderBo.getSupplierName();
	}

	public String getsHotelId() {
		return sHotelId;
	}

	public void setsHotelId(String sHotelId) {
		this.sHotelId = sHotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public List<PendingCancelOrderBo> getPendingOrders() {
		return pendingOrders;
	}

	public void setPendingOrders(List<PendingCancelOrderBo> pendingOrders) {
		this.pendingOrders = pendingOrders;
	}    
}
