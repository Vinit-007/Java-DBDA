class EvenNumber implements Runnable {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class OddNumber implements Runnable {
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Q11 {
    public static void main(String[] args) {
        EvenNumber evenTask = new EvenNumber();
        OddNumber oddTask = new OddNumber();

        Thread evenThread = new Thread(evenTask);
        Thread oddThread = new Thread(oddTask);

        evenThread.start();
        oddThread.start();
    }
}