class ChildThread extends Thread {
    @Override
    public void run() {
        System.out.println("Child thread starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Child thread was interrupted.");
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        ChildThread child = new ChildThread();
        child.start();

        System.out.println("Main thread waits for the child thread to finish.");
        try {
            child.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
    }
}
