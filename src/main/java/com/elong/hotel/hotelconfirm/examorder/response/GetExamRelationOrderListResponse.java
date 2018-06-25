package com.elong.hotel.hotelconfirm.examorder.response;

import java.util.*;
import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.examorder.bo.GetExamRelationOrderBo;

/**
 * Created by user on 18/6/22.
 */
public class GetExamRelationOrderListResponse extends ServiceResponseBase {
    private List<GetExamRelationOrderBo> examRelationOrderList;

    public List<GetExamRelationOrderBo> getExamRelationOrderList() {
        return examRelationOrderList;
    }

    public void setExamRelationOrderList(List<GetExamRelationOrderBo> examRelationOrderList) {
        this.examRelationOrderList = examRelationOrderList;
    }
}
