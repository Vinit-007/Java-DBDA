class MyTask implements Runnable {
    public void run() {
        System.out.println("wait...");
    }

    public class Q9 {
        public static void main(String[] args) {
            MyTask task = new MyTask();
            Thread thread = new Thread(task, "MyThread");

            System.out.println("is it alive? " + thread.isAlive());
            thread.start();

            System.out.println("yes it is !!! " + thread.isAlive());

        }
    }
}