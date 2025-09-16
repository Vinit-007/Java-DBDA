// 7. Write a program to print the area of a rectangle by creating a class named 'Area' taking the
// values of its length and breadth as parameters of its constructor and having a method named
// 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered
// through the keyboard.

import java.util.Scanner;

class Area {
    int a, b;
    int area;

    Area(int a, int b) {
        this.a = a;
        this.b = b;
        this.area = a * b;
    }

    void returnArea() {
        System.out.println("area is : " + area);
    }
}

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        Area rect = new Area(length, breadth);
        rect.returnArea();

    }
}
