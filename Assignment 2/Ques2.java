// 2. Create a base class Vehicle with properties brand and speed. Create a subclass Carthat adds fuelType and a method displayCarDetails(). 
class Vehicle {
    String brand;
    int speed;
}

class Car extends Vehicle {
    String fuelType;

    void displayCarDetails() {
        System.out.println(brand + fuelType + speed);
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Car v1 = new Car();
        v1.brand = "kia";
        v1.speed = 250;
        v1.fuelType = "E20";
        v1.displayCarDetails();

    }
}
