import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int sum = 0;
        System.out.print("Введите k: ");
        int k = Integer.parseInt(r.readLine());

        for(int i = 0; i < 8; i++){
            if(arr[i]%k ==0)
                sum = sum + arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("сумма элементов кратных k равна " + sum);



    }
}

