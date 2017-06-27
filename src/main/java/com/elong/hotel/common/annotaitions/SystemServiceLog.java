package com.elong.hotel.common.annotaitions;

import java.lang.annotation.*;

/**
 * Created by Hualong.Li on 17/5/23.
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemServiceLog {
	String description()  default "";
}
