package com.elong.hotel.proxy.platform.request;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by Hualong.Li on 17/7/14.
 */
public class SendMsgRequest implements Serializable {

	private Long cardNo;

	private String channel;

	private String messageId;

	private Map<String,Object> params;

	private String traceId;

	private String requestIP;

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getRequestIP() {
		return requestIP;
	}

	public void setRequestIP(String requestIP) {
		this.requestIP = requestIP;
	}

	public SendMsgRequest(Long cardNo, String channel, String messageId, Map<String, Object> params, String traceId, String requestIP) {
		this.cardNo = cardNo;
		this.channel = channel;
		this.messageId = messageId;
		this.params = params;
		this.traceId = traceId;
		this.requestIP = requestIP;
	}

	public SendMsgRequest() {

	}
}
