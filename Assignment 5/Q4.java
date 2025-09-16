class MyThread implements Runnable {
    public void run() {
        System.out.println("thread " + Thread.currentThread().getName() + " started running");
    }
}

public class Q4 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread th1 = new Thread(t1);

        th1.setName("i am thread 1");

        th1.start();
    }

}
