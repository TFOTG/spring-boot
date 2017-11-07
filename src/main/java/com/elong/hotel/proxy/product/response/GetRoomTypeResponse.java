package com.elong.hotel.proxy.product.response;

import com.elong.hotel.proxy.product.bo.SHotelRoom;

import java.util.List;

/**
 * Created by peng.wang on 2017/8/1.
 */
public class GetRoomTypeResponse {

    private int responseCode;

    private String exceptionMsg;

    private RealResponse realResponse;


    public RealResponse getRealResponse() {
        return realResponse;
    }

    public void setRealResponse(RealResponse realResponse) {
        this.realResponse = realResponse;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public class RealResponse{

        private int responseCode;

        private List<SHotelRoom> roomTypeNumInfoList;

        public int getResponseCode() {
            return responseCode;
        }

        public void setResponseCode(int responseCode) {
            this.responseCode = responseCode;
        }

        public List<SHotelRoom> getRoomTypeNumInfoList() {
            return roomTypeNumInfoList;
        }

        public void setRoomTypeNumInfoList(List<SHotelRoom> roomTypeNumInfoList) {
            this.roomTypeNumInfoList = roomTypeNumInfoList;
        }
    }

}
