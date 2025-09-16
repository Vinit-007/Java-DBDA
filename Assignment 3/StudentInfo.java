//Question 10) 
//Create a class Student with: 
//● Dint studentId, String name, double grade. 
//● A constructor to initialize these fields. 
//● Methods: 
//○ updateGrade(double newGrade): Updates the grade, but should not accept  negative values (handle using exception handling). 
//○ display(): Prints student details. 
//

class Student{
	int studentId;
	String name;
	double grade;

	Student(int studentId,String name,double grade){
		this.studentId=studentId;
		this.name=name;
		this.grade=grade;
	}
	void updateGrade(double newGrade) {
		try {
			if (newGrade < 0) {
				throw new IllegalArgumentException("Grade cannot be negative!");
			}
			this.grade = newGrade;
		} catch (IllegalArgumentException e) {
			System.out.println("Error updating grade " +e.getMessage());
		}
	}
	void display() {
		System.out.println("Student id :"+ studentId + "Name :" + name + "Grade :" + grade );
	}

}


public class StudentInfo {

	public static void main(String[] args) {
		Student s1 = new Student(1,"purkar",45.5);
		Student s2 = new Student(2,"aditya",25.5);
		Student s3 = new Student(3,"parlia",65.5);
		s1.display();
		s2.display();
		s3.display();
		s1.updateGrade(55.0);   
		s2.updateGrade(-10.0); 
		s1.display();
		s2.display();


	}

}
