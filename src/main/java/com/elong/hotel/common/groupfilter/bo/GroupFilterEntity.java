package com.elong.hotel.common.groupfilter.bo;

import com.elong.hotel.common.groupfilter.enums.CompareFieldEnum;
import com.elong.hotel.common.groupfilter.enums.CompareResultEnum;
import edu.emory.mathcs.backport.java.util.Arrays;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
  * GroupEntity
  * @Title: GroupEntity
  * @Description: TODO
  * @author yangboyu
  * @date 2016年3月2日 上午9:27:57
  *
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
	  * 				DB当中存储的为对比字段源数据，字段包括有一审字段： audit（审核方式）、auditingType（审核确认方式）、supplierId（供应商id）、shotelId（shotel id）、provinceId（省id）、cityId（城id）
	  * 				通过反射机制依次对比源数据字段，如果DB中配置为All，或者是源数据与DB配置具体值对应上为:CompareResultEnum.On，否则为:CompareResultEnum.Off
	  * </p>
	  * @param metaDate
	  * @param compareDate
	  * @throws Exception
	 */
	public GroupFilterEntity(T metaDate, Y compareDate) throws Exception {
		this.groupBaseInfo = metaDate;
		compareMetaDate = new HashMap<>();
		Map<String, String> tags = metaDate.getTags();
		Field[] fileds = compareDate.getClass().getDeclaredFields();

		for (Field field : fileds) {
			if (field.isAnnotationPresent(CompareEntityAnnotations.class)) {
				CompareEntityAnnotations annotations = (CompareEntityAnnotations) field.getAnnotations()[0];
				Object value;
				String name = annotations.name();
				String tagValue = tags.get(name);
				List<String> tagStrings = new ArrayList<String>(Arrays.asList(tagValue.toLowerCase().split(",")));
				try {
					field.setAccessible(true);
					value = field.get(compareDate);
				} catch (Exception e) {
					throw new Exception(name);
				}
				if(tagValue.equalsIgnoreCase(CompareFieldEnum.All.toString()) || tagStrings.contains(value.toString().toLowerCase())){
					compareMetaDate.put(name, CompareResultEnum.On);
				}else {
					compareMetaDate.put(name, CompareResultEnum.Off);
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
	 * 
	 * getAllCompareResult
	 * 
	 * @Title: 整体比较结果
	 * @Description: TODO
	 * @return
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
