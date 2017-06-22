package com.elong.hotel.common.helper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

/**
 * 
 * JsonHelper
 * 
 * @Title: JsonHelper
 * @Description:
 * @author yangboyu
 * @date 2014年12月28日 下午1:36:51
 * 
 */
public class JsonHelper {
	/**
	 * Converts a data object to json string.
	 * 
	 * @param obj
	 *            A java.io.Serializable
	 * @return A java.lang.String indicating the json that contains the data of
	 *         the object.
	 */
	public static String toJson(Serializable obj) {
		if (obj == null) {
			return null;
		} else {  
			return JSONObject.toJSONString(obj,
					SerializerFeature.WriteDateUseDateFormat,
					SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.BrowserCompatible);
		}
	}

	/**
	 * 
	 * fromJson
	 * 
	 * @Title: fromJson
	 * @Description: fromJson
	 * @param json
	 * @param clz
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T extends Serializable> T fromJson(String json, Class clz) {
		json = processJsonString(json);
		if (clz.isArray()) {
			JSONArray array = JSON.parseArray(json);
			return (T) JSONObject.toJavaObject(array, clz);
		} else {
			JSON obj = JSON.parseObject(json);
			return (T) JSONObject.toJavaObject(obj, clz);
		}
	}

	/**
	 * 
	 * fromJson
	 * 
	 * @Title: fromJson
	 * @Description: fromJson
	 * @param json
	 * @param clz
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T extends Serializable> T fromJson2(String json, Class clz) {
		if (clz.isArray()) {
			JSONArray array = JSON.parseArray(json);
			return (T) JSONObject.toJavaObject(array, clz);
		} else {
			JSON obj = JSON.parseObject(json);
			return (T) JSONObject.toJavaObject(obj, clz);
		}
	}

	/**
	 * fromJson parseJsonString
	 * 
	 * @Title: parseJsonString
	 * @Description:
	 * @param json
	 * @return
	 */
	public static String parseJsonString(String json) {
		if (json != null) {
			json = json.replace("\\\"", "\"");
			int subFrom = 0;
			int subTo = json.length();
			if (json.startsWith("\"")) {
				subFrom++;
			}
			if (json.endsWith("\"")) {
				subTo--;
			}
			json = json.substring(subFrom, subTo);
		}
		return json;
	}

	/**
	 * processJsonString processJsonString
	 * 
	 * @Title: processJsonString
	 * @Description: processJsonString
	 * @param json
	 * @return
	 */
	protected static String processJsonString(String json) {
		if (json != null) {
			json = json.replace("\\\"", "\"");
			int subFrom = 0;
			int subTo = json.length();
			if (json.startsWith("\"")) {
				subFrom++;
			}
			if (json.endsWith("\"")) {
				subTo--;
			}
			json = json.substring(subFrom, subTo);
		}
		return json;
	}
}
