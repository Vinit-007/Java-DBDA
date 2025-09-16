// 13. Write a program to convert:
// a. short value into String
// b. short value into Short instance.
// c. String instance into Short instance.
public class Ques13 {
    public static void main(String args[]) {

        short val1 = 23;
        String val2 = "25";

        // short --> string
        String ans1 = String.valueOf(val1);
        System.out.println(ans1);

        // short --> short instance
        Short ans2 = Short.valueOf(val1);
        System.out.println(ans2);

        // string instance --> short instance
        Short ans3 = Short.valueOf(val2);
        System.out.println(ans3);

    }
}