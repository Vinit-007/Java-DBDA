// 9. Print the sum, difference and product of two complex numbers by creating a class named
// 'Complex' with separate methods for each operation whose real and imaginary parts are entered by
// the user.

import java.util.Scanner;

class complex {
    int a, b, c, d;

    complex(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void sum(int a, int b, int c, int d) {
        int sum1 = a + c;
        int sum2 = b + d;
        System.out.println("sum : " + sum1 + "+" + sum2 + "i");
    }

    void difference(int a, int b, int c, int d) {
        int sub1 = a - c;
        int sub2 = b - d;
        System.out.println("sub : " + sub1 + "+" + sub2 + "i");

    }

    void product(int a, int b, int c, int d) {
        int prod1 = (a * c) - (b * d);
        int prod2 = (a * d) + (b * c);
        System.out.println("prod : " + prod1 + "+" + prod2 + "i");
    }
}

public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first complex number : ");
        System.out.println("enter real part:");
        int r1 = sc.nextInt();
        System.out.println("enter imaginary part:");
        int i1 = sc.nextInt();

        System.out.println("enter Second complex number : ");
        System.out.println("enter real part:");
        int r2 = sc.nextInt();
        System.out.println("enter imaginary part:");
        int i2 = sc.nextInt();

        complex c = new complex(r1, i1, r2, i2);
        c.sum(r1, i1, r2, i2);
        c.difference(r1, i1, r2, i2);
        c.product(r1, i1, r2, i2);

    }
}
