package dsa_intermediate.arrays;

import java.util.Arrays;

public class Q_1_Rotate_Array_k_times_right {
    public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            int k=3;
        System.out.println("Array before rotation : \n"+Arrays.toString(arr));

        rotate(arr, k);
  //System.out.println("Array after "+k+" rotation : \n"+Arrays.toString(arr));
    }
    public static void rotate(int[] arr,int k){
        if(arr==null ||arr.length==0){return ; }
        int start=0;int end=arr.length-1;
         k=k%arr.length;
        reverseHelper(arr, start, end);
        reverseHelper(arr, start, k-1);
        reverseHelper(arr, k, end);
        System.out.println("Array after "+k+" rotation : \n"+Arrays.toString(arr));
    }
    public static void reverseHelper(int[] arr,int start,int end){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }
}
