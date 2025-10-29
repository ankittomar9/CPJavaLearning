package Arrays1D;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_deletion_element {

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
     int arr[]={2,9,6,7,8,2,4,5,1,3,6};
        int n=scn.nextInt();  // n is the index to delete // 4 should be deleted
        int arr1[]=new int[arr.length-1];

        // did a copy of elements  arr1 has arr elements till index 6-1= 5 
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        }

         for(int i=n;i<arr1.length;i++){
            arr1[i]=arr[i+1];  // arr1[i+1] access the element after insertion
        }


          System.out.println("Original Array before Deletion ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array after Deletion by Value  ");
         System.out.println(Arrays.toString(arr1));

    }
    
}


/*public static int[] deleteElement(int[] arr, int k) {
    // 1. Create a new array that is one size smaller
    int[] arr1 = new int[arr.length - 1]; 
    
    // 2. Copy elements BEFORE k
    for (int i = 0; i < k; i++) {
        arr1[i] = arr[i];
    }
    
    // 3. Copy and SHIFT elements AFTER k
    // Start i at the deletion point k in the new array arr1
    for (int i = k; i < arr1.length; i++) { 
        // arr[i+1] is the element *after* the deletion point in the old array
        arr1[i] = arr[i + 1]; 
    }
    
    return arr1;
} */