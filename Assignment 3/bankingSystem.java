//Develop a Java program for a simple banking system using an ArrayList to manage bank accounts. Each bank  account should have attributes including the
//name of the account holder, account number, and initial balance.  Implement the BankAccount class with methods to perform the following actions:
//	(Using array list) 
//● Allow users to deposit money into their account. 
//● Allow users to withdraw money from their account if they have sufficient balance. ● Display the current balance of the account. 
//● Enable users to transfer money from one account to another, provided they have sufficient balance. 
import java.util.*;

// -------- Account Class ----------
class Account {
    String name;
    String accnum;
    double balance;

    Account(String name, String accnum, double balance) {
        this.name = name;
        this.accnum = accnum;
        this.balance = balance;
    }

    public String toString() {
        return "[Account Holder: " + name +
               ", Account Number: " + accnum +
               ", Balance: " + balance + "]";
    }
}

// -------- BankAccount Class ----------
class BankAccount {
    ArrayList<Account> acc = new ArrayList<>();

    void addAccount(String name, String accnum, double balance) {
        acc.add(new Account(name, accnum, balance));
        System.out.println("Account created successfully.");
    }

    void deposit(String accnum, double amt) {
        for (Account a : acc) {
            if (a.accnum.equalsIgnoreCase(accnum)) {
                a.balance += amt;
                System.out.println("Deposited " + amt + " to " + accnum);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    void withdraw(String accnum, double amt) {
        for (Account a : acc) {
            if (a.accnum.equalsIgnoreCase(accnum)) {
                if (a.balance >= amt) {
                    a.balance -= amt;
                    System.out.println("Withdrawn " + amt + " from " + accnum);
                } else {
                    System.out.println("Insufficient balance.");
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    void displayBal(String accnum) {
        for (Account a : acc) {
            if (a.accnum.equalsIgnoreCase(accnum)) {
                System.out.println("Balance of " + accnum + " is: " + a.balance);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // ✅ Transfer using nested if
    void transferMoney(String fromAcc, String toAcc, double amt) {
        for (Account a : acc) {
            if (a.accnum.equalsIgnoreCase(fromAcc)) {  // outer if: find a
                if (a.balance >= amt) {               // check balance
                    for (Account b : acc) {         // inner loop: find receiver
                        if (b.accnum.equalsIgnoreCase(toAcc)) {
                            a.balance -= amt;
                            b.balance += amt;
                            System.out.println("Transferred " + amt +
                                               " from " + fromAcc + " to " + toAcc);
                            return;
                        }
                    }
                    System.out.println("Receiver account not found.");
                } else {
                    System.out.println("Insufficient balance in 's account.");
                }
                return; // stop searching after processing 
            }
        }
        System.out.println(" account not found.");
    }

    void displayAll() {
        if (acc.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            for (Account a : acc) {
                System.out.println(a);
            }
        }
    }
}

public class bankingSystem {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n------ Banking System ------");
            System.out.println("1. Add Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Balance");
            System.out.println("5. Transfer Money");
            System.out.println("6. Display All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number 1-7.");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter account number: ");
                    String accnum = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double bal = sc.nextDouble();
                    bank.addAccount(name, accnum, bal);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String depAcc = sc.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depAmt = sc.nextDouble();
                    bank.deposit(depAcc, depAmt);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    String withAcc = sc.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withAmt = sc.nextDouble();
                    bank.withdraw(withAcc, withAmt);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    String dispAcc = sc.nextLine();
                    bank.displayBal(dispAcc);
                    break;

                case 5:
                    System.out.print("Enter  account number: ");
                    String fromAcc = sc.nextLine();
                    System.out.print("Enter receiver account number: ");
                    String toAcc = sc.nextLine();
                    System.out.print("Enter amount to transfer: ");
                    double transferAmt = sc.nextDouble();
                    bank.transferMoney(fromAcc, toAcc, transferAmt);
                    break;

                case 6:
                    bank.displayAll();
                    break;

                case 7:
                    System.out.println("Exiting Banking System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Enter 1-7.");
            }
        }
    }
}
