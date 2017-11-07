package com.elong.hotel.common.helper;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 异常处理工具
 * 
 * @Title: ExceptionHelper
 * @Description:
 * @author bin.song
 * @date 2014年10月31日 下午2:23:02
 *
 */
public class ExceptionHelper {

	/**
	 * 获取堆栈信息 @Title: getStackInfo @Description:   @param exp @return
	 * String @throws
	 */
	public static String getStackInfo(Exception exp) {
		String stackInfo = null;
		StringWriter sWriter = null;
		PrintWriter pWriter = null;
		try {
			sWriter = new StringWriter();
			pWriter = new PrintWriter(sWriter);
			exp.printStackTrace(pWriter);
			stackInfo = sWriter.toString().replaceAll("\r", "").replaceAll("\n", "");
		} catch (Exception e) {
			stackInfo = "null";
		} finally {
			IOUtils.closeWriter(sWriter);
			IOUtils.closeWriter(pWriter);
		}

		return stackInfo;
	}
	
	/**
	 * 获取堆栈信息 @Title: getStackInfo @Description: @param exp @return
	 * String @throws
	 */
	public static String getStackInfo(Throwable exp) {
		String stackInfo = null;
		StringWriter sWriter = null;
		PrintWriter pWriter = null;
		try {
			sWriter = new StringWriter();
			pWriter = new PrintWriter(sWriter);
			exp.printStackTrace(pWriter);
			stackInfo = sWriter.toString().replaceAll("\r", "").replaceAll("\n", "");
		} catch (Exception e) {
			stackInfo = "null";
		} finally {
			IOUtils.closeWriter(sWriter);
			IOUtils.closeWriter(pWriter);
		}

		return stackInfo;
	}
}
