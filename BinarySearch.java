import java.util.Scanner;

public class BinarySearch {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to Find : ");
        int key = sc.nextInt();
        int [] arr = {1,2,3,4,5,6};
        int pos = Binary(arr,key);
        System.out.println(pos);
        sc.close();
    }
    public static int Binary(int[] arr,int key){
        int low = 0, high = arr.length - 1 , mid;
        while (low <= high){
            mid = ( low + high) / 2 ;
            if(arr[mid] == key){
                return mid;
            }
            else if ( arr[mid] < key) {
                high = mid -1 ;
            }
            else {
                low = mid +1 ;
            }
        }
        return -1;
    }
}
