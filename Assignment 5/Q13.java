class MyTask implements Runnable {
    public void run() {
    }
}

public class Q13 {
    public static void main(String[] args) {

        MyTask task = new MyTask();
        Thread thread = new Thread(task);
        System.out.println("Calling run()");
        thread.run();
        System.out.println("Calling start()");
        thread.start();
    }
}