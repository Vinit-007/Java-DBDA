public class Ques6 {
    public static void main(String args[]) {

        // bool to string
        boolean num1 = true;
        String str1 = String.valueOf(num1);
        System.out.println(str1);

        // bool to bool instance
        Boolean num2 = Boolean.valueOf(num1);
        System.out.println(num2);

        // string value into boolean value
        String str2 = "hello";
        boolean num3 = Boolean.parseBoolean(str2);
        System.out.println(num3);

        // string value into boolean instance
        Boolean num4 = Boolean.valueOf(str2);
        System.out.println(num4);

    }
}