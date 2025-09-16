public class Ques9 {
    public static void main(String args[]) {

        // 9.Write a program to convert state of Byte instance into byte,
        // short, int. long, float and double.

        Byte byinst = 25;

        // byte instance --> byte
        byte val1 = byinst.byteValue();
        System.out.println(val1);

        // byte instance --> short
        short val2 = byinst.shortValue();
        System.out.println(val2);

        // byte instance --> int
        int val3 = byinst.intValue();
        System.out.println(val3);

        // byte instance -->long
        long val4 = byinst.longValue();
        System.out.println(val4);

        // byte instance --> float
        float val5 = byinst.floatValue();
        System.out.println(val5);

        // byte instance -->double
        double val6 = byinst.doubleValue();
        System.out.println(val6);

    }
}