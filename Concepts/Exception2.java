public class Exception2 {
    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 5, 4 };
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("exception handled");
        }
    }
}
