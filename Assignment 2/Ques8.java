// Create a class Car with private variables model, year, and price. Provide public  methods to get and set values while ensuring year is not negative.

class car {
    private String model;
    private int year;
    private int price;

    car(String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("negative year");
        }
    }

    void display() {
        System.out.println(model + year + price);
    }

}

public class Ques8 {
    public static void main(String[] args) {
        car c1 = new car("porsche", 2023, 16000045);
        c1.display();
    }
}
