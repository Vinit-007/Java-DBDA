
// 11.Accept character from command line and perform below operations. Here you can use charAt() method to extract character:
// a. Check whether entered character is letter or digit. If it is digit then print its values as well as code point.
// b. If it is character then check whether it is in lowercase? If it is in lowercase then convert it into upper case and print it well as its code point. If it is in uppercase
// then convert it into lower case and print it well as its
// code point.
import java.util.Scanner;

public class Ques11 {
    public static void main(String args[]) {

        // taking input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = input.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            int code = (int) ch;
            System.out.println("it is a digit and code for " + ch + " is " + code);

        } else if (ch >= 'a' && ch <= 'z') {
            char upper = Character.toUpperCase(ch);
            int code = (int) ch;
            System.out.println("it is a character and code for " + upper + " is " + code);

        } else {
            char lower = Character.toLowerCase(ch);
            int code = (int) ch;
            System.out.println("it is a character and code for " + lower + " is " + code);
        }

    }
}