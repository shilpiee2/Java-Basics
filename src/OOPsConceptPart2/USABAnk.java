package OOPsConceptPart2;

public interface USABAnk {
	
	int minBalance = 100;  // automatically static in nature, cannot change the value
	
	// only method declarations, no method body
	
	public void credit();
	public void debit();
	public void transferMoney();
	public void mutualFund();

}
