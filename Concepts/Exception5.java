class Demo {
    public void divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        System.out.println(result);
    }
}

public class Exception5 {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            d.divide(8, 0);
        } catch (ArithmeticException e) {
            System.out.println("exception handled : " + e);
        }

    }
}
