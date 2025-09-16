// Write a Java program where a Vehicle class has a run() method. Create subclasses  Bike and Car that override run() with specific messages.
class Vehicle {
    void run() {
        System.out.println(" all vehicles run");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("bike races");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("car drives");
    }
}

public class Ques17 {
    public static void main(String[] args) {
        Vehicle b = new Bike();
        Vehicle c = new Car();
        b.run();
        c.run();
    }
}
