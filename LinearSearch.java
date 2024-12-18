import java.util.*;
class LinearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to Find : ");
        int key = sc.nextInt();
        int [] arr = {1,2,3,4,5,6};
        int pos = Linear(arr,key);
        System.out.println(pos);
        sc.close();
    }
   
    public static int Linear(int[] arr ,int key){
for(int i=0;i<arr.length;i++) {
if(arr[i] == key){
    return i ;
}
}
        return -1;
    }
}
