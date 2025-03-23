package java_8.method_reference;

/**
 * Functional interface for creating Person objects using constructor reference.
 * 
 * @author er-anubhavgoel
 */
@FunctionalInterface
public interface PersonCreator {
	Person create(String name, int age);
}