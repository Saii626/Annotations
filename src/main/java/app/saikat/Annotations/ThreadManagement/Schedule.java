package app.saikat.Annotations.ThreadManagement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Schedule {

	/**
	 * Rate in per sec
	 * @return rate in per sec. if rate -ve, will not be called
	 */
	float rate() default -1.0f;

	/**
	 * Interval in sec between 2 method calls
	 * @return rate in per sec. if rate -ve, will not be called
	 */
	float interval() default -1.0f;
}