package ObjectOrientedProgrammingConcepts;

public class StaticAndNonStaticConcept {

	static String name = "Shilpi"; // static global variable
	int age = 27; // non static global variable

	public static void main(String[] args) {

		// how to call static methods and variables
		// 1. direct call
		detail2();
		// 2. call by classname
		StaticAndNonStaticConcept.detail2();

		System.out.println(StaticAndNonStaticConcept.name);
		System.out.println(name);

		// how to call non static methods and vars

		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.detail1();
		System.out.println(obj.age);

	}

	public void detail1() { // non static method
		System.out.println("The details of the person is ---->");
	}

	public static void detail2() { // static method
		System.out.println("The details of the person is ---->");
	}

}
