package com.samplePrograms;

public class ParametrisedConstructorEg {

	int a;
	int b;

	public ParametrisedConstructorEg(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	void sum(){
		System.out.println(a+b);
	}
	public static void main(String[] args) {

		ParametrisedConstructorEg obj = new ParametrisedConstructorEg(12, 13);
		
		obj.sum();
	}

}
