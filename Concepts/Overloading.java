class Travel {

    void calculateFare(int distance) {
        System.out.println("Total distance is: " + distance);
    }

    void calculateFare(int distance, String type) {
        System.out.println("Total distance is: " + distance + " type of vehicle is: " + type);
    }

    int calculateFare(int distance, String type, int passCount) {
        return distance * passCount;
    }

}

public class Overloading {
    public static void main(String args[]) {
        Travel t1 = new Travel();
        t1.calculateFare(23);
        t1.calculateFare(24, "bus");
        System.out.println(t1.calculateFare(25, "train", 25));
    }
}
