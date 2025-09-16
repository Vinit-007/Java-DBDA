class numPrint implements Runnable {
    int a, b;

    numPrint(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

}

public class Q6 {
    public static void main(String[] args) {
        numPrint pr = new numPrint(1, 10);
        numPrint p = new numPrint(11, 20);

        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(p);

        t1.start();
        t2.start();

    }

}
