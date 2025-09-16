// 7. Write a program to perform below operations on byte type to
// get:
// a. The number of bits used to represent a byte value
// b. The number of bytes used to represent a byte value
// c. The minimum value a byte
// d. The maximum value a byte

public class Ques7 {
    public static void main(String args[]) {

        // a. number of bits used to represent a byte
        int bits = Byte.SIZE;

        // b. number of bytes used to represent a byte
        int bytes = Byte.BYTES;

        // c. minimum value of byte
        byte minValue = Byte.MIN_VALUE;

        // d. maximum value of byte
        byte maxValue = Byte.MAX_VALUE;

        System.out.println("Number of bits: " + bits);
        System.out.println("Number of bytes: " + bytes);
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}
