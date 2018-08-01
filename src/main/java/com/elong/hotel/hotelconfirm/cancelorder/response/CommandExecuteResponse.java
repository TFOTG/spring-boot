package com.elong.hotel.hotelconfirm.cancelorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;

import java.io.Serializable;

/**
 * Created by liujunjie on 2018/7/27.
 */
public class CommandExecuteResponse extends ServiceResponseBase implements Serializable {

    // 执行某个command 成功或失败的status
    private long status;
    //命令名称
    private String commandName;
    // 失败的原因
    private String result;
    // 扩展参数
    private int intParameter1;
    // 扩展参数
    private String stringParameter1;

    public CommandExecuteResponse() {
        this.intParameter1 = 0;
        this.stringParameter1 = "";
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getIntParameter1() {
        return intParameter1;
    }

    public void setIntParameter1(int intParameter1) {
        this.intParameter1 = intParameter1;
    }

    public String getStringParameter1() {
        return stringParameter1;
    }

    public void setStringParameter1(String stringParameter1) {
        this.stringParameter1 = stringParameter1;
    }
}
