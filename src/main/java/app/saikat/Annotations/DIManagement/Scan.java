
package app.saikat.Annotations.DIManagement;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Meta annotation.
 * Annotations annotated with this will be scanned by DIManager
 */
@Documented
@Target({ ElementType.ANNOTATION_TYPE, ElementType.TYPE } )
@Retention(RetentionPolicy.RUNTIME)
public @interface Scan {

	/**
	 * Managers for beans created for this annotation. The class receives callbacks on various bean states
	 * @return managers of this annotation. All of them must be subclass of @{link app.saikat.DIManagement.Interfaces.DIBeanManager}
	 */
	Class<?>[] beanManager() default {};
}