package com.elong.hotel.common.util;

import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

	/**
	 * 以字符为单位读取文件
	 */
	public String readFile(String fileName) throws IOException {
		ClassLoader classLoader = this.getClass().getClassLoader();
//		return IOUtils.toString(classLoader.getResourceAsStream(fileName));
		return IOUtils.toString(classLoader.getResource(fileName).openStream());
	}

	/**
	 * 以字符为单位读取文件
	 */
	public String readFileByChars(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		try {
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				sb.append(tempString);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
		return sb.toString();
	}
}