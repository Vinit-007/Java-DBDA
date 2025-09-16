
abstract class Order {
    int id;
    int price;

    Order(int id, int price) {
        this.id = id;
        this.price = price;
    }

    abstract void calculateTotal();
}

interface Discountable {
    void applyDiscount(int discount);
}

class OnlineOrder extends Order implements Discountable {
    int total;

    OnlineOrder(int id, int price) {
        super(id, price);
    }

    void calculateTotal() {
        total = price;
    }

    public void applyDiscount(int discount) {
        total = total - discount;
    }

    void displayTotal() {
        System.out.println("Final Total for Order ID " + id + " = " + total);
    }
}

public class abstraction5 {
    public static void main(String args[]) {
        OnlineOrder order1 = new OnlineOrder(101, 1000);

        order1.calculateTotal();
        order1.applyDiscount(200);
        order1.displayTotal();
    }
}
