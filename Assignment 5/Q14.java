class SumCalculator implements Runnable {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

public class Q14 {
    public static void main(String[] args) {
        SumCalculator calculatorTask = new SumCalculator();
        Thread calculationThread = new Thread(calculatorTask, "CalculatorThread");
        calculationThread.start();
    }
}