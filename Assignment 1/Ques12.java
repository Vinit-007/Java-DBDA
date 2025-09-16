// 1. Constructor Chaining within the Same Class
// Create a class Car with multiple constructors that initialize different attributes using
// constructor chaining.
// Problem Statement:
// ● Create a class Car with attributes brand, model, and price. ● Implement constructor chaining within the same class:
// ○ One constructor should only take the brand. ○ Another constructor should take brand and model. ○ The final constructor should take brand, model, and price. ● Use the this() keyword to call other constructors.
// ● Display car details in each constructor.

class car {
    String brand;
    String model;
    int price;

    car(String brand) {
        this.brand = brand;
    }

    car(String brand, String model) {
        this(brand);
        this.model = model;
    }

    car(String brand, String model, int price) {
        this(brand, model);
        this.price = price;

    }

    void print() {
        System.out.println(brand + model + price);
    }

}

public class Ques12 {
    public static void main(String[] args) {
        car c1 = new car("mahindra");
        car c2 = new car("kia", "sonet");
        car c3 = new car("mahindra", "be6e", 48);
        c1.print();
        c2.print();
        c3.print();
    }

}
