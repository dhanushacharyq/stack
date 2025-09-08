package StackPerson;

public class Person {
	private String name;
	private int age;
	private Gender gender;
	Person(String name, int age, Gender gender){
		this.name= name;
		this.age= age;
		this.gender = gender;
	}
	
	void displayPerson() {
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Gender is "+gender);
	}
}
