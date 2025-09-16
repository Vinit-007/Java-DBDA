class ThreadOne extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello from the first thread!");
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Greetings from the second thread!");
        }
    }
}

class ThreadThree extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Message from the third thread!");
        }
    }
}

public class Q12 {
    public static void main(String[] args) {
        ThreadOne thread1 = new ThreadOne();
        ThreadTwo thread2 = new ThreadTwo();
        ThreadThree thread3 = new ThreadThree();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
