package com.elong.hotel.hotelconfirm.staff.response;

import java.util.*;
import com.elong.hotel.hotelconfirm.staff.bo.AmendStaffMonitorBo;
import com.elong.hotel.mis.common.model.response.ResponseBase;

/**
 * Created by pony.ma on 18/6/7.
 */
public class GetAmendStaffMonitorResponse extends ResponseBase {
    private List<AmendStaffMonitorBo> amendStaffMonitorBoList;
    private Date currentTime;

    public List<AmendStaffMonitorBo> getAmendStaffMonitorBoList() {
        return amendStaffMonitorBoList;
    }

    public void setAmendStaffMonitorBoList(List<AmendStaffMonitorBo> amendStaffMonitorBoList) {
        this.amendStaffMonitorBoList = amendStaffMonitorBoList;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
}
