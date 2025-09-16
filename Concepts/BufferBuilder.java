public class BufferBuilder {
    public static void main(String args[]) {
        String str1 = "new string";
        StringBuffer str2 = new StringBuffer("hwello");
        System.out.println(str2);
        System.out.println(str1);
        System.out.println(str2.hashCode());
        System.out.println(str1.hashCode());
    }
}