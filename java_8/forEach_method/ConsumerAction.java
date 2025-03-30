package java_8.forEach_method;

/**
 * Functional Interface representing a Consumer action. Used for demonstrating
 * the forEach() method in Java 8.
 *
 * @author er-anubhavgoel
 */
@FunctionalInterface
public interface ConsumerAction<T> {
	void accept(T t);
}
