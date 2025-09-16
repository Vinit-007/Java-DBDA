// Write a program to perform below operations on char type
// get:
// a. The number of bits used to represent a char value
// b. The number of bytes used to represent a char value
// c. The minimum value a char
// d. The maximum value a char

public class Ques10 {
    public static void main(String args[]) {

        // a. number of bits used to represent a char
        int bits = Character.SIZE;

        // b. number of bytes used to represent a char
        int bytes = Character.BYTES;

        // c. minimum value of char

        int minValue = (int) Character.MIN_VALUE;

        // d. maximum value of char
        int maxValue = (int) Character.MAX_VALUE;

        // printing results
        System.out.println("Number of bits: " + bits);
        System.out.println("Number of bytes: " + bytes);
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}
