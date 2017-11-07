package com.elong.hotel.common.helper;

import com.alibaba.fastjson.JSON;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期帮助类
 */
public class DateHelper {

	/**
	 * 获取两个日期相差的天数 date1-date2
	 * 
	 * @param d1
	 * @param d2
	 * @return date1-date2相差天数
	 */
	public static int getDayCount(Date d1, Date d2) {
		if (d1 == null || d2 == null) {
			throw new RuntimeException("getDayCount error. params can't be null.");
		}
		Date min = getMinDate();
		if (d1.before(min) || d2.before(min)) {
			throw new RuntimeException(String.format("getDayCount error. params can't before %s.", JSON.toJSONStringWithDateFormat(min, "yyyy-MM-dd HH:mm:dd")));
		}
		// 获取年月日部分
		d1 = getYearMonthDay(d1);
		d2 = getYearMonthDay(d2);
		return (int) ((d1.getTime() - d2.getTime()) / (24 * 60 * 60 * 1000));
	}

	/**
	 *
	 * @param toTime
	 * @param fromTime
     * @return
     */
	public static int getMinusCount(Date toTime, Date fromTime){
		long from = fromTime.getTime();
		long to = toTime.getTime();
		int minutes = (int) ((to - from)/(1000 * 60));

		return minutes;
	}

	/**
	 * 获取时间的年月日部分
	 * 
	 * @param date
	 * @return
	 */
	static Date getYearMonthDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE), 0, 0, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获取java中最小日期 因为date.getTime()最小支持1970-01-01
	 * 
	 * @return 1970-01-01 00:00:01
	 */
	public static Date getMinDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(1970, 0, 1, 0, 0, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获取java中日期 因为date.getPromiseDate()2099-01-01
	 *
	 * @return 2099-01-01 00:00:01
	 */
	public static Date getPromiseDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(2099, 0, 1, 0, 0, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 *
	 * @return 2000-01-01 00:00:00
	 */
	public static Date getDefaultDate(){
		Calendar cal = Calendar.getInstance();
		cal.set(2000, 0, 1, 0, 0, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 是否是最小日期 1970-01-01
	 * 
	 * @param date
	 * @return
	 */
	public static boolean isMinDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return getMinDate().compareTo(cal.getTime()) == 0;
	}

	/**
	 * 日期计算
	 * @param src 原始日期
	 * @param days 追加的天数（如果是减日期，传负数）
	 * @return
	 */
	public static Date addDate(Date src, int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(src);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}

	/**
	 * 日期计算
	 * @param src 原始日期
	 * @param second 追加的s数（如果是减日期，传负数）
	 * @return
	 */
	public static Date addSecond(Date src, int second) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(src);
		cal.add(Calendar.SECOND, second);
		return cal.getTime();
	}

	/**
	 * 日期计算
	 * @param src 原始日期
	 * @param minute 追加的s数（如果是减日期，传负数）
	 * @return
	 */
	public static Date addMinute(Date src, int minute) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(src);
		cal.add(Calendar.MINUTE, minute);
		return cal.getTime();
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// Date d1 = sdf.parse("1970-01-01 09:11:49");
		// Date d2 = sdf.parse("2016-06-08 00:00:00");
		// System.out.println(isMinDate(d1));
		// getDayCount(d1, d2);
		Date d1 = sdf.parse("1970-02-01 0:0:0");
		System.out.println(JSON.toJSONStringWithDateFormat(addDate(d1, -1), "yyyy-MM-dd"));
	}
}