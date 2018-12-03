public class ConstructorWithThisKeyword {

	// class variables
	String name;
	int age;

	public ConstructorWithThisKeyword(String name, int age) {
		// this keyword is used to initialize the class variable
		// this.globalvariable = localvariable
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tome",
				30);
	}
}
