
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
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ScanAnnotation {

	/**
	 * If classes/methods annotated with the annotation will be managed by DIManager or not.
	 * If false, DIManager only keeps track of where the annotaion is used. If true, DIManager will 
	 * recursively scan and add all dependencies to dependency graph and DIManager will be able to
	 * provide Provider
	 * @return whether beans will be managed by DIManager or not
	 */
	boolean autoManage() default false;

	/**
	 * Managers for beans created for this annotation. The class receives callbacks on various bean states
	 * @return managers of this annotation. All of them must be subclass of @{app.saikat.DIManagement.Interfaces.DIBeanManager}
	 */
	Class<?>[] beanManagers() default {};
}