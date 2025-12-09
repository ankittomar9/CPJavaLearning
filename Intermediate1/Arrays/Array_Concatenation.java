package Arrays;
import java.util.Arrays;
public class Array_Concatenation {
    public static void main(String args[]){
        int[] arr={1,2,3};
        //Concat the array  
         int n=arr.length;
        if(n==0){
            System.out.println("Array is Empty : ");
        }
       
        int arr2[]=new int[2*n];

        for(int i=0;i<n;i++){   
            arr2[i]=arr[i];  
            arr2[i+n]=arr[i]; 
        }

        System.out.println(Arrays.toString(arr));
         System.out.println(Arrays.toString(arr2));

    }
    
}
