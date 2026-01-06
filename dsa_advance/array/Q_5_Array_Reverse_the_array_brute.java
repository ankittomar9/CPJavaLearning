package dsa_advance.array;

import java.util.Arrays;

public class Q_5_Array_Reverse_the_array_brute {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
            int n=arr.length;
        //brute force use extra space
        int new_arr[]=new int[arr.length];

        for(int i=0;i<n;i++){  
            new_arr[i]=arr[n-1-i];  //can you explain this line
        }    

        //  for(int i=0;i<n;i++){
        //     arr[i]=new_arr[i];
        // }   
        System.out.println(Arrays.toString(arr));
         System.out.println(Arrays.toString(new_arr));
    }
    
}
