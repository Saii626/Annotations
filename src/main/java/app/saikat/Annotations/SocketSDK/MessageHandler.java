package app.saikat.Annotations.SocketSDK;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import app.saikat.Annotations.DIManagement.ScanAnnotation;

/**
 * method to invoke when a message is received.Method can have optional parameters
 *	'UUID', 'MessageHeader' and any one of 'Server', 'Client' or 'Sender'. Other than these,
 *	only one more parameter must be added. When a message of the mandatory type parameter is
 *	received, this method is invoked
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ScanAnnotation(autoManage = false)
public @interface MessageHandler {
}