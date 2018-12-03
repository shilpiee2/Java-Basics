public class ConstructorConcept {

	// constructor----->default constructor, passing nothing

	public ConstructorConcept() {

		System.out.println("Default construtor");

	}

	public ConstructorConcept(int a){
		System.out.println("Single parameter constructor");
		System.out.println(a);
	}
	
	public ConstructorConcept(int a,int b){
		System.out.println("two parameter constructor");
		System.out.println(a+b);
		System.out.println(b);
	}
		
	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept(4,5); 
		
		

	}

}
