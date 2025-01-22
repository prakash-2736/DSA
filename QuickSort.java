import java.util.Scanner;

public class QuickSort {

    static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low +1 ;
        int j = high;
        while(i<=j){
            while( i<=j && arr[i] <= pivot ){
                i++;
            }
            while( i<=j && arr[j]>pivot ){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }

        }
        swap(arr,low,j);
        return j;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); 
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {


        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
      System.err.print("enter the size:");
      int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

