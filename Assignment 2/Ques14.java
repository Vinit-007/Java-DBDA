// Write a Java program where a Shape class has overloaded draw() methods, accepting  different numbers of parameters to draw different shapes.
class shape {
    void draw(int radius) {
        System.out.println("its a circle of radius :" + radius);
    }

    void draw(int len, int bre) {
        System.out.println("its a rectangle");
    }

    void draw(int a, int b, int c) {
        System.out.println("its a triangle");
    }

    void draw(int a, int b, int c, int d) {
        System.out.println("its some kind of shape");
    }
}

public class Ques14 {
    public static void main(String[] args) {
        shape s = new shape();
        s.draw(2);
        s.draw(2, 3);
        s.draw(4, 5, 6);
        s.draw(4, 5, 6, 7);
    }
}
