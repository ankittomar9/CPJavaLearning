package dsa_advance.array;

import java.util.Arrays;

public class Q_1_Rotate_Array_k_times_optimized {
    public static void main(String[] args){
        int arr[]={1,2,3,4};  // expected output is : 3 1 4 2
        System.out.println("Original : \n"+ Arrays.toString(arr));

        int n=arr.length;
        int k=2;  k=k%n;  //optimization what if k=72 we won't rotate 72 times
        int start=0; int end=n-1;

        reverseHelper(arr,0,n-1);// first reverse the whole array
        reverseHelper(arr,0,k-1); // reverse the first half before k
        reverseHelper(arr,k,n-1);// reverse the second half after k
        System.out.println("Final Result: " + Arrays.toString(arr));
    }
    public static void reverseHelper(int[] arr,int start ,int end){
         int i=start;int j=end;   
         while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;j--;
         }
    //   System.out.println(Arrays.toString(arr));
    }
}
