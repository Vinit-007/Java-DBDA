//You are developing a Java program to manage user inputs in a ticket booking system. Implement  code to handle the following built-in exceptions: 
//1. InputMismatchException3 
//2. IllegalArgumentException 
//3. IndexOutOfBoundsException 
import java.util.*;

public class TicketBooking {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List <String> seats = Arrays.asList("A1", "A2", "A3", "A4", "A5");

			try{
				System.out.println("enter number of tickets to book: ");
				int tickecount = sc.nextInt();
				sc.nextLine();

				if(tickecount<=0 || tickecount > seats.size()){
					throw new IllegalArgumentException("ticket count must be between 1 and 5");
				}

				System.out.println("Available seats: ");
				for(int i = 0; i < seats.size(); i++){
					System.out.println(i +": "+ seats.get(i));
				}

				for (int i = 0; i < tickecount; i++){
					System.out.println("enter seat index from 0 to "+(seats.size()-1));
					int index = sc.nextInt();
					sc.nextLine();

					String selectedSeat = seats.get(index);
					System.out.println("seat book "+selectedSeat); 
				}

				System.out.println("booking done successfully: ");
			}catch (InputMismatchException e){
				System.out.println("invalid input type");
			}catch(IllegalArgumentException e){
				System.out.println("error "+ e.getMessage());
			}catch(IndexOutOfBoundsException e){
				System.out.println("invalid seat index: ");
			}
		}
	}
}