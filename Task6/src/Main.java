import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12,15,17,19,0};
        int Z = 2;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= Z){
                arr[i] = Z;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr) + " Количество замен: " + count);

    }
}
