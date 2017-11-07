package com.elong.hotel.hotelconfirm.ivr.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.hotelconfirm.ivr.bo.CallBackItem;

import java.io.Serializable;
import java.util.List;

public class ConfirmIvrRequest implements Serializable {
private String extension;

private String guid;

private String mobile;
@JSONField(name = "BussinessGuid")
private String bussinessGuid;
@JSONField(name = "CallBackStatus")
private int callBackStatus;
@JSONField(name = "CallBackItemList")
private List<CallBackItem> callBackItemList ;

public void setExtension(String extension){
this.extension = extension;
}
public String getExtension(){
return this.extension;
}
public void setGuid(String guid){
this.guid = guid;
}
public String getGuid(){
return this.guid;
}
public void setMobile(String mobile){
this.mobile = mobile;
}
public String getMobile(){
return this.mobile;
}

	public String getBussinessGuid() {
		return bussinessGuid;
	}

	public void setBussinessGuid(String bussinessGuid) {
		this.bussinessGuid = bussinessGuid;
	}

	public int getCallBackStatus() {
		return callBackStatus;
	}

	public void setCallBackStatus(int callBackStatus) {
		this.callBackStatus = callBackStatus;
	}

	public List<CallBackItem> getCallBackItemList() {
		return callBackItemList;
	}

	public void setCallBackItemList(List<CallBackItem> callBackItemList) {
		this.callBackItemList = callBackItemList;
	}
}