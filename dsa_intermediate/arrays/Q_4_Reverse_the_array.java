package dsa_intermediate.arrays;

import java.util.Arrays;

public class Q_4_Reverse_the_array {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,8,9};
         System.out.println("Original Array : \n"+Arrays.toString(arr));
            reverseHelper(arr);
              System.out.println("Reversed Array : \n"+Arrays.toString(arr));
    }
    public static void reverseHelper(int[] arr){
        if(arr==null|| arr.length==0){
            System.out.println("null or empty array");  return ;
        }
        int start=0;int end=arr.length-1;

            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;end--;
            }
    }
}
