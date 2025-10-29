package Arrays1D;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_copy_array_element_add {
    public static void main(String args[]){
         int arr[]={2,9,6,7,8,2,4,5,1,3,6};
         Scanner scn=new Scanner(System.in); 
         int arr1[]=new int[arr.length];

         int n=scn.nextInt();
         for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i]+n;
         }

         System.out.println(Arrays.toString(arr));
          System.out.println("---------------");
          System.out.println(Arrays.toString(arr1));

    }
    
}

/*
 * 
 * You are given a constant array A and an integer B.

You are required to return another array where outArr[i] = A[i] + B.
 */