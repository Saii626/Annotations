package app.saikat.Annotations.SocketSDK;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Method to invoke when a message is received. Method can have optional parameters
 * 'UUID', 'MessageHeader' and either 'Sender' or any of its subclass. Other than these,
 * only one more parameter must be present which determines what kind of message the bean 
 * handles. When a message of this type is received, this method is invoked
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MessageHandler {

	/**
	 * List of qualified MessageQueue's which should process this handler
	 * @return list of queues
	 */
	Class<? extends Annotation>[] queues() default DefaultQueue.class;
}
