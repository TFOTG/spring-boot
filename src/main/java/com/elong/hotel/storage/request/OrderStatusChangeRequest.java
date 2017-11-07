package com.elong.hotel.storage.request;

import com.elong.hotel.storage.enums.StorageTypeEnum;

import java.io.Serializable;

/**
 * Created by Hualong.Li on 17/4/24.
 */
public class OrderStatusChangeRequest implements Serializable {

	private static final long versionUID = -345234523452345L;

	private String messageName;

	private String message;

	private String tag;

	private StorageTypeEnum typeEnum;

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public StorageTypeEnum getTypeEnum() {
		return typeEnum;
	}

	public void setTypeEnum(StorageTypeEnum typeEnum) {
		this.typeEnum = typeEnum;
	}
}
