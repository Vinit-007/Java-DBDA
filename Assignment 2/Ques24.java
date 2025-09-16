// Write a Java program with an abstract class Employee that has an abstract method  calculateSalary(). Implement it in FullTimeEmployee and PartTimeEmployeeclasses.
abstract class Employee {
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {

    void calculateSalary() {
        System.out.println("this is full timers sal");
    }
}

class PartTimeEmployeeclasses extends Employee {
    void calculateSalary() {
        System.out.println("this is part time sal");
    }
}

public class Ques24 {
    public static void main(String[] args) {
        Employee f = new FullTimeEmployee();
        f.calculateSalary();

        Employee p = new PartTimeEmployeeclasses();
        p.calculateSalary();
    }
}
