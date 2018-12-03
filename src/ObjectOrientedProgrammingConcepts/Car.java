package ObjectOrientedProgrammingConcepts;

public class Car {

	// class variables

	int model;
	int wheel;

	public static void main(String[] args) {
		
		Car a = new Car();  // this is creating an object of Car class inside the java memory
		
		//a ----> object reference variable
		//new Car()-------> is the new created object
		
		Car b = new Car();
		Car c = new Car();
		
		// Initialise the value for 3 class objects
		
		a.model = 2018;
		a.wheel = 4;
		
		b.model = 2016;
		b.wheel= 2;
		
		c.model = 2015;
		c.wheel = 4;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		

	}

}
