//Patient Management System
//You are managing a patient database for a hospital. Each patient has a unique patient ID, a name,
//a diagnosis, and the number of days admitted. You need to implement a solution using
//appropriate Java collection classes to efficiently perform the following operations:
//a. Add a new patient to the database.
//b. Remove a patient from the database.
//c. Find all patients with a specific diagnosis.
//d. Find all patients admitted for more than a given number of days.

import java.util.*;

class Patient {
	String id;
	String name;
	String diagnosis;
	int days;

	Patient(String id, String name, String diagnosis, int days) {
		this.id = id;
		this.name = name;
		this.diagnosis = diagnosis;
		this.days = days;
	}

	public String toString() {
		return "[Id :" + id + ",Name:" + name + ",Diagnosis:" + diagnosis + ",Days" + days + "]";
	}
}

class hospital {
	ArrayList<Patient> pat = new ArrayList<>();

	void addPatient(String id, String name, String diagnosis, int days) {
		pat.add(new Patient(id, name, diagnosis, days));
	}

	void removePatient(String id) {
		for (Patient p : pat) {
			if (p.id.equalsIgnoreCase(id)) {
				pat.remove(p);
			}
		}
		System.out.println("patient not found !");
	}

	void findPatientDiag(String diagnosis) {
		for (Patient p : pat) {
			if (p.diagnosis.equalsIgnoreCase(diagnosis)) {
				System.out.println("patients with " + diagnosis + " are : " + p.name);
			}
		}
		System.out.println("patient not found with such diagnosis");
	}

	void findPatientDays(int checkDate) {
		for (Patient p : pat) {
			if (p.days > checkDate) {
				System.out.println("patients with days greater than " + checkDate + "is : " + p);
			}
		}
		System.out.println("patient not found with such days");
	}

}

public class PatientManagement {
	public static void main(String[] args) {

		hospital pat1 = new hospital();
		Scanner sc = new Scanner(System.in);

		while (true) {


			System.out.println("---------------Patient Management-------------");
			System.out.println(" 1 to add a patient");
			System.out.println(" 2 to remove a patient");
			System.out.println(" 3 to find all patient with specific diagnostics");
			System.out.println(" 4 to find patient there in hospital for more than days");
			System.out.println(" 5 to terminate the process");
			
			try {
				int choice = sc.nextInt();
				sc.nextLine();
			switch (choice) {

			case 1:
				System.out.println("Enter id : ");
				String id = sc.nextLine();
				System.out.println("Enter name : ");
				String name = sc.nextLine();
				System.out.println("Enter diagnosis : ");
				String diagnosis = sc.nextLine();
				System.out.println("Enter days : ");
				int days = sc.nextInt();
				pat1.addPatient(id, name, diagnosis, days);
				break;

			case 2:
				System.out.println("enter id of patient to be removed");
				String idPat = sc.nextLine();
				pat1.removePatient(idPat);
				break;

			case 3:
				System.out.println("find patient with similar diagnosis");
				String diag = sc.nextLine();
				pat1.findPatientDiag(diag);
				break;

			case 4:
				System.out.println("Find patient with days more than specified");
				int dayss = sc.nextInt();
				pat1.findPatientDays(dayss);
				break;

			case 5:
				System.out.println(" terminating process ");
				sc.close();
				return;

			default:
				System.out.println("please enter coorect value");

			}
			}catch(InputMismatchException e) {
				System.out.println("input a integer within the range ");
				continue;
			}

		}

	}

}
