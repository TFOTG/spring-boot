package com.elong.hotel.common.response;

import java.io.Serializable;

/**
 * hotelmis
 *
 * @author jianjun.wang
 * @Date 2018-02-09 16:52  下午4:52
 */

public class ApiReturnResponse extends ServiceResponseBase implements Serializable{

    private static final long serialVersionUID = 3132327955780443053L;

    private String serverip;

    private Object body;

    public String getServerip() {
        return serverip;
    }

    public void setServerip(String serverip) {
        this.serverip = serverip;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}