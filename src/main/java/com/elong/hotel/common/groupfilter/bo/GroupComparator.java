package com.elong.hotel.common.groupfilter.bo;

import com.elong.hotel.common.groupfilter.enums.CompareResultEnum;

import java.util.Comparator;

/**
 * GroupComparator
 *
 * @author yangboyu
 * @Title: 分组结果排序
 * @Description: TODO
 * @date 2016年3月2日 上午9:25:19
 */
public class GroupComparator implements Comparator<GroupFilterEntity> {

    @Override
    public int compare(GroupFilterEntity object1, GroupFilterEntity object2) {
        if (object1.getAllCompareResult().equals(CompareResultEnum.On) && object2.getAllCompareResult().equals(CompareResultEnum.On)) {
            if (object1.getGroupInfo().getSort().equals(object2.getGroupInfo().getSort())) {
                return object1.getGroupInfo().getOpdate().getTime() > object2.getGroupInfo().getOpdate().getTime() ? -10 : 10;
            } else {
                return object1.getGroupInfo().getSort() > object2.getGroupInfo().getSort() ? 10 : -10;
            }
        } else if (object1.getAllCompareResult().equals(CompareResultEnum.On)) {
            return -1;
        } else if (object2.getAllCompareResult().equals(CompareResultEnum.On)) {
            return 1;
        } else {
            return 1;
        }
    }
}
