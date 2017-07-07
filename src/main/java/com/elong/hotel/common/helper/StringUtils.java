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
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static String concatWithOutNull(String str1,String str2) {
		StringBuilder sb = new StringBuilder();
		sb.append(str1 == null ? "" : str1).append(str2 == null ? "" : str2);
		return sb.toString();
	}
	
}
