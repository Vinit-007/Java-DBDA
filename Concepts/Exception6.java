class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Exception6 {
    public static void main(String[] args) {
        int age = 15;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age is invalid! Must be 18 or above.");
            }
            System.out.println("You are eligible to vote.");
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
