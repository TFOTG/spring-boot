package com.elong.hotel.common.helper;

public class StringUtils extends com.elong.common.util.StringUtils {

	/**
	 * 截取字符串，从后面开始保留n位
	 * 
	 * @param str
	 * @param length
	 * @return 
	 * subStringFromEnd("123456",3) = "456"
	 * subStringFromEnd("",3) = ""
	 * subStringFromEnd(null,3) = null
	 * @author zouyufei
	 */
	public static String subStringFromEnd(String str, int length) {
		if (!StringUtils.isBlank(str) && str.length() > length) {
			str = str.substring(str.length() - length, str.length());
		}
		return str;
	}
	
}
