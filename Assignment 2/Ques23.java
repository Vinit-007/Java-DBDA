// 23. Create an abstract class Payment with an abstract method payAmount(). Create  subclasses CreditCardPayment and UPIPayment that implement it differently. 
abstract class Payment {
    abstract void payAmount();
}

class CreditCardPayment extends Payment {
    void payAmount() {
        System.out.println("ur doin credit payment");
    }
}

class UPIPayment extends Payment {
    void payAmount() {
        System.out.println("ur doin upi payment");
    }
}

public class Ques23 {
    public static void main(String[] args) {
        Payment c = new CreditCardPayment();
        c.payAmount();

        Payment u = new UPIPayment();
        u.payAmount();
    }
}
