//3. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
// creating a class named 'Triangle' without any parameter in its constructor.
class perimeterarea {
    int a = 3, b = 4, c = 5;

    perimeterarea() {
    }

    void area() {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle: " + area);
    }

    void perimeter() {
        int perimeter = a + b + c;
        System.out.println("Perimeter of triangle: " + perimeter);
    }
}

public class Ques3 {
    public static void main(String[] args) {
        perimeterarea t = new perimeterarea();
        t.area();
        t.perimeter();
    }

}
