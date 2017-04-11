package com.elong.hotel.common.helper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by peng.wang on 11/14/16.
 */
public class JavaBeanHelper {

    /**
     * 把java实体，转换为按照<属性名称，属性值>的map
     *
     * @param obj
     * @return
     */
    public static Map<String, Object> javaBeanToMap(Object obj) {

        Map<String, Object> map = new HashMap<>();
        Field[] fields = obj.getClass().getDeclaredFields();
        try {
            for (Field field : fields) {
                String methodName = field.getName();
                String getMethodName = "get" + methodName.substring(0, 1).toUpperCase() + methodName.substring(1, methodName.length());
                Method method = obj.getClass().getDeclaredMethod(getMethodName);
                Object tagValue = method.invoke(obj);
                map.put(field.getName(), tagValue==null?" ":tagValue);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

}
