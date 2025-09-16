// 9. Write a Java program for a Laptop class with private attributes brand and price. Ensure price cannot be set below zero using validation inside the setter method. 

class laptop {
    private String brand;
    private int price;

    laptop(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            this.price = price;
        } else {
            System.out.println("no negative money");
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    void print() {
        System.out.println(brand + price);
    }

}

public class Ques9 {
    public static void main(String[] args) {
        laptop l = new laptop(120000, "lenoDO");
        l.print();

    }
}
