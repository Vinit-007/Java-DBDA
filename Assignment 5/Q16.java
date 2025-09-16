class Lowercase implements Runnable {
    public void run() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

class uppercase implements Runnable {
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

public class Q16 {
    public static void main(String[] args) {
        Lowercase lowerTask = new Lowercase();
        uppercase upperTask = new uppercase();

        Thread lowerThread = new Thread(lowerTask);
        Thread upperThread = new Thread(upperTask);

        lowerThread.start();
        upperThread.start();
    }
}