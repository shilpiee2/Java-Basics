package ObjectOrientedProgrammingConcepts;

/**
 * @author s.a.bose
 *
 */
public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(1, 2);
		
		// cannot create method inside a method
		//method overloading --> same method name but with different argument with different datatypes within the same class
		

	}

	public void sum() {
		System.out.println("Sum method-----> zero input parameter");

	}

	public void sum(int a) {
		System.out.println("Sum method-----> one input parameter");
	}

	public void sum(int a, int b) {
		System.out.println("Sum method-----> two input parameter");
	}

}
