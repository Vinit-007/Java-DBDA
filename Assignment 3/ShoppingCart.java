//You are developing a Java program to manage an online shopping cart. Implement code to  handle the following built-in exceptions: 
//1. ArrayIndexOutOfBoundsException 
//2. NumberFormatException 
//3. ArithmeticException 
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> shopCart = new ArrayList<>();

        shopCart.add("Phone");
        shopCart.add("Mobile phone");
        shopCart.add("Smart phone");
        shopCart.add("Mobile");
        shopCart.add("Telephone");
        shopCart.add("Landline");

        System.out.println("Available items are: " + shopCart);

        while (true) {
            try {
                System.out.println("Enter serial number of item you want to add ");
                String input = sc.nextLine();      
                int choice = Integer.parseInt(input); 

                if (choice == 0) {
                    int error = 10 / 0;
                }
                System.out.println("Your choice is: " + shopCart.get(choice - 1));
                break;

            } catch (ArithmeticException e) {
                System.out.println("Arithmetic error occurred: " + e.getMessage());

            } catch (NumberFormatException nfe) {
                System.out.println("Enter a valid number (not letters or symbols).");

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("Enter a number between 1 and " + shopCart.size() + ".");

            } finally {
                System.out.println("Order attempt processed!\n");
            }
        }
        sc.close();
    }
}
