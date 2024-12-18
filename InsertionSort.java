import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
         int [] arr = {5, 7,1,4,2,3 , 6 };
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
     public static void Insertion(int[] arr) {
        int temp = 0;
        for (int i = 0 ; i < arr.length -1 ; i++) {
            for ( int j = i +1 ; j > 0 ; j --){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
     }
}
