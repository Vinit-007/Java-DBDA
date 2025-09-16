public class Q17 {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter++;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter++;
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Expected Counter Value: " + (2 * 10000));
        System.out.println(counter);
    }
}