// 12.Write a program to perform below operations on short type to
// get:
// a. The number of bits used to represent a short value
// b. The number of bytes used to represent a short value
// c. The minimum value a short
// d. The maximum value a short
public class Ques12 {
    public static void main(String args[]) {

        int ans1 = Short.SIZE;
        System.out.println(ans1);

        int ans2 = Short.BYTES;
        System.out.println(ans2);

        int ans3 = Short.MIN_VALUE;
        System.out.println(ans3);

        int ans4 = Short.MAX_VALUE;
        System.out.println(ans4);

    }
}