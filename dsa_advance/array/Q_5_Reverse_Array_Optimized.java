package dsa_advance.array;

import java.util.Arrays;

public class Q_5_Reverse_Array_Optimized {
public static void main(String args[]){
    int arr[]={1,2,3,4,5,6};
    System.out.println("Original Array: \n "+Arrays.toString(arr));
    Array_reverse_helper(arr);
}   
    public static void  Array_reverse_helper(int arr[]){
        int i=0;int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        System.out.println("Reversed Array: \n "+Arrays.toString(arr));
    }    
}
