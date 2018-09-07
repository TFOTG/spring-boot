package com.elong.hotel.storage.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hualong.Li on 17/4/24.
 */
public enum StorageTypeEnum {

	CONFIRM(1),

	NOROOM(2),

	CREATEORDER(3),
	
	EXAM(4);

//    CANCEL(5);
//
//	SPECIAL(6);

	private int value;

	StorageTypeEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static List<StorageTypeEnum> getEnumList(){
        List<StorageTypeEnum> list =new ArrayList<>();
        for (StorageTypeEnum storageTypeEnum : StorageTypeEnum.values()) {
            list.add(storageTypeEnum);
        }
        return list;
    }
}
