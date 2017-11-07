/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.common.annotaitions.CollectionNotBlank.java]
 * Createion [2017年7月10日]
 */
package com.elong.hotel.common.annotaitions;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

import com.elong.hotel.hotelconfirm.valid.CollectionNotBlankValidator;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CollectionNotBlankValidator.class)
@ReportAsSingleViolation
@Documented
public @interface CollectionNotBlank {

    String message() default "集合中不能包含空元素。";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
