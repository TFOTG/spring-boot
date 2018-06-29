package com.elong.hotel.hotelconfirm.groupfilter.bo;

import com.elong.hotel.common.exception.Init4GroupInfoException;
import com.elong.hotel.hotelconfirm.groupfilter.enums.CompareFieldEnum;
import com.elong.hotel.hotelconfirm.groupfilter.enums.CompareResultEnum;
import edu.emory.mathcs.backport.java.util.Arrays;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GroupEntity
 *
 * @author yangboyu
 * @Title: GroupEntity
 * @Description:
 * @date 2016年3月2日 上午9:27:57
 */
public class GroupFilterEntity<T extends GroupBase, Y extends CompareEntityBase> {

    /**
     * 原数据匹配结果 例如确认排序：
     * Key 				CompareEnum
     * orderType	    CompareEnum.Off
     * supplierId; 		CompareEnum.Off
     * cityId; 			CompareEnum.On
     */
    private Map<String, CompareResultEnum> compareMetaDate;

    /**
     * 分组信息
     */
    private T groupBaseInfo;

    /**
     * Constructor for GroupEntity.
     * <p>Title: </p>
     * <p>Description: 根据"自定义注释"方式进行反射对比字段处理
     * 通过反射机制依次对比源数据字段，如果DB中配置为All，或者是源数据与DB配置具体值对应上为:CompareResultEnum.On，否则为:CompareResultEnum.Off
     * </p>
     *
     * @param metaDate
     * @param compareDate
     * @throws Exception
     */
    public GroupFilterEntity(T metaDate, Y compareDate) throws Init4GroupInfoException {
        this.groupBaseInfo = metaDate;
        compareMetaDate = new HashMap<>();
        Map<String, String> tags = metaDate.getTags();
        Field[] fields = compareDate.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(CompareEntityAnnotations.class)) {
                String tagValue, name = "";
                Object value;
                List<String> tagStrings;
                try {
                    CompareEntityAnnotations annotations = (CompareEntityAnnotations) field.getAnnotations()[0];

                    name = annotations.name();
                    tagValue = tags.get(name);
                    tagStrings = new ArrayList<>(Arrays.asList(tagValue.toLowerCase().split(",")));
                    field.setAccessible(true);
                    value = field.get(compareDate);
                    //如果比较方式是区间比较
                    if (annotations.compareType().equals(CompareEntityAnnotations.CompareTypeEnum.BETWEEN)) {

                        if ((tagValue.equalsIgnoreCase(CompareFieldEnum.All.toString()) || tagValue.equalsIgnoreCase(CompareFieldEnum.NL.toString()))) {
                            compareMetaDate.put(name, CompareResultEnum.On);
                        } else {
                            double min = Double.valueOf(tagStrings.get(0));
                            double max = Double.valueOf(tagStrings.get(1));
                            boolean inNumInterval = (Double.valueOf(value.toString()) >= min) && (Double.valueOf(value.toString()) < max);
                            if (inNumInterval) {
                                compareMetaDate.put(name, CompareResultEnum.On);
                            } else {
                                compareMetaDate.put(name, CompareResultEnum.Off);
                            }
                        }
                    } else {
                        if ((tagValue.equalsIgnoreCase(CompareFieldEnum.All.toString()) || tagValue.equalsIgnoreCase(CompareFieldEnum.NL.toString()))
                                || (null != value && tagStrings.contains(value.toString().toLowerCase()))) {
                            compareMetaDate.put(name, CompareResultEnum.On);
                        } else {
                            compareMetaDate.put(name, CompareResultEnum.Off);
                        }

                    }
                } catch (Exception e) {
                    throw new Init4GroupInfoException(String.format("初始化分组匹配信息失败:分组信息%s,匹配信息:%s,具体异常:%s", metaDate.toString(), compareDate.toString(), name+e.toString()));
                }
            }
        }
    }

    public Map<String, CompareResultEnum> getCompareMetaDate() {
        return compareMetaDate;
    }

    public T getGroupInfo() {
        return groupBaseInfo;
    }

    /**
     * getAllCompareResult
     *
     * @return
     * @Title: 整体比较结果
     * @Description:
     */
    public CompareResultEnum getAllCompareResult() {
        for (CompareResultEnum resultEnum : compareMetaDate.values()) {
            if (resultEnum.equals(CompareResultEnum.Off)) {
                return CompareResultEnum.Off;
            }
        }

        return CompareResultEnum.On;
    }
    
}
