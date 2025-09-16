// 18. Create a Bank class with a method getInterestRate(). Create subclasses SBI, HDFC, and ICICI that override the method with their respective interest rates. 
class Bank {
    void getInterestRate() {
        System.out.println("having interest is worst !");
    }
}

class SBI extends Bank {
    void getInterestRate() {
        System.out.println("SBI has interest of 7%");
    }
}

class HDFC extends Bank {
    void getInterestRate() {
        System.out.println("HDFC has interest of 12%");
    }
}

class ICICI extends Bank {
    void getInterestRate() {
        System.out.println("ICICI has interest of 5%");
    }
}

public class Ques18 {
    public static void main(String[] args) {
        Bank a = new SBI();
        Bank b = new HDFC();
        Bank c = new ICICI();
        a.getInterestRate();
        b.getInterestRate();
        c.getInterestRate();

    }
}
