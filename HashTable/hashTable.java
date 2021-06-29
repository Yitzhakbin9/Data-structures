package HashTable;

// Java program to demonstrate
// adding elements to Hashtable

import java.io.*;
import java.util.*;

class hashTable {
	
	public static void main(String args[])
	{
		// No need to mention the
		// Generic type twice
		Hashtable<Integer, Integer> ht1 = new Hashtable<>();

		// Initialization of a Hashtable
		// using Generics
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(4);

		// Inserting the Elements
		// using put() method
		ht1.put(1, 11);
		ht1.put(2, 22);
		ht1.put(3, 33);
//		ht1.put(1, "one");
//		ht1.put(2, "two");
//		ht1.put(3, "three");
//		

		ht2.put(4, "four");
		ht2.put(5, "five");
		ht2.put(6, "six");
//		ht2.put(7, null);
		
		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
		System.out.println(ht1.size());
		
		
		
		// containsKey() checks if this map contains a mapping for a key
		Integer key = 1;
        Integer count = ht1.containsKey(key) ? ht1.get(key) : 0;
        ht1.put(key, count + 1);
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println(ht2.containsKey(4));
		System.out.println(ht2.get(5));
		
	}
	
	
	
}
