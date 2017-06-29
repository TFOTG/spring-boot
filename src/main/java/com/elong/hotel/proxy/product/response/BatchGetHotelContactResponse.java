package com.elong.hotel.proxy.product.response;

import com.elong.hotel.proxy.product.bo.ContactInfoLists;

public class BatchGetHotelContactResponse {
private ContactInfoLists body;

private int retcode;

private String retdesc;

private String serverIp;

public void setBody(ContactInfoLists body){
this.body = body;
}
public ContactInfoLists getBody(){
return this.body;
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