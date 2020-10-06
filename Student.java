package com.collectionsPrograms;

public class Student implements Comparable<Student> {

	int rollNumber;
	String studentName;
	int age;

	public Student(int rollNumber, String studentName, int age) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.age = age;
	}
	
	public int compareTo(Student st){
		if(age == st.age)
			return 0;
		else if(age > st.age)
			return 1;
		else 
			return -1;
		
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", age=" + age + "]";
	}
}
