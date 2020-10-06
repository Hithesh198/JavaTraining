package com.samplePrograms;

public class Encapsulation {

	public static void main(String[] args) {

		Employee empObject = new Employee();

		empObject.setEmpId(12);
		empObject.setEmpName("Hithesh");
		empObject.setEmpSalary(2300);

		System.out.println(empObject.getEmpId());
		System.out.println(empObject.getEmpName());
		System.out.println(empObject.getEmpSalary());
	}

}
