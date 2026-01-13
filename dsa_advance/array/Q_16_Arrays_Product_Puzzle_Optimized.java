package dsa_advance.array;

import java.util.Arrays;

public class Q_16_Arrays_Product_Puzzle_Optimized {
    //the Problem: Given an array nums of size n,
    //  return an array res such that res[i] is equal to the product of all the elements of nums except nums[i].
    public static void main(String args[]){
        int arr[]={1,2,3,4}; int n=arr.length;
        int left_prod_arr[] = new int[n];
        int right_prod_arr[] = new int[n];
        int result[]=new int[n];

        left_prod_arr[0]=1;
        for(int i=1;i<n;i++){
           left_prod_arr[i]=left_prod_arr[i-1]*arr[i-1]; 
        }
       System.out.println("Left Array:  " + Arrays.toString(left_prod_arr));

         right_prod_arr[n-1]=1;
        for(int i=n-2;i>=0;i--){
           right_prod_arr[i]=right_prod_arr[i+1]*arr[i+1]; 
        }
        System.out.println("Right Array:  " + Arrays.toString(right_prod_arr));

        for(int i=0;i<n;i++){
          result[i]= left_prod_arr[i] *  right_prod_arr[i];
        }
        System.out.println("Final Result: " + Arrays.toString(result));
    }
}
