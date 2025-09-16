// 6 - Create a class BankAccount with private attributes accountNumber and balance. Use  getters and setters to access and modify them.
class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getacc() {
        return accountNumber;

    }

    public double getbal() {
        return balance;
    }

    public void setacc(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setbal(double balance) {
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("account number : " + accountNumber + "balance : " + balance);
    }

}

public class Ques6 {
    public static void main(String[] args) {
        BankAccount b2 = new BankAccount(01, 500);
        b2.displayInfo();
        b2.setbal(4000);
        b2.displayInfo();

    }
}
