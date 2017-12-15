package com.elong.hotel.log.monitordata.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年12月8日 上午11:05:58   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class TimeHelper {

	public static final int sec = 60;

	public static final int mills = 1000;

	/**
	 * 格式化日期
	 * @param time 日期
	 * @param pattern 
	 * @return
	 * @throws ParseException
	 */
	public static Date formatDate(Date time, String pattern) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String timeStr = sdf.format(time);
		return sdf.parse(timeStr);
	}

	/**
	 * 日期转换
	 * @param timeStr 日期格式
	 * @param pattern 
	 * @return
	 * @throws ParseException
	 */
	public static Date formatStringToDate(String timeStr, String pattern) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.parse(timeStr);
	}

	/**
	 * 计算时间点
	 * @param time 日期
	 * @return
	 * @throws ParseException 
	 */
	public static Date calculatedTime(Date time, int intervalMinute) throws ParseException {

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(time);

		int minute = calendar.get(Calendar.MINUTE);

		int times = (minute % intervalMinute) > 0 ? ((minute / intervalMinute) + 1) : (minute % intervalMinute);

		Date date = formatDate(time, "yyyy-MM-dd HH");

		return new Date((date.getTime() + times * intervalMinute * sec * mills));
	}
}
