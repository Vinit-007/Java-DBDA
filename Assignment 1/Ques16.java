class BankAccount {
    int accountNumber;
    String holderName;
    int balance;

    // First constructor (only account number)
    BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    BankAccount(int accountNumber, String holderName) {
        this(accountNumber);
        this.holderName = holderName;
    }

    BankAccount(int accountNumber, String holderName, int balance) {
        this(accountNumber, holderName);
        this.balance = balance;
    }

    void display() {
        System.out
                .println("Account Number: " + accountNumber + ", Holder Name: " + holderName + ", Balance: " + balance);
    }
}

public class Ques16 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(7);
        BankAccount b2 = new BankAccount(8, "Risky");
        BankAccount b3 = new BankAccount(9, "Rashid", 2500);

        b1.display();
        b2.display();
        b3.display();
    }
}
