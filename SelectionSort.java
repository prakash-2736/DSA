import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5, 7,1,4,2,3 , 6 };
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Selection(int[] arr) {
        int min ; 
        for (int i = 0; i < arr.length; i++) {
            min = i ; 
            for ( int j =i ; j < arr.length ; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }
}
