package CollectionFramework;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();

		ar.add(100); // index 0
		ar.add(200); // index 1
		ar.add('s'); // index 2
		ar.add("Shilpi16sep"); // index 3
		ar.add(12.33); // index 4
		ar.add(true); // index 5

		System.out.println(ar.size());

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// I want to restrict my input datatype in arraylist

		ArrayList<Integer> ar1 = new ArrayList<Integer>();

		ar1.add(1);
		// ar1.add("shilpi"); The method add(Integer) in the type
		// ArrayList<Integer> is not applicable for the arguments (String)

		System.out.println("The size of the arrayList is -------->"
				+ ar1.size());

	}

}
