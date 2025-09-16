class ChildTask implements Runnable {
    public void run() {
        System.out.println("child thread running");
    }
}

public class Q3 {
    public static void main(String[] args) {
        ChildTask t1 = new ChildTask();
        Thread th1 = new Thread(t1);
        th1.start();

        System.out.println("main thread is running");
    }
}
