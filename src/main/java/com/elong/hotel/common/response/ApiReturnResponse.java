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

    private int retcode;

    private String retdesc;

    private String serverip;

    private Object body;

    public int getRetcode() {
        return retcode;
    }

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public String getRetdesc() {
        return retdesc;
    }

    public void setRetdesc(String retdesc) {
        this.retdesc = retdesc;
    }

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