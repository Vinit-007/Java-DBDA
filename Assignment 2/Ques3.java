// 3. Create a base class Employee with attributes name and salary. Create a subclass  Manager that adds bonus. Write a method to calculate the total salary. 

class Employee {
    String name;
    int salary;

}

class Manager extends Employee {
    int bonus;

    void totalSal() {
        salary = salary + bonus;
        System.out.println(name + "   :" + salary);
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.name = "purkar";
        m1.salary = 20;
        m1.bonus = 1;
        m1.totalSal();

    }

}
