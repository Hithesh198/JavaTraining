package com.samplePrograms;

class A{
	
	int a = 12;
    int b = 13;
     
    void sum(){
    	System.out.println(a+b);
    }
}


public class Inheritance extends A{

	public static void main(String args[]){
		Inheritance obj = new Inheritance();
		obj.sum();
	}
	 
 
}
