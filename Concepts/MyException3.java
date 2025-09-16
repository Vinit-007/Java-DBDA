public class MyException3 {
    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("exception handled :" + e);
        } finally {
            System.out.println("finally executed");
        }
    }
}
