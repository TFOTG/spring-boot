package com.elong.hotel.proxy.hotel3.bo;

import com.alibaba.fastjson.annotation.JSONField;

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
     * 1:新单/已审;2:变更;3:取消;4:已确认;5:担保书;7:预付;8:满房;101:(外)通知付款;102:(外)安排预定;103:(外)提供入住凭证;
     * 51:elong(客户确认单);52:AsiaMedia(客户确认单);53:艺龙-集团客户部(客户确认单);61:elong(酒店确认单);62:elong(酒店确认单)-重;
     * 63:AsiaMedia(酒店确认单);64:AsiaMedia(酒店确认单)-重;65:艺龙-集团客户部(酒店确认单);66:艺龙-集团客户部(酒店确认单)-重;67:汇款通知单;
     * 104:(接机)通知付款;105:(接机)安排预定;106:(接机)提供入住凭证;202:度假产品机票订单;201:度假传真;203:度假产品接送机订单;204:度假产品客人出行通知书;
     * 301:EVEREST国际酒店预订信用卡授权书传真
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
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date EndTime;
    /**
     *收发传真开始时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
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
