package com.collectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String args[]){
		
		List<String> listObj = new ArrayList<>();
		
		listObj.add("Apple");
		listObj.add("Banana");
		listObj.add("cat");
		
		Iterator<String> iteratorObj = listObj.iterator();
		
		while(iteratorObj.hasNext())
		{
			System.out.println(iteratorObj.next());
		}
	}
	
	
}
