package CollectionFramework;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
	
		Hashtable h = new Hashtable();
		
		h.put(1, "One");
		h.put(2, 2);
		h.put('3', "Three");
		
		
		System.out.println("The size of the Hashtable->" + h.size());
		
		// if i want to restrict the datatypes in hashtable
		
		Hashtable<Integer,String> h1 = new Hashtable<Integer,String>();
		
		//h1.put("!@", 'a');
		h1.put(1, "alpha");
		h1.put(2, "beta");
		h1.put(3, "gamma");
		
		System.out.println(h1.get(1)); // to get the value of the key
		
		for(int i=1;i <= h1.size();i++){
			System.out.println(h1.get(i));
		}
		
		
		
		

	}

}
