import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15, 17, 19, 0, -2};

        //for (int i = 0; i < 9; i++)

            System.out.println(Arrays.toString(method(arr)));
    }

    public static int[] method(int[] array) {
        int[] tmp = new int[array.length];
        int count = 0;

        for (int n : array)
            if (n % 2 == 0)
                tmp[count++] = n;
            if (count != 0)
                return Arrays.copyOf(tmp, count);
                System.out.println("Четных чисел нет");
            return null;

    }
}



