public class Q18 {

    public static void main(String[] args) throws InterruptedException {

        Runnable task = new Runnable() {
            public void run() {
                int count = 0;
                for (int i = 0; i < 10000; i++) {
                    count++;
                }

                System.out.println(count);
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Expected final count: 20000");
    }
}