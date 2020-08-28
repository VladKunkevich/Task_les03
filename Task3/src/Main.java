public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,9,15,19,3,7,21};

        System.out.println(ByMinToMax(arr));
    }
    public static boolean ByMinToMax(int[] arr)
    {
        for (int i = 0;i < arr.length;i++)
        {
            if (i + 1 == arr.length)
                return true;
            if (arr[i+1] < arr[i])
                return false;
        }
        return false;
    }
}
