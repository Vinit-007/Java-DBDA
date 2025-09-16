class task1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Learning Java");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class task2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Multithreading in action");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Q20 {
    public static void main(String[] args) {
        task1 javaTask = new task1();
        task2 multiTask = new task2();
        Thread thread1 = new Thread(javaTask);
        Thread thread2 = new Thread(multiTask);
        thread1.start();
        thread2.start();
    }
}