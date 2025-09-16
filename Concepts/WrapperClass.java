import java.util.Scanner;

class WrapperClass {
    static int outside;
    static float other;

    public static void main(String args[]) {
        System.out.println(outside);
        System.out.println(other);

        // AUTOBOXING
        int a = 56;
        System.out.println(a); // primitive
        Integer aObj = a;
        System.out.println(aObj); // object
        System.out.println(aObj.hashCode());

        // UNBOXING
        int b = aObj;
        System.out.println(b);

        // INPUT -- OUTPUT
        System.out.println("pls enter ur age :");
        Scanner sc = new Scanner(System.in);
        int ai = sc.nextInt();
        System.out.println("your age is : " + ai);

    }
}