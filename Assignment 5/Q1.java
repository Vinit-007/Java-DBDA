class MyThread extends Thread {
    public void run() {
        System.out.println("Hello world");
    }

}

public class Q1 {
    public static void main(String args[]) {
        System.out.println("Main method is working");
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}