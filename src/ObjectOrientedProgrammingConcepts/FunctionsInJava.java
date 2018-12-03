package ObjectOrientedProgrammingConcepts;

public class FunctionsInJava {
	
	//Global variables are class variables
	
	String x = "I am Shilpi";
	int y = 25;
	

	public static void main(String[] args) {
		
		// to call the functions, we need to create the object for the class 'FunctionsInJava'.
		FunctionsInJava obj = new FunctionsInJava();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4(3, 7);
		System.out.println(obj.x); // to call the global variable, you need to create an object of class
		
		
	}
	
	//non static methods

	// void means doesn't return any value
	public void test1(){
		
		System.out.println("test method 1");
	}
	
	// return type integer 
	public int test2(){
		System.out.println("Test method 2");
		int a = 1;
		int b = 2;
		int c = a+b;
		
		return c;
		
	}
	
	public String test3(){
		System.out.println("Test method 3");
		String s = "Selenium";
		return s;
	}
	
	// a, b ---> input arguments, parameters
	
	public int test4(int a, int b){
		System.out.println("Test method 4");
		System.out.println(a+b);
		return a+b;
		
		
	}
}

