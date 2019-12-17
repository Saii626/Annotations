package app.saikat.Annotations.DIManagement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Provider of this method will be created, with qualifier
 * same as this method
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface Provides {

	/**
	 * Whether  the object returned is singleton. If it is singleton, method will be
	 * executed only once and will return same result on every subsequent invocation
	 * @return if the return value is singleton
	 */
	boolean singleton() default true;
}