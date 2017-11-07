package com.elong.hotel.proxy.product.response;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class GetSRoomByShotelRealResponse extends ServiceResponseProductRealBase implements Serializable {

	private Map<String,List<String>> effectiveShotelIdSroomIdsMap;

	public Map<String, List<String>> getEffectiveShotelIdSroomIdsMap() {
		return effectiveShotelIdSroomIdsMap;
	}

	public void setEffectiveShotelIdSroomIdsMap(Map<String, List<String>> effectiveShotelIdSroomIdsMap) {
		this.effectiveShotelIdSroomIdsMap = effectiveShotelIdSroomIdsMap;
	}
}