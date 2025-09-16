// 8.Write a program to convert:
// a. byte value into String
// b. byte value into Byte instance.
// c. String instance into Byte instance.
public class Ques8 {
    public static void main(String args[]) {
        // byte --> string
        byte val1 = 23;
        String str1 = Byte.toString(val1);
        System.out.println(str1);

        // byte --> byte instance
        Byte str2 = Byte.valueOf(val1);
        System.out.println(str2);

        // string instance --> byte instance
        String str3 = "52";
        Byte val2 = Byte.parseByte(str3);
        System.out.println(val2);
    }
}
