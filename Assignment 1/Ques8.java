// 8. Print the average of three numbers entered by the user by creating a class named 'Average'
// having a method to calculate and print the average.
class average {
    int a, b, c, avg;

    void calcAvg(int d, int e, int f) {

        avg = (d + e + f) / 3;

    }

    void printavg() {
        System.out.println(avg);
    }
}

public class Ques8 {
    public static void main(String[] args) {
        average abc = new average();
        abc.calcAvg(2, 3, 4);
        abc.printavg();

    }

}
