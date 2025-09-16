// Write a Java program to create a class Printer that has multiple overloaded print()methods for String, int, and double values.
class Printer {
    void print(int a) {
        System.out.println("it is an integer :" + a);
    }

    void print(String a) {
        System.out.println("this is a string : " + a);
    }

    void print(double a) {
        System.out.println("this is a float value" + a);
    }

}

public class Ques12 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10);
        p.print("yes it its");
        p.print(3.1348);

    }
}
