package com.collectionsPrograms;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, Student> mapObj = new HashMap<>();
		
		mapObj.put(1, new Student(12, "Hithesh", 21));
		mapObj.put(2, new Student(13, "shreya", 21));
		mapObj.put(3, new Student(14, "Revanth", 23));
		mapObj.put(4, new Student(15, "Rahul", 24));
		
		for(Map.Entry ma : mapObj.entrySet()){
			
			System.out.println(ma.getKey()+" "+ ma.getValue().toString());
		}
		
	}

}
