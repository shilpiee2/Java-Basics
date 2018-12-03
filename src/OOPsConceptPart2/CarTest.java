package OOPsConceptPart2;

public class CarTest {

	public static void main(String[] args) {
	
		BMW b = new BMW() ;
		b.engineCheck();
		
		// whenever the same method is present in parent class and child class, then preference is goes to Child class only.
		// this is Method Overriding.
		
		// Static polymorphism ------>compile time polymorphism
		
		b.start(); // overridden method....preference will go to child class method
		b.refuel();
		b.stop();
		b.engineCheck();
		
		Car c = new Car();
		c.start();     // it will take from Car class
		c.stop();
		c.refuel();
		
		
		//Down Casting
		
		//BMW b1= (BMW) new Car();  //class cast exception will come
		
		//Top Casting
		
		Car c1 =new BMW(); // child class can be referred with object of parent class. This is called dynamic polymorphism
		
		c1.refuel();
		c1.start();
		c1.refuel();
		
		// Cannot use the methods of the child class BMW
		//only overridden methods can be called
		
		
		
		
	}

}
