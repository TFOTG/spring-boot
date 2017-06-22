package com.elong.hotel.hotelconfirm.groupfilter.bo;

import com.elong.hotel.hotelconfirm.groupfilter.enums.CompareResultEnum;

import java.util.Comparator;

/**
 * GroupComparator
 *
 * @author yangboyu
 * @Title: 分组结果排序
 * @Description:
 * @date 2016年3月2日 上午9:25:19
 */
@SuppressWarnings("rawtypes")
public class GroupComparator implements Comparator<GroupFilterEntity> {

    @Override
    public int compare(GroupFilterEntity object1, GroupFilterEntity object2) {
        if (object1.getAllCompareResult().equals(CompareResultEnum.On) && object2.getAllCompareResult().equals(CompareResultEnum.On)) {
            if (object1.getGroupInfo().getSort().equals(object2.getGroupInfo().getSort())) {
                return object1.getGroupInfo().getOpdate().getTime() > object2.getGroupInfo().getOpdate().getTime() ? -10 : 10;
            } else {
                return object2.getGroupInfo().getSort().compareTo(object1.getGroupInfo().getSort());
            }
        } else if (object1.getAllCompareResult().equals(CompareResultEnum.On)) {
            return -1;
        } else if (object2.getAllCompareResult().equals(CompareResultEnum.On)) {
            return 1;
        } else {
            return -1;
        }
    }
}
