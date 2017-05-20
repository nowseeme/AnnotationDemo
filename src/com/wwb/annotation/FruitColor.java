package com.wwb.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ˮ����ɫע��
 * @author nowuseeme
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
	//ˮ����ɫö��
	public enum Color{Green,Red, Blue};
	//��ɫ����
	Color fruitColor() default Color.Green;	
}
