package app.saikat.Annotations.SocketSDK;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * method to invoke when a message is received.Method can have optional parameters
 *	'UUID', 'MessageHeader' and any one of 'Server', 'Client' or 'Sender'. Other than these,
 *	only one more parameter must be added. When a message of the mandatory type parameter is
 *	received, this method is invoked
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