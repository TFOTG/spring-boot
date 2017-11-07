package com.elong.hotel.common.enums;

import com.elong.hotel.common.util.FileUtils;

import java.io.Serializable;

public enum FileSingletonEnum implements Serializable {

	INSTANCE;

	private FileUtils fileUtils;

	public FileUtils getFileUtils() {
		return fileUtils;
	}

	public void setFileUtils(FileUtils fileUtils) {
		this.fileUtils = fileUtils;
	}
}