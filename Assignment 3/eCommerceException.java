//You're developing error handling for a Java program that manages payments in an e-commerce application. 
//Write  code to handle the following three, specific payment gateway errors: 
//● Timeout error: Implement exception handling to catch situations where the payment gateway response  times out. 
//● Invalid card details: Handle exceptions arising from attempts to process payments with invalid card  information. 
//● Insufficient funds: Implement exception handling to manage cases where users attempt to make payments  without sufficient funds in their account. 

import java.util.Scanner;

class TimeOutErrorException extends Exception{
	TimeOutErrorException(String message){
		super(message);
	}
}

class InvalidCardDetailsException extends Exception{
	InvalidCardDetailsException(String message){
		super(message);
	}
}

class InsufficientFundsException extends Exception{
	InsufficientFundsException(String message){
		super(message);
	}
}

class PaymentGateway{
	void processPayment(String cardNumber,int amount , int balance)throws TimeOutErrorException,InvalidCardDetailsException,InsufficientFundsException {
		
		if(cardNumber == null || cardNumber.length() != 8) {
			throw new InvalidCardDetailsException("invalid card details added enter valid details");
		}
		
		if(amount > balance) {
			throw new InsufficientFundsException("You have insufficient funds ");
		}
		
		if(amount > 500) {
			throw new TimeOutErrorException("Payment getway timeout ");
		}
		
		System.out.println("Payment of "+amount+" is done ! ");
	}
}

public class eCommerceException {
	public static void main(String[] args) {
		
		PaymentGateway pg1 = new PaymentGateway();
		Scanner sc = new Scanner(System.in);
		
		String cardnum = sc.nextLine();
		int amount = sc.nextInt();
		sc.nextLine();
		int balance = sc.nextInt();
		sc.nextLine();
		
		try {
		pg1.processPayment(cardnum, amount, balance);
		}
		catch(InvalidCardDetailsException e) {
			System.out.println(e.getMessage());
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		catch(TimeOutErrorException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("transaction processed");
			sc.close();
		}
	}

}
