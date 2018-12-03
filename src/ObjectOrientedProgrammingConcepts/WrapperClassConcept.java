package ObjectOrientedProgrammingConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// Data conversion ---->string to Int

		String x = "100";
		System.out.println(x + 20);

		int a = Integer.parseInt(x); // it will return a integer
		System.out.println(a + 20);
		System.out.println(Integer.parseInt(x) + 20);

		// Integer, Boolean, Double ---> wrapper class

		// String to Double
		String y = "20.50";
		System.out.println(y + 20);
		System.out.println(Double.parseDouble(y) + 20);

		// String to Char
		String b = "True";
		System.out.println(Boolean.parseBoolean(b));

		// Int to String

		int j = 200;
		System.out.println(String.valueOf(j) + 20);

	}

}
