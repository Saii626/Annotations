package app.saikat.Annotations.DIManagement;

public interface Generator<T> {

	/**
	 * Generates an object with specified arguments
	 * @param args arguments to create the object
	 * @return the created object
	 */
	T generate(Object... args);
}