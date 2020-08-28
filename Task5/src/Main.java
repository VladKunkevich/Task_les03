import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9, 12, 15, 17, 19, 21, 0};

        System.out.println(method(arr));
    }
        public static int method(int arr[]) {
            if(arr.length==0) return 0;
            Arrays.sort(arr);
            return arr[arr.length-1] - arr[0] + 1;
        }

    }

