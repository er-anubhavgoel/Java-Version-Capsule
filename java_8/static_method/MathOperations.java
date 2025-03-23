package java_8.static_method;

/**
 * Interface showcasing static and default methods in Java 8. Static methods
 * must be called using the interface name.
 * 
 * @author er-anubhavgoel
 */
public interface MathOperations {

	static int findMax(int a, int b) {
		return (a > b) ? a : b;
	}

	static int findMin(int a, int b) {
		return (a < b) ? a : b;
	}

	default void greet() {
		System.out.println("Welcome to MathOperations!");
	}
}
