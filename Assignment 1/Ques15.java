class Order {
    int orderId;
    String customerName;
    int totalAmount;

    Order(int orderId) {
        this.orderId = orderId;
        System.out.println("Order created with ID: " + orderId);
    }

    Order(int orderId, String customerName) {
        this(orderId);
        this.customerName = customerName;
        System.out.println("Order created with ID: " + orderId + ", Customer: " + customerName);
    }

    Order(int orderId, String customerName, int totalAmount) {
        this(orderId, customerName);
        this.totalAmount = totalAmount;
        System.out.println(
                "Order created with ID: " + orderId + ", Customer: " + customerName + ", Total Amount: " + totalAmount);
    }

    void display() {
        System.out
                .println("Order Details → ID: " + orderId + ", Customer: " + customerName + ", Amount: " + totalAmount);
    }
}

public class Ques15 {
    public static void main(String[] args) {
        Order o1 = new Order(101);
        o1.display();

        Order o2 = new Order(102, "Aditya");
        o2.display();

        Order o3 = new Order(103, "Vinit", 2500);
        o3.display();
    }
}
