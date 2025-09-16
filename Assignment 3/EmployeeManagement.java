import java.util.*;

class Employee {
	String name;
	String id;
	String department;

	Employee(String name, String id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	public String toString() {
		return "[Name: " + name + ", Id: " + id + ", Department: " + department + "]";
	}
}

class Employees {
	ArrayList<Employee> emp = new ArrayList<>();

	// 1. Add a new employee
	void addEmp(String name, String id, String department) {
		emp.add(new Employee(name, id, department));
		System.out.println("Employee added successfully.");
	}

	// 2. Update department by employee ID
	void updateDept(String id, String newDept) {
		for (Employee e : emp) {
			if (e.id.equalsIgnoreCase(id)) {
				e.department = newDept;
				System.out.println("Department updated successfully.");
				return;
			}
		}
		System.out.println("Employee with ID " + id + " not found!");
	}

	// 3. Remove employee
	void removeEmp(String id) {
		for (Employee e : emp) {
			if (e.id.equalsIgnoreCase(id)) {
				emp.remove(e); // remove the employee object itself
				System.out.println("Employee removed successfully.");
				return;
			}
		}
		System.out.println("Employee with ID " + id + " not found!");
	}

	// 4. Display all employees
	void displayEmp() {
		if (emp.isEmpty()) {
			System.out.println("No employees in the database.");
		} else {
			System.out.println("Employees:");
			for (Employee e : emp) {
				System.out.println(e);
			}
		}
	}
}

public class EmployeeManagement {
	public static void main(String[] args) {
		Employees employees = new Employees();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n-------------Employee Management------------");
			System.out.println("1. Add an employee");
			System.out.println("2. Update department by ID");
			System.out.println("3. Remove employee by ID");
			System.out.println("4. Display all employees");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			try {
				int choice=Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1:
					System.out.print("Enter name: ");
					String name = sc.nextLine();
					System.out.print("Enter ID: ");
					String id = sc.nextLine();
					System.out.print("Enter department: ");
					String dept = sc.nextLine();
					employees.addEmp(name, id, dept);
					break;

				case 2:
					System.out.print("Enter employee ID to update: ");
					String updateId = sc.nextLine();
					System.out.print("Enter new department: ");
					String newDept = sc.nextLine();
					employees.updateDept(updateId, newDept);
					break;

				case 3:
					System.out.print("Enter employee ID to remove: ");
					String removeId = sc.nextLine();
					employees.removeEmp(removeId);
					break;

				case 4:
					employees.displayEmp();
					break;

				case 5:
					System.out.println("Exiting... Goodbye!");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice. Please enter a number from 1 to 5.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number from 1 to 5.");
				sc.nextInt();

				continue;
			}
		}
	}
}
