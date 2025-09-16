// Create a Calculator class with overloaded multiply() methods to accept integers,  doubles, and a mix of both.
class Calculator {
    int a;
    int b;

    void multiply(int a, int b) {
        int mul = a * b;
        System.out.println("multiplication of integers is : " + mul);
    }

    void multiply(double a, double b) {
        double mul = a * b;
        System.out.println("multiplication of doubles is : " + mul);
    }

    void multiply(int a, double b) {
        double mul = a * b;
        System.out.println("multiplication of int and double is : " + mul);
    }
}

public class Ques13 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.multiply(2, 3);
        c.multiply(4.5, 3.4);
        c.multiply(2, 3.4);
    }
}
