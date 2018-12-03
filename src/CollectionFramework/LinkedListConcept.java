package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Aron");
		ll.add("Baron");
		ll.add("Shilpi");

		// print all
		System.out.println(ll);

		ll.addFirst("Start");
		ll.addLast("End");

		System.out.println(ll);

		// get

		System.out.println(ll.get(1));

		// using for loop
		System.out.println("< Using For Loop >");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println("The linkedList contains------>" + ll.get(i));
		}

		// while loop
		System.out.println("<Using Advanced For loop>");

		for (String str : ll) {
			System.out.println(str);

		}

		// using iterator
		System.out.println("< Using Iterator >");

		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// while
		System.out.println("< Using While Loop >");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
