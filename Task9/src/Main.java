public class Main {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,5,7,-15,16,-18,20,54,-1,0};

        int countEven = 0;
        int countOdd = 0;
        int countNul = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                countEven++;
            }else if(arr[i] < 0){
                countOdd++;
            }else if(arr[i] == 0){
                countNul++;
            }
        }
        System.out.println("Even " + countEven + " Odd " + countOdd + " Nul " + countNul);

    }
}
