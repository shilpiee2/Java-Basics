package OOPsConceptPart2;

public class HSBCBank implements USABAnk, BrazilBank { // we are achieving multiple inheritance
	// Is-a relationship
	
	//if a class is implementing an Interface then, it is mandatory to define/override all the methods of the interface
	
	
	public void credit(){
		System.out.println("HSBC---------->credit");
		
	}

	public void debit(){
		System.out.println("HSBC---------->debit");
		
	}
	
	public void transfer(){
		System.out.println("HSBC---------->transfer");
	}


	@Override
	public void transferMoney() {
		System.out.println("HSBC---------->transferMoney");
		
	}
	@Override
	public void mutualFund() {
	
		System.out.println("HSBC---------->MutualFund");
		
	}
	
}
