import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,15,20,19,64,11};

        int min = 0;
        int max = 0;
        int temp;

        for(int i = 0; i < arr.length; i++){
            if(arr[min] > arr[i]) min = i;
            if(arr[max] < arr[i]) max = i;
        }
        System.out.println(Arrays.toString(arr) + " Min = " + arr[min] + " Max = " + arr[max]);

        temp = arr[min];
        arr[min] = arr[max];
        arr[max] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
