// 21. Create an abstract class Vehicle with an abstract method start(). Create subclasses  Car and Bike that provide their own implementation of start().
abstract class Vehicle {
    abstract void start();

}

class Car extends Vehicle {
    void start() {
        System.out.println("car starts broommmmmmm");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("bike starts vrooommmmmmm");
    }
}

public class Ques21 {
    public static void main(String[] args) {
        Vehicle c = new Bike();
        c.start();

        Vehicle b = new Bike();
        b.start();
    }
}
