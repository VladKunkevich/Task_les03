import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 10, 15, -9, 0, 8, 11, -8, 1};
        method(arr);
    }

    public static void method(int[] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= i) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
