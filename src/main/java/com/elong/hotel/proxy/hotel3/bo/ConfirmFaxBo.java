package com.elong.hotel.proxy.hotel3.bo;

import java.util.Date;

/**
 * Created by user on 17/6/23.
 */
public class ConfirmFaxBo {
    /**
     *回传传真id FaxRec.ID
     */
    private int FID;
    /**
     *传真id Call_Log.ID
     */
    private int CID;
    /**
     *酒店传真关系ID Hotel_Fax_Callcenter.ID
     */
    private int HID;
    /**
     *回传类型
     */
    private String FileType;
    /**
     *第一次传真查看人
     */
    private String Inspector;
    /**
     *第一次传真查看时间
     */
    private String InspectDate;
    /**
     *用于CallCenter确认部是否处理完接收的传真(0没处理1处理完)0默认值 1被人看过 2忽略 4完成 8不详
     */
    private int CallStatus;
    /**
     *接收到传真的服务器IP地址，传真文件转移后这个ip也会更新。所以这个ip是这个传真文件实际所在的服务器的ip
     */
    private String ServerIP;
    /**
     *传真文件名，含绝对路径信息
     */
    private String FileName;
    /**
     *收发传真结束时间
     */
    private Date EndTime;
    /**
     *收发传真开始时间
     */
    private Date StartTime;
    /**
     *是否移动文件
     */
    private int FileMove;
    /**
     *订单号
     */
    private int ReserNo;

    public int getCallStatus() {
        return CallStatus;
    }

    public void setCallStatus(int callStatus) {
        CallStatus = callStatus;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }

    public int getFID() {
        return FID;
    }

    public void setFID(int FID) {
        this.FID = FID;
    }

    public int getFileMove() {
        return FileMove;
    }

    public void setFileMove(int fileMove) {
        FileMove = fileMove;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getFileType() {
        return FileType;
    }

    public void setFileType(String fileType) {
        FileType = fileType;
    }

    public int getHID() {
        return HID;
    }

    public void setHID(int HID) {
        this.HID = HID;
    }

    public String getInspectDate() {
        return InspectDate;
    }

    public void setInspectDate(String inspectDate) {
        InspectDate = inspectDate;
    }

    public String getInspector() {
        return Inspector;
    }

    public void setInspector(String inspector) {
        Inspector = inspector;
    }

    public int getReserNo() {
        return ReserNo;
    }

    public void setReserNo(int reserNo) {
        ReserNo = reserNo;
    }

    public String getServerIP() {
        return ServerIP;
    }

    public void setServerIP(String serverIP) {
        ServerIP = serverIP;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }
}
