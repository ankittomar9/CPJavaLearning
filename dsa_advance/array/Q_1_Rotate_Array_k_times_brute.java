package dsa_advance.array;
import java.util.Arrays;

public class Q_1_Rotate_Array_k_times_brute {
    public static void main(String[] args){
        int arr[]={1,2,3,4};  // expected output is : 3 4 1 2 
        int k=2;  System.out.println("Original : \n"+ Arrays.toString(arr));
        int n= arr.length;

         k=k%n ;  // optimization what if k=72 we won't rotate 72 times
        //shift element 1 by 1 towards the right 
        
        for(int i=0;i<k;i++){
            int last=arr[n-1];

            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        System.out.println("Rotated "+k+" times : \n"+ Arrays.toString(arr)); 

    }
}
