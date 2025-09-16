// 5. Create a base class Shape with a method area(). Create subclasses Circle and  
// Rectangle that override area() to calculate their respective areas
class Shape {
    void area() {
        System.out.println("area is : ");
    }

}

class Rectangle extends Shape {

    int lenght;
    int breadth;

    Rectangle(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    void area() {
        int areA = lenght * breadth;
        System.out.println("area of rectangle is : " + areA);
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void area() {
        int areAA = (int) (Math.PI * radius * radius);
        System.out.println("area of circle : " + areAA);
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(2, 3);
        s1.area();
        Shape s2 = new Circle(10);
        s2.area();

    }
}
