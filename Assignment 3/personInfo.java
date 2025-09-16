//Question 9.)  
//You're developing a Java program to manage individuals within an educational institution. 
//Create a class named  "Person" with attributes for the name and age of an individual.
//Implement a constructor that accepts both fields as  arguments. 
//Next, design a subclass named "Student" with an additional attribute for the grade level. 
//Provide two  constructors for the Student class: one that accepts all fields 
//including name, age, and grade level, and another that  accepts only the name and age, chaining to the superclass constructor. 
//Ensure that your program demonstrates  proper inheritance principles, 
//and validate the constructors to ensure valid data is provided during object  instantiation,
//also implement appropriate getter and setter methods to access and modify the attributes of Person  class. 

class Person{
	private String name;
	private int age;

	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}

class Student2 extends Person{
	private String grade;

	Student2(String name, int age,String grade) {
		super(name, age);
		this.grade=grade;
	}

	Student2(String name,int age){
		this(name,age,"A");
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


}

public class personInfo {
	public static void main(String[] args) {
		Student2 s1 = new Student2("Aditya", 20, "B");
		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
		System.out.println("Grade: " + s1.getGrade());

		Student2 s2 = new Student2("Purkar", 22);
		System.out.println("Name: " + s2.getName());
		System.out.println("Age: " + s2.getAge());
		System.out.println("Grade: " + s2.getGrade());

		s2.setGrade("A+");
		s2.setAge(23);
		System.out.println("Updated Grade: " + s2.getGrade());
		System.out.println("Updated Age: " + s2.getAge());

	}

}
