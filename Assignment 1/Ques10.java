class Employee {
    String name;
    int year;
    String address;

    // Constructor
    Employee(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    // Method to print info
    void print() {
        System.out.println(name + "   " + year + "   " + address);
    }
}

public class Ques10 {
    public static void main(String[] args) {
        System.out.println("Name   Year of joining   Address");

        Employee e1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee e2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee e3 = new Employee("John", 1999, "26B- WallsStreat");

        e1.print();
        e2.print();
        e3.print();
    }
}
