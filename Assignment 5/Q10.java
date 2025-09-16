class GoodMorning implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Welcome implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        // Create an instance of each task
        GoodMorning goodMorning = new GoodMorning();
        Welcome welcome = new Welcome();

        // Create threads and associate them with the tasks
        Thread morningThread = new Thread(goodMorning);
        Thread welcomeThread = new Thread(welcome);

        // Start both threads
        morningThread.start();
        welcomeThread.start();
    }
}