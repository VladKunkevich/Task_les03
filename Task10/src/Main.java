public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 15, 16, 18, 20, 54, 1, 0};

        System.out.println(method(arr));
    }

    public static int method(int[] arr) {
        int maxSum = arr[0] + arr[arr.length - 1];
        for (int i = 1; i < arr.length / 2; i++) {
            if ((arr[i] + arr[arr.length - i - 1]) > maxSum) {
                maxSum = arr[i] + arr[arr.length - i - 1];
            }
        }
        return maxSum;
    }
}
