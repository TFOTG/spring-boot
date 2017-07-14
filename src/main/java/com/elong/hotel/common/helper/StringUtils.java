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

	/**
	 * 拼接字符串
	 * @param str
	 * @return
	 */
	public static String concatWithOutNull(String ... str) {
		StringBuilder sb = new StringBuilder();
		for(String s : str) {
			sb.append(s == null ? "" : s);
		}
		return sb.toString();
	}
	
}
