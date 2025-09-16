// 2. Assign and print the roll number, phone number and address of two students 
// having names "Sam" and "John" respectively by creating two objects of class 'Student'.
class Student {
    int roll_no;
    String name;
    long phone_no;
    String address;

    void print(int roll_no, String name, long phone_no, String address) {
        System.out
                .println("Name: " + name + ", Roll No: " + roll_no + ", Phone: " + phone_no + ", Address: " + address);
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.print(12, "Sam", 9312465308L, "Pune");
        s2.print(13, "John", 8742465308L, "Mumbai");
    }
}
