import java.util.Scanner;

public class MergeSort {
    private  static  int[]b;
     public static void merge(int[] arr, int low, int mid, int high) {
        // ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;      
        int right = mid + 1;  
        int k = low;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                // temp.add(arr[left]);
                // left++;
                b[k++] = arr[left++];
            } else {
                // temp.add(arr[right]);
                // right++;
                b[k++] = arr[right++];
            }
        }

       
        while (left <= mid) {
            // temp.add(arr[left]);
            // left++;
            b[k++] = arr[left++];
        }

  
        while (right <= high) {
            // temp.add(arr[right]);
            // right++;
            b[k++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = b[i];
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid); 
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);  
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.err.print("enter the size:");
      int n = sc.nextInt();
        int[] arr = new int[n];
        b = new int[n];
        System.err.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
