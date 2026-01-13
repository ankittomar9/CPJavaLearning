package dsa_advance.array;

import java.util.Arrays;

public class Q_12_Arrays_Prefix_sum {
    public static void main(String args[]){
        int arr[]={1,2,3,5,1,-6};
        System.out.println("Original Array : \n"+Arrays.toString(arr));

        int prefix_arr[]=new int[arr.length];

        // prefix sum tc:O(N) ,SC: O(N)
        prefix_arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_arr[i]=prefix_arr[i-1]+arr[i];
        }    
             System.out.println("Prefix Array : \n"+Arrays.toString(prefix_arr));
      
             //InPlace prefix sum tc:O(N) ,SC: O(1) we have to modify the original array
             for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
          System.out.println("\nPrefix Array Original Array Modified ");
          System.out.println(" Prefix Array : \n"+Arrays.toString(arr));



    }
    
}
