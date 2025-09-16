// 2. Constructor Chaining Using super Keyword (Parent-Child Relationship)
// Create a class hierarchy where the child class calls the parent class constructor using
// super(). Problem Statement:
// ● Create a Person class with attributes name and age. ● Create a Student class that extends Person and has an additional attribute course. ● Use constructor chaining:
// ○ Person class should have a constructor initializing name and age. ○ Student class should use super(name, age) to call the Person constructor
// and then initialize course. ● Display details in both constructors.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println(name + age);
    }
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    void print() {
        System.out.println(name + age + course);
    }
}

public class Ques13 {
    public static void main(String[] args) {
        Person p1 = new Person("purkar", 35);
        Person p2 = new Student("aditya", 25, "dbda");
        p1.print();
        p2.print();
    }
}
