// 6. Write a program to print the area of a rectangle by creating a class named 'Area' having two
// methods. First method named as 'setDim' takes length and breadth of the rectangle as parameters
// and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of
// the rectangle are entered through the keyboard.

import java.util.*;

class Area {
    int a;
    int b;

    // method to set dimensions
    void setDim(int c, int d) {
        this.a = c; // assign to instance variables
        this.b = d;
    }

    // method to return area
    int getArea() {
        return a * b;
    }
}

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        Area rect = new Area();
        rect.setDim(length, breadth);

        System.out.println("Area of Rectangle = " + rect.getArea());
    }
}
