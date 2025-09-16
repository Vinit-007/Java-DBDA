class MyThread implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running. Priority: "
                + Thread.currentThread().getPriority());
    }
}

public class Q5 {
    public static void main(String[] args) {
        MyThread task = new MyThread();
        Thread t1 = new Thread(task, "Thread-1");
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority of " + t1.getName() + ": " + t1.getPriority());
        t1.start();
    }
}