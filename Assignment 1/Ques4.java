//4. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
// creating a class named 'Triangle' with parameter in its constructor.
class perimeterarea {
    int a, b, c;

    perimeterarea(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle: " + area);

        int perimeter = a + b + c;
        System.out.println("Perimeter of triangle: " + perimeter);
    }

}

public class Ques4 {
    public static void main(String[] args) {
        perimeterarea t = new perimeterarea(20, 30, 45);
    }

}
