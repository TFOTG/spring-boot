package com.elong.hotel.common.helper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

import com.elong.common.util.StringUtils;
import com.elong.hotel.common.enums.CommunicationEventTypeEnum;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
@Component
public class NativeHttpHelper {

	public static String post(String url, String requestContent, int timeout) throws Exception {
		return post(url, requestContent, timeout, "application/json;charset=UTF-8");
	}

	public static String post(String url, String requestContent, int timeout, String contentType) throws Exception {
		OutputStream outputStream = null;
		OutputStreamWriter outputStreamWriter = null;
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader reader = null;
		try {
			URL postUrl = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);
			if (!StringUtils.isBlank(contentType)) {
				connection.setRequestProperty("Content-Type", contentType);
			}
			// 订单组用于记录来源 写死的
			connection.setRequestProperty("X-OrderApi-ClientId", "014e7fe2-da7c-437d-aa7d-dd9ebbd2e4f8");
			connection.setConnectTimeout(timeout);
			outputStream = connection.getOutputStream();
			outputStreamWriter = new OutputStreamWriter(outputStream);
			outputStreamWriter.write(requestContent);
			outputStreamWriter.flush();

			inputStream = connection.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			reader = new BufferedReader(inputStreamReader);
			String result = "";
			String line;
			while ((line = reader.readLine()) != null) {
				result += line;
			}
			return result;
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (outputStreamWriter != null) {
				outputStreamWriter.close();
			}

			if (outputStream != null) {
				outputStream.close();
			}

			if (reader != null) {
				reader.close();
			}

			if (inputStreamReader != null) {
				inputStreamReader.close();
			}

			if (inputStream != null) {
				inputStream.close();
			}
		}
	}

	/**
	 * 
	 * @param url
	 * @param requestContent
	 * @param timeout
	 * @param logTag
	 *            记录communicationevent的tag
	 * @param type
	 *            communicationevent 类型
	 * @return
	 * @throws Exception
	 */
	public String postWithLog(String url, String requestContent, int timeout, String logTag, CommunicationEventTypeEnum type) throws Exception {
		return post(url, requestContent, timeout, null);
	}
}
