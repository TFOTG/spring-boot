package com.elong.hotel.proxy.product.response;

import com.elong.hotel.proxy.product.bo.ShotelInfo;
import com.elong.hotel.proxy.product.bo.ShotelPhone;

import java.io.Serializable;
import java.util.List;

public class GetShotelAuditRealResponse extends ServiceResponseProductRealBase implements Serializable {

	private static final long serialVersionUID = -624988456237705387L;
	private List<ShotelInfo> shotelForAuditInfos;

	private List<ShotelPhone> result;

	public List<ShotelInfo> getShotelForAuditInfos() {
		return shotelForAuditInfos;
	}

	public void setShotelForAuditInfos(List<ShotelInfo> shotelForAuditInfos) {
		this.shotelForAuditInfos = shotelForAuditInfos;
	}

	public List<ShotelPhone> getResult() {
		return result;
	}

	public void setResult(List<ShotelPhone> result) {
		this.result = result;
	}
}