// 22. Write a Java program with an abstract class Shape that has an abstract method  calculateArea(). Implement it in Circle and Rectangle classes
abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double rad;

    Circle(double rad) {
        this.rad = rad;
    }

    void calculateArea() {
        double area = 3.14 * rad * rad;
        System.out.println("area of circle : " + area);
    }
}

class Rectangle extends Shape {
    int len, bre;

    Rectangle(int len, int bre) {
        this.len = len;
        this.bre = bre;
    }

    void calculateArea() {
        int area = len * bre;
        System.out.println("area of rectangle is : " + area);
    }
}

public class Ques22 {
    public static void main(String[] args) {
        Shape c = new Circle(20.0);
        c.calculateArea();

        Shape r = new Rectangle(25, 25);
        r.calculateArea();
    }
}
