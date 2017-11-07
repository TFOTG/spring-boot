package com.elong.hotel.hotelconfirm.groupfilter.bo;

import java.lang.annotation.*;

/**
 * 
  * CompareEntityAnnotations
  * @Title: 分组比较自定义数据
  * @Description:
  * @author yangboyu
  * @date 2016年3月1日 下午8:39:50
  *
 */
@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface CompareEntityAnnotations {

	/**
	 * 
	  * name
	  * @Title: 分组Tag表中Key 对应的名称
	  * @Description:
	  * @return
	 */
	String name();
}
