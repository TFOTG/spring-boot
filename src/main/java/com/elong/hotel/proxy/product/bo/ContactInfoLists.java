package com.elong.hotel.proxy.product.bo;

import java.util.List;
public class ContactInfoLists {
private List<ContactInfoList> contactInfoList ;

private int retcode;

private String retdesc;

private String serverIp;

public void setContactInfoList(List<ContactInfoList> contactInfoList){
this.contactInfoList = contactInfoList;
}
public List<ContactInfoList> getContactInfoList(){
return this.contactInfoList;
}
public void setRetcode(int retcode){
this.retcode = retcode;
}
public int getRetcode(){
return this.retcode;
}
public void setRetdesc(String retdesc){
this.retdesc = retdesc;
}
public String getRetdesc(){
return this.retdesc;
}
public void setServerIp(String serverIp){
this.serverIp = serverIp;
}
public String getServerIp(){
return this.serverIp;
}

}