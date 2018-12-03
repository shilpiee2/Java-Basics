package OOPsConceptPart2;

public class BankTest {

	public static void main(String[] args) {
		
		System.out.println(USABAnk.minBalance);
		
		//once you have define the interface value , it cannot be change.. it is final in nature

		HSBCBank hsbc = new HSBCBank();
		hsbc.credit();
		hsbc.debit();
		hsbc.transfer();
		hsbc.transferMoney();

		// dynamic polymerphism
		// child class objects can be referred by the parent interface reference
		// variable

		USABAnk usa = new HSBCBank();

		usa.credit();
		usa.debit();
		usa.transferMoney();

	}

}
