// Create a MathOperations class with overloaded add() methods: one for two integers,  another for three integers, and one for two double values.
class MathOperation {
    int a;
    int b;

    void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }

    void add(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }
}

public class Ques11 {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        m.add(2, 3);
        m.add(3.1, 2.5);
        m.add(2, 5, 6);
    }
}
