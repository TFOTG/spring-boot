/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.valid.CollectionNotBlankValidator.java]
 * Createion [2017年7月10日]
 */
package com.elong.hotel.hotelconfirm.valid;

import java.util.Collection;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.elong.hotel.common.annotaitions.CollectionNotBlank;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class CollectionNotBlankValidator implements ConstraintValidator<CollectionNotBlank, Collection<?>>{

	@Override
	public void initialize(CollectionNotBlank constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(Collection<?> value, ConstraintValidatorContext context) {
		if(value==null || value.isEmpty()) return false;
        return true;
	}

}
