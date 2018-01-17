package com.elong.hotel.proxy.indexlibrary.response;


import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.proxy.indexlibrary.request.IndexLibraryBody;

import java.io.Serializable;
import java.util.List;

/**
 * verify
 *
 * @author jianjun.wang
 * @Date 2018-01-08 15:54  下午3:54
 */

public class IndexLibraryBaseResponse extends ServiceResponseBase implements Serializable {

    private static final long serialVersionUID = 6495326705058248334L;

    private String retcode;

    private String retdesc;

    private String serverIp;

    private List<IndexLibraryBody> body;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    public String getRetdesc() {
        return retdesc;
    }

    public void setRetdesc(String retdesc) {
        this.retdesc = retdesc;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public List<IndexLibraryBody> getBody() {
        return body;
    }

    public void setBody(List<IndexLibraryBody> body) {
        this.body = body;
    }
}