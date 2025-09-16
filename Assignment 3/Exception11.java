//Write a Java program that reads a string from the user and attempts to convert it to an integer  using Integer.parseInt().
//If the input is not a valid integer, handle the NumberFormatException. 
//Additionally, handle NullPointerException if the input is null. Use a finally block to print  "Conversion attempt completed."
import java.util.*;
public class Exception11 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				try {
					System.out.println("Enter a string : ");
					String input = sc.nextLine();

					Integer n = Integer.parseInt(input);
					System.out.println(n);
				}
				catch(NumberFormatException nfe) {
					System.out.println("enter a string input value ");
					nfe.printStackTrace();
				}
				catch(NullPointerException npe) {
					System.out.println("you haven't entered any value");
				}
				finally{
					System.out.println("Conversion attempt completed");
					
				}

			}
		}

	}
}



