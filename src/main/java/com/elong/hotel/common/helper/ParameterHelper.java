package com.elong.hotel.common.helper;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * ParameterHelper
 * 
 * @Title: ParameterHelper
 * @Description: 参数帮助类
 * @author yangboyu
 * @date 2014年12月27日 下午1:47:48
 * 
 */
public class ParameterHelper {

	/**
	 * 
	 * resovleParams
	 * 
	 * @Title: resovleParams
	 * @Description: 解析TaskParams
	 * @param param
	 * @return
	 */
	public static Map<String, String> resovleTaskParams(String param) {
		// 解析 请求参数
		Map<String, String> params = new HashMap<String, String>();
		if (!(param == null) && !param.isEmpty()) {
			String[] tmpParams = param.split("&");

			for (String string : tmpParams) {
				params.put(string.split("=")[0],
						string.split("=").length == 1 ? ""
								: string.split("=")[1]);
			}
		}

		return params;
	}
}
