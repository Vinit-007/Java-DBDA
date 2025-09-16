// Create a class CurrencyConverter that has overloaded methods to convert different  currencies (INR to USD, INR to EUR, etc.).
class CurrencyConverter {

    void currency(double a) {
        double usd = a * 0.12;
        System.out.println("in usd : " + usd);
    }

    void currency(int a) {
        int euro = a * 122;
        System.out.println("in euro : " + euro);

    }
}

public class Ques15 {
    public static void main(String[] args) {
        CurrencyConverter s = new CurrencyConverter();
        s.currency(10.5);
        s.currency(25);
    }
}
