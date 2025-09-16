
class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle constructor: Type = " + type);
    }
}

class FourWheeler extends Vehicle {
    String brand;

    FourWheeler(String type, String brand) {
        super(type); // calls Vehicle constructor
        this.brand = brand;
        System.out.println("FourWheeler constructor: Type = " + type + ", Brand = " + brand);
    }
}

class Car extends FourWheeler {
    String model;
    int price;

    Car(String type, String brand, String model, int price) {
        super(type, brand); // calls FourWheeler constructor
        this.model = model;
        this.price = price;
        System.out.println("Car constructor: Type = " + type + ", Brand = " + brand +
                ", Model = " + model + ", Price = " + price);
    }
}

public class ques14 {
    public static void main(String[] args) {
        Car c1 = new Car("FourWheeler", "Toyota", "Innova", 2500000);
    }
}
