// 4. Write a Java program where a Person class has name and age. Create a subclass
// Student that adds rollNumber and marks.
class Person {
    String name;
    int age;
}

class Student extends Person {
    int rollNumber;
    int marks;

    void printInfo() {
        System.out.println(name + age + rollNumber + marks);
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "purkar";
        s.age = 24;
        s.rollNumber = 12;
        s.marks = 01;
        s.printInfo();

    }
}
