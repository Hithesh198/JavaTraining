package com.collectionsPrograms;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<String> sortedSetObj = new TreeSet<>();

		sortedSetObj.add("Bat");
		sortedSetObj.add("India");
		sortedSetObj.add("Zebra");
		sortedSetObj.add("Mango");
		sortedSetObj.add("Apple");
		sortedSetObj.add("Cat");
		
	Iterator<String> itObj = sortedSetObj.iterator();
	
		while(itObj.hasNext()){
			System.out.println(itObj.next());
		}
 	}

}
