class Myrunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Myrunnable r1 = new Myrunnable();
        Thread t1 = new Thread(r1);
        t1.start();

    }
}
