class payment {

    void pay() {
        System.out.println("which payment method you want to use");
    }
}

class CreditCardPayment extends payment {
    void pay() {
        System.out.println("welcome to credit card payment");
    }
}

class UPIPayment extends payment {
    void pay() {
        System.out.println("welcome to UPI payment");
    }
}

class WalletPayment extends payment {
    void pay() {
        System.out.println("welcome to wallet payment");
    }
}

public class overriding1 {
    public static void main(String args[]) {

        payment p1 = new CreditCardPayment();
        p1.pay();

        payment p2 = new UPIPayment();
        p2.pay();

        payment p3 = new WalletPayment();
        p3.pay();

    }
}