//You are creating a Java program to represent different types of employees in a company.  
//Implement a class named Employee with attributes for name, employeeID, and department. 
//Provide a constructor to initialize these fields. Next, create a subclass named Manager with an  additional attribute for numberOfTeams managed.
//The Manager class should have two  constructors: one that accepts all fields, and another that accepts only name and employeeID,  
//chaining to the superclass constructor. Include methods to validate input data and implement  getter and setter methods for the attributes in the Employee class
//. Demonstrate the inheritance  hierarchy by creating instances of both classes and displaying their details. 

class Employee4{
	private String name;
	private int employeeID;
	private String department;
	
	Employee4(String name, int employeeID, String department) {
		this.name = name;
		this.employeeID = employeeID;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}

class Manager extends Employee4{
	private int numberOfTeams;
	Manager(String name, int employeeID, String department,int numberOfTeams) {
		super(name, employeeID, department);
		this.numberOfTeams=numberOfTeams;
	}
	
	Manager(String name,int employeeID){
		this(name,employeeID,"computer",1);
	}

	public int getNumberOfTeams() {
		return numberOfTeams;
	}

	public void setNumberOfTeams(int numberOfTeams) {
		this.numberOfTeams = numberOfTeams;
	}

}
public class EmployeeOops {
	public static void main(String[] args) {
		
		Employee4 e1 = new Employee4("naruto", 1, "leaf");
		Employee4 e2 = new Employee4("sasuke", 2, "leaf");
		System.out.println("Name :"+e1.getEmployeeID()+"Employee id :"+e1.getName()+"Department :"+e1.getDepartment());
		System.out.println("Name :"+e2.getEmployeeID()+"Employee id :"+e2.getName()+"Department :"+e2.getDepartment());
		e2.setDepartment("hidden leaf");
		System.out.println(e2.getDepartment());
		

	}

}
