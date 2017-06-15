package com.elong.hotel.hotelconfirm.ivr.request;

import com.elong.hotel.hotelconfirm.ivr.bo.CallBackItem;

import java.util.List;

public class ConfirmIvrRequest {
private String extension;

private String guid;

private String mobile;

private String BussinessGuid;

private int CallBackStatus;

private List<CallBackItem> CallBackItemList ;

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
public void setBussinessGuid(String BussinessGuid){
this.BussinessGuid = BussinessGuid;
}
public String getBussinessGuid(){
return this.BussinessGuid;
}
public void setCallBackStatus(int CallBackStatus){
this.CallBackStatus = CallBackStatus;
}
public int getCallBackStatus(){
return this.CallBackStatus;
}
public void setCallBackItemList(List<CallBackItem> CallBackItemList){
this.CallBackItemList = CallBackItemList;
}
public List<CallBackItem> getCallBackItemList(){
return this.CallBackItemList;
}

}