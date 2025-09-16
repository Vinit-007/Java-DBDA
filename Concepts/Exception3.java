
public class Exception3 {
    public static void main(String[] args) {
        try {
            int arr[] = { 10, 20, 3, 0 };

            try {
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("inner catch: " + e);
            }

            int result = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("outer catch: " + e);
        } catch (Exception e) {
            System.out.println("outer general catch: " + e);
        }
    }
}
