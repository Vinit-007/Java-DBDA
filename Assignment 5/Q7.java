public class Q7 {
    public static void main(String[] args) {
        System.out.println("Main Thread starts.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing number: " + i);

            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The main thread was interrupted.");
            }
        }

    }
}
