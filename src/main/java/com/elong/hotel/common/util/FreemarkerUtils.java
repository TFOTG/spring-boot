package com.elong.hotel.common.util;

import com.elong.hotel.common.enums.FileSingletonEnum;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.IOException;
import java.io.StringReader;

public class FreemarkerUtils {

	/**
	 * 根据 模板内容及模板对象生成具体内容
	 * @param content
	 * @param obj
	 * @return
	 * @throws IOException
	 * @throws TemplateException
	 */
	private static String getTemplateValue(String content, Object obj) throws IOException, TemplateException {
		Template template = new Template(null, new StringReader(content), null);
		return FreeMarkerTemplateUtils.processTemplateIntoString(template, obj);
	}

	/**
	 * 根据文件名和模板对象生成具体内容
	 * @param fileName
	 * @param obj
	 * @return
	 * @throws IOException
	 * @throws TemplateException
	 */
	public static String getTemplate(String fileName,Object obj) throws IOException, TemplateException {
		FileSingletonEnum singleton = FileSingletonEnum.INSTANCE;
		if(singleton.getFileUtils() == null) {
			singleton.setFileUtils(new FileUtils());
		}
		String content = singleton.getFileUtils().readFile(fileName);
		return  getTemplateValue(content, obj).replaceAll("\\s","");
	}


}