package com.elong.hotel.hotelconfirm.ivr.bo;


public class CallBackItem {
private int OrderId;

private String FeedBackStatus;

public void setOrderId(int OrderId){
this.OrderId = OrderId;
}
public int getOrderId(){
return this.OrderId;
}
public void setFeedBackStatus(String FeedBackStatus){
this.FeedBackStatus = FeedBackStatus;
}
public String getFeedBackStatus(){
return this.FeedBackStatus;
}

}