package com.elong.hotel.proxy.indexlibrary.request;

import java.io.Serializable;

/**
 * @author jianjun.wang
 * @Date 2018-01-08 下午12:50
 */

public class IndexLibraryBaseRequest implements Serializable{

    private static final long serialVersionUID = 2150409518228941674L;

    private String sourceCode;

    private IndexLibraryBody body;

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public IndexLibraryBody getBody() {
        return body;
    }

    public void setBody(IndexLibraryBody body) {
        this.body = body;
    }
}