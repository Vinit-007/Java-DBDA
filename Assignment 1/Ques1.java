// 1.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
// the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class Student {
    String name;
    int roll_no;

    void print() {
        System.out.println("name: " + name + "roll no : " + roll_no);
    }

}

public class Ques1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "vinit";
        s.roll_no = 25;
        s.print();

    }
}