import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {5, 7,1,4,2,3 , 6 };
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Bubble(int [] arr){
        int temp = 0;
        for(int i = 0 ;  i < arr.length ; i++){
            for (int j = 0 ; j < arr.length - i - 1 ; j++ ){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                
            }
        }
    }

}
